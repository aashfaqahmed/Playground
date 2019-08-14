#include<stdio.h>
#include<stdlib.h>
void print(int, int *);
int main()
{ int n;
 scanf("%d",&n);
  int *a=(int *)(malloc(n*sizeof(int)));
                 for(int i=0;i<n;i++)
                 scanf("%d",a+i);//or scanf("%d",&a[i]);
                 print(n,a);
                 
                 return 0;
}
                 void print(int x, int *b)
                 {
                   for(int i=0;i<x;i++)
                   {
                     printf("%d\n",*(b+i));
                   }
                 }
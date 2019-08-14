#include<stdio.h>
int maximum(int, int *);
int main()
{int n;
 scanf("%d",&n);
 int *a=(int *)(malloc(n*sizeof(int)));
 for(int i=0;i<n;i++)
   scanf("%d",a+i);
 int max=maximum(n,a);
 printf("%d",max);
 return 0;
}
int maximum(int x,int *b)
{
  int max=b[0];
  for(int i=1;i<x;i++)
    if(max<*(b+i))
      max=*(b+i);
  
  return max;
     
 
  //fill your code
}
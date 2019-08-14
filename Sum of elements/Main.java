#include<stdio.h>
#include<stdlib.h>
int sumOfElements(int, int *);
int main()
{int n;
 scanf("%d",&n);
 int *a=(int *)(malloc(n*sizeof(int)));
 for(int i=0;i<n;i++)
   scanf("%d",a+i);
 int sum=sumOfElements(n,a);
 printf("%d",sum);
 return 0;
  //fill your code
}
int sumOfElements(int x,int *b)
{int sum=0;
  for(int i=0;i<x;i++)
  sum=sum+*(b+i);
 return sum;
}
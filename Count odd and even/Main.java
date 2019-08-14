#include<stdio.h>
int countEven(int , int *);
int countOdd(int, int *);
int main()
{int n;
 scanf("%d",&n);
 int *a=(int *)(malloc(n*sizeof(int)));
 for(int i=0;i<n;i++)
   scanf("%d",a+i);
 int x=countEven(n,a);
 int y=countOdd(n,a);
 printf("Odd: %d\nEven: %d",y,x);
  //fill your code
}
int countEven(int x,int *b)
{int count=0;
  for(int i=0;i<x;i++)
  {
    if(b[i]%2==0)
      count++;
  }
 return count;
}
int countOdd(int x,int *b)
{int count=0;
  for(int i=0;i<x;i++)
  {
    if(b[i]%2==1)
      count++;
  }
 return count;
}

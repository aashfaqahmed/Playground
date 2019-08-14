#include<stdio.h>
#include<stdlib.h>
int findsame(int*,int); 
int* createarray(int); 
void getelements(int*,int); 
int main()
{int n1,n2;
 scanf("%d",&n1);
 scanf("%d",&n2);
int *p1=createarray(n1); 
int *p2=createarray(n2); 
 getelements(p1,n1);
 getelements(p2,n2);
 
int sum1=findsame(p1,n1);
 int sum2=findsame(p2,n2);

 if((n1==n2)&&(sum1==sum2))
 printf("Same");
 else
   printf("Not Same");
  //fill your code
}
int* createarray(int n)
{
   int *p1=(int *)(malloc(n*sizeof(int)));
  return p1;
}
  
void getelements(int *a,int n)
{
  for(int i=0;i<n;i++)
  scanf("%d",a+i);
}
int findsame(int *a,int n)
{int sum=0;
  for(int i=0;i<n;i++)
  {
   sum = sum + *(a+i);
  }
 return sum;
}
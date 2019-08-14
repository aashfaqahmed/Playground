#include<stdio.h>
int main()
{int i,n,f,s,next;
 printf("Enter n value\n");
 scanf("%d",&n);
 f=1;
 s=2;
 printf("%d %d ",f,s);
for(i=2;i<n;i++)
{
  next=f+s;
  f=s;
 s=next; 
  printf("%d ",next);
  //Fill your code
}
}
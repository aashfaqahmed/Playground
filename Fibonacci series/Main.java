#include<stdio.h>
int main()
{int n,f=0,l=1,next;
 scanf("%d",&n);
 printf("%d ",f);
 printf("%d ",l);
 for(int i=3;i<=n;i++)
 {
   next=f+l;
   f=l;
   l=next;
   printf("%d ",next);}
  //Type your code here
  return 0;
}

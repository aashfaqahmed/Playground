#include<stdio.h>
int main()
{int n,f=0,s=1,next,flag=0;
 scanf("%d\n",&n);
 if(n==0||n==1)
   printf("Fibonacci Number");
 for(int i=0;i<n;i++)
 {next=f+s;
  f=s;
  s=next;
  if(n==next){
     printf("Fibonacci Number");flag++;
    break;
  }
 }
 if(flag==0)
    printf("Not Fibonacci Number");
  //fill your code
}
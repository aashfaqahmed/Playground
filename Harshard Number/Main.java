#include<stdio.h>
int main()
{int n,num,num2,sum=0;
 scanf("%d",&n);
 num=n;
 num2=n;
 while(num>0)
 {
   num=num%10;
   sum=sum+num;
   num2=num2/10;
   num=num2;
 }
 if(n%sum==0)
   printf("Harshard Number");
 else
   printf("Not Harshard Number");
 
  //fill your code
}
#include<stdio.h>
#include<math.h>
int main()
{int n,num1,num,num2,count=0,sum=0;
  scanf("%d",&n);
 num=n;
 num1=n;
 num2=n;
 while(num>0)
 {
   num=num/10;
   count++;
 }
 for(int i=1;i<=count;i++)
 {
   num1=num1%10;
   sum=sum+pow(num1,count);
   num2=num2/10;
   num1=num2;
 }
   if(n==sum)
   printf("Armstrong Number");
  
 else
   printf("Not Armstrong Number");
  //fill your code
}
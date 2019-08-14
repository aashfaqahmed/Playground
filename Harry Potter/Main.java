#include<stdio.h>
#include<math.h>
int main()
{int n,num,num2,count=0,y;
 scanf("%d",&n);
 num=n;

 while(num>0)
 {
   num=num/10;
   count++;
 }
 count=count-1;
y=(n%10)+(n/(pow(10,count)));
 printf("%d",y);
  //fill your code
}
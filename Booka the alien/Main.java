#include<stdio.h>
int main()
{int n,years=0,weeks=0,days=0;
 scanf("%d",&n);
 if(n>=365)
 {
   years=n/365;
   days=n%365;
   if(days>=7)
   {
     weeks=days/7;
     days=weeks%7;
   }
 }
 else{
   days=n%365;
   if(days>=7)
   {
     weeks=days/7;
     days=weeks%7;
   }
 }
 printf("%d\n%d\n%d",years,weeks,days);
 return 0;
  //fill your code
}
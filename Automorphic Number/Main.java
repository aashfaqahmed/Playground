#include<stdio.h>
int main()
{int a,s,num;
 scanf("%d",&a);
 s=(a*a)%10;
 num=a%10;
 if(s==num)
   printf("Automorphic Number");
 else
   printf("Not Automorphic Number");
 
  //fill your code
}
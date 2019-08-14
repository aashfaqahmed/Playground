#include<stdio.h>
int main()
{char c;
 scanf("%c",&c);
 if(c>=65&&c<=91)
   printf("Upper");
 else if(c>=97&&c<=123)
   printf("Lower");
 else if(c>=48&&c<=57)
   printf("Number");
 else 
   printf("Symbol");
 
   
  //Fill your code
}
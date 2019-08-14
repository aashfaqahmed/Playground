#include<stdio.h>
#define pi 3.1428
int main()
{float r,h,l,t;
 scanf("%f\n%f\n%f\n%f\n",&r,&h,&l,&t);
 float v;
 v=pi*r*r*h;
if(v<l*t)
 printf("The tank can be filled within %.1f hours",t);
 else
   printf("The tank cannot be filled within %.1f hours",t);
 
  //fill your code
}
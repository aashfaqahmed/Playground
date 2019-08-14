#include<stdio.h>
int main()
{float x,y,z,a,b,c;
 scanf("%f\n%f\n%f",&x,&y,&z);
 a=x+y;
 b=((100-z)/100)*a;
 c=a-b;
 printf("%.2f\n%.2f\n%.2f",a,b,c);
  //fill your code
}
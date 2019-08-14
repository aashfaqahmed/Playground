#include<stdio.h>
int main()
{int p,r,t;
 float a,b,c,d;
 scanf("%d\n%d\n%d",&p,&r,&t);
 a=p*r*t/100;
 b=p+a;
 c=(0.02)*a;
 d=b-c;
 printf("%.2f\n%.2f\n%.2f\n%.2f",a,b,c,d);
  //fill your code
}
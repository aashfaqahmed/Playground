#include<stdio.h>
int main()
{float ben,black,others,a,b,c;
 scanf("%f\n%f\n%f",&a,&b,&c);
 ben=(b/100)*a;
 black=(c/100)*(a-ben);
 others=(a-ben-black)/3;
 printf("%.0f\n%.0f\n%.0f",floor(ben),black,others);
  //fill your code
}
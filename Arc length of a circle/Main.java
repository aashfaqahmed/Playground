#include<stdio.h>
int main()
{
float r,a,arc;
scanf("%f\n%f",&r,&a);
  arc=2*3.14*r*(a/360);
  printf("%.2f",arc);
  return 0;
}
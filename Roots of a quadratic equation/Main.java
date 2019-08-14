#include<stdio.h>
#include<math.h>
int main()
{
 double  a,b,c,root1,root2,determinant,comp;
 scanf("%lf\n%lf\n%lf",&a,&b,&c);
 determinant=((b*b)-(4*a*c));
 if(determinant>0)
 {
   root1=(-b+sqrt(determinant))/(2*a);
   root2=(-b-sqrt(determinant))/(2*a);
   printf("root1 = %.2lf  root2 = %.2lf",root1,root2);
 }
 else if(determinant==0)
 {
   root1=root2=(-b)/(2*a);
   printf("root1 = %.2lf  root2 = %.2lf",root1,root2);
 }
 else
 {
   root1=(-b)/(2*a);
   comp=sqrt(-determinant)/(2*a);
   printf("root1 = %.2lf + %.2lfi  root2 = %.2lf - %.2lfi",root1,comp,root1,comp);}
  //Type your code here
  
}
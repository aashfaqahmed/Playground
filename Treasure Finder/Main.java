#include<stdio.h>
int main()
{int a,b,c,i,gcd;
 scanf("%d\n%d\n%d",&a,&b,&c);
 if(a<b&&a>c||a>b&&a<c)
   printf("The treasure is in the box which has number %d.\n",a);
 else if(b<a&&b>c||b>a&&b<c)
    printf("The treasure is in the box which has number %d.\n",b);
 else
    printf("The treasure is in the box which has number %d.\n",c);
 for(i=1;i<=a||i<=b||i<=c;i++)
 {
   if(a%i==0&&b%i==0&&c%i==0)
     gcd=i;
 }
 printf("The code to open the box is %d.",gcd);
  //fill your code
}
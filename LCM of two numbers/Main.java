#include <stdio.h>
// Main function
int main()
{int x,y,i,gcd=0;
 scanf("%d\n%d",&x,&y);
 for(i=1;i<=x && i<=y;i++)
 {
   if(x%i==0&&y%i==0)
     gcd=i;
 }
 printf("%d",(x*y)/gcd);
   return 0;
}
#include<stdio.h>
int main()
{int f,l,count,sum=0;
 scanf("%d\n%d",&f,&l);
 count=l-f;
 while(count>=0)
 {sum=sum+f;
   count--;
  f++;
 }
 printf("%d",sum);
  //fill your code
}
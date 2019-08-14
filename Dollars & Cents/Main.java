#include<stdio.h>
int main()
{int d1,c1,d2,c2,dollar,cent;
 scanf("%d\n%d\n%d\n%d",&d1,&c1,&d2,&c2);
 dollar=d1+d2+(c1+c2)/100;
 cent=(c1+c2)%100;
 printf("%d\n%d",dollar,cent);
  //fill your code
}
#include<stdio.h>
int main()
{int x1,y1,x2,y2,x3,y3;
 float x,y,z;
 scanf("%d\n%d\n%d\n%d\n%d\n%d",&x1,&y1,&x2,&y2,&x3,&y3);
 x=(float)(x1+x2+x3)/3;
 y=(float)(y1+y2+y3)/3;
 printf("%.1f\n%.1f",x,y);
  //fill your code
}
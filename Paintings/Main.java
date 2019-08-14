#include<stdio.h>
int main()
{int lw,bw,lp1,bp1,lp2,bp2;
 scanf("%d\n%d\n%d\n%d\n%d\n%d",&lw,&bw,&lp1,&bp1,&lp2,&bp2);
 if((lw>=lp1+lp2||lw>=lp1+bp1||lw>=lp1+bp2||lw>=bp1+bp2||lw>=lp2+bp2||lw>=lp2+bp1)&&(bw>=lp1+lp2||bw>=lp1+bp1||bw>=lp1+bp2||bw>=bp1+bp2||bw>=lp2+bp2||bw>=lp2+bp1))
   printf("Raj can fix both painting");
    else
    printf("Raj cannot fix both painting");
    
  //fill your code
}
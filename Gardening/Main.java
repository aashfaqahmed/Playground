#include<stdio.h>
int main()
{int row,col,n,m;
 scanf("%d\n%d\n%d",&row,&col,&n);
 if((n>row&&n<=row*2)||(n>row*(col-2)&&n<=row*(col-1)))
   printf("It is a mango tree");
 else
   printf("It is not a mango tree");
  //fill your code
}
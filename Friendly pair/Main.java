#include<stdio.h>
int main()
{int n1,n2,sum1=0,sum2=0;
 scanf("%d\n%d",&n1,&n2);
 for(int i=1;i<=n1/2;i++)
 {if(n1%i==0)
   sum1=sum1+i;
 }
   for(int i=1;i<=n2/2;i++)
 {if(n2%i==0)
   sum2=sum2+i;
 } 
 if(sum1/n1==sum2/n2)
   printf("Friendly Pair");
 else
   printf("Not Friendly Pair");
 
  //fill your code
}
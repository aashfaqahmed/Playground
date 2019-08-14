#include<stdio.h>
int main()
{int n,sum=7;
 scanf("%d",&n);
for(int i=0;i<n;i++){
 printf("%d ",sum);
  if(i%2==0)
  sum=sum-2;
  else
    sum=sum+3;
  
}
    //fill your code
}
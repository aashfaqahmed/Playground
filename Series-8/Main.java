#include<stdio.h>
int main()
{int n,sum=101,count=0;
 scanf("%d",&n);
while(n>0)
{
  for(int j=1;j<=sum;j++)
  {
    if(sum%j==0)
      count++;
  }
  if(count==2)
  {
   printf("%d ",sum); 
   n--;
  }
  sum++;
 count=0;
  //printf("%d ",n);
  
   
}
   //Fill your code
}

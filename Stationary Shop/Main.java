#include<stdio.h>
int main()
{char ch[100];
 int n,a,na;
 scanf("%s\n%d\n%d\n%d",&ch,&n,&a,&na);
 if(n>=na)
 printf("The amount for %d %s is %d\nRemaining number of %ss present in the stock:",na,na*a,n-na);
  else 
    printf("Out of stock");
 return 0;
  //Fill your code
}
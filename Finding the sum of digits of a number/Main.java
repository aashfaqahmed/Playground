#include <stdio.h>
int main() {
	//Type your code
  int n,num,sum=0;
  scanf("%d",&n);
  num=n;
  while(n!=0)
   
  {
    num=num%10;
    sum=sum+num;
    n=n/10;
    num=n;
  }
  printf("%d",sum);
	return 0;
}
#include <stdio.h>
int main() {
	//Type your code
  int n,num,sum=0, original;
  scanf("%d",&original);
    num=original;
  n=original;
    while(num!=0)
    {
      if(original/num==1 || num%10==num)
      {
        num=num%10;
        sum=sum+num;

      }
              n=n/10;
        num=n;
    }
  printf("%d",sum);
	return 0;
}
#include <stdio.h>
int main() {int n,num;
	//Type your code
  scanf("%d",&n);
            num=n;
  while(num!=0)
  {
    if(num%100==num)
      break;
    num=num/10;
  }
            printf("%d",num%10);
    
	return 0;
}
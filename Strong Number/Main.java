#include <stdio.h>
int main() {int n,num1,num2,sum=0;
            scanf("%d",&n);
            num1=n;
            num2=n;
            while(num1>0)
            {
              num1=num1%10;
             int p=1;
              for(int i=1;i<=num1;i++)
              {
                p=p*i;
              }
              //printf("%d\n",p);
              sum=sum+p;
              num2=num2/10;
              num1=num2;
            }
            if(n==sum)
            printf("Yes");
            else 
              printf("No");
	//Type your code
            
	return 0;
}
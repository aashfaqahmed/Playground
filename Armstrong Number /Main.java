#include <stdio.h>
#include <math.h>
int main() {int n,num,num2,num3,count=0,sum=0;
            scanf("%d",&n);
                  num2=n;
               num=n;
                  num3=n;   
                  while(num2>0)
                  {num2=num2/10;
                    count=count+1;
                  }
                  
                  while(num>0)
                  {
                    num=num%10;
                    sum=sum+pow(num,count);
                    num3=num3/10;
                    num=num3;}
            
                  if(n==sum)
                  printf("Armstrong Number");
            else 
              printf("Not an Armstrong Number");
                    
                    
	//Type your code
	return 0;
}
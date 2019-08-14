#include <stdio.h>
#include <math.h>
int main()
{int x,y,z;
 scanf("%d\n%d",&x,&y);
 z= pow(x,y);
 if(y<0)
   printf("Wrong input");

 else
  printf("%d",z);	//Your code here       
    return 0;
}
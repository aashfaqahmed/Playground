#include<stdio.h>
int main()
{int a,b,c,cars;
 scanf("%d\n%d\n%d\n%d",&a,&b,&c,&cars);
 if(a%cars==0)
   printf("Cars 1 goes into road A");
 else if(b%cars==0)
    printf("Car 1 goes into road B");
 else if(c%cars==0)
    printf("Car 1 goes into road C");
 else
    printf("No path exist");
  //Fill your code
}
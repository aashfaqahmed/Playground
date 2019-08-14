#include<stdio.h>
int main()
{int units;
  float total;
 scanf("%d",&units);
 if(units<=200)
   total=units*0.5;
 else if(units>200&&units<=400)
   total=units*0.65+100;
 else if(units>400&&units<=600)
   total=units*0.80+200;
 else
   total=units*1.25+425;
 printf("Rs.%.0f",round(total));
  //fill your code
}
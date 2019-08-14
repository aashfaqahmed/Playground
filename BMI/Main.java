#include<stdio.h>
int main()
{float h,w,bmi;
 scanf("%f\n%f",&w,&h);
 bmi=w/(h*h)*10000;
 if(bmi>18&&bmi<=25)
   printf("You are normal. Go walking daily and maintain it.");
 else if(bmi<18)
   printf("You are underweight. Have an apple daily.");
   else
          printf("You are obese. Go to doctor");
  //fill your code
}
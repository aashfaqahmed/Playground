#include<stdio.h>
int main()
{char name[20];
 float cgpa;
 int reg,ar;
 scanf("%s\n%d\n%f\n%d",&name,&reg,&cgpa,&ar);
 printf("%s\n%d\n",name,reg);
 if(cgpa>=7.0&&ar==0)
   printf("Eligible to attend placement");
 else if(cgpa>=7.5&&(ar==1||ar==2))
   printf("Eligible to attend placement");
 else
   printf("Not Eligible to attend placement");
 
 
  //fill your code
}
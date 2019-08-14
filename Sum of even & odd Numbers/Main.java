#include<stdio.h>
int main()
{int odd=1,n,even=0;
 float a1,a2,c1=0,c2=0;
 do{
   scanf("%d\n",&n);
   if(n%2==0){
     even=even+n;c1++;}
   else{
     odd=odd+n;c2++;}
 }while(n!=-1);
 a1=even/c1;
 a2=odd/(c2-1);
   printf("%d\n%d\n%.2f\n%.2f",even,odd,a1,a2);
  //fill your code
}
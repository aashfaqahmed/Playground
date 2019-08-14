#include<stdio.h>
int main()
{float fp,fd,fs,sp,sd,ss,ap,ad,as,st,ft,at;
 scanf("%f\n%f\n%f\n%f\n%f\n%f\n%f\n%f\n%f",&fp,&fd,&fs,&sp,&sd,&ss,&ap,&ad,&as);
 ft=(fp-(fd/100)*fp+fs);
 st=sp-(sd/100)*sp+ss;
 at=ap-(ad/100)*ap+as;
printf("In Flipkart: Rs.%.0f\nIn Snapdeal: Rs.%.0f\nIn Amazon: Rs.%.0f\n",ft,st,at);
 if(ft<st&&ft<at)
   printf("He will prefer Flipkart");
 else if(at<st&&at<ft)
   printf("He will prefer Amazon");
 else
   printf("He will prefer Snapdeal");//////fill your code
}
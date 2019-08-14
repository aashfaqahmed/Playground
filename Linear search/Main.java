#include<stdio.h>
int main()
{int arr[100],n,i,flag=0;
 scanf("%d",&n);
 for( i=0;i<n;i++)
 {
   scanf("%d ",&arr[i]);
 }
 int s;
 scanf("%d",&s);
 for(i=0;i<n;i++){
   if(s==arr[i])
   {printf("%d",i+1);
    flag=1;
    }
   else
   continue;
 }
 if(flag==0)
printf("%d isn't present in the array.",s);
  
  //Type your code here
  return 0;
}
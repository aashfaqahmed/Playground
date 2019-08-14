#include<stdio.h>
int main()
{int run_scored,total_balls,total_runs,balls_bowled;
  float run_rate,total_overs,overs_finished,total_runrate;
 scanf("%d\n%d\n%d\n%d",&total_balls,&total_runs,&run_scored,&balls_bowled);
 total_overs=total_balls/6;
   overs_finished=(balls_bowled/6)+(0.1*(balls_bowled%6));
 run_rate=run_scored/overs_finished;
 total_runrate=total_runs/total_overs;
 printf("%.0f\n%.1f\n%.1f\n%.1f\n",total_overs,overs_finished,run_rate, total_runrate);
 if(run_rate>=total_runrate)
   printf("Eligible to Win");
        else 
        printf("Not Eligible to Win");
 
  //Fill your code
}
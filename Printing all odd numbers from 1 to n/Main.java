#include <stdio.h>
int main() {int n;
            scanf("%d",&n);
            for(int i=1;i<=n;i++)
            {
              if(i%2==1)
                printf("%d\n",i);
              else
                continue;
            }
	//Type your code
	return 0;
}
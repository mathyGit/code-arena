#include "stdio.h"

int main(void) {
   
   setvbuf(stdout,NULL,_IONBF,0);
   int r,a[100],i,sum=0,avg;
   printf("Enter the limit:\n");
   scanf("%d",&r);
   for(i=0;i<r;i++){
   	scanf("%d",&a[i]);
   	sum=sum+a[i];
   }
   avg=sum/r;
   printf("Average:%d ",avg);
   
    return 0;
}

#include "stdio.h"

int main(void) {
   int num,ip;
   printf("Enter the limit: ");
   scanf("%d",&num);
   printf("enter the number: ");
   scanf("%d",&ip);
   if(ip<num){
   	printf("Valid input!");
   }
    else printf("Invalid input!");
    return 0;
}

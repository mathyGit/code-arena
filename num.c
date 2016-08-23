#include "stdio.h"

int main(void) {
   int num;
   printf("Enter a number between 1 to 9: ");
   scanf("%d",&num);
   if((num>=1)&&(num<=9)){
   	printf("%d",num);
   }
    else printf("you entered number not in range");
    return 0;
}

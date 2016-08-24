#include "stdio.h"

int main(void) {
    char ch;
    setvbuf(stdout, NULL, _IONBF, 0);
    printf("enter the character: ");
    scanf("%c",&ch);
    printf("%d",(int)ch);
    return 0;
}

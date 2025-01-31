#include<stdio.h>

int main(){
    int num =9;
    int* ptr = &num;
    printf("%d\n", ptr);
    printf("%d\n", *ptr);
    printf("%d\n", &num);
    return 0;
}


//6. Write a program to check whether a given character is uppercase or lowercase.
#include <stdio.h>

int main() {
    char ch;

    
    printf("Enter a character: ");
    scanf(" %c", &ch);  

    
    if (ch >= 'A' && ch <= 'Z') {
        printf("The character '%c' is uppercase.\n", ch);
    }
    
    else if (ch >= 'a' && ch <= 'z') {
        printf("The character '%c' is lowercase.\n", ch);
    }
  
    else {
        printf("The character '%c' is not an alphabetic letter.\n", ch);
    }

    return 0;
}

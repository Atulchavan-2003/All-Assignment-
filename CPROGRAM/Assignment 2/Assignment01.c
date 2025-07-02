/*1. Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
desired operations.*/
#include <stdio.h>
void main () {
	int no1,no2 ;
	char op;

	printf("Enter the firsr number\n");
	scanf("%d",&no1);
	
	printf("enter the operator \n");
	fflush(stdin);
	scanf("%c",&op);
	
	
	printf("Enter second  number ");
	scanf(" %d",&no2);
	
	if(op == '+'){
		printf("%d ",no1+no2);
	}
	else if(op == '-'){
		printf("%d",no1-no2);
	}
		else if(op == '/'){
		printf("%d",no1/no2);
	}
		else if(op == '*'){
	   	
		     printf("%d",no1*no2);
	}
		else if(op == '%'){
		printf("%d",no1%no2);
	}
	else{
		printf("incorrect operator");
	}
}
	
	
	
	
	
	
	
	
	
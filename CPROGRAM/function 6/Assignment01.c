
#include <stdio.h>

void add();
void sub();
void mult();
void div();
void mod();

int main() {

	char op;

	printf("Enter the operator (+, -, *, /, %%): ");
	scanf(" %c", &op);  // Notice the space before %c to ignore newline



	if (op == '+') {
		add();
	}
	if (op == '-') {
		sub();
	}
	if (op == '*') {
		mult();
	}
	if (op == '/') {
		div();
	}
	if (op == '%') {
		mod();
	}


	return 0;
}

void add() {

	int no1,no2;
	printf("Enter the first number: ");
	scanf("%d", &no1);
	printf("Enter the second number: ");
	scanf("%d", &no2);
	printf("Result: %d\n", no1 + no2);
}
void sub() {

	int no1,no2;
	printf("Enter the first number: ");
	scanf("%d", &no1);
	printf("Enter the second number: ");
	scanf("%d", &no2);

	printf("Result: %d\n", no1 - no2);
}
void mult() {
	int no1,no2;
	printf("Enter the first number: ");
	scanf("%d", &no1);

	printf("Enter the second number: ");
	scanf("%d", &no2);

	printf("Result: %d\n", no1 * no2);
}
void div() {

	int no1,no2;
	printf("Enter the first number: ");
	scanf("%d", &no1);
	printf("Enter the second number: ");
	scanf("%d", &no2);
	printf("Result: %d\n", no1 / no2);
}
void mod() {

	int no1,no2;
	printf("Enter the first number: ");
	scanf("%d", &no1);
	printf("Enter the second number: ");
	scanf("%d", &no2);
	printf("Result: %d\n", no1 % no2);
}



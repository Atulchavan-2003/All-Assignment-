/*2. Print prime numbers in the given range 1 to n.*/
#include<stdio.h>
void main(){
	int n;
	printf("Enter the number ");
	scanf("%d",&n);
	for(int i = 1; i <= n;i++ ){
		int count = 0;
		for(int j = 1; j <= i; j++){
			if(i%j==0){
				count++;
			}
			
		}
		if (count == 2)
			printf(" %d ",i);
	}
}


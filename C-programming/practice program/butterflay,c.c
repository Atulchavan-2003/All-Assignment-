#include <stdio.h>
void main(){
	int i,j,n=4,s;
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++){
			printf(" * ");
		}
		for(j=n-i;j>=1;j--){
			printf("   ");
		}
		for(j=n-i;j>=1;j--){
			printf("   ");
		}
		for(j=1;j<=i;j++){
			printf(" * ");
		}
		printf("\n \n");
	}
	for(i=n-1;i>=1;i--){
		for(j=1;j<=i;j++){
			printf(" *");
		}
		for(j=1;j<=n-i;j++){
			printf("  ");
		}
		for(j=1;j<=n-i;j++){
			printf("  ");
		}
		for(j=1;j<=i;j++){
			printf(" *");
		}
		printf("\n \n");
	}
	
	
}
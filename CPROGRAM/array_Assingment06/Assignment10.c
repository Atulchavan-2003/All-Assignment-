#include<stdio.h>
void main(){
	int arr[5];
	printf("Enter the array");
	for(int i=0;i<5;i++){
		scanf("%d ",&arr[i]);
	}
	for(int i=0;i<5;i++){
		printf("%d ",&arr[i]);
	}
	for(int i = 0;i<5;i++){
		for(int j=1;j<5;j++){
			if(arr[j] > arr[j+1]){
				arr[j]=arr[j+1];
			}
			printf("hello %d",arr[i]);
		}
	}
}
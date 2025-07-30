#include<stdio.h>
void main(){
	int arr[100]={1,2,1,1};
	int n = sizeof(arr);
	int flag = 0;
	for(int i=0;i<n;i++){
		if(arr[i] == arr[n]){
			flag++;
		}
		n--;
	}
	if(flag==1){
		printf("not pali");
	}
	else
	   printf("pali");
}
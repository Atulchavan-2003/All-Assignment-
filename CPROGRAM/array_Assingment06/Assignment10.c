#include<stdio.h>
void main() {
	int arr[]= {5,3,1,8,9,7,2};
	printf("Enter the array");
	int size = sizeof(arr)/sizeof(arr[0]);

	for(int i=0; i<size-1; i++) {
		int flag=0;
		for(int j = 0; j<size-1-i; j++) {
			int tem = 0;
			if(arr[j]>arr[j+1]) {
				flag=1;
				tem = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tem;
			}
		}

		if(flag==0)
			break;
	}
	for(int k =0; k<size; k++)
		printf("%d ",arr[k]);

}

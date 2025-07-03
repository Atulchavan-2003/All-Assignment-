/*9 Check the given number is Palindrome number or not.
Input: n = 121
Output: Palindrome*/
#include <stdio.h>
void main(){
	int n = 121,rem;
	int rev;
	while(n > 0){
		rem = n % 10;
		rev = rev * 10 + rem;   
		n = n / 10;
	}
	printf("%d",rev);
}
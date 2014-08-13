//求子数组的最大和
#include<iostream>
using namespace std;

int  findMaxSum(int a[], int length){
	int size = length;
	int sum = 0;
	int maxSum = 0;
	for (int i = 0; i < length; i++){
		if (sum + a[i] > maxSum){
			sum = sum + a[i];
			maxSum = sum;
		}
		else if (sum + a[i] < 0){
			sum = 0;
		}
	}
	return maxSum;
}

int main(){
	int a[] = { -1, 2, -4, 3, -14, 5, -6 };
	cout << findMaxSum(a, 7) << endl;
}


#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

void BubbleSort(int arr[], int sz) {
	for (int i = 0; i < sz - 1; i++) {
		for (int j = 0; j < sz - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
}

int main() {
	int arr[] = { 1 ,6 ,2 ,7 ,8 ,5,8,7,8,5,2 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	BubbleSort(arr, sz);
	for (int i = 0; i < sz; i++) {
		printf("%d ", arr[i]);
	}


	return 0;
}






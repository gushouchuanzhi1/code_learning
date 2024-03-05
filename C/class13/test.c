#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	//int arr1[40];
	int* arr2 = (int*)malloc(40);
	if (arr2 == NULL) {
		printf("malloc error!\n");
		return 1;
	}
	int i = 0;
	for (i = 0; i < 9; i++) {
		printf("%d ", *(arr2 + i));
	}
	printf("\n");
	for (i = 0; i < 9; i++) {
		*(arr2 + i) = i;
	}
	for (i = 0; i < 9; i++) {
		printf("%d ", *(arr2 + i));
	}
	free(arr2);

	printf("\n");

	int* arr3 = (int*)calloc(10, sizeof(int));
	for (i = 0; i < 9; i++) {
		printf("%d ", *(arr3 + i));
	}
	printf("\n");
	for (i = 0; i < 9; i++) {
		*(arr3 + i) = i;
	}
	for (i = 0; i < 9; i++) {
		printf("%d ", *(arr3 + i));
	}
	printf("\n");
	int* temp = (int *)realloc(arr3, 80);
	if (temp != NULL) {
		arr3 = temp;
		temp = NULL;
	}
	for (i = 0; i < 9; i++) {
		printf("%d ", *(arr3 + i));
	}


	return 0;
}









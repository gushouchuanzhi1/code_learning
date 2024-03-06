#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//int main() {
//	//int arr1[40];
//	int* arr2 = (int*)malloc(40);
//	if (arr2 == NULL) {
//		printf("malloc error!\n");
//		return 1;
//	}
//	int i = 0;
//	for (i = 0; i < 9; i++) {
//		printf("%d ", *(arr2 + i));
//	}
//	printf("\n");
//	for (i = 0; i < 9; i++) {
//		*(arr2 + i) = i;
//	}
//	for (i = 0; i < 9; i++) {
//		printf("%d ", *(arr2 + i));
//	}
//	free(arr2);
//
//	printf("\n");
//
//	int* arr3 = (int*)calloc(10, sizeof(int));
//	for (i = 0; i < 9; i++) {
//		printf("%d ", *(arr3 + i));
//	}
//	printf("\n");
//	for (i = 0; i < 9; i++) {
//		*(arr3 + i) = i;
//	}
//	for (i = 0; i < 9; i++) {
//		printf("%d ", *(arr3 + i));
//	}
//	printf("\n");
//	int* temp = (int *)realloc(arr3, 80);
//	if (temp != NULL) {
//		arr3 = temp;
//		temp = NULL;
//	}
//	for (i = 0; i < 9; i++) {
//		printf("%d ", *(arr3 + i));
//	}
//
//
//	return 0;
//}

//int main() {
//	long i;
//	long a[16];
//	for (int i = 0; i <= 17; i++){
//		a[i] = 0;
//		printf("%d", i);
//	}
//	//内存被破坏了，内存访问越界！
//
//	return 0;
//}

typedef struct Test {
	int i; 
	char name[20];
	int a[];
} test;


int main() {
	test* t = (test*)malloc(sizeof(test) + 40);
	if (t == NULL) {
		return 1;
	}
	printf("%d\n", sizeof(*t));//24
	printf("%d\n", sizeof(t));//4
	t->i = 10;
	strcpy(t->name, "asda");
	//因为这里的name是数组的地址，也是数组第一个元素的地址，
	//使用strcpy才能对这个指针指向的内容进行修改
	for (int i = 0; i < 10; i++) {
		t->a[i] = i;
	}
	for (int i = 0; i < 10; i++) {
		printf("%d ", t->a[i]);
	}
	free(t);



	return 0;
}









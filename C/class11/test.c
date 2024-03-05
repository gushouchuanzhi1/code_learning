#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <string.h>

int main() {
	int arr1[] = { 1,2,3,4,5,6,7 };
	int arr2[20] = { 0 };
	memcpy(arr2, arr1, 20);
	for (int i = 0; i < 5; i++) {
		printf("%d ", arr2[i]);
	}

	char s1[] = {"nihao hello world"};
	memmove(s1 + 5, s1 + 6, 5);
	puts(s1);

	char buffer1[] = "qweq";
	char buffer2[] = "qweql";

	int n = memcmp(buffer1, buffer2, sizeof(buffer1));

	printf("%d\n", n);



	return 0;
}


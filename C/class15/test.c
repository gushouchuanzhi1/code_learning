#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>

//int main() {
//	FILE* fp = fopen("log.txt", "w");
//	if (fp == NULL) {
//		perror("fopen failed");
//		return 1;
//	}
//	for (int i = 0; i < 10; i++) {
//		printf("file:%s line=%d data:%s time:%s i=%d\n", __FILE__, __LINE__, __DATE__, __TIME__, i);
//		fprintf(fp,"file:%s line=%d data:%s time:%s i=%d\n", __FILE__, __LINE__, __DATE__, __TIME__, i);
//	}
//	fclose(fp);
//	fp = NULL;
//
//	return 0;
//}

#include <stddef.h>

struct S
{
	int i;
	char c;
	int m;
};

int main() {
	struct S s = { 0 };
	printf("%d\n", offsetof(struct S, i));
	printf("%d\n", offsetof(struct S, c));
	printf("%d\n", offsetof(struct S, m));



	return 0;
}






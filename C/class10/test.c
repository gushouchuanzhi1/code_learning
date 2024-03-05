#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>


//int main() {
//
//	char s[] = { 'b','b' };
//	int len = strlen(s);//74 随机值
//	printf("%d\n", len);
//
//	return 0;
//}

//int main() {
//	if (strlen("abc") - strlen("asdva") > 0) { //结果是大于零的，是比较无符号整型的-2是否大于零
//		printf(">\n");
//	}
//	else {
//		printf("<\n");
//	}
//
//	return 0;
//}

//模拟实现：
#include <assert.h>

unsigned int my_strlen(const char* str) {
	assert(str);//保证这里的str不为\0
	unsigned int cnt = 0;
	while (*str != '\0') {
		cnt++;
		str++;
	}
	return cnt;
}

//int main() {
//	char arr[20] = "hello";
//	strcat(arr, " world");
//	printf("%s\n", arr);
//	printf("%d\n", strcmp(arr,"aorld"));//1
//	printf("%d\n", strcmp(arr,"world"));//-1，第二位e小于o
//	printf("%d\n", strcmp("hello", "hello"));//0
//	char arr2[] = "hello";
//	char arr3[] = "hello";
//	printf("%d\n", strcmp(arr2, arr3));//0
//
//
//
//	return 0;
//}

int main() {
	char s[] = "asdfas";
	printf("%p\n", strstr(s,"df"));


	return 0;
}




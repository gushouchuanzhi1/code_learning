#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>


//int main() {
//
//	char s[] = { 'b','b' };
//	int len = strlen(s);//74 ���ֵ
//	printf("%d\n", len);
//
//	return 0;
//}

//int main() {
//	if (strlen("abc") - strlen("asdva") > 0) { //����Ǵ�����ģ��ǱȽ��޷������͵�-2�Ƿ������
//		printf(">\n");
//	}
//	else {
//		printf("<\n");
//	}
//
//	return 0;
//}

//ģ��ʵ�֣�
#include <assert.h>

unsigned int my_strlen(const char* str) {
	assert(str);//��֤�����str��Ϊ\0
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
//	printf("%d\n", strcmp(arr,"world"));//-1���ڶ�λeС��o
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




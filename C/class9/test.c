#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>

//int main() {
//	char p[] = "abcdef";
//	printf("%d\n",strlen(p));
//	printf("%d\n",strlen(&p));//随机值，因为取地址之后，不清楚后面多少有"\0"
//	printf("%d\n",strlen(&p + 1));//随机值，因为取地址之后，不清楚后面多少有"\0"
//
//	return 0;
//}

int main() {
	int a[3][4] = { 0 };
	printf("%d\n", sizeof(a[0]));//是作为第一行的数组名 为4x4
	printf("%d\n", sizeof(a[0] + 1));//表示第一行第二个元素的地址，而非是元素值，由于是64位系统，所以是八个字节 8
	printf("%d\n", sizeof(*(a[0] + 1)));//取第二个元素的值
	printf("%d\n", sizeof(a + 1));//a没有单独放在sizeof，也没有取地址，a表示首元素即第一行，+1之后表示第二行地址 8
	printf("%d\n", sizeof(*(a + 1)));//解地址 16
	printf("%d\n", sizeof(&a[0] + 1));//对第一行数组取了地址，然后+1，还是地址， 8
	printf("%d\n", sizeof(*(&a[0] + 1)));//对第一行数组去了地址，+1.第二行地址解地址  16
	printf("%d\n", sizeof(*a));//16  第一行地址解应用即可
	printf("%d\n", sizeof(a[3]));//16  计算这一行的大小，第四行，但是并不存在



}


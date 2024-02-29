#include <stdio.h>
#include <string.h>

int main() {

	char s[] = "abcde";//计数的时候不计数'\0'
	char t[] = { 'a','b','c','d','e' };

	printf("%s\n", s);
	printf("%#x\n", s);//打印了数组的地址第一个

	int length = strlen(t);

	printf("%d\n", length);

	printf("absdc\\0 \n");

	printf("%c\n", '130');

	return 0;

}

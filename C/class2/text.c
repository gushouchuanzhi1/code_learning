#include <stdio.h>
#include <string.h>

int main() {

	char s[] = "abcde";//������ʱ�򲻼���'\0'
	char t[] = { 'a','b','c','d','e' };

	printf("%s\n", s);
	printf("%#x\n", s);//��ӡ������ĵ�ַ��һ��

	int length = strlen(t);

	printf("%d\n", length);

	printf("absdc\\0 \n");

	printf("%c\n", '130');

	return 0;

}

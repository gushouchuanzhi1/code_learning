#include <stdio.h>
#include <string.h>

int main() {

	char s[] = "abcde";//������ʱ�򲻼���'\0'
	char t[] = { 'a','b','c','d','e' };

	printf("%s\n", s);
	printf("%#x\n", s);//��ӡ������ĵ�ַ��һ��

	int length = strlen(t);

	printf("%d\n", length);

	
	return 0;

}

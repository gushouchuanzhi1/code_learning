#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>

//int main() {
//	char p[] = "abcdef";
//	printf("%d\n",strlen(p));
//	printf("%d\n",strlen(&p));//���ֵ����Ϊȡ��ַ֮�󣬲�������������"\0"
//	printf("%d\n",strlen(&p + 1));//���ֵ����Ϊȡ��ַ֮�󣬲�������������"\0"
//
//	return 0;
//}

int main() {
	int a[3][4] = { 0 };
	printf("%d\n", sizeof(a[0]));//����Ϊ��һ�е������� Ϊ4x4
	printf("%d\n", sizeof(a[0] + 1));//��ʾ��һ�еڶ���Ԫ�صĵ�ַ��������Ԫ��ֵ��������64λϵͳ�������ǰ˸��ֽ� 8
	printf("%d\n", sizeof(*(a[0] + 1)));//ȡ�ڶ���Ԫ�ص�ֵ
	printf("%d\n", sizeof(a + 1));//aû�е�������sizeof��Ҳû��ȡ��ַ��a��ʾ��Ԫ�ؼ���һ�У�+1֮���ʾ�ڶ��е�ַ 8
	printf("%d\n", sizeof(*(a + 1)));//���ַ 16
	printf("%d\n", sizeof(&a[0] + 1));//�Ե�һ������ȡ�˵�ַ��Ȼ��+1�����ǵ�ַ�� 8
	printf("%d\n", sizeof(*(&a[0] + 1)));//�Ե�һ������ȥ�˵�ַ��+1.�ڶ��е�ַ���ַ  16
	printf("%d\n", sizeof(*a));//16  ��һ�е�ַ��Ӧ�ü���
	printf("%d\n", sizeof(a[3]));//16  ������һ�еĴ�С�������У����ǲ�������



}


#define _CRT_NO_SECURE_WARNINGS

#include <stdio.h>

int main() {
	int a = 1;
	if (*(char*)&a == 0) {//�洢��01 00 00 00
		//����int������4���ֽڣ���char������1���ֽ�
		//�Ȱ�a��ַȡ������&a��һ��ָ�룬ǿ��ת����char����ָ�룬���������ҵ���һ���ֽڵ�����
		//�ٱȽ���0����1���ж���ʲô�洢
		printf("xiao\n");
	}
	else {
		printf("da\n");
	}
	unsigned char b = -1;//-1�Բ�����������11111111��Ȼ�����޷�������������255��
	printf("%d\n", b);

	return 0;
}



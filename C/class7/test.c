#include <stdio.h>

int Add(int x, int y) {
	return x + y;
}

void Calc(int (*p)(int, int)) {
	int a = 3, b = 5;
	int ret = p(3, 5);
	printf("%d\n", ret);
}

int main() {
	//��a�ĵ�ַ������p
	char* p = "avadscv";
	char arr1[] = "abv";
	char arr2[] = "abv";
	printf("%s\n",p);

	/*
	int arr[5];//��������
	int *parr1[10]//����ָ�������
	int (*parr2)[10] ������ָ��
	int (*parr3[10])[5];�Ǵ������ָ������飬ÿ��Ԫ������ʮ�����ݵ�����
	
	*/
	//������������Ҳ��һ��ָ�룬����������
	Calc(Add);


	return 0;
}







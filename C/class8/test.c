#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int Add(int x, int y) {
	return x + y;
}

int Sub(int x, int y) {
	return x - y;
}

void Calc(int (*pf)(int, int)) {
//ͨ��ʹ�ú���ָ�룬���Լ���������룬���
	int x, y;
	printf("please enter two number!\n");
	scanf("%d %d", &x, &y);
	int ret = pf(x, y);
	printf("%d\n", ret);
}


//int main() {
//
//	//(*(void(*)())0)();
//	//���ڲ��void��void(*)()��һ������ָ�����ͣ����ﲻ���������Ҳ�����ز���
//	//*(void(*)()) 0���ｫ0ǿ��ת��Ϊ�������ָ�����ͣ����ҵ�������������ָ��
//	//����������������������0��Ϊ��ַ���ĺ���
//
//	Calc(Add);
//	Calc(Sub);
//
//	return 0;
//
//
//}


//����ָ������飺
int main() {
	//������ָ��
	int (*p)(int, int) = Add;
	//���������Ҫʹ�ú���ָ������飺 ����Ҫ�������Ǵ����������������ͬ��������ͬ
	int(*arr[4])(int, int) = { Add,Sub };



}








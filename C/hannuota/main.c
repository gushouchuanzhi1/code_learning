/*��ŵ�������е������ڶ�̬�滮����
����Ҫ�ƶ�n���̣���Ҫ�ƶ������n-1���̣�Ȼ���ƶ������Ǹ���
���������������Ȱ�ǰ��n-1�����Ƶ�һ�������ϣ�Ȼ���ƶ���������̣�Ȼ��n-1������ȥ
�����ƶ�n����f(n)������ô���Եõ�����ʽ��
f(n) = 2 * f(n-1) + 1 */
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
	
int cal(int n) {
	if (n == 1) return 1;
	else return 2 * cal(n - 1) + 1;

}

int main() {
	int num = 0;
	printf("how many plates?\n");
	scanf("%d", &num);
	printf("you need %d move\n", cal(num));

	return 0;

}



#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

struct Stu{
	int age;
	char name[20];
};

struct Node
{
	int num;
	char name[20];
	struct Node* p;
};

struct s
{
	char c;
	int num;
	char a;
};

enum Day {//��Ԥ����׶ξ͵�����
	Mon, Tues, Wed, Thurs, Fri, Sat, Sun
};

int main() {
	printf("%d\n", sizeof(struct Node));
	printf("%d\n", sizeof(struct s));// 8 12����Ԫ�ص�������ı�
	enum Day d = Tues;
	printf("%d\n", Mon);
	printf("%d\n", d);

	return 0;
}

				
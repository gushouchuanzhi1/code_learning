#include <stdio.h>

extern int p;

//typedef
typedef struct Student {
	int num;
	char name[100];
	int age;
}Student;


//function
void print1() {
	int a = 1;
	printf("this is no static %d\n", a++);//�ȵ�����++
}

void print2() {
	static int a = 1;//static֮�������������´���
	printf("this is static %d\n", a++);//�ȵ�����++
}

int main() {
	float a = 7 / 2.0;
	printf("%.3f\n", a);

	char s[] = "array";
	printf("%d\n", sizeof(s));//6��������'\0'

	int i = 0;
	while (i < 10) {
		print1();
		print2();
		i++;
	}


	return 0;
}


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
	printf("this is no static %d\n", a++);//先调用再++
}

void print2() {
	static int a = 1;//static之后他不会再重新创建
	printf("this is static %d\n", a++);//先调用再++
}

int main() {
	float a = 7 / 2.0;
	printf("%.3f\n", a);

	char s[] = "array";
	printf("%d\n", sizeof(s));//6，包含了'\0'

	int i = 0;
	while (i < 10) {
		print1();
		print2();
		i++;
	}


	return 0;
}


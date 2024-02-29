#include <stdio.h>

void swap(int* a, int* b) {// * 为解地址符
	int c = 0;
	c = *a;
	*a = *b;
	*b = c;
}

void print(int a) {
	if(a >= 10) {
		print(a / 10);
	}
	printf("%d\n", a % 10);
}

int my_strlen(char* s) {//或者char arr[]也可以

	if (*s != '\0') {//记得是*s，要解地址符
		return 1 + my_strlen(s + 1);
	}
	else return 0;
}

int fib(int n) {
	if (n <= 2) return 1;
	else return fib(n - 1) + fib(n - 2);
}

int main() {
	int c = 4;
	printf("%#x\n", &c);
	int* p = &c;
	int** pp = &p;
	printf("%#x\n", pp);
	int a = 1;
	int b = 2;
	swap(&a, &b);
	printf("%d\n", a);

	int number = 1102;
	print(number);

	char s[] = "abc";
	printf("%d\n", my_strlen(s));

	printf("%d\n", fib(10));

	return 0;

}

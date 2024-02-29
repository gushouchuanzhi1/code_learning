#include <stdio.h>

void swap(int* a, int* b) {// * Îª½âµØÖ··û
	int c = 0;
	c = *a;
	*a = *b;
	*b = c;
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
	return 0;

}

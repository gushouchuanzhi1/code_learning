#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int Add(int x, int y) {
	return x + y;
}

int Sub(int x, int y) {
	return x - y;
}

void Calc(int (*pf)(int, int)) {
//通过使用函数指针，可以减少冗余代码，灵活
	int x, y;
	printf("please enter two number!\n");
	scanf("%d %d", &x, &y);
	int ret = pf(x, y);
	printf("%d\n", ret);
}


//int main() {
//
//	//(*(void(*)())0)();
//	//最内层的void：void(*)()是一个函数指针类型，这里不传入参数，也不返回参数
//	//*(void(*)()) 0这里将0强制转化为这个函数指针类型，并且调用了整个函数指针
//	//即调用了整个函数，调用0作为地址处的函数
//
//	Calc(Add);
//	Calc(Sub);
//
//	return 0;
//
//
//}


//函数指针的数组：
int main() {
	//函数的指针
	int (*p)(int, int) = Add;
	//如果我们需要使用函数指针的数组： 并且要求他们是传入参数类型数量相同，返回相同
	int(*arr[4])(int, int) = { Add,Sub };



}








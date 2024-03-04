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
	//将a的地址存入了p
	char* p = "avadscv";
	char arr1[] = "abv";
	char arr2[] = "abv";
	printf("%s\n",p);

	/*
	int arr[5];//整型数组
	int *parr1[10]//整型指针的数组
	int (*parr2)[10] 是数组指针
	int (*parr3[10])[5];是存放数组指针的数组，每个元素是有十个内容的数组
	
	*/
	//函数名本质上也是一个指针，类似于数组
	Calc(Add);


	return 0;
}







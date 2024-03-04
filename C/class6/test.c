#define _CRT_NO_SECURE_WARNINGS

#include <stdio.h>

int main() {
	int a = 1;
	if (*(char*)&a == 0) {//存储：01 00 00 00
		//由于int类型是4个字节，而char类型是1个字节
		//先把a地址取出来，&a是一个指针，强制转化成char类型指针，这样可以找到第一个字节的内容
		//再比较是0或者1来判断是什么存储
		printf("xiao\n");
	}
	else {
		printf("da\n");
	}
	unsigned char b = -1;//-1以补码来保存是11111111，然后以无符号来看，就是255了
	printf("%d\n", b);

	return 0;
}



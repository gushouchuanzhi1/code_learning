/*汉诺塔本身有点类似于动态规划问题
你想要移动n个盘，需要移动上面的n-1个盘，然后移动下面那个盘
这样考虑下来，先把前面n-1个盘移到一个柱子上，然后移动最下面的盘，然后将n-1盘移上去
假设移动n盘有f(n)方法那么可以得到迭代式：
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



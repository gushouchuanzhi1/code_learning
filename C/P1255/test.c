#include<stdio.h>

#define N 250//2000λ���ˣ�250*8

int  f[3][N + 10], g;
int n;
int main()
{
	f[0][N] = 1; f[1][N] = 1; scanf("%d", &n); if (!n) { puts("0"); return 0; }//0Ҫ����
	for (int i = 2; i <= n; i++)
		for (int j = N; j > 0; j--)
		{
			f[i % 3][j] = (f[(i + 1) % 3][j] + f[(i + 2) % 3][j] + g) % 100000000;
			g = (f[(i + 1) % 3][j] + f[(i + 2) % 3][j] + g) / 100000000;//8��0����©��
		}
	int j = 1;
	while (!f[n % 3][j] && j < N) j++;//����ǰ��0
	for (int i = j; i <= N; i++)
	{
		if (i != j) {//һ����©��ǰ�����
			if (f[n % 3][i] < 1e7) putchar(48);
			if (f[n % 3][i] < 1e6) putchar(48);
			if (f[n % 3][i] < 1e5) putchar(48);
			if (f[n % 3][i] < 1e4) putchar(48);
			if (f[n % 3][i] < 1e3) putchar(48);
			if (f[n % 3][i] < 1e2) putchar(48);
			if (f[n % 3][i] < 1e1) putchar(48);
		}//����ǰ��0
		printf("%d", f[n % 3][i]);//���
	}
}
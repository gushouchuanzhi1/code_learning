#pragma once
#include "game.h"

void InitBoard(char board[ROWS][COLS], int rows, int cols, char set) {
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			board[i][j] = set;
		}
	}
}

void DisplayBoard(char board[ROWS][COLS], int row, int col) {
	printf("----------------��Ϸ��ʼ------------------\n");
	for (int m = 0; m <= row; m++) {
		printf("%d ", m);
	}
	printf("\n");
	for (int i = 1; i <= row; i++) {
		printf("%d ", i);
		for (int j = 1; j <= col; j++) {
			printf("%c ", board[i][j]);
		}
		printf("\n");
	}
}

int GetMine(char mine[ROWS][COLS], int x, int y) {
	return (mine[x - 1][y - 1] + mine[x][y - 1] + 
		mine[x + 1][y - 1] + mine[x - 1][y] + mine[x + 1][y] + 
		mine[x - 1][y + 1] + mine[x][y + 1] + mine[x + 1][y + 1] - 8 * '0');
}

void SetMine(char board[ROWS][COLS], int row, int col) {
	int mine_number = 10;
	while (mine_number) {
		int x = rand() % row + 1;
		int y = rand() % col + 1;
		if (board[x][y] == '0') {
			board[x][y] = '1';
			mine_number--;
		}

	}
}

void FindMine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col) {
	int x = 0, y = 0;
	int noMineWindow = 0;
	while (noMineWindow < ROW * COL - 10) {
		printf("��������Ҫ�Ų������:>");
		scanf("%d %d", &x, &y);
		if (x < 1 || x > 9 || y < 1 || y > 9) {
			printf("������Ƿ���\n");
		}
		else {
			if (show[x][y] != '*'){
				printf("��ǰλ���Ѿ����Ų飡\n");
			}
			if (mine[x][y] == '1') {
				printf("��ǰλ���е��ף�\n");
				DisplayBoard(mine, ROW, COL);
				break;
			}
			else {
				int count = GetMine(mine, x, y);
				printf("��ǰλ����%d�����ף�\n", count);
				show[x][y] = count + '0';//ת�����ַ�
				DisplayBoard(show, ROW, COL);
			}
		}
		if (noMineWindow == row * col - 10) {
			printf("��ϲ�����׳ɹ���\n");
			DisplayBoard(show, row, col);
		}


	}
}



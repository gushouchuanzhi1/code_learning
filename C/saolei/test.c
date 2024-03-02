#pragma once
#include "game.h"

void Menu() {
	printf("**************\n");
	printf("****1.play****\n");
	printf("****0.exit****\n");
	printf("**************\n");
	printf("请输入你的操作：>");
}

void Game() {
	char mine[ROWS][COLS] = {0};//预设地雷
	char show[ROWS][COLS] = { 0 };//展示游戏的界面
	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(show, ROWS, COLS, '*');
	SetMine(mine, ROW, COL);
	DisplayBoard(show, ROW, COL);
	FindMine(mine, show, ROW, COL);


}


int main() {
	srand((unsigned int)time(NULL));
	int op = 0;
	while (1) {
		Menu();
		scanf("%d", &op);

		switch (op) {
		case 1:
			printf("开始扫雷游戏\n");
			Game();

			break;
		case 0:
			printf("退出扫雷游戏\n");


			break;

		default:
			printf("操作输入错误\n");

			break;

		}


	}
	
	
	
	
	return 0;
}

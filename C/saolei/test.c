#pragma once
#include "game.h"

void Menu() {
	printf("**************\n");
	printf("****1.play****\n");
	printf("****0.exit****\n");
	printf("**************\n");
	printf("��������Ĳ�����>");
}

void Game() {
	char mine[ROWS][COLS] = {0};//Ԥ�����
	char show[ROWS][COLS] = { 0 };//չʾ��Ϸ�Ľ���
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
			printf("��ʼɨ����Ϸ\n");
			Game();

			break;
		case 0:
			printf("�˳�ɨ����Ϸ\n");


			break;

		default:
			printf("�����������\n");

			break;

		}


	}
	
	
	
	
	return 0;
}

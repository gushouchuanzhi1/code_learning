#pragma once
#define _CRT_SECURE_NO_WARNINGS
//��Ϸ����Ĳ���
#include "game.h"



void menu() {
	printf("**************************\n");
	printf("****      1.play      ****\n");
	printf("****      0.exit      ****\n");
	printf("**************************\n");
	printf("���������Ĳ�����0,1��>");
}

void game() {
	char board[ROW][COL] = { 0 };
	InitBoard(board, ROW, COL);
	DispalyBoard(board, ROW, COL);
	char result = 'c';
	while (1) {//��Ҫ�ж�
		PlayerMove(board, ROW, COL);
		result = Judge(board, ROW, COL);
		if (result != 'c') {
			break;
		}
		DispalyBoard(board, ROW, COL);
		ComputerMove(board, ROW, COL);
		result = Judge(board, ROW, COL);
		if (result != 'c') {
			break;
		}
		DispalyBoard(board, ROW, COL);
		
	}
	if (result == '*') {
		printf("player win!\n");
		DispalyBoard(board, ROW, COL);
	}
	else if (result == '#') {
		printf("computer win!\n");
		DispalyBoard(board, ROW, COL);
	}
	else if (result == '-') {
		printf("no one win!\n");
		DispalyBoard(board, ROW, COL);
	}
	else {

	}
}


int main() {
	int op = 0;
	srand((unsigned)time(NULL));
	do
	{
		system("cls");
		menu();
		scanf("%d", &op);
		switch (op)
		{
		case 1:
			printf("game start!\n");
			game();

			break;
		case 0:
			printf("game exit! \n");

			break;

		default:
			printf("�������\n");

			break;
		}
		getchar();
		getchar();

	} while (op); 


	return 0;
}



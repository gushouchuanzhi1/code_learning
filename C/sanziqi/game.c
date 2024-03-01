#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include "game.h"
#include <stdio.h>
//游戏代码的实现

void InitBoard(char board[ROW][COL], int row, int col) {
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			board[i][j] = ' ';
		}
	}

}

void DispalyBoard(char board[ROW][COL], int row, int col) {
	//需要打印棋子还需要打印棋盘
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			if (j != col - 1) {
				printf(" %c |", board[i][j]);
			}
			else {
				printf(" %c \n", board[i][j]);
			}
		}
		//printf(" %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
		if (i < row - 1) {
			printf("---|---|---\n");
		}
	}
}

void PlayerMove(char board[ROW][COL], int row, int col) {
	while (1) {
		printf("player move:>\n");
		printf("please enter your x y:>");
		int x = 0, y = 0;
		scanf("%d %d", &x, &y);
		if (x >= 1 && x <= 3 && y >= 1 && y <= 3) {
			if (board[x - 1][y - 1] == ' ') {
				board[x - 1][y - 1] = '*';
				break;
			}
			else {
				printf("this place is used!\n");
			}
		}
		else {
			printf("the x y is illegal!\n");
		}
	}

}


void ComputerMove(char board[ROW][COL], int row, int col) {
	printf("computer move!:>\n");
	int x = 0, y = 0;
	while (1) {
		x = rand() % row;
		y = rand() % col;
		if (board[x - 1][y - 1] == ' ') {
			board[x - 1][y - 1] = '#';
			break;
		}
	}

}

bool IsFull(char board[ROW][COL], int row, int col) {
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			if (board[i][j] == ' ') return false;
		}
	}
	return true;
}


char Judge(char board[ROW][COL], int row, int col) {
	for (int i = 0; i < row; i++) {
		if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' ') {
			return board[i][0];
		}
	}
	for (int j = 0; j < col; j++) {
		if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] != ' ') {
			return board[0][j];
		}
	}
	if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
		return board[1][1];
	}
	if (board[0][2] == board[1][1] && board[2][0] == board[1][1] && board[1][1] != ' ') {
		return board[1][1];
	}
	//平局
	if (IsFull(board, row, col)) {
		return '-';
	}
	return 'c';//continue
}
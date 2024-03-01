#pragma once
#define _CRT_SECURE_NO_WARNINGS
//游戏代码的声明
#define ROW 3
#define COL 3
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

void InitBoard(char board[ROW][COL], int row, int col);
void DispalyBoard(char board[ROW][COL], int row, int col);
void PlayerMove(char board[ROW][COL], int row, int col);
void ComputerMove(char board[ROW][COL], int row, int col);
char Judge(char board[ROW][COL], int row, int col);
bool IsFull(char board[ROW][COL], int row, int col);



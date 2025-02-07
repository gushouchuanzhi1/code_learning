#pragma once
#define _CRT_SECURE_NO_WARNINGS

#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#include <stdio.h>
#include <time.h>
#include <stdlib.h>

void InitBoard(char board[ROWS][COLS], int rows, int cols, char set);
void DisplayBoard(char board[ROWS][COLS], int row, int col);
void SetMine(char board[ROWS][COLS], int row, int col);
void FindMine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col);
int GetMine(char mine[ROWS][COLS], int x, int y);




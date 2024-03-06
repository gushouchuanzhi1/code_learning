#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <errno.h>

int main() {
	//write
	FILE* wpf = fopen("test.txt", "w");
	if (wpf == NULL) {
		//printf("%s\n", strerror(errno));
		perror(fopen);
		return 1;
	}
	for (char i = 'a'; i <= 'z'; i++) {
		fputc(i, wpf);
		fputc(' ', wpf); 
	}
	char name[20] = "asdfwefa";
	fputs(name, wpf);
	fclose(wpf);
	wpf = NULL;

	//read
	FILE* rpf = fopen("test.txt", "r");
	int ch = fgetc(rpf);
	printf("%c\n", ch);
	char getstring[50];
	fgets(getstring, 50, rpf);
	puts(getstring);
	fclose(rpf);
	rpf = NULL;
	


	return 0;
}




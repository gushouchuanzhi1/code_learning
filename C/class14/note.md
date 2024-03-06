文件的读写以及打开
这里代表对文件操作的字符无论单个与否，都需要用双引号来标注，
而char类型的字符填写需要使用单引号

1.打开文件流
FILE* pf = fopen("test.txt", "w");
if (pf == NULL) {
	printf("error\n");
	return 1;
}


2.增添读取单个字符
//write
fputc('a', pf);

int fgetc(char,FILE * stream);
fgetc函数最后返回的int类型，如果需要输出字符型或者别的类型，需要注意转换。


3.增添读取一行内容（字符数组）
int fputs(const char *str, FILE *stream)该函数返回一个非负值，如果发生错误则返回 EOF。

char *fgets(char *str, int n, FILE *stream)
如果成功，该函数返回相同的 str 参数。如果到达文件末尾或者没有读取到任何字符，str 的内容保持不变，并返回一个空指针。
如果发生错误，返回一个空指针。
char getstring[50];
fgets(getstring, 50, rpf);
puts(getstring);
需要自己定义一个字符数组来接受这个读取的指针，函数的n是读取的最多的字符数量，包括'\0'


4.
int fprintf(FILE *stream, const char *format, ...)，将我的信息按照格式要求打印到文件之中
int fscanf(FILE *stream, const char *format, ...) 同理，将文件中的内容，按照我的要求读取出来


5.二进制写和读
size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream)
参数
ptr -- 这是指向要被写入的元素数组的指针。
size -- 这是要被写入的每个元素的大小，以字节为单位。
nmemb -- 这是元素的个数，每个元素的大小为 size 字节。
stream -- 这是指向 FILE 对象的指针，该 FILE 对象指定了一个输出流。
返回值
如果成功，该函数返回一个 size_t 对象，表示元素的总数，该对象是一个整型数据类型。
如果该数字与 nmemb 参数不同，则会显示一个错误。

size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream)

参数
ptr -- 这是指向带有最小尺寸 size*nmemb 字节的内存块的指针。
size -- 这是要读取的每个元素的大小，以字节为单位。
nmemb -- 这是元素的个数，每个元素的大小为 size 字节。
stream -- 这是指向 FILE 对象的指针，该 FILE 对象指定了一个输入流。
返回值
成功读取的元素总数会以 size_t 对象返回，size_t 对象是一个整型数据类型。如果总数与 nmemb 参数不同，则可能发生了一个错误或者到达了文件末尾。

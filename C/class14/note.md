�ļ��Ķ�д�Լ���
���������ļ��������ַ����۵�����񣬶���Ҫ��˫��������ע��
��char���͵��ַ���д��Ҫʹ�õ�����

1.���ļ���
FILE* pf = fopen("test.txt", "w");
if (pf == NULL) {
	printf("error\n");
	return 1;
}


2.�����ȡ�����ַ�
//write
fputc('a', pf);

int fgetc(char,FILE * stream);
fgetc������󷵻ص�int���ͣ������Ҫ����ַ��ͻ��߱�����ͣ���Ҫע��ת����


3.�����ȡһ�����ݣ��ַ����飩
int fputs(const char *str, FILE *stream)�ú�������һ���Ǹ�ֵ��������������򷵻� EOF��

char *fgets(char *str, int n, FILE *stream)
����ɹ����ú���������ͬ�� str ��������������ļ�ĩβ����û�ж�ȡ���κ��ַ���str �����ݱ��ֲ��䣬������һ����ָ�롣
����������󣬷���һ����ָ�롣
char getstring[50];
fgets(getstring, 50, rpf);
puts(getstring);
��Ҫ�Լ�����һ���ַ����������������ȡ��ָ�룬������n�Ƕ�ȡ�������ַ�����������'\0'


4.
int fprintf(FILE *stream, const char *format, ...)�����ҵ���Ϣ���ո�ʽҪ���ӡ���ļ�֮��
int fscanf(FILE *stream, const char *format, ...) ͬ�����ļ��е����ݣ������ҵ�Ҫ���ȡ����


5.������д�Ͷ�
size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream)
����
ptr -- ����ָ��Ҫ��д���Ԫ�������ָ�롣
size -- ����Ҫ��д���ÿ��Ԫ�صĴ�С�����ֽ�Ϊ��λ��
nmemb -- ����Ԫ�صĸ�����ÿ��Ԫ�صĴ�СΪ size �ֽڡ�
stream -- ����ָ�� FILE �����ָ�룬�� FILE ����ָ����һ���������
����ֵ
����ɹ����ú�������һ�� size_t ���󣬱�ʾԪ�ص��������ö�����һ�������������͡�
����������� nmemb ������ͬ�������ʾһ������

size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream)

����
ptr -- ����ָ�������С�ߴ� size*nmemb �ֽڵ��ڴ���ָ�롣
size -- ����Ҫ��ȡ��ÿ��Ԫ�صĴ�С�����ֽ�Ϊ��λ��
nmemb -- ����Ԫ�صĸ�����ÿ��Ԫ�صĴ�СΪ size �ֽڡ�
stream -- ����ָ�� FILE �����ָ�룬�� FILE ����ָ����һ����������
����ֵ
�ɹ���ȡ��Ԫ���������� size_t ���󷵻أ�size_t ������һ�������������͡���������� nmemb ������ͬ������ܷ�����һ��������ߵ������ļ�ĩβ��

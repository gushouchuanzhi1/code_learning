��̬�ڴ���䣺

malloc free calloc realloc

malloc����
extern void *malloc(unsigned int num_bytes); 

��������ֽڵĴ�С������ʹ��sizeof��ȷ��
int* arr2 = (int*)malloc(40);,����󷵻ص����� ��Ϊ��void* ����ת����int*����


free���� ��mallocʹ�õ��ڴ�����ʹ�����Ҫ�ǵ�ʹ��free���ͷ�


calloc����void *calloc(size_t nitems, size_t size)
����������ڴ�ռ䣬������һ��ָ������ָ�룬�����ڷ���ռ��ʱ����ʼ��Ϊ0


realloc ���� ���µ����Ѿ�����Ŀռ�Ĵ�С
 void *realloc(void *ptr, size_t size) 
 �������µ���֮ǰ���� malloc �� calloc ������� ptr ��ָ����ڴ��Ĵ�С��


�����Զ�ͬһ�鶯̬����Ŀռ��ͷ����Σ������ԶԾ�̬�ڴ�����ͷ�
��̬�����ڴ�һ��Ҫ�ǵ��ͷţ�����alloc��realloc��calloc������ڴ�ǵ�free��


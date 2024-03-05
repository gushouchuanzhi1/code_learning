内存函数：
void * memcpy(void *destination,void * source,size_t num)
复制的内存起始地址，以及复制的大小。这里复制的大小单位是字节，一个int是4个字节之类，这里的大小需要计算

void * memmove ( void * destination, const void * source, size_t num );
目的地：指向要在其中复制内容的目标数组的指针，类型转换为 void* 类型的指针。
源：指向要复制的数据源的指针，类型转换为 const void* 类型的指针。
数字：要复制的字节数。（size_t 是无符号整数类型）
这个函数和memcpy的区别在于memmove中源目标地址和目标地址可以重叠

int memcmp ( const void * ptr1, const void * ptr2, size_t num );
小于0:在两个内存块中不匹配的第一个字节在 ptr1 中的值低于在 ptr2 中的值（如果计算为无符号 char 值）
0:两个内存块的内容相等
大于0:在两个内存块中不匹配的第一个字节在 ptr1 中的值大于在 ptr2 中的值（如果计算为无符号字符值）

void *memset(void *str, int c, size_t n) 将从str开始的后面n个字符改为c，对每一个字节来进行修改，即两个十六进制数
这里如果是改为int类型，对应每个字节，8位，会修改为01（两位十六进制数），导致一个int的变量变成01010101（8位十六进制数）





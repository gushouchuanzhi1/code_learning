动态内存分配：

malloc free calloc realloc

malloc函数
extern void *malloc(unsigned int num_bytes); 

分配多少字节的大小，可以使用sizeof来确定
int* arr2 = (int*)malloc(40);,将最后返回的类型 因为是void* 所以转化成int*类型


free函数 当malloc使用的内存区域使用完后，要记得使用free来释放


calloc函数void *calloc(size_t nitems, size_t size)
分配所需的内存空间，并返回一个指向它的指针，并且在分配空间的时候会初始化为0


realloc 函数 重新调整已经分配的空间的大小
 void *realloc(void *ptr, size_t size) 
 尝试重新调整之前调用 malloc 或 calloc 所分配的 ptr 所指向的内存块的大小。


不可以对同一块动态分配的空间释放两次，不可以对静态内存进行释放
动态开辟内存一定要记得释放，对于alloc、realloc、calloc分配的内存记得free！


动态内存空间的相关问题：
野指针问题，在函数中的指针，在函数结束之后会将该内存空间归还给操作系统，
这样就导致了野指针问题，因为内存空间交还给操作系统了，可能会有新的内容进行覆盖


柔性数组：
结构中的数组成员前面至少有一个其他成员，并且柔性数组大小未知，
如果需要使用malloc对其进行动态内存分配，需要分配较多的内存给它







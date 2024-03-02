p是一个指针变量的名字，表示此指针变量指向的内存地址，如果使用%p来输出的话，它将是一个16进制数。

*p表示此指针指向的内存地址中存放的内容，一般是一个和指针类型一致的变量或者常量。 

&是取地址运算符，&p就是取指针p的地址。

结构体：
typedef struct Student {
	char name[20];
	int age;
	int grade;
}Student, * Student;
//这个相当于把“struct Student”这个类型命名为Student了
//struct Student s 等价于 Student s

release版本是用户看到的版本，而debug版本是程序员使用的版本










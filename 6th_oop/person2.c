#include <stdio.h>

struct person{
	char *name;
};

int main(int argc, char **argv)
{
	struct person p1 = {"Zhangsan"};
	struct person p2 = {"Lishi"};

	printf("%s\n", p1.name);
	printf("%s\n", p2.name);

	return 0;
}

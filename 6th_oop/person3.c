#include <stdio.h>

struct person{
	char *name;
	void (*printName)(struct person *per);
};

void printName(struct person *per)
{
	printf("Guangdong %s\n", per->name);
}

int main(int argc, char **argv)
{
	struct person p1 = {"Zhangsan", printName};
	struct person p2 = {"Lishi", printName};

	p1.printName(&p1);
	p2.printName(&p2);

	return 0;
}

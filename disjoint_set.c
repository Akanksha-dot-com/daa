#include<stdio.h>
#define SIZE 100
void simpleunion(int set[],int i , int j);
void display();
void simplefind(int set[],int *i);
int main()
{
	int a,i,n,ch,x,y,num;
	int set[SIZE];
	printf("\nEnter the number of element in set: ");//thinking that every element is a set
	scanf("%d",&n);
	for(i = 1; i <= n; i++)
	{
		set[i] = -1;
	}
	while(1)
	{
		printf("\n1.UNION \n2.FIND \n3.DISPLAY");
		printf("\nEnter your choice: ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1: printf("\nEnter the two elements for union: ");
					scanf("%d %d",&x,&y);
					simpleunion(set,x,y);
					break;
			case 2: printf("\nEnter the element which you want to find: ");
					scanf("%d",&num);
					a = num;
					simplefind(set,&num);
					printf("\nElement %d is found in a set of %d  root",a,num);
					break;
			case 3: display(set,n);
			
			default: break;
		}
	}
	return 0;	
}
void simpleunion(int set[],int i , int j)
{
	set[i] = j;
}
void display(int set[],int n)
{
	int i;
	printf("\nset martix is being displayed(-1 for root)");
	for(i = 1 ; i <= n ; i++)
	{
		printf("\nnode %d -> %d",i,set[i]);
	}
}
void simplefind(int set[],int *i)
{
	while(set[*i] > 0)
		*i = set[*i];
		
}
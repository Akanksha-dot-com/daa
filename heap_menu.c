#include<stdio.h>
#define SIZE 100
void display(int arr[], int n);
void insert(int arr[],int n);
void delmax(int arr[],int *n, int *x);
void adjust(int arr[],int i,int n);
int main()
{
	int ch,n=0,x,num,i;
	int arr[SIZE];
	while(1)
	{
		printf("\n________________________");
	printf("\n1.INSERT \n2.DELETE \n3.DISPLAY");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:n++;
			printf("\nEnter the number to insert: ");
			scanf("%d",&num);
			arr[n] = num;
			insert(arr,n);
			break;
		case 2: 
			delmax(arr,&n,&x);
			printf("\nThe number deleted is : %d",x);
			break;
		case 3:
			printf("\nElements in array are: ");
			for(i = 1; i <= n; i++)
			{
				printf("%d--",arr[i]);
			}
	}
	}
	
	return 0;
}
void insert(int arr[],int n)
{
	int temp,i;
	i = n;
	temp = arr[n];
	while( (i > 1) && arr[i/2] < temp)
	{
		arr[i] = arr[i/2];
		i = i / 2;
	}
	arr[i]= temp;
	
}
void delmax(int arr[],int *n, int *x)
{
	if(*n == 0)
	{
		printf("\nThe heap is empty");
	}
	*x = arr[1];
	arr[1] = arr[*n];
	*n = *n - 1;
	adjust(arr,1,*n);
}
void adjust(int arr[],int i,int n)
{    
	int item,j;
	item = arr[i];
	j = 2*i;
	while(j <= n)
	{
		if(j < n && arr[j]< arr[j+1])        
		{
			j = j+1;
		}
		if(item >= arr[j])
				break;
		arr[j/2] = arr[j];
		j = 2*j;
	}
	arr[(j/2)] = item;
}
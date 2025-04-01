#include<stdio.h>
#define SIZE 100
void insert(int arr[],int n);
void delmax(int arr[],int *n, int *x);
void adjust(int arr[],int i,int n);
int main()

{
	int i,n,x;
	int arr[SIZE];
	printf("\nEnter the number you want to insert :");
	scanf("%d",&n);
	printf("\nEnter the elements you want to insert :");
	for( i = 1 ; i <= n ; i++)
	{
		scanf("%d",&arr[i]);
		insert(arr,i);
	}
	for(i = 1; i <= n ; i++)
	{
		printf("%d--",arr[i]);
	}
	printf("\nNow calling for deletion: ");
	delmax(arr,&n,&x);
	printf("\nNumber deleted is :%d",x);
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
		i = i/2;
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
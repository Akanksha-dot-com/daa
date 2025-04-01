#include<stdio.h>
#define SIZE 100
void quick_sort(int arr[],int p, int q);
void partition(int arr[],int p, int q,int *j);
void interchange(int arr[],int i, int j);
int main()
{
	int arr[SIZE],i,n;
	printf("\nEnter the numbers of element in array(1-10): ");
	scanf("%d",&n);
	printf("\nEnter the elements in array: ");
	for(i = 1 ; i <= n ;i++)
	{
		scanf("%d",&arr[i]);	
	}
	quick_sort(arr,1,n);
	for(i = 1 ; i <= n ;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	return 0;
}
void quick_sort(int arr[],int p, int q)
{
	int j;
	if(p < q)
	{
		partition(arr,p,q+1,&j);
		quick_sort(arr,p,j-1);
		quick_sort(arr,j+1,q);	
	}
}
void partition(int arr[], int p, int q,int *j)
{
	int t,i;
	t = arr[p];
	i = p;
	*j = q;
	do
	{
		do
		{
			i++;
		}while(arr[i] < t);
		do
		{
			--*j;
		}while(arr[*j] > t);
		if(i < *j)
			interchange(arr,i,*j);
	}while(i<*j);
	arr[p] = arr[*j];
	arr[*j] = t;
	
}
void interchange(int arr[],int i ,int j)
{
	int temp;
	temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

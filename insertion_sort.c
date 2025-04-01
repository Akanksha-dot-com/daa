#include<stdio.h>
#define SIZE 10
#include<conio.h>
void insertion_sort(int arr[], int n);
int main()
{
	int arr[SIZE];
	int i,n,x,key,num,count;
	printf("\nEnter the numbers of element in array(1-10): ");
	scanf("%d",&n);
	printf("\nEnter the elements in array: ");
	for(i = 0 ; i < n ;i++)
	{
		scanf("%d",&x);
		arr[i] = x;
		
	}
	insertion_sort(arr,n);
	for(i = 0 ; i < n ;i++)
	{
		printf("%d",arr[i]);
	}
	
	return 0;
}
void insertion_sort(int arr[],int n)
{
	int i,j,x;
	for(i = 1; i < n; i++)
	{
		x = arr[i];
		j = i;
		while(arr[j-1] > x && j > 0)
		{
			arr[j] = arr[j-1];
			j--;
		}
		if(i != j)
		{
			arr[j] = x;
		}
	}
}
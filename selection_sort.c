#include<stdio.h>
#define SIZE 10
#include<conio.h>
void selection_sort(int arr[], int n);
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
	selection_sort(arr,n);
	for(i = 0 ; i < n ;i++)
	{
		printf("%d",arr[i]);
	}
	
	return 0;
}
void selection_sort(int arr[],int n)
{
	int i,j,temp,min;
	for(i = 0 ; i < n-1; i ++)
	{
		min = i;
		for(j = i+1; j < n; j++)
		{
			if(arr[i] > arr[j])
			{
				min = j;
			}
		}
		if(min != i)
		{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			
		}
		
	}
}
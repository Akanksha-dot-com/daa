#include<stdio.h>
#define SIZE 10
#include<conio.h>
void bubble_sort(int arr[], int n);
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
	bubble_sort(arr,n);
	for(i = 0 ; i < n ;i++)
	{
		printf("%d",arr[i]);
	}
	
	return 0;
}
void bubble_sort(int arr[], int n)
{
	int i,j,flag,temp;
	for( i = 0 ; i < n-1; i ++)
	{
		flag =  0; 
		for(j = 0 ; j < n-1-i ; j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				flag = 1;
			}
			if(flag = 0)
				break;
		}
	}
	
}

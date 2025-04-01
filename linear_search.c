#include<stdio.h>
#define SIZE 10
#include<conio.h>
int linear_search(int arr[],int key, int n);
int frequency_count(int arr[],int key, int n);
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
	printf("\nEnter the number you want to search: ");
	scanf("%d",&key);
	num = linear_search(arr,key,n);
	if( num == -111)
		printf("\nElement not found");
	else
	{
		count =  frequency_count(arr,key,n);
		printf("\nElement found %d times and at index %d",count,num);
	}
	return 0;
}
int linear_search(int arr[],int key, int n)
{
	int i,index = -111;
	for( i = 0; i < n ; i++ )
	{
		if(arr[i] == key)
		{
			index = i;
		}
	}
	return index;
}
int frequency_count(int arr[],int key, int n)
{
	int i,c = 0;
	for( i = 0; i < n ; i++ )
	{
		if(arr[i] == key)
		{
			c++;
		}
	}
	return c;
}

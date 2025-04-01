#include<stdio.h>
#define SIZE 100
void straightmaxmin(int arr[],int n,int *min,int *max);
int main()
{
	int i,n,max,min;
	int arr[SIZE];
	printf("\nEnter the number of element you want to insert in array: ");
	scanf("%d",&n);
	printf("\nEnter the element you want to insert in array: ");
	for(i = 1; i <= n; i++)
	{
		scanf("%d",&arr[i]);
	}
	straightmaxmin(arr,n,&min,&max);
	printf("\nMaximum element in array is: %d",max);
	printf("\nMinimum element in array is: %d",min);
	return 0;
}
void straightmaxmin(int arr[],int n,int *min,int *max)
{
	int i;
	*max = *min = arr[1];
	for(i = 2; i <= n ; i++ )
	{
		if(arr[i] > *max )
			*max = arr[i];
		else if(arr[i] < *min)
			*min = arr[i];
		else
			continue;
	}
}
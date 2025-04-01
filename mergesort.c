#include<stdio.h>
#define SIZE 10
void merge_sort(int arr[],int b[],int low, int high);
void merge(int arr[],int b[],int low,int mid, int high);
int main()
{
	int arr[SIZE],b[SIZE],i,n;
	printf("\nEnter the numbers of element in array(1-10): ");
	scanf("%d",&n);
	printf("\nEnter the elements in array: ");
	for(i = 1 ; i <= n ;i++)
	{
		scanf("%d",&arr[i]);	
	}
	merge_sort(arr,b,1,n);
	for(i = 1 ; i <= n ;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	return 0;
}
void merge_sort(int arr[],int b[],int low,int high)
{
	int mid;
	if(low<high)
	{
		mid = (low + high)/2;
		merge_sort(arr,b,low,mid);
		merge_sort(arr,b,mid+1, high);
		merge(arr,b,low, mid , high);
	}
}
void merge(int arr[],int b[],int low, int mid, int high)
{
	int i,j,k,l;
	i = low;
	j = mid+1;
	k = low;
	while((i<= mid)&&(j <= high))
	{
		if(arr[i] <= arr[j])
		{
			b[k] = arr[i];
			i++;
		}
		else
		{
			b[k] = arr[j];
			j++;
		}
		k++;
	}
	if(i > mid)
	{
		for(l = j ; l <= high; l++ )
		{
			b[k] = arr[l];
			k++;
		}
	}
	else
	{
		for(l = i ; l<= mid; l++ )
		{
			b[k] = arr[l];
			k++;
		}
	}
	for( l = low; l <= high; l++)
	{
		arr[l] = b[l]; 
	}
	
}
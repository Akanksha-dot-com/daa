#include<stdio.h>
#define SIZE 100
void maxmin(int arr[],int i,int j,int *max,int *min);
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
	maxmin(arr,1,n,&max,&min);
	printf("\nMaximum element in array is: %d",max);
	printf("\nMinimum element in array is: %d",min);
	return 0;
}
void maxmin(int arr[],int i,int j,int *max,int *min)
{
	int mid,max1,min1;
	if(i == j)//small problem 
		*min = *max = arr[1];
	else
	{
		if(i == j -1)// 2 element array
		{
			if(arr[i] < arr[j])
			{
				*max = arr[j];
				*min = arr[i];
			}
			else
			{
				*max = arr[i];
				*min = arr[j];
			}
		}
		else
		{
			mid = (i + j)/2;
			maxmin(arr,i,mid,max,min);		
			maxmin(arr,mid+1,j,&max1,&min1);
			if(*max < max1 )
				*max = max1;
			if(*min > min1)
				*min = min1; 
			
		}
	}
}
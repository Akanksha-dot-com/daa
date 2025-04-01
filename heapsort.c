#include<stdio.h>
#define SIZE 100
void heapsort(int arr[], int n)
void heapify(int arr,int n);
void adjust(int arr[], int n)
int main()
{
	
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
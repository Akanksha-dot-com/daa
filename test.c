#include<stdio.h>
#define SIZE 100
void binsrch(int arr[],int low,int high,int key,int *ans);
int main()
{
	int arr[SIZE];
	int i,n,x,key,num,count,ans;
	printf("\nEnter the numbers of element in array(1-10): ");
	scanf("%d",&n);
	printf("\nEnter the elements in array: ");
	for(i = 1 ; i <= n ;i++)
	{
		scanf("%d",&x);
		arr[i] = x;
		
	}
	printf("\nEnter the number you want to search: ");
	scanf("%d",&key);
	binsrch(arr,1,n,key,&ans);
	if( ans == 0)
		printf("\nElement not found");
	else
	{
		
		printf("\nElement is at index %d",ans);
	}
	return 0;
}
int binsrch(int arr[],int low,int high,int key,int *ans)
{
	int mid;
	if(low >high)
		*ans = 0;
	else
	{
		mid = (low + high)/2;
		return key == arr[mid] ?  mid : key > arr[mid] ? binsrch(arr,mid+1,high,key,ans): binsrch(arr,low,mid+1,key,ans);
	}
}
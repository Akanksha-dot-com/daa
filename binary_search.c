#include<conio.h>
int binary_search(int arr[],int key, int n);

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
	num = binary_search(arr,key,n);
	if( num == -111)
		printf("\nElement not found");
	else
	{
		
		printf("\nElement found %d times and at index %d",num);
	}
	return 0;
}
int binary_search(int arr[], int key, int n)
{
	int l,h,mid=-111;
	l = 0 ;
	h = n;
	mid = (l+h)/2;
	while(l<=h)
	{
		if(a[mid] == key)
			return mid;
		else if(arr[mid] > key)
			h = mid - 1;
		else
			l = mid + 1;
	mid = (l+h)/2;
	return 
		
	}
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

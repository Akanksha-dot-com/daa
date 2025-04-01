#include<stdio.h>
#define SIZE 10
int main()
{
	int i,j,n,m,x;
	int arr[SIZE][SIZE];
	printf("\nEnter the number of vertex you want to insert(1-10): ");
	scanf("%d",&n);
	for(i = 1 ; i <= n; i++)
	{
		for(j = 1; j <= n; j++)
			arr[i][j] = 0;//insertion
	}
	for(i = 1; i <= n; i++)
	{
		printf("\nEnter which edges you want to connect with %d \nElse to terminate enter -1:",i);
		
		scanf("%d",&x);
		while(x != -1)
		{
			arr[i][x] = 1;
			scanf("%d",&x);
			
		}
	}
	for(i = 1 ; i <= n ; i++)
	{
		for(j = 1 ; j <= n ; j++)
			printf("\na[%d][%d] = %d",i,j,arr[i][j]);//display
		printf("\n");
	}
	
	
	
	return 0;
}
#include<stdio.h>
#define SIZE 10
int main()
{
	int i,j,n,m,x,y;
	int arr[SIZE][SIZE];
	printf("\nEnter the number of vertex you want to insert(1-10): ");
	scanf("%d",&n);
	printf("\nEnter the number of edges you want to insert(1-10): ");
	scanf("%d",&m);
	for(i = 1 ; i <= n; i++)
	{
		for(j = 1; j <= n; j++)
			arr[i][j] = 0;//insertion
	}
	for(i = 1; i <= m; i++)
	{
		printf("\nEnter the vertex you want to connect: ");
		scanf("%d %d",&x,&y);//vertex connection
		arr[x][y] = 1;
		arr[y][x] = 1;
	}
	for(i = 1 ; i <= n ; i++)
	{
		for(j = 1 ; j <= n ; j++)
			printf("\na[%d][%d] = %d",i,j,arr[i][j]);//display
		printf("\n");
	}
	
	
	
	return 0;
}
#include<stdio.h>
#define SIZE 100
void dfs(int arr[SIZE][SIZE],int visited[],int v,int n);
void dft(int arr[SIZE][SIZE],int n);
int main()
{
	int i,j,n,m,x,y,v;
	int arr[SIZE][SIZE];
	printf("\nEnter the number of node you want to insert(1-10): ");
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
	printf("\nThe elements in matrix are: ");
	for(i = 1 ; i <= n ; i++)
	{
		for(j = 1 ; j <= n ; j++)
			printf("\na[%d][%d] = %d",i,j,arr[i][j]);//display
		printf("\n");
	}

	dft(arr,n);
	return 0;
}
void dft(int arr[SIZE][SIZE],int n)
{
	int i;
	int visited[n];
	for(i = 1; i <= n ; i++)
		visited[i] = 0;
	for(i = 1 ; i <= n; i++)
	{
		if(visited[i] == 0)
			dfs(arr,visited,i,n);
	}
}
void dfs(int arr[SIZE][SIZE],int visited[],int v,int n)
{
	int i;
	visited[v] = 1;
	printf("%d--",v);
		for(i = 1; i <= n ;i++ )
		{
			if(arr[v][i] == 1)
			{
				if(visited[i] == 0)
					dfs(arr,visited,i,n);
			}
		}
}

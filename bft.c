#include<stdio.h>
#define SIZE 100
int queue[SIZE];
int front = -1;
int rear = -1;
void enqueue(int num);
int dequeue();
void bfs(int arr[SIZE][SIZE],int visited[],int v,int n);
void bft(int arr[SIZE][SIZE],int n);
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
//	printf("\nEnter the node from which you want to display: ");
//	scanf("%d",&v)
	bft(arr,n);
	return 0;
}
void bft(int arr[SIZE][SIZE],int n)
{
	int i;
	int visited[n];
	for(i = 1; i <= n ; i++)
		visited[i] = 0;
	for(i = 1 ; i <= n; i++)
	{
		if(visited[i] == 0)
			bfs(arr,visited,i,n);
	}
}
void bfs(int arr[SIZE][SIZE],int visited[],int v,int n)
{
	int i,w;
	int u = v;
	visited[v] = 1;
	printf("%d--",v);
	while(1)
	{
		for(i = 1; i <= n ;i++ )
		{
			if(arr[u][i] == 1)
			{
				w = i;
				if(visited[w] == 0)
				{
					enqueue(w);
					visited[w] = 1;
					printf("%d--",w);
				}
			}
		}
		u = dequeue();
		if(u == -111)
			return;
	}
}
void enqueue(int num)
{
	if(rear >= SIZE-1)
	{
		printf("\nQUEUE OVERFLOW");
		return;
	}
	if(front == -1)
		front = rear = 0;
	else
		rear++;
	queue[rear] = num;
}
int dequeue()
{
	int temp;
	if(front == -1)
	{
		return -111;
	}
	temp = queue[front];
	if(front == rear)
		rear = front = -1;
	else
		front++;
	return temp;
	
}

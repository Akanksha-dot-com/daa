#include<stdio.h>
#define SIZE 30
void bft(int arr[][SIZE],int n);
void bfs(int v,int arr[][SIZE],int n,int visited[]);
void enqueue(int n,int queue[],int *f,int *r);
void dequeue(int *u,int queue[],int *f,int *r);
void main()
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
    bft(arr,n);
}
void bft(int arr[][SIZE],int n)
{
    int visited[SIZE],i;
    for(i = 1; i <= n; i++)
        visited[i] = 0;
    for(i = 1; i <= n; i++)
    {
        if(visited[i] == 0)
            bfs(i,arr,n,visited);
    }
}
void bfs(int v,int arr[][SIZE],int n,int visited[])
{
    int queue[SIZE],i,u,w,f,r;
    f = r = -1;
    for(i = 1; i <= n; i++)
        queue[i] = 0;
    u = v;
    visited[u] = 1;
    printf("%d  ",u);
    while(1)
    {
        for(i = 1; i <= n; i++)
        {
            if(arr[u][i] == 1)
            {
                w = i;
                if(visited[w] == 0)
                {
                    visited[w] = 1;
                    printf("%d ",w);
                    enqueue(w,queue,&f,&r);
                }
            }
        }
        if(f == -1)
            return;
        else
            dequeue(&u,queue,&f,&r);
    }
}
void enqueue(int n, int queue[], int *f, int *r) {
    if (*r >= SIZE - 1) {
        printf("\nQueue overflow");
        return;
    }

    if (*f == -1)
        *f = 0;

    (*r)++;
    queue[*r] = n;
}
void dequeue(int *u, int queue[], int *f, int *r) {
    if (*f == -1) {
        printf("\nQueue is empty");
        return;
    }

    *u = queue[*f];

    if (*f == *r)
        *f = *r = -1;  
    else
        (*f)++;
}
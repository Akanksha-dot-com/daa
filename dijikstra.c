#include<stdio.h>
#define SIZE 100
#define INF 999999
void shortestpath(int v,float cost[][SIZE],float dist[],int n);
void main()
{
    int v,i,j,n,m,x,y;
	float cost[SIZE][SIZE],dist[SIZE], wt;
	printf("\nEnter the number of vertex: ");
	scanf("%d",&n);
	printf("\nEnter the number of edges: ");
	scanf("%d",&m);
	for(i = 1 ; i <= n; i++)
	{
		for(j = 1; j <= n; j++)
			cost[i][j] = INF;//insertion
	}
	for(i = 1; i <= m; i++)
	{
		printf("\nEnter the vertex you want to connect: ");
		scanf("%d %d",&x,&y);//vertex connection
		printf("\nEnter the weight of edge: ");
		scanf("%f",&wt);
		cost[x][y] = wt;
		cost[y][x] = wt;
	}
    printf("\nEnter the source vertex: ");
    scanf("%d",&v);
    shortestpath(v,cost,dist,n);
    printf("\nRespected shortest dist will be: ");
    for(i = 1; i <= n ; i++)
        printf("%f  ",dist[i]);
}
void shortestpath(int v,float cost[][SIZE],float dist[],int n)
{
    int w,u,min,num,i,s[SIZE];
    for(i = 1; i <=n; i++)
    {
        s[i] = 0;
        dist[i] = cost[v][i];
    }
    s[v] = 1;
    dist[v] = 0;
    for(num = 2; num <= n; num++ )
    {
        min = 999999;
        for(i = 1; i <= n; i ++)
        {
            if(s[i] == 0 && dist[i] < min)
            {
                min = dist[i];
                u = i;
            }
        }
        s[u]= 1;
        for(i = 1; i <= n ; i++)
        {
            if(s[i] == 0 && (cost[u][i] != INF&& cost[u][i] != 0))
            {
                w = i;
               if(dist[w] > (dist[u] + cost[u][w]))
                {
                    dist[w] = dist[u] + cost[u][w];
                }
            }
        }
    }

    
}
// Enter the number of vertex: 5

// Enter the number of edges: 6

// Enter the vertex you want to connect: 1
// 2

// Enter the weight of edge: 2

// Enter the vertex you want to connect: 1
// 3

// Enter the weight of edge: 4

// Enter the vertex you want to connect: 2
// 3

// Enter the weight of edge: 1

// Enter the vertex you want to connect: 2
// 4

// Enter the weight of edge: 7

// Enter the vertex you want to connect: 3
// 5

// Enter the weight of edge: 3

// Enter the vertex you want to connect: 4
// 5

// Enter the weight of edge: 1

// Enter the source vertex: 1

// Respected shortest dist will be: 0.000000  2.000000  3.000000  7.000000  6.000000
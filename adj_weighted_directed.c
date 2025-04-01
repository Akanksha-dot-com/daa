#include<stdio.h>
#define SIZE 100
#define INF 999999
void main()
{
	int cost[SIZE][SIZE],n,m,i,j,x,y;
	float wt;
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
		printf("\nThe elements in matrix are:\n ");
	for(i = 1 ; i <= n ; i++)
	{
		for(j = 1 ; j <= n ; j++)
			if(cost[i][j] == 999999)
				printf("INF ");
			else
				printf("%d ",cost[i][j]);
		printf("\n");
	}
	
}
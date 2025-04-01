#include<stdio.h>
#define SIZE 100
#define INF 999999
void prims(float cost[SIZE][SIZE],int n,int near[SIZE],int t[SIZE][3],float *mincost);
void main()
{
	int t[SIZE][3],near[SIZE],n,m,i,j,x,y;
	float cost[SIZE][SIZE],wt,mincost;
	mincost = INF;
	printf("\nEnter the number of vertex: ");
	scanf("%d",&n);
	printf("\nEnter the number of edges: ");
	scanf("%d",&m);
	for(i = 1 ; i <= n; i++)
	{
		for(j = 1; j <= n; j++)
//			if(i == j)
//				cost[i][j] = 0.0f;
//			else
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
		printf("\nThe elements in matrix are:\n");
	for(i = 1 ; i <= n ; i++)
	{
		for(j = 1 ; j <= n ; j++)
			if(cost[i][j] == 999999)
				printf("INF ");
			else
				printf("%f ",cost[i][j]);
		printf("\n");
	}
	
	//near array
	for(i = 1; i <= n ; i++)
	{
		near[i] = 0;
	}
	
	
//	for(i = 1; i <= n ; i++)
//	{
//		printf("%d",near[i]);
//	}
//	
//	t vector
	for(i = 1 ; i < n ;i++)
	{
		for(j = 1; j <=2 ; j++)
			t[i][j] = 0;
	}
//	for(i = 1 ; i <n ;i++)
//	{
//		for(j = 1; j <=2 ; j++)
//			printf("%d",t[i][j]);
//	}
	prims(cost,n,near,t,&mincost);
	for(i = 1 ; i <n ;i++)
	{
		for(j = 1; j <=2 ; j++)
			printf("%d  ",t[i][j]);
		printf("\n");
	}

	printf("\n%f",mincost);
}


void prims(float cost[SIZE][SIZE],int n,int near[SIZE],int t[SIZE][3],float *mincost)
{
	int i,j,k,l,min,q;
	for(i = 1; i <= n ; i++)
	{
		for(j = 1; j <= i-1; j++)
		{
			if(cost[i][j] < *mincost)
			{
				*mincost = cost[i][j];
				k = i;
				l = j;
			}
		}	
	}
	t[1][1] = k;
	t[1][2] = l;
	for(i = 1; i <= n; i++)
	{
		if(cost[i][k] < cost[i][l])
			near[i] = k;
		else
			near[i] = l;
		near[k] = near[l] = 0;
	}
	for(i = 2; i <= n-1 ; i++)
	{
		min = INF;
		for(j = 1; j<= n ; j++)
		{
			if( near[j] != 0  && cost[j][near[j]] < min)
			{
				min = cost[j][near[j]];
				k = j;
				l = near[j];
			}
		}
		t[i][1] = k;
		t[i][2] = l;
		*mincost += cost[k][l];
		near[k] = 0;
		for(q = 1;q <= n; q++)
		{
			if((near[q] != 0) && (cost[q][near[q]] > cost[q][k]))
				near[q] = k; 
		}
	}
}
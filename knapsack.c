#include<stdio.h>
#define SIZE 100
void bubble_sort(int id[],float profit[],float weight[],int n);
void knapsack(int m,int n,float profit[],float weight[],float x[],float *totalprof);
void main()
{
	float profit[SIZE],weight[SIZE],x[SIZE],m,totalprof;
	int id[SIZE],n,i;
	totalprof = 0.0f;
	printf("\nEnter the number of total item present: ");
	scanf("%d",&n);
	printf("\nEnter the size of knapsack: ");
	scanf("%f",&m);
	for(i = 1; i <= n ; i++)
	{
		printf("\nEnter the weight of %d item: ",i);
		scanf("%f",&weight[i]);
		printf("\nEnter the profit of %d element: ", i);
		scanf("%f",&profit[i]);
		id[i] = i;
	}
	bubble_sort(id,profit,weight,n);
	knapsack(m,n,profit,weight,x,&totalprof);
	printf("\nTotal profit which can be generated will be : %f",totalprof);
	for(i = 1; i<= n; i++)
	{
		printf("\nFrom the elements %d and %f quantity",id[i],x[i]);
	}
	
	
}
void bubble_sort(int id[], float profit[], float weight[],int n)
{
	int i,j,temp;
	float t;
	for(i = 1 ; i < n-1 ; i++)
	{
		for(j = 1; j <= n-i ; j++)
		{
			if((profit[j]/weight[j])<(profit[j+1]/weight[j+1]))
			{
				t = profit[j];
				profit[j] = profit[j+1];
				profit[j+1] = t;
				
				
				t = weight[j];
				weight[j] = weight[j+1];
				weight[j+1] = t;
				
				temp = id[j];
				id[j] = id[j+1];
				id[j+1] = temp;
			}
		}
	}
}
void knapsack(int m,int n,float profit[],float weight[],float x[],float *totalprof)
{
	int i;
	float u;
	for(i = 1 ; i <= n ; i++)
	{
		x[i] = 0.0f;
	}
	u = m;
	for( i = 1; i <= n ; i++)
	{
		if(weight[i] > u)
			break;
		x[i] = 1.0f;
		*totalprof = *totalprof + profit[i];
		u = u - weight[i];
	}
	if(i <= n)
	{
			x[i] = u/weight[i];
			*totalprof = *totalprof + (profit[i]*x[i]);
	}
}
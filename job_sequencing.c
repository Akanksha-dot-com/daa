#include<stdio.h>
#define SIZE 100
void bubble_sort(int d[],float p[],int job[],int n);
void js(int d[],float p[],int j[],int n,float *maxprofit,int *k);
void main()
{
	int d[SIZE],j[SIZE],job[SIZE],i,n,k;
	float p[SIZE],maxprofit;
	
	maxprofit = 0.0f;
	k = 0;
	
	printf("\nEnter the total number of jobs: ");
	scanf("%d",&n);
	for(i = 1; i<= n; i++)
	{
		printf("\nEnter the deadlines of the job: ");
		scanf("%d",&d[i]);
		printf("\nEnter the profit of the job: ");
		scanf("%f",&p[i]);
		job[i] = i;		
	}
	
	bubble_sort(d,p,job,n);
	
	js(d,p,j,n,&maxprofit,&k);
	printf("\nTotal profit which can be generated will be : %f  ",maxprofit);
	printf("\nWith the number of jobs: %d",k);
	for(i = 1; i<= k; i++)
	{
		printf("\nFrom the job %d  ",job[j[i]]);
	}
}
void bubble_sort(int d[],float p[],int job[],int n)
{
	int i,j,temp;
	float t;
	for(i = 1 ; i < n-1 ; i++)
	{
		for(j = 1; j <= n-i ; j++)
		{
			if(p[j] < p[j+1])
			{
				temp = d[j];
				d[j] = d[j+1];
				d[j+1] = temp;
				
				t = p[j];
				p[j] = p[j+1];
				p[j+1] = t;
				
				temp = job[j];
				job[j] = job[j+1];
				job[j+1] = temp;
			}
		}
	}
}
void js(int d[],float p[],int j[],int n,float *maxprofit,int *k)
{
	int i,r,q;
	d[0] = j[0] = 0;
	
	j[1] = 1;
	*k = 1;
	*maxprofit += p[1];
	
	for(i = 2; i <= n; i++)
	{
		r = *k;
		while( ( ( d[j[r]] ) > d[i] )&& (d[j[r]] != r))
			r--;
		if(( (d[j[r]]) <= d[i]) && (d[i] > r))
		{
			for(q = *k ; q >= r+1; q--)
			{
				j[q+1] = j[q];
			}
			j[r+1] = i;
			*maxprofit += p[i];
			*k = *k + 1;
		}
	}


	
	
}
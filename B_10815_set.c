#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int	compare(const void *a, const void *b)
{
	if (*(int*)a > *(int*)b)
		return (1);
	else if (*(int*)a < *(int*)b)
		return (-1);
	else
		return (0);
}

double logB(double x, double base)
{
	return log(x)/log(base);
}

int main(void)
{
	int n, m, l;
	int arr[500001];
	int arr2[500001];

	scanf("%d",&n);
	for (int i = 0; i < n; i++)
		scanf("%d",&arr[i]);
	
	qsort(arr,n,sizeof(int),compare);
	scanf("%d",&m);
	for (int i = 0; i < m; i++)
		scanf("%d",&arr2[i]);

	l = (int)logB((float)n,2.0);
	for (int i = 0; i < m; i++)
	{
		int pivot = n / 2;
		int before_pivot;
		int checker = 1;
		for (int j = 0; j < l + 1; j++)
		{
			printf("pivot : %d \n",pivot);
			int tmp = arr[pivot];
			if (arr2[i] > tmp && checker)
				before_pivot = n;
			else if (arr2[i] < tmp && checker == 0)
				before_pivot = 0;
			else
				before_pivot = pivot;

			if (arr2[i] > tmp)
			{
				checker = 1;
				pivot = (pivot + before_pivot) / 2;
			}
			else if (arr2[i] < tmp)
			{
				checker = 0;
				pivot = (pivot + before_pivot) / 2;
			}
			else
			{
				printf("1 ");
				break ;
			}
			if (j == l || pivot < 0 || pivot > n - 1)
			{
				printf("0 ");
				break ;
			}
		}
	}
	return (0);
}

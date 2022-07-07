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
		int before_pivot1 = n;
		int	before_pivot2 = 0;
		int	checker = 0;
		int	tmp = pivot;
		for (int j = 0; j < l + 1; j++)
		{
			if (arr2[i] > arr[pivot])
			{
				if (checker == 1)
					before_pivot1 = tmp;
				tmp = pivot;
				pivot = ((pivot + before_pivot1) / 2);
				checker = 2;
			}
			else if (arr2[i] < arr[pivot])
			{
				if (checker == 2)
					before_pivot2 = tmp;
				tmp = pivot;
				pivot = ((pivot + before_pivot2) / 2);
				checker = 1;
			}
			else
			{
				printf("1 ");
				break ;
			}
			if (j == l)
			{
				printf("0 ");
				break ;
			}
		}
	}
	return (0);
}

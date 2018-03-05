#include <stdio.h>
#include <math.h>

int getOne(int n);
int getTen(int n);
int getHundred(int n);
int getThousand(int n);
int getTenThousand(int n);
int getHundredThousand(int n);

int main(void) {

	int totalSum = 0;

	for (int n = 2; n < 1000000; n++) {

		int sumOfPow = 0;

		if (n > 0) {
			sumOfPow += (int) pow(getOne(n), 5);
		}
		if (n > 10) {
			sumOfPow += (int) pow(getTen(n), 5);
		}
		if (n > 100) {
			sumOfPow += (int) pow(getHundred(n), 5);
		}
		if (n > 1000) {
			sumOfPow += (int) pow(getThousand(n), 5);
		}
		if (n > 10000) {
			sumOfPow += (int) pow(getTenThousand(n), 5);
		}
		if (n > 100000) {
			sumOfPow += (int) pow(getHundredThousand(n), 5);
		}

		if (sumOfPow == n) {
			printf("Found: %d\n", n);
			totalSum += n;
		}
	}
	printf("Total sum: %d\n", totalSum);
}

int getOne(int n) {
	return n % 10;
}

int getTen(int n) {
	return (n / 10) % 10;
}

int getHundred(int n) {
	return (n / 100) % 10;
}

int getThousand(int n) {
	return (n / 1000) % 10;
}

int getTenThousand(int n) {
	return (n / 10000) % 10;
}

int getHundredThousand(int n) {
	return (n / 100000) % 10;
}

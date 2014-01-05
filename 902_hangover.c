#include <stdio.h>

int main() {
    double d;
    while(scanf("%lf", &d), d != 0.0) {
        double sum = 0.0; int i;
        for(i = 2; sum <= d; sum += 1.0/i, ++i);
        printf("%d card(s)\n", i-2);
    }
    return 0;
}

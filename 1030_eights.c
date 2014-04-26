#include <stdio.h>

typedef long long int lli;

int main()
{
    lli t;
    scanf("%lld", &t);
    while(t--) {
        lli k;
        scanf("%lld", &k);
        printf("%lld\n", 192+(k-1)*250);
    }
    return 0;
}


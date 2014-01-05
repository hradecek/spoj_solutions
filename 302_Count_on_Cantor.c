#include <stdio.h>
#include <math.h>

typedef unsigned short ushort;
typedef unsigned long long ull;

int main() {
  ushort tc;
  scanf("%hu", &tc);
  
  while(tc--) {
    ull n;
    scanf("%llu", &n);
    
    ull t = floor((-1+sqrt(8*n-7))/2);
    ull j = (t*t+3*t+4)/2-n;
    ull i = n-t*(t+1)/2;
    double temp = pow(-1,t);
    
    ull numerator   = (temp+1)*j/2-(temp-1)*i/2;
    ull denominator = (temp+1)*i/2-(temp-1)*j/2;
    
    printf("TERM %hu IS %llu/%llu\n", n, numerator, denominator);
  }
  return 0;
}


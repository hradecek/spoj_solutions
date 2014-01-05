#!/usr/bin/python3.3

def fact(n):
    res = 1
    for i in range(1,n+1):
        res *= i
    return res

t = int(input())
for i in range(t):
    n = int(input())
    print(str(fact(n)))
    
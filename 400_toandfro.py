#!/usr/bin/python2.7

while True:
    dim = int(raw_input())
    if dim == 0:
        break
    line = str(raw_input())
    i = j = 0
    ans = ""

    while True:
        if j*2*dim + i < len(line):
            ans += line[j*2*dim + i]
        if (j+1)*2*dim - (i+1) < len(line):
            ans += line[(j+1)*2*dim - (i+1)]
        j += 1
        if j == dim:
            j = 0
            i += 1
        if i == dim:
            break
    print ans


#!/usr/bin/python2.7
from math import floor
from math import sqrt

tc = int(raw_input())
while tc:
  tc -= 1
  n = int(raw_input())
  t = floor((-1+sqrt(8*n-7))/2)
  j = (t*t+3*t+4)/2-n
  i = n-t*(t+1)/2
  temp = (-1)**t
  numerator   = (temp+1)*j/2-(temp-1)*i/2
  denominator = (temp+1)*i/2-(temp-1)*j/2
  print "TERM {} IS {}/{}".format(n, int(numerator), int(denominator))

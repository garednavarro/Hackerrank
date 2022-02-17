#!/bin/python3


if __name__ == '__main__':
    n = int(input().strip())
    l = []
    while n > 0:
        resto = n % 2
        n = n // 2
        l.append(resto)
    count = 0
    result = 0
    for i in range(len(l)):
        if l[i] == 0:
            count = 0
        else:
            count += 1
            result = max([result, count])
    print(result)

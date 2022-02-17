#!/bin/python3

def hourglass_sum(x, y):
    suma = arr[x][y] + arr[x][y + 1] + arr[x][y + 2]
    suma += arr[x + 1][y + 1]
    suma += arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2]
    return suma


if __name__ == '__main__':
    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    size = len(arr)
    suma = -100000
    for x in range(0, (size - 2)):
        for y in range(0, (size - 2)):
            k = hourglass_sum(x, y)
            if k > suma:
                suma = k
    print(suma)

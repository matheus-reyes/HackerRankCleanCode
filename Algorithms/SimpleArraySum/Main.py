
sizeOfArray = int(input())
array = []
sum = 0

for i in range(sizeOfArray):
    array.append(int(input()))
    sum += array[int(i)]

print(sum)
import heapq
import sys

input_data = sys.stdin.readlines()
# 연산의 개수 입력 받기
N = int(input_data[0])

# 연산 정보 입력 받기
operations = list(map(int, input_data[1:]))

# 최소 힙을 이용하여 연산 수행
arr = []
result = []


for i in range(N):
    x = operations[i]

    if x == 0:
        if not arr:
            result.append(0)
        else:
            result.append(heapq.heappop(arr))
    else:
        heapq.heappush(arr, x)

# 결과 출력
for res in result:
    print(res)
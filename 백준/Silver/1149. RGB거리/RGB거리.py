import sys
# 최소 값을 구하는 함수
def min_cost_measure(N, costs):
    dp = [[0] * 3 for _ in range(N)]

    dp[0] = costs[0]

    # 1 ~ N-1번까지 중첩된 최소값을 지속적으로 업데이트
    for i in range(1, N):
        dp[i][0] = costs[i][0] + min(dp[i - 1][1], dp[i - 1][2])
        dp[i][1] = costs[i][1] + min(dp[i - 1][0], dp[i - 1][2])
        dp[i][2] = costs[i][2] + min(dp[i - 1][0], dp[i - 1][1])

    return min(dp[N - 1])

N = int(input())
costs = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

costs_min = min_cost_measure(N, costs)
print(costs_min)
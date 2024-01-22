def delivery_sugar(N):
    num_of_5kg = N // 5

    while num_of_5kg >= 0:

        remainding_weight = N - (num_of_5kg * 5)

        if remainding_weight % 3 == 0:
            num_of_3kg = remainding_weight // 3
            return num_of_3kg + num_of_5kg

        num_of_5kg -= 1
    return -1


N = int(input())
result = delivery_sugar(N)
print(result)
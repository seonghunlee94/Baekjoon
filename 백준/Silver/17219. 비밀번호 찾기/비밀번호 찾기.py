# 입력
N, M = map(int, input().split())

# 저장된 사이트와 비밀번호를 저장하는 딕셔너리
password_dict = {}
for _ in range(N):
    site, password = input().split()
    password_dict[site] = password

# 비밀번호를 찾으려는 사이트 주소를 입력받아 출력
for _ in range(M):
    site_to_find = input()
    print(password_dict[site_to_find])
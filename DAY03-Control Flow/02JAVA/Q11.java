number = int(input("Enter a positive number less than 100: "))

if 0 < number < 100:
    for i in range(100, 0, -1):
        if i % number == 0:
            print(i)
else:
    print("Enter a valid number!")

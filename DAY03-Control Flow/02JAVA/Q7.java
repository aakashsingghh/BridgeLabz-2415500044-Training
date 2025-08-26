number = int(input("Enter a positive number: "))

if number > 0:
    for i in range(1, number + 1):
        if number % i == 0:
            print(i)
else:
    print("Enter a positive number!")

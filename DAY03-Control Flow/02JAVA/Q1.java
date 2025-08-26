number = int(input("Enter a natural number: "))

if number > 0:
    for i in range(1, number + 1):
        if i % 2 == 0:
            print(i, "is Even")
        else:
            print(i, "is Odd")
else:
    print("Please enter a natural number!")

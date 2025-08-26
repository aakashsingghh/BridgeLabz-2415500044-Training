number = int(input("Enter a positive number: "))

if number > 0:
    i = 1
    while i <= number:
        if number % i == 0:
            print(i)
        i += 1
else:
    print("Enter a positive number!")

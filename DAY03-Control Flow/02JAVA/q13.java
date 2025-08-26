number = int(input("Enter a positive number less than 100: "))

if 0 < number < 100:
    counter = 100
    while counter > 0:
        if counter % number == 0:
            print(counter)
        counter -= 1
else:
    print("Enter a valid number!")

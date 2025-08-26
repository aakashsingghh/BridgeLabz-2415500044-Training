num = int(input("Enter a positive integer: "))

if num > 0:
    i = 1
    while i <= num:
        if i % 3 == 0 and i % 5 == 0:
            print("FizzBuzz")
        elif i % 3 == 0:
            print("Fizz")
        elif i % 5 == 0:
            print("Buzz")
        else:
            print(i)
        i += 1
else:
    print("Enter a positive integer!")

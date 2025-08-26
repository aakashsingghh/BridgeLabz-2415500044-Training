number = int(input("Enter number: "))
power = int(input("Enter power: "))

result = 1
for i in range(1, power + 1):
    result *= number

print("Result =", result)

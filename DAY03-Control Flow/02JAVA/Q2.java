salary = float(input("Enter salary: "))
years = int(input("Enter years of service: "))

if years > 5:
    bonus = salary * 0.05
    print("Bonus =", bonus)
else:
    print("No bonus awarded.")

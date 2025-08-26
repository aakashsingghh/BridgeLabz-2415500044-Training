amar_age = int(input("Enter Amar's age: "))
akbar_age = int(input("Enter Akbar's age: "))
anthony_age = int(input("Enter Anthony's age: "))

amar_height = int(input("Enter Amar's height: "))
akbar_height = int(input("Enter Akbar's height: "))
anthony_height = int(input("Enter Anthony's height: "))
if amar_age < akbar_age and amar_age < anthony_age:
    print("Youngest = Amar")
elif akbar_age < anthony_age:
    print("Youngest = Akbar")
else:
    print("Youngest = Anthony")
if amar_height > akbar_height and amar_height > anthony_height:
    print("Tallest = Amar")
elif akbar_height > anthony_height:
    print("Tallest = Akbar")
else:
    print("Tallest = Anthony")

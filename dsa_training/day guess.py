def day(day):
    if (day == 1):
        print("Today is Monday")
    elif (day == 2):
        print("Today is Tuesday")
    elif (day == 3):
        print("Today is Wednesday")
    elif (day == 4):
        print("Today is Thursday")
    elif (day == 5):
        print("Today is Friday")
    elif (day == 6):
        print("Today is Saturday")
    elif (day == 7):
        print("Today is Sunday")
    else:
        print("Invalid day number. Please enter a number between 1 and 7.")
a = int(input("Enter the day number (1-7): "))

day(a)
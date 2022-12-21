
# first_name = "io"
# last_name = "Haro"
# full_name = first_name +" "+ last_name
# print(full_name)



#print(type(name))               #type lets you know type of var 
#print("Hello " + name)


# age = 21
# age +=1
# print(age)
# print(type(age))

                # Multiple Assignments 
# name = "aharo"
# age = 21
# attractive = True
    # name, age, attractive = "aharo", 21, True

    # print(name)
    # print(age)
    # print(attractive)

            #type casting = convert the data type of a value to another data type .
# x = 1 #int
# y = 2.0 #float
# z = " 3 " #str
# y = int ( y )
# print ( x )
# print ( y )
# print ( z )

                #INPUT STUFF
# in_name = input("what is your name: ")
# print("Hello " + in_name)

# in_age = int(input("what is your age: " ))
# in_age +=10
# print("you are " + str(in_age) + " old")

# in_height = float(input("how tall are you: "))
# print("heigh: " + str(in_height) )
                
                # MATH FUNCT
# import math
# pi = 3.14
# print(round(pi))
# math.ceil($)
# math.floor($)
# math.pow( $ , $ )
# math.sqrt($)
# math.max(x,y,z)
# math.min(x,y,z)


                # STRING SLICING 
            # indexing[] or slice()
            # [start:stop:step]
# name = "yaretzy haro"
# first_name = name[0:2]
# last_name = name[3:7]
# step_method = name[0::2]
# reversed_name = name[::-1]

# print(first_name)
# print(last_name)
# print(step_method)
# print(reversed_name)

# website_one = "http://google.com"
# website_two = "http://io.aharo24.com"
# slice = slice(7,-4)                             #slice -> Object


# website_one[slice]
# print (website_one[slice])

# website_two[slice]
# print(website_two[slice])

                        # IF STATEMENTS
age = int(input("enter age: "))

if age >=18:
    print("you are an adult")

elif (age <0):
    print("you havent been born yet x_x")

else:
    print("you are a child")


                    # LOGICAL OPERATORS
                    # and , or, ! 
temp = input(input("what is temp outside: "))
if (temp >= 0 and temp <= 30):
    print("the temp is good")
    print("go outside")
elif ( temp < 0 or temp > 30):
    print("stay inside")

                    #WHILE LOOPS
# name = ""
# while len(name) == 0:
#     name = input("enter name: ")
    
# print("your name is: " + name)


# name = None
# while not name:
#     name = input("enter name: ")
# print("hello " + name)


                # FOR LOOP

# for i in range(10):
#     print(i+1)

# for i in range(50,100):
#     print(i)

# for i in range(50,100, 2):
#     print(i)

# import time
# for seconds in range(10,0,-1):
#     print(seconds)
#     time.sleep(1)
# print("Happy new Year !!")


                    # NESTED LOOPS

# rows = int(input("enter rows: "))
# columns = int(input("enter columns: "))
# symbol = input("enter symbol:")


# for i in range(rows):
#     for j in range(columns):
#         print(symbol, end="")
#     print()


                    # LOOP CONTROL STATEMENTS
                    # break=
                    # continue=
                    # pass=
# while True:
#     name = input("enter name: ")
#     if name !="":
#         break

# phone_number = "123-456-7890"
# for i in phone_number:
#     if i == "-":
#         continue
#     print(i,end="")

# for i in range(1,21):
    
#     if i == 13:
#         pass
#     else:
#         print(i)


#                 # LIST
# food = ["pizza","hot dog", "enchiladas", "tacos", "sopes"]

# print(food[4])
# food.remove("pizza")
# food.pop()
# food.insert(4,"cupcakes")

# for i in food:
#     print(i)


                # 2D List 
# drinks = ["Modelo", "Tecate", "Ulra"]
# dinner = ["Pizza", "Tacos", "Cupcakes"]
# desser = ["cake", "pops"]

# food = [ drinks, dinner, desser]

# print(food)
# print(food[1][2])

                # TUPPLES 
# student = ("Yaretzy", 8, "female")
# print(student.count("Yaretzy"))
# print(student.index("female"))

# for i in student:
#     print(i)

# if "Yaretzy" in student:
#     print("Angel coded <3!")







                # SETS 
# utensils.add("napkin")
# utensils.remove("fork")
# utensils.clear()
#utensils.update(dishes)
#dinner_table = utensils.union(dishes)

# utensils = {"fork", "spoon", "knife"}
# dishes = {"bowl", "plate", "cup", "knife"}

# print(dishes.difference(utensils))
# print(dishes.intersection(utensils))


# for i in dinner_table:
#     print(i)

                # dictionary <--> hashmap
# capitals = {
#             'USA':'Washington DC',
#             'India': 'New Dehli',
#             'China': 'Beijing',
#             'Russia':'Moscow'
#             #Key    : Value
#             }
# capitals.update({'Germany':'Berling'})
# capitals.update({'USA':'Las Vegas'})
# capitals.pop('China')
# #capitals.clear()

# #print(capitals['Russia'])
# #print(capitals.get('Germany'))
# #print(capitals.keys())
# #print(capitals.values())
# #print(capitals.items())

# for key,val in capitals.items():
#     print(key, val)

                # INDEX OPREATOR []
# name = "yaretzy Haro"
# # if name[0].islower():
# #     name = name.capitalize()

# first_name = name[:7].upper()
# last_name = name[8:13].upper()
# last_character = name[-1]

# print (last_name)
# print(first_name,'\n')

# print(last_character)


                # FUNCTIONS
def hello():
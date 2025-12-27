def eraExp():
    answer={'a1':'PYRAMIDX','a2':'164','a3':'GOLDMASK','b1':'BLOOD','b2':'DEATH','b3':'OFQRXI'}
    print(f"ERA EXPLORER\nWelcome To Era Explorer, {name.title()}!\n")
    enter = input("Enter any key to proceed: ")
    egyart()
    print("\nYou will now enter The ANCIENT EGYPTIAN Civilization!")
    enter = input("Enter any key to proceed: ")
    print("\nThere is a tomb located in some place where a chest is present.\nUpon opening the chest with a key, you will find different valuable items.\nUpon picking the correct one, you will complete the mission.")
    enter = input("Enter any  key to proceed: ")
    print('''\nFCUVAK is SPHINX.   CLENZVQK = ?
Decode this to find the location of the tomb.''')
    tries=0
    while tries<=3:
        ans=input().upper()
        if ans == answer['a1']:
            print("Congrats! You found the location of the tomb.\n")
            break
        else:
            tries+=1
            if tries == 1:
                print("Wrong answer. You have 2 more tries. Hint: Its a monumental structure.")
            elif tries ==2 :
                print("Incorrect! 1 more try left. Hint: It has polygonal base and triangular faces.")
            else:
                  print("You've used all your attempts. The correct answer was PYRAMIDX.")
                  break
    enter = input("Enter any key to go to the location: ")
    print('''\nCrack The Code [] [] []
[3] [6] [8] - One Number is correct and well placed
[3] [8] [7] - Nothing is Correct
[2] [7] [6] - One Number is correct but wrongly placed
[4] [7] [1] - Two Numbers are correct but wrongly placed
Fill the three blocks with the correct number to get the key to the chest. (NO spaces between numbers)''')
    tries=0
    while tries<=3:
        ans=input()
        if ans == answer['a2']:
            print("Sweet! You found the key.\n")
            break
        else:
            tries+=1
            if tries == 1:
                print("Wrong answer. You have 2 more tries.")
            elif tries ==2 :
                print("Incorrect! 1 more try left.")
            else:
                  print("Wrong again. The correct answer was 164.")
                  break
    enter = input("Enter any key to open the chest: ")
    print('''\nIt is the face of a king, crafted in shimmering gold. Its serene gaze watches over eternity. It is a symbol of protection and power.
From the given items, identify the correct one as per the description.
ROSETTA_STONE, AMULET, SPHINX, GOLD_MASK, GEMSTONES, ANKH''')
    tries=0
    while tries<=3:
        ans=input().upper().replace('_','')
        ans=ans.replace(" ","")
        if ans == answer['a3']:
            print("Congratulations! You completed the mission!\n")
            break
        else:
            tries+=1
            if tries == 1:
                print("Wrong answer. You have 2 more tries. Hint: The metal used to make it is widely used.")
            elif tries ==2 :
                print("Incorrect! 1 more try left. Hint: It is yellow in colour.")
            else:
                  print("Wrong again. The correct answer was GOLD_MASK.")
                  break
    enter = input("Enter any key to proceed: ")
    aztecArt()
    print("Welcome to AZTEC Civilization.\n")
    print('''You have encountered a human sacrifice that is happening. But the ritual method they are following is wrong.
The real script which has the correct method is hidden somewhere. 
Your mission is to find out the real script and stop the next human sacrifice.\n''')
    enter = input("Enter any key to find the location: ")
    print('''\n"Red in colour, not paint. I flow in streams, but never get wet. Vital for life, I'm not water. What am I?"
Solve this riddle to find the location of the real script. ___ PATH''')
    tries=0
    while tries<=3:
        ans=input().upper()
        if ans == answer['b1']:
            print("Yay! You now know where to go!\n")
            break
        else:
            tries+=1
            if tries == 1:
                print("Oops! You have 2 more tries. Hint: Its present in Fauna.")
            elif tries ==2 :
                print("Incorrect! 1 more try left. Hint: It helps transport oxygen & nutrients.")
            else:
                  print("Wrong again. The correct answer was BLOOD.")
                  break
    enter=input("Enter any key to proceed: ")
    print('''\nThere are multiple doors in this path. Identify the 5 words which are related to human sacrifices.
Arrange the first letters of these 5 words in a way that it forms a new meaningful word.
SUN, CANDLES, HAVOC, DEITY, LOTUS, TORMENT, EXECUTION, COLOUR, ASHES, MUSIC''')
    tries=0
    while tries<=3:
        ans=input().upper()
        if ans == answer['b2']:
            print("Yes! That is the correct door!\n")
            break
        else:
            tries+=1
            if tries == 1:
                print("Oops! You have 2 more tries. Hint: A phenomenon that occurs to all living beings.")
            elif tries ==2 :
                print("Incorrect! 1 more try left. Hint: Its the end of life.")
            else:
                  print("Wrong again. The correct answer was DEATH.")
                  break
    enter=input("Enter any key to open the door: ")
    print('''AZTEC is XWQBZ.   RITUAL = ?
Find the right word to get the real script from all the other scripts.''')
    tries=0
    while tries<=3:
        ans=input().upper()
        if ans == answer['b3']:
            print("Congratulations! Now you can stop the human sacrifice!!\n")
            break
        else:
            tries+=1
            if tries == 1:
                print("Oops! You have 2 more tries.")
            elif tries ==2 :
                print("Incorrect! 1 more try left.")
            else:
                  print("Wrong again. The correct answer was OFQRXI.")
                  break
    play_again=input("Do you wish to play again? (1 for yes / 0 for no): ")
    if play_again == '1':
        eraExp()
    else:
        print("Thank you for playing Era Explorer!\n")

        
def egyart():
    print("""
                                   _
                                 ,d8b,
                         ,,aadd8888888bbaa,,
                    ,ad88P'''8,  I8I  ,8'''Y88ba,
                 ,ad88P' `Ya  `8, `8' ,8'  aP' 'Y88ba,
               ,d8' 'Yb   'b, `b  8  d' ,d'   dP' `'8b,
              dP'Yb,  `Yb,  `8, 8  8  8 ,8'  ,dP'  ,dP'Yb
           ,ad8b, `Yb,  'Ya  `b Y, 8 ,P d'  aP'  ,dP' ,d8ba,
          dP' `Y8b, `Yb, `Yb, Y,`8 8 8',P ,dP' ,dP' ,d8P' 'Yb
         ,88888888Yb, `Yb,`Yb,`8 8 8 8 8',dP',dP' ,dY88888888,
         dP     `Yb`Yb, Yb,`8b 8 8 8 8 8 d8',dP ,dP'dP'     Yb
        ,8888888888b '8, Yba888888888888888adP ,8' d8888888888,
        dP        `Yb,`Y8P''             `''Y8P',dP'        Yb
       ,88888888888P'Y8P'.---..     _..---._`Y8P'Y88888888888,
       dP         d'  8 '  ____  `. .'  ____  ` 8  `b         Yb
      ,888888888888   8   <(@@)>  | |  <(@@)>   8   888888888888,
      dP          8   8    `"""         """'    8   8          Yb
     ,8888888888888,  8          ,   ,          8  ,8888888888888,
     dP           `b  8,        (.-_-.)        ,8  d'           Yb
    ,88888888888888Yaa8b      ,'       `,      d8aaP88888888888888,
    dP               ''8b      ,gd888bg,      d8''               Yb
   ,888888888888888888888b,    ''Y888P''    ,d888888888888888888888,
   dP                   '8'b,             ,d'8'                   Yb
  ,888888888888888888888888,'Ya,,ggg,,aP' ,888888888888888888888888,
  dP                      '8,  '8\\x//8   ,8'                      Yb
 ,88888888888888888888888888b   8\\x//8   d88888888888888888888888888,
 8888bgg,_                  8   8\\x//8   8                  _,ggd8888
  `'Yb, ""8888888888888888888     Y\\x//P     8888888888888888888"" ,dP'
    d8bg,;8,                8   Y\\x//P   8                ,8',gd8b
  ,iP'   'Yb,8888888888888888   8\\x//8   8888888888888888,dP'   `'Yi,
 ,P'    _,888               8   8\\x//8   8              888,_      'Y,
,8baaad8P\":Y8888888888888888   aa8\\x/8aaa   8888888888888888P:\"\"Y8baaad8,
dP':::::::::8               8 8:8\\x/8::8 8              8:::::::::`'Yb
8::::::::::::8888888888888888 8::88888::8 8888888888888888::::::::::::8
8::::::::::::8,             8 8:::::::::8 8             ,8::::::::::::8
8::::::::::::8888888888888888 8:::::::::8 8888888888888888::::::::::::8
8::::::::::::Ya             8 8:::::::::8 8             aP::::::::::::8
8:::::::::::::888888888888888 8:::::::::8 888888888888888:::::::::::::8
8:::::::::::::Ya            8 8:::::::::8 8            aP:::::::::::::8
Ya:::::::::::::88888888888888 8:::::::::8 88888888888888:::::::::::::aP
`8;:::::::::::::Ya,         8 8:::::::::8 8         ,aP:::::::::::::;8'
 Ya:::::::::::::::'Y888888888 8:::::::::8 888888888P':::::::::::::::aP
 `8;::::::::::::::::::::''''Y8888888888888P''''::::::::::::::::::::;8'
  Ya:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::aP
   'b;:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;d'
    `Ya;:::::::::::::::::::::::::::::::::::::::::::::::::::::::;aP'
      `Ya;:::::::::::::::::::::::::::::::::::::::::::::::::::;aP'
         'Ya;:::::::::::::::::::::::::::::::::::::::::::::;aP'
            'Yba;;;:::::::::::::::::::::::::::::::::;;;adP'
                `''''''Y888888888888888888888P'''''' 
""")
    
def aztecArt():
    print("""
                  _____
                 _|[ ]|_
               _|_|===|_|_
             _|_ |==_==| _|_
           _|__ |===_===| __|_
         _|_ _ |====_====|  __|_
       _| __ _|=====_=====| ___ |_
     _| ___ _|======_======|_  __ |_
""")

if __name__ == "__main__":
    print('''
===========================================
                ERA EXPLORER
===========================================
          ''')
    name = input("Enter Your Name: ")
    eraExp()
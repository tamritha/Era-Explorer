#include<stdio.h>
#include<string.h>
int main () 
{
    char name[50];
    char answer[50];
    int enter,tries=0,ans,anss;
    printf("Welcome to Era Explorer. Enter your name.\n");
    scanf("%s",name);
    printf("Hello, %s. You will now enter The Ancient Egyptian Civilization.\nEnter 1 to proceed ",name);
    scanf("%d",&enter);
    if(enter==1) {
        printf("                                   _\n");
        printf("                                 ,d8b,\n");
        printf("                         ,,aadd8888888bbaa,,\n");
        printf("                    ,ad88P'''8,  I8I  ,8'''Y88ba,\n");
        printf("                 ,ad88P' `Ya  `8, `8' ,8'  aP' 'Y88ba,\n");
        printf("               ,d8' 'Yb   'b, `b  8  d' ,d'   dP' `'8b,\n");
        printf("              dP'Yb,  `Yb,  `8, 8  8  8 ,8'  ,dP'  ,dP'Yb\n");
        printf("           ,ad8b, `Yb,  'Ya  `b Y, 8 ,P d'  aP'  ,dP' ,d8ba,\n");
        printf("          dP' `Y8b, `Yb, `Yb, Y,`8 8 8',P ,dP' ,dP' ,d8P' 'Yb\n");
        printf("         ,88888888Yb, `Yb,`Yb,`8 8 8 8 8',dP',dP' ,dY88888888,\n");
        printf("         dP     `Yb`Yb, Yb,`8b 8 8 8 8 8 d8',dP ,dP'dP'     Yb\n");
        printf("        ,8888888888b '8, Yba888888888888888adP ,8' d8888888888,\n");
        printf("        dP        `Yb,`Y8P''             `''Y8P',dP'        Yb\n");
        printf("       ,88888888888P'Y8P'.---..     _..---._`Y8P'Y88888888888,\n");
        printf("       dP         d'  8 '  ____  `. .'  ____  ` 8  `b         Yb\n");
        printf("      ,888888888888   8   <(@@)>  | |  <(@@)>   8   888888888888,\n");
        printf("      dP          8   8    `"""         """'    8   8          Yb\n");
        printf("     ,8888888888888,  8          ,   ,          8  ,8888888888888,\n");
        printf("     dP           `b  8,        (.-_-.)        ,8  d'           Yb\n");
        printf("    ,88888888888888Yaa8b      ,'       `,      d8aaP88888888888888,\n");
        printf("    dP               ''8b      ,gd888bg,      d8''               Yb\n");
        printf("   ,888888888888888888888b,    ''Y888P''    ,d888888888888888888888,\n");
        printf("   dP                   '8'b,             ,d'8'                   Yb\n");
        printf("  ,888888888888888888888888,'Ya,,ggg,,aP' ,888888888888888888888888,\n");
        printf("  dP                      '8,  '8\\x//8   ,8'                      Yb\n");
        printf(" ,88888888888888888888888888b   8\\x//8   d88888888888888888888888888,\n");
        printf(" 8888bgg,_                  8   8\\x//8   8                  _,ggd8888\n");
        printf("  `'Yb, ""8888888888888888888     Y\\x//P     8888888888888888888"" ,dP'\n");
        printf("    d8bg,;8,                8   Y\\x//P   8                ,8',gd8b\n");
        printf("  ,iP'   'Yb,8888888888888888   8\\x//8   8888888888888888,dP'   `'Yi,\n");
        printf(" ,P'    _,888               8   8\\x//8   8              888,_      'Y,\n");
        printf(",8baaad8P"":Y8888888888888888   aa8\\x/8aaa   8888888888888888P:""Y8baaad8,\n");
        printf("dP':::::::::8               8 8:8\\x/8::8 8              8:::::::::`'Yb\n");
        printf("8::::::::::::8888888888888888 8::88888::8 8888888888888888::::::::::::8\n");
        printf("8::::::::::::8,             8 8:::::::::8 8             ,8::::::::::::8\n");
        printf("8::::::::::::8888888888888888 8:::::::::8 8888888888888888::::::::::::8\n");
        printf("8::::::::::::Ya             8 8:::::::::8 8             aP::::::::::::8\n");
        printf("8:::::::::::::888888888888888 8:::::::::8 888888888888888:::::::::::::8\n");
        printf("8:::::::::::::Ya            8 8:::::::::8 8            aP:::::::::::::8\n");
        printf("Ya:::::::::::::88888888888888 8:::::::::8 88888888888888:::::::::::::aP\n");
        printf("`8;:::::::::::::Ya,         8 8:::::::::8 8         ,aP:::::::::::::;8'\n");
        printf(" Ya:::::::::::::::'Y888888888 8:::::::::8 888888888P':::::::::::::::aP\n");
        printf(" `8;::::::::::::::::::::''''Y8888888888888P''''::::::::::::::::::::;8'\n");
        printf("  Ya:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::aP\n");
        printf("   'b;:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;d'\n");
        printf("    `Ya;:::::::::::::::::::::::::::::::::::::::::::::::::::::::;aP'\n");
        printf("      `Ya;:::::::::::::::::::::::::::::::::::::::::::::::::::;aP'\n");
        printf("         'Ya;:::::::::::::::::::::::::::::::::::::::::::::;aP'\n");
        printf("            'Yba;;;:::::::::::::::::::::::::::::::::;;;adP'\n");
        printf("                `''''''Y888888888888888888888P''''''\n");
    }else {
        return 0;
    }
    printf("\nWelcome to The Ancient Egyptian Civilization.\n");
    printf("\nThere is a tomb located in some place where a chest is present. Upon opening the chest with a key, you will find different valuable items.\n");
    printf("Upon picking the correct one, you will complete the mission.\nEnter 1 to find the location. ");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\nFCUVAK is SPHINX.   CLENZVQK = ?\n");
    }else {
        return 0;
    }
    printf("Decode this to find the location of the tomb. (Enter in CAPITAL letter, no spaces):\n");
    while (tries<3) {
        scanf("%s",answer);
        if (strcmp(answer, "PYRAMIDX") == 0) {
            printf("Congratulations! You found the location.\n");
            break;
        } else {
            tries++;
            if(tries==1) {
                printf("Wrong answer. Hint: starts with P.\n");
            }
            else if (tries==2) {
                printf("Wrong answer. Hint: ends with X.\n");
            }
            else {
                printf("Wrong answer. Game over.\n");
                return 0;
            }
        }
    }
    printf("Enter 1 to go to the location. ");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\nCrack The Code [] [] []\n");
    }else {
        return 0;
    }
    printf("[3] [6] [8] - One Number is correct and well placed\n");
    printf("[3] [8] [7] - Nothing is Correct\n");
    printf("[2] [7] [6] - One Number is correct but wrongly placed\n");
    printf("[4] [7] [1] - Two Numbers are correct but wrongly placed\n");
    printf("Fill the three blocks with the correct number to get the key to the chest. (NO spaces between numbers)\n");
    tries=0;
    while (tries<3) {
        scanf("%d",&ans);
        if (ans==164) {
            printf("Congratulations! You found the key.\n");
            break;
        } else {
            tries++;
            if(tries==1) {
                printf("Wrong answer. Hint: first number is 1.\n");
            }
            else if (tries==2) {
                printf("Wrong answer. Hint: ends with 4.\n");
            }
            else {
                printf("Wrong answer. Game over.\n");
                return 0;
            }
        }
    }
    printf("Enter 1 to open the chest. ");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\nIt is the face of a king, crafted in shimmering gold. Its serene gaze watches over eternity. It is a symbol of protection and power.\n");
    }else {
        return 0;
    }
    printf("From the given items, identity the correct one as per the description. (all CAPITAL, underscore if required.)\n");
    printf("ROSETTA_STONE, AMULET, SPHINX, GOLD_MASK, GEMSTONES, ANKH\n");
    tries=0;
    while (tries<3) {
        scanf("%s",answer);
        if (strcmp(answer, "GOLD_MASK") == 0) {
            printf("Congratulations, you completed the mission!\n");
            break;
        } else {
            tries++;
            if (tries==1) {
                printf("Wrong answer. Hint: No.of letters in answer is greater than 6.\n");
            }
            else if (tries==2) {
                printf("Wrong answer. Hint: Answer has 2 words.\n");
            }
            else {
                printf("Wrong answer. Game over.");
                return 0;
            }
        }
    }
    printf("Enter 1 to proceed. ");
    scanf("%d",&enter);
    if (enter==1) {
        printf("\nWelcome to Aztec Civilization.\n");
    } else {
        return 0;
    }
    printf("You have encountered a human sacrifice that is happening. But the ritual method they are following is wrong.\nThe real script which has the correct method is hidden somewhere. Your mission is to find out the real script and stop the next human sacrifice.\n");
    printf("Enter 1 to find the location. ");
    scanf("%d",&enter);
    if (enter==1) {
        printf("\nSolve this riddle to find the location of the real script. ___ PATH (all CAPITAL letters\n");
    } else {
        return 0;
    }
    printf("Red in colour, not paint. I flow in streams, but never get wet. Vital for life, I'm not water. What am I?\n");
    tries=0;
    while (tries<3) {
        scanf("%s",answer);
        if(strcmp(answer, "BLOOD") == 0) {
            printf("Congratulations, you now know where to go.\n");
            break;
        } else {
            tries++;
            if (tries==1) {
                printf("Wrong answer. Hint: Starts with B\n");
            }
            else if (tries==2) {
                printf("Wrong answer. Hint: Ends with D\n");
            }
            else {
                printf("Wrong answer. Game over.");
                return 0;
            }
        }
    }
    printf("Enter 1 to go to the location.");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\nThere are multiple doors in this path.\nIdentify the 5 words which are related to human sacrifices and arrange the first letters of these 5 words in a way that it forms a new meaningful word.\n");
    } else {
        return 0;
    }
    printf("SUN, CANDLES, HAVOC, DEITY, LOTUS, TORMENT, EXECUTION, COLOUR, ASHES, MUSIC.\n");
    tries=0;
    while(tries<3) {
        scanf("%s",answer);
        if(strcmp(answer, "DEATH") == 0) {
            printf("Congratulations! You found the correct door.\n");
            break;
        } else {
            tries++;
            if(tries==1) {
                printf("Wrong answer. Hint: Starts with D");
            }
            else if(tries==2) {
                printf("Wrong answer. Hint: Ends with H");
            }
            else{
                printf("Wrong answer. Game over.");
                return 0;
            }
        }
    }
    printf("Enter 1 to go inside the door. ");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\nAZTEC is XWQBZ.   RITUAL = ? \nFind the right word to get the real script from all the other scripts. (all CAPITAL letters.)\n");
    }else {
        return 0;
    }
    tries=0;
    while(tries<3) {
        scanf("%s",answer);
        if(strcmp(answer, "OFQRXI") == 0) {
            printf("Congratulations! You have completed this mission.\n");
            break;
        } else {
            tries++;
            if(tries==1) {
                printf("Wrong answer. Hint: Starts with O\n");
            }else if (tries==2) {
                printf("Wrong answer. Hint: Starts with I\n");
            }else {
                printf("Wrong answer. Game over.");
                return 0;
            }
        }
    }
    printf("Enter 1 to continue. ");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\nTo return to our world, solve this puzzle.\n");
    }else {
        return 0;
    }
    printf("Enter 1 to procced. ");
    scanf("%d",&enter);
    if(enter==1) {
        printf("\n2 a b\nc d 1\n4 e f\n");
    }
    printf("Enter 1-9 numbers such that in each row, column and diagonal the sum is 15. (NO spaces in between, no commas, format: abcdef\n");
    tries=0;
    while(tries<3) {
        scanf("%d",&anss);
        if(anss==769538) {
            printf("Congratulations! You won the game.");
            break;
        }else {
            tries++;
            if(tries==1) {
                printf("Wrong answer. Hint: b=6\n");
            }else if(tries==2) {
                printf("Wrong answer. Hint: d=5");
            }else {
                printf("Wrong answer. You are stuck in Aztec Civilization.");
                return 0;
            }
        }
    }
    return 0;
}
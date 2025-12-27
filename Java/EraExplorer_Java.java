import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

interface instructions {
    default void eraexp() {
        System.out.println("\n\n\n\n");
        System.out.println(" _____  ____      _      _____ __  __ ____   _      ___   ____   _____  ____  \n" + 
                        "| ____||  _ \\    / \\    | ____|\\ \\/ /|  _ \\ | |    / _ \\ |  _ \\ | ____||  _ \\ \n" + 
                        "|  _|  | |_) |  / _ \\   |  _|   \\  / | |_) || |   | | | || |_) ||  _|  | |_) |\n" + 
                        "| |___ |  _ <  / ___ \\  | |___  /  \\ |  __/ | |___| |_| ||  _ < | |___ |  _ < \n" + 
                        "|_____||_| \\_\\/_/   \\_\\ |_____|/_/\\_\\|_|    |_____|\\___/ |_| \\_\\|_____||_| \\_\\");
    }

    default void egypt_art() {
        System.out.println("                              /^\\\n" + 
                        "           L L               /   \\               L L\n" + 
                        "        __/|/|_             /  .  \\             _|\\|\\__\n" + 
                        "       /_| [_[_\\           /     .-\\           /_]_] |_\\\n" + 
                        "      /__\\  __`-\\_____    /    .    \\    _____/-`__  /__\\\n" + 
                        "     /___] /=@>  _   {>  /-.         \\  <}   _  <@=\\ [___\\\n" + 
                        "    /____/     /` `--/  /      .      \\  \\--` `\\     \\____\\\n" + 
                        "   /____/  \\____/`-._> /               \\ <_.-`\\____/  \\____\\\n" + 
                        "  /____/    /__/      /-._     .   _.-  \\      \\__\\    \\____\\\n" + 
                        " /____/    /__/      /         .         \\      \\__\\    \\____\\\n" + 
                        "|____/_  _/__/      /          .          \\      \\__\\_  _\\____|\n" + 
                        " \\__/_ ``_|_/      /      -._  .        _.-\\      \\_|_`` _\\___/\n" + 
                        "   /__`-`__\\      <_         `-;           _>      /__`-`__\\\n" + 
                        "      `-`           `-._       ;       _.-`           `-`\n" + 
                        "                        `-._   ;   _.-`\n" + 
                        "                            `-._.-`");
    }

    default void aztec_art() {
        System.out.println("\n" +
                        "                     _____\n" +
                        "                    _|[ ]|_\n" +
                        "                  _|_|===|_|_\n" +
                        "                _|_ |==_==| _|_\n" +
                        "              _|__ |===_===| __|_\n" +
                        "            _|_ _ |====_====|  __|_\n" +
                        "          _| __ _|=====_=====| ___ |_\n" +
                        "        _| ___ _|======_======|_  __ |_\n" +
                        "      _| ____ _|=======_=======|_  __  |_\n" +
                        "    _| _____ _|========_========|_  ____ |_\n" +
                        "  _| ______ _|=========_=========|_  _____ |_\n" +
                        "_| _______ _|==========_==========|_  ______ |_");
    }

    default boolean checkAnswer(Scanner sc, String answer, List<String> hints) {
        int tries = 3;
        int i=0;
        while(tries > 0) {
            String userAns = sc.nextLine().trim();
            userAns = userAns.replaceAll("[^a-zA-Z0-9]", "");
            if(!userAns.isEmpty() && userAns.equalsIgnoreCase(answer)) return true;
            else if (userAns.isEmpty()) continue;
            // else if (close != null && close.containsKey(userAns.toUpperCase())) {
            //     tries--;
            //     if (tries > 0) {
            //         System.out.println("Wrong answer! No.of tries left = "+tries);
            //         if (hints != null && i < hints.size()) {
            //             System.out.println(hints.get(i)+"\n");
            //             System.out.println(close.get(userAns.toUpperCase()));
            //             i++;
            //         }
            //     }
            // }
            else {
                tries--;
                if (tries > 0) {
                    System.out.println("Wrong answer! No.of tries left = "+tries);
                    if (hints != null && i < hints.size()) {
                        System.out.println(hints.get(i));
                        i++;
                    }
                    System.out.println();
                }
            }
        }
        return false;
}

    default void intro1(Scanner sc) {
        eraexp();
        System.out.println("\n\n================================ ERA EXPLORER ================================");
        System.out.println("\n\nThere are two civilizations where you have to complete 3 missions each.\n" + 
                            "You win after completing all 6 missions.");
        
        System.out.println("\nPress enter to proceed...");
        sc.nextLine();
        egypt_art();
        System.out.println("\nYou will now enter The ANCIENT EGYPTIAN Civilization!");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
    }

    default void inst1(Scanner sc) {
        System.out.println("\nThere is a chest inside a tomb that is LOCATED in some place.\n" + 
                            "Upon opening the chest with a KEY, you will find different valuable items.\n" +
                            "Upon picking the correct ITEM, you go to the next civilization.");
        System.out.println("\nPress enter to proceed...");
        sc.nextLine();
        System.out.println("\nYour first mission is to find where the tomb is located.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    default void inst2(Scanner sc) {
        System.out.println("In this location, there's a chest which needs to be unlocked with a key.");
        System.out.println("Your mission is to pick the correct key to unlock the chest.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    default void inst3(Scanner sc) {
        System.out.println("To unlock the chest, press enter...");
        sc.nextLine();
        System.out.println("There are various valuable items in the chest. \nYour mission is to find the correct item based on its description.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Description :");
    }

    default void intro2(Scanner sc) {
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        aztec_art();
        System.out.println("\n\nYou have entered The AZTEC Civilization.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
    }

    default void inst4(Scanner sc) {
        System.out.println("You have encountered a human sacrifice that is happening. But the ritual method they are following is wrong.\n" +
                            "The script which has the correct method is hidden somewhere. \n" +
                            "Your mission is to find that script and ensure the next sacrifice follows the right method.");
        System.out.println("\nPress enter to proceed...");
        sc.nextLine();
        System.out.println("\nYour first mission is to find the location where the script is present.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    default void inst5(Scanner sc) {
        System.out.println("In this location, there are multiple doors. Your mission is to find the correct door which has all the scripts.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    default void inst6(Scanner sc) {
        System.out.println("In this door, there are numerous scripts. But only one script among them is related to human sacrifice.");
        System.out.println("You are very close to completing the mission.");
        System.out.println("Press enter to proceed...");
        sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    default void end() {
        System.out.println("You have successfully completed all 6 missions.\n");
    }
}

interface Egypt_Civilization extends instructions {
    default void egyptLocation1(Scanner sc) {
        System.out.println("Decode this to find the location of the tomb.\n" +
                            "FCUVAK is SPHINX.\nNOLQBF = ?");

        // ArrayList<String> hints = new ArrayList<>();
        // hints.add("Hint: It's a momumental structure.");
        // hints.add("Hint: It has polygonal base and triangular faces.");

        // Map<String, String> close = new HashMap<>();
        // close.put("PYRAMID", "But partially correct! Hint : The answer has 8 letters, decode the last letter.\n");

        if (checkAnswer(sc, "ABYDOS", null)) System.out.println("\nCongrats! You found the location of the tomb.");
        else {
            System.out.println("\nYou've used all your attempts. The correct answer was ABYDOS.\n");
            System.exit(0);
        }
    }

    default void egyptLocation2(Scanner sc) {
        System.out.println("Decode this to find the location of the tomb.\n" +
                            "XGZJKVOMV is CLEOPATRA.\nNVLLVMV = ?");
        
        if (checkAnswer(sc, "SAQQARA", null)) System.out.println("\nCongrats! You found the location of the tomb.");
        else {
            System.out.println("\nYou've used all your attempts. The correct answer was SAQQARA.\n");
            System.exit(0);
        }
    }

    default void egyptLocation3(Scanner sc) {
        System.out.println("Decode this to find the location of the tomb.\n" +
                            "TGNUBL is ANUBIS.\nWTALANK = ?");
        
        if (checkAnswer(sc, "DAHSHUR", null)) System.out.println("\nCongrats! You found the location of the tomb.");
        else {
            System.out.println("\nYou've used all your attempts. The correct answer was DAHSHUR.\n");
            System.exit(0);
        }
    }

    default void egyptLocation4(Scanner sc) {
        System.out.println("Decode this to find the location of the tomb.\n" +
                            "UDPVHV is RAMSES.\nNDUQDN = ?");
        
        if (checkAnswer(sc, "KARNAK", null)) System.out.println("\nCongrats! You found the location of the tomb.");
        else {
            System.out.println("\nYou've used all your attempts. The correct answer was KARNAK.\n");
            System.exit(0);
        }
    }

    default void egyptLocation5(Scanner sc) {
        System.out.println("Decode this to find the location of the tomb.\n" +
                            "STSZMJGZLTM is TUTANKHAMUN.\nUZKKDX NE JHMFR = ?");
        
        if (checkAnswer(sc, "VALLEYOFKINGS", null)) System.out.println("\nCongrats! You found the location of the tomb.");
        else {
            System.out.println("\nYou've used all your attempts. The correct answer was VALLEY OF KINGS.\n");
            System.exit(0);
        }
    }

    default void egyptKey1(Scanner sc) {
        System.out.println("\nCrack The Code [] [] []");
        System.out.println(
                        "[1] [4] [8] - One Number is correct and well placed\n" +
                        "[1] [6] [8] - Nothing is Correct\n" +
                        "[2] [7] [6] - One Number is correct but wrongly placed\n" +
                        "[7] [1] [3] - Two Numbers are correct but wrongly placed\n" +
                        "Fill the three blocks with the correct number to get the key to the chest. (ex : 123 or 1 2 3)\n");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: There are two prime numbers in the code.");
        hints.add("Hint: Third digit is the sum of the first and second digit.");

        if (checkAnswer(sc, "347", hints)) System.out.println("\nSweet! You found the key.");
        else {
            System.out.println("\nYou've used all your attempts. The correct key was 3 4 7.\n");
            System.exit(0);
        }
    }

    default void egyptKey2(Scanner sc) {
        System.out.println("\nCrack The Code [] [] []");
        System.out.println(
                        "[6] [8] [2] - One Number is correct and well placed\n" +
                        "[6] [4] [5] - One Number is correct but wrongly placed\n" + 
                        "[2] [0] [6] - Two Numbers are correct but wrongly placed\n" + 
                        "[7] [6] [8] - Nothing is Correct\n" +
                        "[7] [8] [0] - One Number is correct but wrongly placed\n" +
                        "Fill the three blocks with the correct number to get the key to the chest. (ex : 123 or 1 2 3)\n");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: There are two prime numbers in the code.");
        hints.add("Hint: The sum of all the digits in code is a prime number below 10.");

        if (checkAnswer(sc, "052", hints)) System.out.println("\nSweet! You found the key.");
        else {
            System.out.println("\nYou've used all your attempts. The correct key was 0 5 2.\n");
            System.exit(0);
        }
    }

    default void egyptKey3(Scanner sc) {
        System.out.println("\nCrack The Code [] [] [] []");
        System.out.println(
                        "[9] [2] [8] [5] - One Number is correct but wrongly placed\n" +
                        "[1] [9] [3] [7] - Two Numbers are correct but wrongly placed\n" + 
                        "[5] [2] [0] [1] - One Number is correct and well placed\n" + 
                        "[2] [5] [0] [7] - Nothing is Correct\n" +
                        "[8] [5] [2] [4] - Two Numbers are correct but wrongly placed\n" + 
                        "Fill the four blocks with the correct number to get the key to the chest. (ex : 1234 or 1 2 3 4)\n");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: The code has 2 odd and 2 even digits.");
        hints.add("Hint: 2nd digit is twice of 3rd digit and 1st digit is thrice of 4th digit.");

        if (checkAnswer(sc, "3841", hints)) System.out.println("\nSweet! You found the key.");
        else {
            System.out.println("\nYou've used all your attempts. The correct key was 3 8 4 1.\n");
            System.exit(0);
        }
    }

    default void egyptKey4(Scanner sc) {
        System.out.println("\nCrack The Code [] [] [] []");
        System.out.println(
                        "[3] [5] [4] [8] - One Number is correct but wrongly placed\n" +
                        "[4] [6] [7] [1] - Two Numbers are correct but only one is well placed\n" + 
                        "[3] [7] [8] [1] - Two Number are correct and well placed\n" + 
                        "[8] [2] [9] [7] - Three Numbers are correct but are wrongly placed\n" +
                        "[5] [1] [2] [4] - Nothing is Correct\n" +
                        "[2] [9] [3] [4] - One Number is correct but wrongly placed\n" +
                        "[5] [1] [3] [6] - One Number is correct and well placed\n" + 
                        "Fill the four blocks with the correct number to get the key to the chest. (ex : 1234 or 1 2 3 4)\n");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: 1st and 3rd digit is odd. 2nd and 4th digit is even.");
        hints.add("Hint: The digit decreases throughout the code (like 4 3 2 1).");

        if (checkAnswer(sc, "9876", hints)) System.out.println("\nSweet! You found the key.");
        else {
            System.out.println("\nYou've used all your attempts. The correct key was 9 8 7 6.\n");
            System.exit(0);
        }
    }

    default void egyptKey5(Scanner sc) {
        System.out.println("\nCrack The Code [] [] []");
        System.out.println(
                        "[2] [4] [1] - One Number is correct and well placed\n" +
                        "[4] [1] [3] - Nothing is Correct\n" +
                        "[5] [3] [2] - Two Numbers are correct but wrongly placed\n" + //
                        "[3] [4] [7] - One Number is correct but wrongly placed\n" + 
                        "[7] [5] [1] - Two Numbers are correct but wrongly placed\n" +
                        "Fill the three blocks with the correct number to get the key to the chest. (ex : 123 or 1 2 3)\n");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: All the digits in the code are prime numbers.");
        hints.add("Hint: 2nd digit is the sum of 1st and 3rd digit.");

        if (checkAnswer(sc, "275", hints)) System.out.println("\nSweet! You found the key.");
        else {
            System.out.println("\nYou've used all your attempts. The correct key was 2 7 5.\n");
            System.exit(0);
        }
    }

    default void egyptItem1(Scanner sc) {
        System.out.println("It is the face of a king, crafted in shimmering gold. Its serene gaze watches over eternity.\nIt is a symbol of protection and power.\n");
        System.out.println("From the given items, identify the correct one as per its description above.\n" +
                            "ROSETTA STONE | AMULET | SPHINX | TUTANKHAMUN GOLD MASK | GEMSTONES | ANKH");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: The metal used to make it is widely used.");
        hints.add("Hint: It is yellow in colour.");

        if(checkAnswer(sc, "TUTANKHAMUNGOLDMASK", hints)) System.out.println("\nCongratulations! You completed all 3 missions in The ANCIENT EGYPTIAN Civilization.");
        else {
            System.out.println("\nAhh! You don't have any more tries left. The item was TUTANKHAMUN GOLD MASK.\n");
            System.exit(0);
        }
    }

    default void egyptItem2(Scanner sc) {
        System.out.println("These are sacred containers used in burial rituals to hold the internal organs of the deceased.\n" +
                            "They are topped with lids shaped like the heads of gods, each protecting a specific organ for afterlife.\n");
        System.out.println("From the given items, identify the correct one as per its description above.\n" +
                           "SCARAB AMULET | CANOPIC JARS | ROSETTA STONE | CROWNS | GEMSTONES | ANKH");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: They are used in mummification.");
        hints.add("Hint: They are jars has a lid shaped like a deity's head.");

        if(checkAnswer(sc, "CANOPICJARS", hints)) System.out.println("\nCongratulations! You completed all 3 missions in The ANCIENT EGYPTIAN Civilization.");
        else {
            System.out.println("\nAhh! You don't have any more tries left. The item was CANOPIC JARS.\n");
            System.exit(0);
        }
    }

    default void egyptItem3(Scanner sc) {
        System.out.println("These are ancient rolled papers used by Egyptians to write.\nImportant texts, prayers, spells, and knowledge were written on these.\n");
        System.out.println("From the given items, identify the correct one as per its description above.\n" +
                            "ANKH | OBELISKS | CROWNS | SPHINX | LINEN CLOTHING | PAPYRUS SCROLLS ");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: It's something you can write on.");
        hints.add("Hint: Often used for religious texts or spells.");

        if(checkAnswer(sc, "PAPYRUSSCROLLS", hints)) System.out.println("\nCongratulations! You completed all 3 missions in The ANCIENT EGYPTIAN Civilization.");
        else {
            System.out.println("\nAhh! You don't have any more tries left. The item was PAPYRUS SCROLLS.\n");
            System.exit(0);
        }
    }

    default void egyptItem4(Scanner sc) {
        System.out.println("A small ornament or gem, often worn around the neck or wrist.\nIt is believed to protect its wearer and bring good luck.\n");
        System.out.println("From the given items, identify the correct one as per its description above.\n" +
                           "CANOPIC JARS | AMULET | GOLD MASK | PAPYRUS SCROLLS | CROWN | COSMETIC KITS");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: People usually wore it around the neck like a necklace.");
        hints.add("Hint: It is believed to have magical power to protect its holder.");

        if(checkAnswer(sc, "AMULET", hints)) System.out.println("\nCongratulations! You completed all 3 missions in The ANCIENT EGYPTIAN Civilization.");
        else {
            System.out.println("\nAhh! You don't have any more tries left. The item was AMULET.\n");
            System.exit(0);
        }
    }

    default void egyptItem5(Scanner sc) {
        System.out.println("A collection of small jars or chests containing black kohl, scented oils, pigments and perfumes.\n");
        System.out.println("From the given items, identify the correct one as per its description above.\n" +
                           "COSMETIC KIT | SCARAB AMULET | GOLD MASK | PAPYRUS SCROLLS | ROSETTA STONE | ANKH");

        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: Primarily used for personal care, makeup, and fragrance.");
        hints.add("Hint: Often stored in small, decorated wooden containers.");

        if(checkAnswer(sc, "COSMETICKIT", hints)) System.out.println("\nCongratulations! You completed all 3 missions in The ANCIENT EGYPTIAN Civilization.");
        else {
            System.out.println("\nAhh! You don't have any more tries left. The item was COSMETIC KIT.\n");
            System.exit(0);
        }
    }

}

interface Aztec_Civilization extends instructions{
    default void aztecLocation1(Scanner sc) {
        System.out.println("Red in colour, not paint. I flow in streams, but never get wet.\nVital for life, I'm not water. What am I?\n" + 
                          "Solve this riddle to find the location of the real script. ___ PATH.\n");
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: It flows inside every living being.");
        hints.add("Hint: It carries oxygen and nutrients.");

        if(checkAnswer(sc, "BLOOD", hints)) System.out.println("\nYay! You now know where to go - the BLOOD PATH!");
        else {
            System.out.println("\nYou used all the tries. The script was in the BLOOD PATH.\n");
            System.exit(0);
        }
    }

    default void aztecLocation2(Scanner sc) {
        System.out.println("I have eyes but cannot see, a nose but cannot smell, and a mouth but cannot speak.\nI am hard as stone and found beneath the skin. What am I?\n" + 
                          "Solve this riddle to find the location of the real script. ___ WALL.\n");
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: It is made of bone and part of your skeleton.");
        hints.add("Hint: It protects your brain.");

        if(checkAnswer(sc, "SKULL", hints)) System.out.println("\nYay! You now know where to go - the SKULL WALL!");
        else {
            System.out.println("\nYou used all the tries. The script was in the SKULL WALL.\n");
            System.exit(0);
        }
    }

    default void aztecLocation3(Scanner sc) {
        System.out.println("I beat without drums, and bleed without wounds.\n" +
                           "I have chambers, but I'm not a housee. I am broken by love. What am I?\n" + 
                           "Solve this riddle to find the location of the real script. ___ ALTAR.\n");
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: You can feel it inside your chest.");
        hints.add("Hint: It pumps blood through your body.");

        if (checkAnswer(sc, "HEART", hints))
            System.out.println("\nWell done! You now know where to go - the HEART ALTAR!");
        else {
            System.out.println("\nYou used all the tries. The script was in the HEART ALTAR.\n");
            System.exit(0);
        }
    }

    default void aztecLocation4(Scanner sc) {
        System.out.println("I rise but never climb, I set but never fall.\n" +
                            "I bring warmth and light to all. What am I?\n" + 
                            "Solve this riddle to find the location of the real script. ___ TEMPLE.\n");
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: Without it, no life could exist.");
        hints.add("Hint: It appears daily in the sky.");

        if (checkAnswer(sc, "SUN", hints))
            System.out.println("\nWell done! You now know where to go - the SUN TEMPLE!");
        else {
            System.out.println("\nYou used all the tries. The script was in the SUN TEMPLE.\n");
            System.exit(0);
        }
    }

    default void aztecLocation5(Scanner sc) {
        System.out.println("I grow, but I have no life. I don't have lungs, but I need air.\n" +
                            "I have no legs, but can dance and glow. What am I?\n" + 
                            "Solve this riddle to find the location of the real script. ___ CAVE.\n");
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: It is considered dangerous but essential.");
        hints.add("Hint: Vanishes if water is poured on it.");

        if (checkAnswer(sc, "FIRE", hints))
            System.out.println("\nWell done! You now know where to go - the FIRE CAVE!");
        else {
            System.out.println("\nYou used all the tries. The script was in the FIRE CAVE.\n");
            System.exit(0);
        }
    }

    default void aztecDoor1(Scanner sc) {
        System.out.println("Identify the 5 words that resonate most with human sacrifices.\n" +
                        "Arrange the first letters of these 5 words in a way that it forms a new meaningful word.\n" +
                        "BOTTLE | HELL | DEITY | LOTUS | TORTURE | EXECUTION | COLOUR | ASHES | SHOE\n");
        
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: A phenomenon that occurs to all living beings. No one can escape it.");
        hints.add("Hint: It marks the end of every life's journey. It is inevitable and feared.");

        if(checkAnswer(sc, "DEATH", hints)) System.out.println("\nGreat! You have chosen the correct door - the DOOR OF DEATH.");
        else {
            System.out.println("\nNo attempts left.. All scripts were in the DOOR OF DEATH.\nThe words were deity, execution, ashes, torture, hell.\n");
            System.exit(0);
        }
    }

    default void aztecDoor2(Scanner sc) {
        System.out.println("Identify the 6 words that resonate most with human sacrifices.\n" +
                        "Arrange the first letters of these 6 words in a way that it forms a new meaningful word.\n" +
                        "AFTERLIFE | CANS | RELIGION | LOSS | ROSES | TERROR | EGYPT | UNHOLY | SKY | ISOLATION\n");
        
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: A ceremony in which the actions and wording follow a prescribed form and order.");
        hints.add("Hint: 6 letters : _I_UA_.");

        if(checkAnswer(sc, "RITUAL", hints)) System.out.println("\nGreat! You have chosen the correct door - the DOOR OF RITUAL.");
        else {
            System.out.println("\nNo attempts left.. All scripts were in the DOOR OF RITUAL.\nThe words were religion, isolation, terror, unholy, afterlife, loss.\n");
            System.exit(0);
        }
    }

    default void aztecDoor3(Scanner sc) {
        System.out.println("Identify the 4 words that resonate most with human sacrifices.\n" +
                        "Arrange the first letters of these 4 words in a way that it forms a new meaningful word.\n" +
                        "LIFE | ANSWER | UNDEAD | PUZZLED | SHIP | SUFFERING | OFFERING\n");
        
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: Even after death, this part of a person is believed to remain.");
        hints.add("Hint: Believed to be immortal and to exist apart from the material world.");

        if(checkAnswer(sc, "SOUL", hints)) System.out.println("\nGreat! You have chosen the correct door - the DOOR OF SOUL.");
        else {
            System.out.println("\nNo attempts left.. All scripts were in the DOOR OF SOUL.\nThe words were suffering, offering, undead, life.\n");
            System.exit(0);
        }
    }

    default void aztecDoor4(Scanner sc) {
        System.out.println("Identify the 4 words that resonate most with human sacrifices.\n" +
                        "Arrange the first letters of these 4 words in a way that it forms a new meaningful word.\n" +
                        "NIGHTMARE | ANGUISH | PRAYERS | BUTTERFLY | INHUMAN | ROYAL | DIAMONDS\n");
        
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: An unpleasant feeling - physical or emotional, often caused by injury, loss, or suffering.");
        hints.add("Hint: One of its synonyms is 'hurt'.");

        if(checkAnswer(sc, "PAIN", hints)) System.out.println("\nGreat! You have chosen the correct door - the DOOR OF PAIN.");
        else {
            System.out.println("\nNo attempts left.. All scripts were in the DOOR OF PAIN.\nThe words were prayers, anguish, inhuman, nightmare.\n");
            System.exit(0);
        }
    }

    default void aztecDoor5(Scanner sc) {
        System.out.println("Identify the 5 words that resonate most with human sacrifices.\n" +
                        "Arrange the first letters of these 5 words in a way that it forms a new meaningful word.\n" +
                        "FUNERAL | HORROR | PLAY | PILLOW | EVIL | LOSS | GROUND | SACRIFICE | COFFEE\n");
        
        ArrayList<String> hints = new ArrayList<>();
        hints.add("Hint: The soft tissue of the body that surrounds bones and organs.");
        hints.add("Hint: This tissue on an animal is used as food.");

        if(checkAnswer(sc, "FLESH", hints)) System.out.println("\nGreat! You have chosen the correct door - the DOOR OF FLESH.");
        else {
            System.out.println("\nNo attempts left.. All scripts were in the DOOR OF FLESH.\nThe words were funeral, loss, evil, sacrifise, horror.\n");
            System.exit(0);
        }
    }

    default void aztecScript1(Scanner sc) {
        System.out.println("Decode the word to find the correct script.");
        System.out.println("SFMZFYQ is NAHUATL.\nSJCYQF = ?");

        if(checkAnswer(sc, "NEXTLA", null)) System.out.println("\nYOU WIN! You have found the correct script and ensured the next human sacrifice is done in the right way.");
        else {
            System.out.println("\nAhh! You were so close to finding the correct script. The correct word was NEXTLA.\n");
            System.exit(0);
        }
    }

    default void aztecScript2(Scanner sc) {
        System.out.println("Decode the word to find the correct script.");
        System.out.println("UETKRV is SCRIPT.\nVNCOKEVK = ?");

        if(checkAnswer(sc, "TLAMICTI", null)) System.out.println("\nYOU WIN! You have found the correct script and ensured the next human sacrifice is done in the right way.");
        else {
            System.out.println("\nAhh! You were so close to finding the correct script. The correct word was TLAMICTI.\n");
            System.exit(0);
        }
    }

    default void aztecScript3(Scanner sc) {
        System.out.println("Decode the word to find the correct script.");
        System.out.println("BAUFD is AZTEC.\nWFNBOB = ?");

        if(checkAnswer(sc, "VEMANA", null)) System.out.println("\nYOU WIN! You have found the correct script and ensured the next human sacrifice is done in the right way.");
        else {
            System.out.println("\nAhh! You were so close to finding the correct script. The correct word was VEMANA.\n");
            System.exit(0);
        }
    }

    default void aztecScript4(Scanner sc) {
        System.out.println("Decode the word to find the correct script.");
        System.out.println("KXOEZEWJv is OBSIDIAN.\nPAUKHE = ?");

        if(checkAnswer(sc, "TEYOLI", null)) System.out.println("\nYOU WIN! You have found the correct script and ensured the next human sacrifice is done in the right way.");
        else {
            System.out.println("\nAhh! You were so close to finding the correct script. The correct word was TEYOLI.\n");
            System.exit(0);
        }
    }

    default void aztecScript5(Scanner sc) {
        System.out.println("Decode the word to find the correct script.");
        System.out.println("BCYRF is DEATH.\nRXMKNYL = ?");

        if(checkAnswer(sc, "TZOMPAN", null)) System.out.println("\nYOU WIN! You have found the correct script and ensured the next human sacrifice is done in the right way.");
        else {
            System.out.println("\nAhh! You were so close to finding the correct script. The correct word was TZOMPAN.\n");
            System.exit(0);
        }
    }

}

class EraExplorer_Java implements Egypt_Civilization, Aztec_Civilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EraExplorer_Java exp = new EraExplorer_Java();
        String choice;
        // // do{        
            exp.intro1(sc);
            exp.inst1(sc);
            List<Runnable> egyptLocation = Arrays.asList(
                () -> exp.egyptLocation1(sc),
                () -> exp.egyptLocation2(sc),
                () -> exp.egyptLocation3(sc),
                () -> exp.egyptLocation4(sc),
                () -> exp.egyptLocation5(sc)
            );
            int ElocationIndex = ThreadLocalRandom.current().nextInt(egyptLocation.size());
            egyptLocation.get(ElocationIndex).run();

            exp.inst2(sc);
            List<Runnable> egyptKey = Arrays.asList(
                () -> exp.egyptKey1(sc),
                () -> exp.egyptKey2(sc),
                () -> exp.egyptKey3(sc),
                () -> exp.egyptKey4(sc),
                () -> exp.egyptKey5(sc)
            );
            int EKeyIndex = ThreadLocalRandom.current().nextInt(egyptKey.size());
            egyptKey.get(EKeyIndex).run();

            exp.inst3(sc);
            List<Runnable> egyptItem = Arrays.asList(
                () -> exp.egyptItem1(sc),
                () -> exp.egyptItem2(sc),
                () -> exp.egyptItem3(sc),
                () -> exp.egyptItem4(sc),
                () -> exp.egyptItem5(sc)
            );
            int EItemIndex = ThreadLocalRandom.current().nextInt(egyptItem.size());
            egyptItem.get(EItemIndex).run();

            exp.intro2(sc);
            exp.inst4(sc);
            List<Runnable> AztecLocation = Arrays.asList(
                () -> exp.aztecLocation1(sc),
                () -> exp.aztecLocation2(sc),
                () -> exp.aztecLocation3(sc),
                () -> exp.aztecLocation4(sc),
                () -> exp.aztecLocation5(sc)
            );
            int AlocationIndex = ThreadLocalRandom.current().nextInt(AztecLocation.size());
            AztecLocation.get(AlocationIndex).run();

            exp.inst5(sc);
            List<Runnable> AztecDoor = Arrays.asList(
                () -> exp.aztecDoor1(sc),
                () -> exp.aztecDoor2(sc),
                () -> exp.aztecDoor3(sc),
                () -> exp.aztecDoor4(sc),
                () -> exp.aztecDoor5(sc)
            );
            int ADoorIndex = ThreadLocalRandom.current().nextInt(AztecDoor.size());
            AztecDoor.get(ADoorIndex).run();

            exp.inst6(sc);
            List<Runnable> AztecScript = Arrays.asList(
                () -> exp.aztecScript1(sc),
                () -> exp.aztecScript2(sc),
                () -> exp.aztecScript3(sc),
                () -> exp.aztecScript4(sc),
                () -> exp.aztecScript5(sc)
            );
            int AScriptIndex = ThreadLocalRandom.current().nextInt(AztecScript.size());
            AztecScript.get(AScriptIndex).run();

            exp.end();

            // while (true) {
            //     System.out.print("\nDo you want to play ERA EXPLORER again? (y or 1 = yes ; n or 0 = no): ");
            //     choice = sc.nextLine().trim().toLowerCase();
            //     System.out.println();
            //     if (choice.equals("y") || choice.equals("1") || 
            //         choice.equals("n") || choice.equals("0")) {
            //         break;
            //     }
            //     System.out.println("Please type 'y'/'1' for yes or 'n'/'0' for no.");
            //     }
            // } while (choice.equals("y") || choice.equals("1"));
        System.out.println("Do you wish to play ERA EXPLORER again? (y/n)");
        while (true) {
        choice = sc.nextLine();
        if (choice.isEmpty()) {
            continue;
        }
        else if (choice.equalsIgnoreCase("y")) main(args);//Project.main(args);
        else {
            System.out.println("Thank you for playing ERA EXPLORER.");
            break;
        }
        }
        // sc.close(); //error if i put this
    }
}
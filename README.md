# Era Explorer

**Era Explorer** is a text-based adventure game where players solve riddles across Ancient Egyptian and Aztec civilizations. 

## 🚀 Project Architecture: Progressive Complexity
This project was built to demonstrate how software evolves across different paradigms. The complexity scales up significantly from C to Python, and finally to the fully-featured Java build.

### 🥇 Java Implementation (The "Pro" Version)
* **Status:** **Full Production Build**
* **Complexity:** Advanced.
* **Key Features:** **Massive Content:** Features **30 unique puzzles** across 6 distinct categories (vs. only 6 in C/Python).
    * **Dynamic Gameplay:** Implements **Randomization** algorithms so the puzzles change every time you play.
    * **Architecture:** Engineered using strict **OOP principles** and **Interfaces** for smooth execution.
    * **UX:** Enhanced user interaction with robust handling of edge cases.

### 🥈 Python Implementation (The "Smart" Prototype)
* **Status:** **Optimized Logic**
* **Complexity:** Intermediate.
* **Key Features:** * **Data Structures:** Utilizes **Dictionaries** and **Functions** to modularize the code.
    * **Improvement over C:** Handles case-insensitive inputs and cleaner data retrieval ($O(1)$ complexity).
    * **Scope:** Contains the core 6-puzzle logic with improved structure.

### 🥉 C Implementation (The "Raw" Core)
* **Status:** **Base Logic**
* **Complexity:** Basic / Low-Level.
* **Key Features:** * **Strict Logic:** Case-sensitive input handling with no hints.
    * **Linear Flow:** A fixed sequence of 6 puzzles implemented using fundamental loops and conditional statements.
    * **Purpose:** Demonstrates the raw, bare-metal logic required to build the game engine without high-level abstractions.

## 🎮 How to Play
For the best experience, **play the Java version**.
1.  **Java:** Compile and run to experience the full randomized game.
2.  **Python:** Run `python3 EraExplorer_Python.py`.
3.  **C:** Compile using `clang` or `gcc`.

# ⚔️ Assignment 1 – Let the Battle Commence

| **Course**     | Advanced Programming – CO2039 |
|----------------|-------------------------------|
| **University** | HCMC University of Technology – VNU-HCM |
| **Faculty**    | Computer Science and Engineering |
| **Lecturers**  | MEng. Trần Ngọc Bảo Duy, BEng. Thi Khắc Quân |
| **Date**       | March 2025 |

---

## 🧠 Introduction

In this assignment, you are asked to implement a **battle simulation system** between characters such as **Knights**, **Warriors**, **Paladins**, and **Death Eaters**, based on an initial **class diagram** and **combat rules**.

The source includes abstract classes, interfaces, and some bytecode files. Your task is to implement specific classes and logic to simulate battle results, following defined rules.

---

## 🗂️ Project Structure

```bash
/
└── Initial Code/
    ├── class/            # Bytecode classes (DO NOT MODIFY)
    │   ├── Battle.class
    │   ├── Combatable.class
    │   ├── Fighter.class
    │   ├── Human.class
    │   ├── Main.class
    │   └── Monster.class
    ├── source/           # Java source files (Part B - must implement)
    │   ├── Knight.java
    │   ├── Warrior.java
    │   ├── Paladin.java
    │   └── DeathEater.java
    └── util/             # Utility classes (Part C - editable)
        ├── Complex.java
        ├── TeamMaker.java
        └── Utility.java

🔒 All classes must be placed in the default package (no package declaration).

📌 Assignment Parts
✅ Part A – Initial Classes (Given in Bytecode)
Interface: Combatable.class

Abstract classes: Human.class, Fighter.class, Monster.class

Others: Main.class, Battle.class (handles battle simulation logic)

🔸 You must not modify or recompile these files.

✅ Part B – Fixed Classes You Must Implement
1. Knight & Warrior
CombatScore:

If WP = 1: CombatScore = baseHP

Else: CombatScore = baseHP / 10

Special rules based on battle ground number:

Prime number → Warrior: CombatScore = baseHP × 2

Square number → Knight: CombatScore = baseHP × 2

2. Paladin
CombatScore = 3 × baseHP (on any ground)

If baseHP is a Fibonacci number (Fn with n > 2):
→ CombatScore = 1000 + n

📝 Example: Paladin with baseHP = 34 (F9) ⇒ CombatScore = 1009

3. DeathEater
No HP, only has MP as a complex number C = (real, imaginary)

CombatScore = factorial(real) + factorial(imaginary)

✅ Part C – Customizable Classes
You are allowed to modify the following files:

Complex.java: represents complex numbers, must support real/imaginary access.

TeamMaker.java: dummy class used for test-case generation during grading.

Utility.java: optional utility class.

📐 Class Diagram

📸 This diagram shows the initial structure and relationships. The classes in Part B are to be implemented accordingly.

🚀 How to Compile & Run
Ensure Java is installed and run using command line:

bash
Copy
Edit
javac *.java
java Main
You may need to compile files in source/ and util/ depending on your system.

📤 Submission Guidelines
You must submit a ZIP file via the university’s LMS.

Rename the folder Initial Code to your name and student ID, for example:
NguyenVanA_2012345

Preserve the original directory structure.

Do not rename or move bytecode files in class/.

⚠️ Notes
All source files must be placed in the default package.

TeamMaker.java will be replaced with another version during grading – do not hardcode its behavior.

Main.class and Battle.class simulate and score battles – your implementation must work with them.

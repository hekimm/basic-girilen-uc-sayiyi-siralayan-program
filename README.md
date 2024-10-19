# Number Sorting Project

## Overview
This project is a simple Java program designed to take three integer inputs from the user and display them in ascending order. The program prompts the user to enter three numbers and then determines their order using conditional statements. This project is useful for beginners learning Java, especially in terms of understanding conditionals, basic input, and output.

## Features
- Prompts the user to enter three integers.
- Displays the numbers in ascending order.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A Java code editor or IDE (e.g., IntelliJ, Eclipse, NetBeans, or VS Code).

### Running the Project
1. **Clone the Repository (Optional):** If the code is in a repository, clone it using:
   ```sh
   git clone <repository-url>
   ```

2. **Open the Code Editor/IDE:** Open your favorite Java IDE or code editor and create a new project named `NumberSorting`.

3. **Create the Main Java File:** Create a new file named `Main.java` and copy the following code into it:
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           int sayi1, sayi2, sayi3;
           
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the first number: ");
           sayi1 = scanner.nextInt();

           System.out.println("Enter the second number: ");
           sayi2 = scanner.nextInt();

           System.out.println("Enter the third number: ");
           sayi3 = scanner.nextInt();
           
           if (sayi1 < sayi2 && sayi1 < sayi3) {
               if (sayi2 < sayi3) {
                   System.out.println("Order: sayi1 < sayi2 < sayi3");
               } else {
                   System.out.println("Order: sayi1 < sayi3 < sayi2");
               }
           } else if (sayi2 < sayi1 && sayi2 < sayi3) {
               if (sayi1 < sayi3) {
                   System.out.println("Order: sayi2 < sayi1 < sayi3");
               } else {
                   System.out.println("Order: sayi2 < sayi3 < sayi1");
               }
           } else {
               if (sayi2 < sayi1) {
                   System.out.println("Order: sayi3 < sayi2 < sayi1");
               } else {
                   System.out.println("Order: sayi3 < sayi1 < sayi2");
               }
           }
       }
   }
   ```

4. **Compile and Run:** Compile and run the program.
   ```sh
   javac Main.java
   java Main
   ```

5. **User Input:** The program will prompt you to enter three numbers. Enter the numbers and see their order printed out.

## Example
```
Enter the first number:
5
Enter the second number:
3
Enter the third number:
8
Order: sayi2 < sayi1 < sayi3
```

## Explanation
The program uses `if-else` statements to determine the order of the three numbers by comparing them with each other. Depending on which number is smallest and how the other two relate to it, the appropriate sequence is displayed.

## Author
- **Hekim Can Aktaş**

## License
This project is open-source and available under the [MIT License](LICENSE).

## Acknowledgments
- Thanks to the Java community for helpful resources and tutorials.
- Inspiration from basic Java exercises for learning conditionals and input handling.


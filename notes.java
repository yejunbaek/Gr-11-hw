/*

/*used to enclose single or mutliline comments. Appropriate for the beginning of a program to describe the program */
// used for adding a comment to the end of a statement or to create a single line comment. Also useful for debugging

/*
control characters/escape characters
----------------------------------------------------------------------------------------------------------------------------------
System.out.print("") <- Display exactly as you see between the quotation marks
System.out.println("") <- Moves the insertion point to the next line (Adds an "enter" after the text)
\n <- new line
\t <- tab (8 spaces)
\\ <- shows a backslash ("\")
\" <- double quotation mark
----------------------------------------------------------------------------------------------------------------------------------
spaces
---------------------------------------------------------------
at least one space is needed to separate meaningful words
it is bad style to have spaces around dots
extra spaces inside a string would give different results
---------------------------------------------------------------
Displaying Output
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
when executing a program, the output can be printed in the console
the user sees only the output to the console, it is the only way a program communicates with the user. The user does not see the code and the "intentions" of the programmer through the code
output can not be changed, but can be used later on to interact with the user of the program and information
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Primitive Data Types
-------------------------------------------------------------------------
type     content   Min Value      Max Value
byte   - integer - -2^7         - 2^7 - 1
short  - integer - -2^15        - 2^15 - 1 
int    - integer - -2^31        - 2^31 - 1
long   - integer - -2^63        - 2^63 - 1
float  - real    - ~-3.4x10^38  - ~3.4 x 10^38
double - real    - ~-1.8x10^308 - ~1.8x10^308
char   - 1 character - enclose single character in single quotation
bool   - false/true
-------------------------------------------------------------------------
Variables
------------------------------------------------------------------------------------------------------------
Declaration: allocate space to store information <type> <name> (ex: int number; ex: char first, second;)
Initialization: Give a value for the first time (ex: number = 15;)
Declare and intialize: (ex: int total = 0)
Assignment: changing the value of a variable (ex: number = 74)
*always need to declar before using for first time.
*decalre only once. Can not have variable with same name
*initialize the variables before operating on them
------------------------------------------------------------------------------------------------------------
Identifiers and keywords
-------------------------------------------------------------------------------------------------------------------------
identifiers (names of variables) must begin with a letter
can contain letter/number/underscore
periods and spaces are not allowed
identifiers are case sensitive: Apple != apple
multiple words in a name: timeAtStart   time_at_start
names should make reference to what information they store
keywords in java are words with special meanings to the java complier. Therefore they cannot be used as variable names
-------------------------------------------------------------------------------------------------------------------------
Assigning Values
---------------------------------------------------------------------------------------------------------------------------

<type> <name> = <value>;
The <value> must be compatible with the <type>
java permits one type to another when it is safe
a byte varibale can be stored to an int
this type of conversation is called widening, because the new representation has a greater range
converting to a type with a smaller range is called narrowing
    careful: narrowing can cause a loss of data/precision
force java to perfrom conversion by performing a cast
ex:
int numOne;
double numTwo = 3.99;
numOne = (int) <-(the type you want to convert the value to) numTwo; <- (numOne is assigned 3)
casting a double to an int, truncates the number. Not round it
---------------------------------------------------------------------------------------------------------------------------
Changing Types
---------------------------------------------------------------------------------------------------------------------------
int a = 2;
double b = 3.7;
int x;
x = a*(int)b;

java will implicity cast operands in a mixed expression to match the type (precision) of the variable storing the result
int a = 2;
double b = 3.7;
double y;
y=a*b
y=(double)a*b;
---------------------------------------------------------------------------------------------------------------------------
Operations:
---------------------------------------------------------------------------------------------------------------------------
+, -, *, / <- division, % <- modulo
In math: 5/3 = 1 2/3
In java: 5/3 = 1 <- integer part
         5%3 = 2 <- remainder
int a = 5, b = 6;
doulbe c = 2, d = 3;
System.out.println(a/b); <- 0
System.out.println(a/c); <- 2.5
System.out.println(c/a); <- 0.4
System.out.println(c/d); <-0.66666666666666666666666666666666666666666666666666666666666666666666666
---------------------------------------------------------------------------------------------------------------------------
User input:
import java.util.Scanner;
Scanner input = new Scanner (System.in);
input.nextInt();
Scanner Type 
Scanner is an Abstract Data Type

object type        
 |       object name            parameter
 |        |                     |
Scanner input = new Scanner (System.in);
declare             intialize

.nextInt(); returns the int read from input stream
.nextDouble(); returns the double read from input stream
.next(); returns "word" from input stream
.nextLine(); returns the string up to the end of the line character from input stream

Math Class Random Class
import java.lang.Math;
Math.abs(num1) <- absolute value
Math.sqrt(num2) <- square root

import java.util.Random
Random rand = new Random();
int num = rand.nextInt(); <- gen random number

*/
import java.lang.Math;

public class notes {
    public static void main(String[] args) {
    }
}
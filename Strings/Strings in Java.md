# Strings

- String is an IMMUTABLE OBJECT of the "String" Class in Java.
- These Objects are stored in the String Pool (In the Heap) to eliminate redundancy.
- This means if a = "avi" and b = "avi". Then they are referring to the same object in the String Pool.
- Changing the value of either a or b will not overwrite the Object "avi", but it will create a new object instead.
- To create reference variables with the same value but different objects, we use the "new" keyword. 

## Comparing Strings

- " == " Comparator: It returns TRUE if two variables are referring to the same Object.
- equals() method: It returns TRUE if two variables have the same value.
```java
System.out.printf("Value of Pi is %.3f", Math.PI);
// Printf truncates and prints float var to specific decimal pts.
// out is an instance of PrintStream Class. Println and Printf are its functions. 
```

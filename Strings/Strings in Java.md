# Strings

- String is an IMMUTABLE OBJECT of the "String" Class in Java.
- These Objects are stored in the String Pool (In the Heap) to eliminate redundancy.
- This means if a = "avi" and b = "avi". Then they are referring to the same object in the String Pool.
- Changing the value of either a or b will not overwrite the Object "avi", but it will create a new object instead.
- To create reference variables with the same value but different objects, we use the "new" keyword. 

## Comparing Strings

- " == " Comparator: It returns TRUE if two variables are referring to the same Object.
- equals() method: It returns TRUE if two variables have the same value.

## Pretty Printing

```java
System.out.printf("Value of Pi is %.3f", Math.PI);
// Printf truncates and prints float var to specific decimal pts.
// out is an instance of PrintStream Class. Println and Printf are its functions. 
```
| Format Specifier | Description                               |
|------------------|-------------------------------------------|
| `%c`             | Character                                 |
| `%d`             | Decimal (integer) number (base 10)        |
| `%e`             | Exponential floating-point number         |
| `%f`             | Floating-point number                     |
| `%i`             | Integer (base 10)                         |
| `%o`             | Octal number (base 8)                     |
| `%s`             | String                                    |
| `%u`             | Unsigned decimal (integer) number          |
| `%x`             | Number in hexadecimal (base 16)           |
| `%t`             | Formats date/time                         |
| `%%`             | Print a percent sign                      |
| `\%`             | Print a percent sign                      |

## String Concatenation

- 'a' + 'b' = 195
- "a" + "b" = ab
- 'a' + 3 = 97
- (char)('a' + 3) = d
- "a" + 1 = a1 [int will be converted to Integer, which will call toString then. So it is the same as doing "a" + "1"]
- THIS "toString()" CONVERSION OF OBJECT WILL ONLY HAPPEN WHEN AT LEAST ONE THING IN THE ADDITION IS A STRING.

`Example: ans = new Integer(56) + "" + new Arraylist<>()];`

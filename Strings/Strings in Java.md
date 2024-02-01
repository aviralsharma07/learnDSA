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

## String Performance

```
String series = "";
for (int i=0; i<26; i++){
     char ch = (char)('a' + i);
     series += ch;
}
System.out.println(series);
```
- Here, in each Iteration new String Object is created: a, ab, abc, abcd --- a->z.
- This is a waste of Space. So we use String Builder to manipulate same object. 

```
StringBuilder builder = new StringBuilder();
for (int i=0; i<26; i++){
    char ch = (char)('a' + i);
    builder.append(ch);
}
System.out.println(builder);
String newstr = builder.toString();
System.out.println(newstr);
```
## String Methods

| Method                           | Description                                      | Example                                              | Explanation                                                         |
|----------------------------------|--------------------------------------------------|------------------------------------------------------|---------------------------------------------------------------------|
| `length()`                       | Returns the length of the string.                | `"Hello".length()`                                   | Returns `5` as the string "Hello" has five characters.              |
| `charAt(int index)`               | Returns the character at the specified index.   | `"Java".charAt(1)`                                   | Returns `'a'` at index `1`.                                        |
| `concat(String str)`             | Concatenates the specified string to the end.   | `"Hello".concat(" World")`                          | Returns a new string "Hello World".                               |
| `toUpperCase()`                  | Converts the string to uppercase.               | `"java".toUpperCase()`                              | Returns "JAVA".                                                    |
| `toLowerCase()`                  | Converts the string to lowercase.               | `"Java".toLowerCase()`                              | Returns "java".                                                    |
| `equals(Object obj)`              | Compares the content of two strings.            | `"hello".equals("world")`                           | Returns `false` as the content is not the same.                    |
| `equalsIgnoreCase(String str)`   | Case-insensitive comparison of two strings.     | `"Java".equalsIgnoreCase("java")`                   | Returns `true` as the content is the same, ignoring case.          |
| `indexOf(String str)`             | Returns the index of the first occurrence.      | `"Hello".indexOf("l")`                              | Returns `2` as the first occurrence of "l" is at index `2`.         |
| `substring(int beginIndex)`      | Returns a substring starting from the index.    | `"Hello".substring(2)`                              | Returns "llo" starting from index `2`.                             |
| `replace(char oldChar, char newChar)` | Replaces occurrences of a character.       | `"Hello".replace('l', 'w')`                        | Returns "Hewwo" by replacing all occurrences of 'l' with 'w'.      |
| `startsWith(String prefix)`      | Checks if the string starts with a prefix.     | `"Java".startsWith("Ja")`                          | Returns `true` as "Java" starts with "Ja".                         |
| `endsWith(String suffix)`        | Checks if the string ends with a suffix.       | `"Java".endsWith("va")`                            | Returns `true` as "Java" ends with "va".                           |
| `trim()`                         | Removes leading and trailing whitespaces.      | `"  Hello  ".trim()`                                | Returns "Hello" by removing leading and trailing whitespaces.     |
| `split(String regex)`            | Splits the string into an array using regex.   | `"Java is fun".split("\\s")`                        | Returns `["Java", "is", "fun"]` by splitting on whitespaces.      |
| `substring(int beginIndex, int endIndex)` | Returns a substring in the specified range. | `"Hello".substring(1, 4)`                          | Returns "ell" from index `1` to `3` (exclusive).                   |
| `isEmpty()`                      | Checks if the string is empty.                 | `"".isEmpty()`                                     | Returns `true` as the string is empty.                            |

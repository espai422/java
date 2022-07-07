# Java Strings

### Declare a String

In java we have two ways to declare a string. First one is by creating a new instance of a String class. This way it's not deprecated but is not used by the community.

```java
String oldWay = new String("This is a String");
```

The most used way to define a string is defining the String in a literal way.

```java
String newWay = "Ez way to define a string";
```

> String is imported by default by java in the **java.lang** class
___
### Escape Sequences
```java
// To insert " in a String we need to escape it with \ -> \"
String doubleQuotes = "Hello This is a \"double quotes\" test";

// Insert a back slash in a text such as a windows path -> \\
String windowsPath = "C:\\windows\\Users\\espai422";

// Insert a new line -> \n
String newLine = " This\n is a multi\n line String";

// Tabulation -> \t
String tab = "This is a\t tab";
```

### String methods
Strings are a reference types so the can have methods. Here we have a list of all Strings methods.

https://www.programiz.com/java-programming/library/string
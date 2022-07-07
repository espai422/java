# Java Casting
Casting consists in converting data from a type to another type. It's usefull when we need to operate with diferent types.
## Implicit
Implicit casting is the one tha happens without we know it's happening. For example when we add a short number with a int number an implicit casting is happening to the short number because it's possible to convert a 2 bytes number to a 4 bytes numbers without losing any data.

So we need to know that Implicit casting only happens when there is no way to lose some data. For example if we convert a float 1.1 to an int 1 we are missing data because 0.1 is missing, so in this case we will get an error and to make it work we will need to specifi it and it's going to be explicit casting. 

#### Examples of implicit casting

```java
// Implicit Casting
short x = 1;
int y = x + 2; // x is converted to an int and then java add the numbers

// Decimal
double a = 1.1;
double b = a + 2; // 2 is converted to 2.0 an then they add up        
// Result is 3.1
```

## Explicit
Explicit casting happens when change manually the type of a variable. In the following example we can see how to change from a double to a int without an error. We use a parenthesis and the type we want to convert the expression to.

```java
double a = 1.1;
int b = (int)a + 2;
// Result is 3
```

We can only cast compatible types, this is for example why we can not cast a string to a number or a number to a string. We can only cast primitive types with the previous method

## Wrapper Classes
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects. 

> All this classes are contained in java.lang so we don't need to import anything.

| Primitive data type | Wrapper Classes |
|:--------------------|-----------------|
| byte                | Byte            |
| short               | Short           |
| int                 | Integer         |
| long                | Long            |
| float               | Float           |
| double              | Double          |
| char                | Character       |
| boolean             | Boolean         |

#### String to primitive data type

| Primitive data type | Wrapper Classes Method    |
|:--------------------|---------------------------|
| byte                | Byte.parseByte(str)       |
| short               | Short.parseShort(str)     |
| int                 | Integer.parseInt(str)     |
| long                | Long.parseLong(str)       |
| float               | Float.parseFloat(str)     |
| double              | Double.parseDouble(str)   |
| char                | myString.charAt(0);       |
| boolean             | Boolean.parseBoolean(str) |

#### Primitive data type to String

First of all we need an instance of the Wrapper class an then we can convert it to an string usign the toString method. In this example we are using an Int.
```java
Integer myInt = 100;
String myString = myInt.toString();
```
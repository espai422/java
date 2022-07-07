# Java Arrays

Arrays are a list of objects with the same type for example we can have an array of bytes or an array of Strings but can not hava an array of bytes and Strings. Their size is defined when it's created so we can not increase or decrease the number of elements in it. In case of undefined value it will be a default value like `0` or `""` depending on the type of the array.

Arrays are mutable so we can modify the content without creating a new array.

## Define a new array

We have to ways to define an array and we can use the one wich is easier to use in every single case.

#### Method 1
```java
int[] numbers = new int[5]; // 5 is the lenght of the array
numbers[0] = 1;
numbers[3] = 10;
```

#### Method 2
```java
int[] shortWay = {1,2,3,4,5};
```

#### Print an array
If we just print the array variable, we are going to see a String version of a memory address. To print it we should import `java.util.Arrays` and use the following method.

```java
System.out.println(Arrays.toString(numbers));
```

## Multidimensional Arrays
Sometimes is usefull to have a multidimensiona array such as a matrix for example to solve some mathematical problem. As we can se define a multidimensional array is quite easy.

#### Method 1
```java
int[][] numbers = new int[2][3];
numbers[0][0] = 1;
```

#### Method 2
```java
int[][] matrix = {{1,2,3}, {4,5,6,7}};
```

#### Print a multidimensional array
We will also need the `java.util.Arrays` but we will use another method.
```java
System.out.println(Arrays.deepToString(matrix));
```
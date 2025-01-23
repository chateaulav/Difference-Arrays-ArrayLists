# Difference-Arrays-ArrayLists
## Arrays vs. ArrayLists in Java

In Java, Arrays and ArrayLists are both used to store collections of elements
but they serve different purposes and have distinct functionalities.

### Arrays

| Feature         | Description                                                                 |
|-----------------|-----------------------------------------------------------------------------|
| Fixed Size      | Once an array is created, its size cannot be changed.                       |
| Type-Specific   | Arrays store elements of a single data type (e.g., `int[]`, `String[]`).    |
| Performance     | Arrays are faster since they don't involve overhead like dynamic resizing.  |
| Direct Access   | Array elements are accessed directly using an index.                        |
| Syntax          | Arrays use square brackets (e.g., `int[] numbers = new int[5];`).           |

### ArrayLists

| Feature          | Description                                                                                                      |
|------------------|------------------------------------------------------------------------------------------------------------------|
| Dynamic Size     | ArrayLists can grow or shrink dynamically as elements are added or removed.                                      |
| Object Storage   | ArrayLists can store objects of any type, though primitive types need to be wrapped (e.g., `Integer` for `int`). |
| Built-in Methods | ArrayLists provide methods for common operations like `add()`, `remove()`, and `contains()`.                     |
| Memory Management| ArrayLists manage resizing internally, which involves creating new arrays and copying data.                      |
| Syntax           | ArrayLists require importing `java.util.ArrayList` (e.g., `ArrayList<Integer> list = new ArrayList<>();`).       |

### Conceptual Differences

**Arrays** are ideal for fixed-size collections, where performance and simplicity are priorities.
**ArrayLists** are more flexible and convenient for dynamic collections, making them suitable for
situations where the size of the collection isn't known in advance.

```java
ArrayList contents:
Index 0: 10
Index 1: 20
Index 2: 30

ArrayList after adding more elements:
Index 0: 10
Index 1: 20
Index 2: 30
Index 3: 40
Index 4: 50

ArrayList after removing element at index 2:
Index 0: 10
Index 1: 20
Index 2: 40
Index 3: 50

Array contents:
Index 0: 10
Index 1: 20
Index 2: 30
Index 3: 0
Index 4: 0
Error: Attempted to access an invalid index in the array.
```
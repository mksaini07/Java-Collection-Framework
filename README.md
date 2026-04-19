# Java Collection Framework - README

## 📌 Overview

The **Java Collection Framework (JCF)** is a unified architecture in Java that provides a set of interfaces, implementations, and algorithms to store, manipulate, and process groups of objects efficiently.

It is part of the `java.util` package and is designed to handle data structures such as lists, sets, queues, and maps.

---

## 🧱 Core Components

### 1. Interfaces

Interfaces define the abstract data types in the framework:

* **Collection** – Root interface for most collections
* **List** – Ordered collection (allows duplicates)
* **Set** – Unordered collection (no duplicates)
* **Queue** – FIFO structure
* **Deque** – Double-ended queue
* **Map** – Key-value pair structure (not a subtype of Collection)

---

### 2. Implementations

Concrete classes that implement the interfaces:

#### List Implementations

* `ArrayList` – Dynamic array, fast random access
* `LinkedList` – Doubly linked list, efficient insertions/deletions
* `Vector` – Synchronized (legacy)

#### Set Implementations

* `HashSet` – Uses hashing, no order guarantee
* `LinkedHashSet` – Maintains insertion order
* `TreeSet` – Sorted set (Red-Black tree)

#### Queue Implementations

* `PriorityQueue` – Elements processed based on priority
* `ArrayDeque` – Resizable array-based deque

#### Map Implementations

* `HashMap` – Fast lookup using hashing
* `LinkedHashMap` – Maintains insertion order
* `TreeMap` – Sorted keys
* `Hashtable` – Thread-safe (legacy)

---

### 3. Algorithms

Utility methods provided by the `Collections` class:

* Sorting (`Collections.sort()`)
* Searching (`Collections.binarySearch()`)
* Reversing (`Collections.reverse()`)
* Shuffling (`Collections.shuffle()`)

---

## ⚙️ Key Features

* **Dynamic resizing**
* **Reusable data structures**
* **High performance**
* **Generic support (type safety)**
* **Thread-safe options available**

---

## 🧪 Example Usage

```java
import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2); // duplicate ignored

        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("Map: " + map);
    }
}
```

---

## 🔄 Collection Hierarchy (Simplified)

```
Iterable
   └── Collection
         ├── List
         ├── Set
         ├── Queue
         
Map (separate hierarchy)
```

---

## 🚀 When to Use What?

| Requirement            | Recommended Collection |
| ---------------------- | ---------------------- |
| Fast random access     | ArrayList              |
| Frequent insert/delete | LinkedList             |
| No duplicates          | HashSet                |
| Sorted data            | TreeSet / TreeMap      |
| Key-value mapping      | HashMap                |
| Thread-safe collection | Vector / Hashtable     |

---

## ⚠️ Notes

* Prefer modern classes (`ArrayList`, `HashMap`) over legacy ones (`Vector`, `Hashtable`)
* Use generics to avoid `ClassCastException`
* Consider concurrency utilities from `java.util.concurrent` for multithreading

---

## 📚 References

* Engineering Digest YT 
* Oracle Java Tutorials

---

## 🏁 Conclusion

The Java Collection Framework simplifies data handling by providing ready-made data structures and algorithms. Understanding when and how to use each collection type is key to writing efficient and maintainable Java code.

---

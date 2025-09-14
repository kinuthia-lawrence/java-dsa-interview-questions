# Collections cheat sheet

# 1. Arrays
```java
Arrays.copyOf(oldArray, length) // copying arrays
Arrays.sort(arr) // sorting arrays in ascending order
Arrays.sort(arr, Collections.reverseOrder()) // sorting arrays in descending order
Arrays.equals(arr1, arr2) // compare arrays
Arrays.fill(arr, value) // fill array with value
Arrays.binarySearch(arr, key) // binary search in sorted array
```

# 2. ArrayList
```java
ArrayList<Integer> list = new ArrayList<>(); // create ArrayList
list.add(1); // add element
list.get(0); // get element
list.set(0, 2); // set element
list.remove(0); // remove element
list.size(); // get size
list.contains(2); // check if contains
Collections.sort(list); // sort list
Collections.reverse(list); // reverse list
```

# 3. LinkedList
```java
LinkedList<String> ll = new LinkedList<>();
ll.add("A");
ll.addFirst("B");
ll.addLast("C");
ll.removeFirst();
ll.removeLast();
ll.get(0);
```

# 4. HashSet
```java
HashSet<Integer> set = new HashSet<>();
set.add(1);
set.contains(1);
set.remove(1);
set.size();
```

# 5. HashMap
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.get("A");
map.containsKey("A");
map.remove("A");
map.keySet();
map.values();
```

# 6. Stack
```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.pop();
stack.peek();
stack.isEmpty();
```

# 7. Queue (LinkedList implementation)
```java
Queue<Integer> queue = new LinkedList<>();
queue.add(1);
queue.poll(); // remove head
queue.peek(); // get head
queue.isEmpty();
```

# 8. PriorityQueue
```java
PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap
pq.add(1);
pq.poll(); // remove min
pq.peek(); // get min
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
```

# 9. Useful Collection Utilities
```java
Collections.sort(list); // sort list
Collections.reverse(list); // reverse list
Collections.max(list); // max element
Collections.min(list); // min element
Collections.frequency(list, value); // count occurrences
```

# 10. Iterating Collections
```java
for (int x : list) { }
for (String key : map.keySet()) { }
for (int x : set) { }
```

# 11. Conversion
```java
list.toArray(); // ArrayList to array
Arrays.asList(arr); // array to ArrayList
```

# 12. Streams (Java 8+)
```java
list.stream().filter(x -> x > 0).collect(Collectors.toList());
Arrays.stream(arr).forEach(System.out::println);
```

# 13. Common Imports
```java
import java.util.*;
import java.util.stream.*;
```
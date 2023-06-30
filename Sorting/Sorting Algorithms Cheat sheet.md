# Sorting Algorithms Cheat Sheet


| Algorithm      | Best Time Complexity | Average Time Complexity | Worst Time Complexity | Auxiliary Space Complexity | Online | Stable | Inplace |
|----------------|---------------------|------------------------|-----------------------|------------------------------|--------|--------|---------|
| Selection Sort | O(n^2)              | O(n^2)                 | O(n^2)                | O(1)                         | No     | No     | Yes     |
| Bubble Sort    | O(n)                | O(n^2)                 | O(n^2)                | O(1)                         | No     | Yes    | Yes     |
| Insertion Sort | O(n)                | O(n^2)                 | O(n^2)                | O(1)                         | Yes    | Yes    | Yes     |
| Merge Sort     | O(n log n)          | O(n log n)             | O(n log n)            | O(n)                         | No     | Yes    | No      |
| Quick Sort     | O(n log n)          | O(n log n)             | O(n^2)                | O(log n)                     | No     | No     | Yes     |
| Heap Sort      | O(n log n)          | O(n log n)             | O(n log n)            | O(1)                         | No     | No     | Yes     |


## Tips and Tricks
- Merge Sort is really preferred for Linked List. This is because we don't need that extra auxiliary space in Linked Lists.
- Merge Sort is used in external sorting. Considering, we are given huge chunks of data s.t, it is not feasible to handle such an amount of data in one go. So we divide it into chunks, sort them separately and merge them.
- We prefer Quick Sort over Merge Sort for Arrays.

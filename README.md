# Algorithm-Basic

>##### What is Algorithm?
>+ It is a logical and mathematical approach to solve or crack a problem using any possible method.
>+ Algorithms are generally created independent of underlying languages, i.e. an algorithm can be implemented in more than one programming language.
  <br><br>


>##### Criteria of a Algorithm:
>1. Input
>2. Output
>3. Definiteness
>4. Finiteness
>5. Effectiveness
   <br><br>


>##### Different types of Algorithms:
>- [x] Searching Algorithms
>- [x] Sorting Algorithms
>- [ ] Divide and conquer algorithms
>- [ ] Recursive algorithms
>- [ ] Backtracking algorithms
>- [ ] Brute force algorithms
>- [ ] Greedy Algorithms
>- [ ] Dynamic programming algorithms
<br><br>
  

>##### Application of Algorithms:
>+ Searching Data
>+ Sorting Data
>+ Find out the Shortest Path
>+ Best Possible solution
  <br><br>

>##### Complexity Analysis of Algorithm:
>+ Time Complexity
>+ Space Complexity
<br><br>
  
>##### Three Cases of Complexity Analysis:
><p align="center" >
>  <img src="https://user-images.githubusercontent.com/69858580/107119551-9351a180-68b2-11eb-9487-64a7b9cb50c3.PNG" width="600" height="300" >
></p>
>
><p align="center" >
>  <img src="https://user-images.githubusercontent.com/69858580/107119681-69e54580-68b3-11eb-9cd1-15b281d08d90.PNG" width="600" height="300" >
></p>
>
>
>+ Best case depends on the input
>+ Average case is difficult to compute 
>+ So We usually focus on worst case analysis:
>    + Easier to compute
>    + Usually close to the actual running time
>    
<br>

>##### Some common rates of growth:
>Let n be the size of input to an algorithm, and k some
constant. The following are common rates of growth-
>
><p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107119957-f17f8400-68b4-11eb-8cf6-1421dfc33d71.PNG" width="600" height="300" >
></p>
>
><p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107121365-2f33db00-68bc-11eb-84f6-e0b1cbd49504.PNG" width="500" height="300" >
></p>

<br>

# 1. Searching Algorithms:
>- [x] **Search for a target data from a data set.**
>
>- [x] **Searching Algorithms are designed to check for an
element or retrieve an element from any data structure
where it is stored.**
>
>###### Why Searching Algorithms:
>+ **It is used for unsorted and unordered small list of elements.**
>+ **It has a time complexity of O(n), which means the time is linearly dependent on the number of elements, which is not bad, but not that good too.**
>+ **It has a very simple implementation.**
>
>
>###### Two possible outcomes:
>+ Target data is Found (Success)
>+ Target data is not Found (Failure)
<br> <br>

>##### Based on the type of search operation, two popular algorithms available:
>+ Linear Search / Sequential Search
>+ Binary Search
  <br> <br>
  
>### Linear Search
>Check each and every data in the list till the desired element
or value is found.
>
>
>
> <p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107122139-12010b80-68c0-11eb-8981-0d19b0059da3.PNG" width="500" height="100" >
> </p>

>##### Algorithm:
>+  Best case: O(1)
>+  Worst Case: O(n)

      // First way...
      i = 1 
      while i < n && Z != X[i] do           // Z = searching variable
          i = i+1

      if i < n then
          FOUND
      else
          NOT FOUND


      // Second Way...
      flag = FALSE
      for i = 1 to n
          if A[i] == key        // key = searching variable
              flag = TRUE;
    
      if flag == TRUE
          FOUND
      else
          NOT FOUND

      // After looking at the algorithm, you can see that there is an example in the above file(Linear_Search.java) to better understand.


>### Binary Search
>
> **To use binary search, your array / list must be sorted. If it is not sorted then you cannot do binary search. Or else you have to sort the array / list.**
> <p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107189030-dcb90280-6a12-11eb-9d3c-9e0bd9de0bb8.PNG" width="500" height="150" >
> </p>
>
>
>+  Best case: O(1)
>+  Worst Case: O(n)

```javascript
       Algorithm:

       low = 1                          //Start position
       high = n                         //Last position
       flag = false

       while low <= high and flag = = false do
          mid = (low + high) / 2
          Xm = A[mid]                   // Xm = a veriable where we store our mid variable

          case:
              Xm < Z : low = mid + 1    // z = searching number
              Xm > Z : high = mid - 1
              Xm == Z : flag = true
       
       if (flag == true){
          FOUND
        }
       else
          NOT FOUND
       

       // After looking at the algorithm, you can see that there is an example in the above file[Binary_Search.java](https://github.com/DeveloperKits/Algorithm-Basic/blob/master/src/Searching_Algorithm/Linear_Search.java) to better understand. 

```

# 2. Sorting Algorithms
>- [x] **Sorting refers to arranging data in a particular format.**
>
>- [x] **Most common orders are in numerical or lexicographical
order.**
>###### Why Sorting Algorithms:
>+ The importance of sorting lies in the fact that data
   searching can be optimized to a very high level, if data is
   stored in a sorted manner.
>
>+ Sorting is also used to represent data in more readable formats.
> 
>###### We will Learn: 
> 1. `Selection Sort`
> 2. `Insertion Sort`
> 3. `Merge Sort`
> 4. `Quick Sort`
> <br>


>### Selection Sort


```javascript
1. Find the smallest element in the array
2. Exchange it with the element in the first position
3. Find the second smallest element and exchange it with the element in the second position
4. Continue until the array is sorted

Algorithm:

n ← length[A]
for i ← 1 to n - 1
    min ← i

    for j ← i + 1 to n
        if A[j] < A[min]
            min ← j

    exchange A[i] ↔ A[min]
```

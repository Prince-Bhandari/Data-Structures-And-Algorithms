#  #DrGViswanathan Challenge Progress Log

<div align="center">
  
[![LeetCode](https://img.shields.io/badge/LeetCode-252527?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/Prince_Bhandari/)
[![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=007396&style=for-the-badge)](https://www.java.com/)
![Data Structures](https://img.shields.io/badge/Data%20Structures-64A56C?style=for-the-badge)
![Algorithms](https://img.shields.io/badge/Algorithms-F5695F?style=for-the-badge)

</div>

<div align="center">

### Topics that I will be covering: 
![Array](https://img.shields.io/badge/Array-fca5a5?style=for-the-badge)
![String](https://img.shields.io/badge/String-fdba74?style=for-the-badge)
![Hash Table](https://img.shields.io/badge/Hash%20Table-fcd34d?style=for-the-badge)
[![Math](https://img.shields.io/badge/Math-fef08a?style=for-the-badge)](./Math)
![Number Theory](https://img.shields.io/badge/Number%20Theory-bef264?style=for-the-badge)
![Matrix](https://img.shields.io/badge/Matrix-86efac?style=for-the-badge)
![Graphs](https://img.shields.io/badge/Graphs-6ee7b7?style=for-the-badge)
![Bit Manipulation](https://img.shields.io/badge/Bit%20Manipulation-99f6e4?style=for-the-badge)
![Binary Tree](https://img.shields.io/badge/Binary%20Tree-a5f3fc?style=for-the-badge)
![Binary Search](https://img.shields.io/badge/Binary%20Search-93c5fd?style=for-the-badge)
![Greedy](https://img.shields.io/badge/Greedy-bfdbfe?style=for-the-badge)
[![Linked List](https://img.shields.io/badge/Linked%20List-c7d2fe?style=for-the-badge)](./Linked_List)
![Stack](https://img.shields.io/badge/Stack-d8b4fe?style=for-the-badge)
![Queue](https://img.shields.io/badge/Queue-e9d5ff?style=for-the-badge)
![Recursion](https://img.shields.io/badge/Recursion-f5d0fe?style=for-the-badge)
![Two Pointers](https://img.shields.io/badge/Two%20Pointers-fbcfe8?style=for-the-badge)  

</div>

---

### 📁 Repository Structure

Each problem's solution is categorized in its own topic directory following the naming convention:

```
Data-Structures-And-Algorithms
├──{topic_name}/
    └──{problem-slug}.java
├── LICENSE                    
└── README.md
```

---

<br>

### 📋 Day 1 - 03/06/2026
Started with math-based problems and focused on both solving and optimizing.  
✅ [Missing Value](./Math/Missing_Number.java)  
✅ [Add Digits](./Math/Add_Digits.java) – learned & solved using the Digital Root concept  
✅ [Perfect Number](./Math/Perfect_Number.java) – both Brute Force (O(n)) and Optimal (O(√n), O(1) space) approach

---

### 📋 Day 2 - 04/06/2026
Solved:  
✅ [Palindrome Number](./Math/Palindrome_Number.java) — a quick revision of a familiar problem.  
✅ [Valid Perfect Square](./Math/Valid_Perfect_Square.java) — first solved with Binary Search O(log n) and then explored Heron's Method.  
x^2 - n = 0 gives the iterative formula where the sequence converges quadratically to sqrt n as it tends to ∞ 

---

### 📋 Day 3 - 04/06/2026
Today's focus: Linked Lists.  
✅ [Reverse Linked List](./Linked_List/Reverse_Linked_List.java) — practiced pointer manipulation using the iterative two-pointer approach.  
✅ [Middle of the Linked List](./Linked_List/Middle_of_The_Linked_List.java) — I solved it with the fast & slow pointer technique and also experimented with a step-counting approach where the 2nd pointer will move in every even step while the 1st moves each step.  
✅ [Merge Two Sorted Lists](./Linked_List/Merge_Two_Sorted_Linked_List.java) — merged two sorted lists efficiently using a new node and pointer traversal. 

---

### 📋 Day 4 - 05/06/2026
Today's focus stayed on Linked Lists.  
✅ [Linked List Cycle](./Linked_List/Linked_List_Cycle.java)  
Solved using the same fast & slow pointer technique learned yesterday. This is Floyd’s Cycle Finding Algorithm (Tortoise and Hare) a pointer-based approach that detects cycles in O(n) time and O(1) space.  
Fast runner will always catch the slow runner!   
✅ [Palindrome Linked List](./Linked_List/Palindrome_Linked_List.java)  
Started with straightforward approaches using a List and then a Stack. Both solutions achieve O(n) time with O(n) extra space.  
Next step: explore the recursive solution and the optimal approach using two pointers and in-place reversal for this problem.

---

### 📋 Day 5 – 08/06/2026
Today's focus was on [Palindrome Linked List](./Linked_List/Palindrome_Linked_List.java).  
✅ Solved using the optimal two-pointer approach:  
Found the middle using slow & fast pointers  
Reversed the second half of the linked list in-place  
Compared both halves for palindrome validation  
Achieved O(n) time and O(1) extra space, improving over stack/list-based approaches.  
Also explored a recursive solution, which was elegant but used extra call stack space.

---

### 📋 Day 6 - 09/06/2026
Today I solved two Linked List problems:  
✅ [Remove Linked List Elements](./Linked_List/Remove_Linked_List_Elements.java)  
Initially created a new filtered list → O(n) time, O(n) space.  
Realized the list could be modified in-place unless stated otherwise.  
Optimized to O(n) time, O(1) space.  
✅ [Rotate List](./Linked_List/Rotate_List.java)
Converted the list into a circular linked list.  
Used k % n and pointer math to find the new head and tail.  
Broke the circle to get the rotated list.  
Achieved O(n) time, O(1) space.

---

<br>

### 📝 License
This project is licensed under the **MIT License** - see the [LICENSE](./LICENSE) file for details.

---

### 🌟 Acknowledgments
- [LeetCode](https://leetcode.com/) for providing an excellent platform for coding practice
- placementoffice@vitbhopal.ac.in and ***#DrGViswanathan Challenge*** initiative for inspiring consistent learning and DSA practice.

---

### 📫 Connect
- **GitHub:** [@Prince-Bhandari](https://github.com/Prince-Bhandari)
- **LeetCode:** [@Prince_Bhandari](https://leetcode.com/Prince_Bhandari/)
- **LinkedIn:** [@Prince--Bhandari](https://www.linkedin.com/in/prince--bhandari/)
- **Email:** prince.24bcy10302@vitbhopal.ac.in | princebhandari67@gmail.com

<br>

<div align="center">

**⭐ Thank you for visiting this repository!**  
Made with ❤️ by [Prince Bhandari](https://github.com/Prince-Bhandari)

</div>

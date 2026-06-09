# #DrGViswanathan Challenge Progress Log

### Day 1 - 03/06/2026
Started with math-based problems and focused on both solving and optimizing.  
✅ Missing Value  
✅ Add Digits – learned & solved using the Digital Root concept  
✅ Perfect Number – both Brute Force (O(n)) and Optimal (O(√n), O(1) space) approach

---

### Day 2 - 04/06/2026
Solved:  
✅ Palindrome Number — a quick revision of a familiar problem.  
✅ Valid Perfect Square — first solved with Binary Search O(log n) and then explored Heron's Method.  
x^2 - n = 0 gives the iterative formula where the sequence converges quadratically to sqrt n as it tends to ∞ 

---

### Day 3 - 04/06/2026
Today's focus: Linked Lists.  
✅ Reverse Linked List — practiced pointer manipulation using the iterative two-pointer approach.  
✅ Middle of the Linked List — I solved it with the fast & slow pointer technique and also experimented with a step-counting approach where the 2nd pointer will move in every even step while the 1st moves each step.  
✅ Merge Two Sorted Lists — merged two sorted lists efficiently using a new node and pointer traversal. 

---

### Day 4 - 05/06/2026
Today's focus stayed on Linked Lists.  
✅ Linked List Cycle  
Solved using the same fast & slow pointer technique learned yesterday. This is Floyd’s Cycle Finding Algorithm (Tortoise and Hare) a pointer-based approach that detects cycles in O(n) time and O(1) space.  
Fast runner will always catch the slow runner!   
✅ Palindrome Linked List  
Started with straightforward approaches using a List and then a Stack. Both solutions achieve O(n) time with O(n) extra space.  
Next step: explore the recursive solution and the optimal approach using two pointers and in-place reversal for this problem.

---

### Day 5 – 08/06/2026
Today's focus was on Palindrome Linked List.  
✅ Solved using the optimal two-pointer approach:  
Found the middle using slow & fast pointers  
Reversed the second half of the linked list in-place  
Compared both halves for palindrome validation  
Achieved O(n) time and O(1) extra space, improving over stack/list-based approaches.  
Also explored a recursive solution, which was elegant but used extra call stack space.

---

### Day 6 - 09/06/2026
Today I solved two Linked List problems:  
✅ Remove Linked List Elements (LeetCode 203)  
Initially created a new filtered list → O(n) time, O(n) space.  
Realized the list could be modified in-place unless stated otherwise.  
Optimized to O(n) time, O(1) space.  
✅ Rotate List (LeetCode 61)  
Converted the list into a circular linked list.  
Used k % n and pointer math to find the new head and tail.  
Broke the circle to get the rotated list.  
Achieved O(n) time, O(1) space.

---


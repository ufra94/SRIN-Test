### Questions:
1. Please explain when we must use an array or linked list. Better explain the tradeoff between them. 
2. Assume that the maximum number of balls is 10,000 and the sequence starts with 100 balls. In this case, the maximum number of balls is fixed, but the operation needed is explained below. Is it still good to use arrays ?
- There is a sequence of balls. I can insert a ball anywhere in the sequence. I can retrieve the whole sequence of balls. Which data structure that I will use ? 
- Ex. When I have a ball with number 1 to 100. Then I insert a ball number 101 between 55 and 56. Then the sequence of balls would be 1, 2, 3, ..., 55, 101, 56, ..., 100. 


### Question 1 Answer:
1. Array is a data structure that contains a group of element, typically of the same data type. Array stores data linearly and contiguously. Array has fixed size and memory allocation which is allocated at compile time. 
2. Linked list is also a data structure that contains a group of element. Unlike array, linked list stores data typically in non contiguous manner, hence there is a need to store an additional tag that reference to the location of the next data. Linked list has flexible size, and its memory is allocated dynamically according to needs. 
3. Tradeoff: Array is more compact than linked list, in a sense that it doesn't need to store the reference to next data location. Being 


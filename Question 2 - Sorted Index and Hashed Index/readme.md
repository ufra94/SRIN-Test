### Questions:
1. Please explain the sorted index and hashed index in the database. Better explain the tradeoff between them.
2. Ex. If there is a table consisting of user_id, age, height, and gender. You want to query in that table by user_id, like `SELECT user_id FROM table WHERE user_id = 1`
3. Ex. If you want to query in that table by age range, like `SELECT user_id FROM table WHERE age > 15 AND age < 60` Which index is better on the problems above ? 

### Question 1 answer:
1. In hashed index, the data is distributed uniformly across a range of 'buckets' without regard of any ordering. A function called 'hash function' is then used to map an index to the bucket in which the corresponding data is stored.  
2. In sorted index, the data is stored according to a certain ordering. Indices then created on a fixed interval which then used to access a particular data in a sequential manner. 
3. Tradeoff: 

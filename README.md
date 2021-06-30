# COMP3411_OperatingSystems
TRU Operating System Class - Notes for my own reference 

## Threads 
1. Thread is a basic unit of CPU utilization 
2. Concurrency: multiple threads are making progress; Parallelism: multiple threads making progress simultaneously  
3. Java threads: "There are two techniques for explicitly creating threads in a Java program." 
  - New class from Thread class and override run() method 
  - Define a class that implements Runnable interface 
4. Difference between the two from StackOverFlow: 
    " Both approaches do the same job but there have been some differences.
     The most common difference is

      When you extend Thread class, after that you can’t extend any other class which you required. (As you know, Java does not allow inheriting more than one class).
    When you implement Runnable, you can save space for your class to extend any other class in the future or now.
    However, one significant difference between implementing Runnable and extending Thread is that
   by extending Thread, each of your threads has a unique object associated with it, whereas implementing Runnable, many threads can share the same object instance."
  
  



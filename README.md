## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |      10000         |     0.000982    |
| Using ReentrantLock     |      10000         |     0.006250    |
| Syncronized method      |      10000         |     0.004079    |
| AtomicLong for total    |      10000         |     0.001632    |

## 1. Using unsynchronized counter object

answer the questions (1.1 - 1.3)
1.1 I run it more than 50 times The total never be zero, the total less time same.
1.2 I run by using limit = 10,000,000 First time 0.016441 sec., Second is 0.019020 sec., Third is 0.016664 sec. 
	Average is 0.017375 sec.
1.3 Because in the Memory do load , replace and change In each thread work together But if there is a process that overlaps.The 	time that changes the value of one thread is wrong. 
## 2. Implications for Multi-threaded Applications

How might this affect real applications?  
2. Withdraw in ATM for example in your account have balance 100 baht you withdraw 100 baht 2 time together if the balance not yet to replace new balance before 2nd withdraw you can earn 200 baht.

## 3. Counter with ReentrantLock

answer questions 3.1 - 3.4
3.1 It always zero, Average time is 0.005966.
3.2 Because in CounterWithLock wait the process in each thread is completed before do next process.
3.3 ReentranLock do lock the one process to completely before do next process use when program called method simultaneously. 
3.4 For when you finish the process the program is unlocked to make the next process.

## 4. Counter with synchronized method

answer question 4
4.1 It always zero, Average time is 0.003949.
4.2 Because in synchronized method wait the process in each thread is completed before do next process.
4.3 Synchronized mean can't call the method simultaneously use when program called method simultaneously.


## 5. Counter with AtomicLong

answer question 5
5.1 Because AtomicLong can't call the method simultaneously
5.2 use when program called method simultaneously.

## 6. Analysis of Results

answer question 6
6.1 The fastest is AtomicLong for total, The slowest is ReentrantLock.
6.2 Synchronized because it faster than ReentrantLock and comprehensive than AtomicLong can use only long.


## 7. Using Many Threads (optional)


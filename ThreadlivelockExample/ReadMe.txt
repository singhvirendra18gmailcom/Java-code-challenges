Livelock describes situation where two threads are busy responding to actions of each other. They keep repeating a particular code so the program is unable to make further progress:
Thread 1 acts as a response to action of thread 2

Thread 2 acts as a response to action of thread 1

Unlike deadlock, threads are not blocked when livelock occurs. They are simply too busy responding to each other to resume work. In other words, the program runs into an infinite loop and cannot proceed further.
 
A Livelock Example:
Let’s see an example: a criminal kidnaps a hostage and he asks for ransom in order to release the hostage. A police agrees to give the criminal the money he wants once the hostage is released. The criminal releases the hostage only when he gets the money. Both are waiting for each other to act first, hence livelock.
Here’s the code of this example.



So how to avoid livelock? There’s no general guideline, you have to design your program to avoid livelock situation.

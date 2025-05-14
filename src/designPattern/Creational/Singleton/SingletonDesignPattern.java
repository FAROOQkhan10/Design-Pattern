package designPattern.Creational.Singleton;



public class SingletonDesignPattern {

    /*
     It ensures that class has only one instance and provides a global point of access to that instance.

     When to Use the Singleton Pattern:
       1. When a class is required to have only one instance (e.g., logging, configuration settings).
       2. When that instance needs to be accessed globally throughout the application.

Summary of Differences:
Feature	                     First Logger	                                              Second Logger
Thread Safety	             Not thread-safe	                                          Thread-safe using double-checked locking (once without synchronization for performance, and once inside the synchronized block to ensure only one thread can create the instance.)
Performance	                 Faster, no synchronization overhead	                      Slightly slower due to synchronization
Singleton Creation	         Simple creation without thread safety	                      Thread-safe creation using synchronized block
Use Case	                 Works for single-threaded applications	                      Works in multi-threaded applications
Potential Issue	             May create multiple instances in multi-threaded apps	      Ensures only one instance in multi-threaded apps



     */



    public static void main(String[] args) throws InterruptedException {

        // To create problem of multithreaded as we discuss that logger1 is not work in multithreaded environment
        // Create two threads that try to access the Logger1 instance
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Try to get the Logger1 instance
                Logger1 logger = Logger1.getInstance();
                logger.printLog("Log from thread 1");
                System.out.println("Thread 1 - Logger instance: " + logger);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Try to get the Logger1 instance
                Logger1 logger = Logger1.getInstance();
                logger.printLog("Log from thread 2");
                System.out.println("Thread 2 - Logger instance: " + logger);
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

    }

    /*
         Why does the second thread print first, even though we started thread1 before thread2?

        Thread start order ≠ Thread execution order.

        Just because you write thread1.start() first, doesn’t mean thread1 will run before thread2.
        Once a thread is started, it's up to the JVM thread scheduler and OS to decide which thread
        runs when — and it's not guaranteed to be in the order you started them.

    Here's what actually happens:

    You request both threads to start.
    The JVM tells the OS: "Hey, schedule these threads for execution."
    The OS puts both threads in its scheduler's queue.
    Depending on many factors — like CPU load, system architecture, thread priority, timing — either thread can get CPU time first.
    So even if you start thread1 first, thread2 may start executing sooner.

     */

}

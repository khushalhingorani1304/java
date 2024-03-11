// Java Multithreading is mostly used in games and animations 
// Multithreading is preffered over Multiproceesing becasuse shared memory area
// theu dont allocate seperate memory area s saves memory and the context switching between between threads take less time then process
// Threades are independent if there occurs exception in one thread it does not affect another thread
// At a time one thread is excecuted only
// Life Cycle Of A Thread - in java a thread always exixts in any one of the following states:
// @1 New
// @2 Active
// @3 Blocked/Waiting
// @4 timed waiting
// @5 terminated
// There are 2 ways to create a thread in java 
// 1@ By extending thread class
// 2@ By implementing runnable interface

// Common method of Thread class:
// 1@ Public Void run;
// 2@ Public Void start;
// 3@ Public Void sleep;
// 4@ Public Void join;
// 5@ Public int getPriority;
// 6@ Public int getName;
// 7@ Public Void SetName;
// 8@ Public Boolean isAlive;
// 9@ Public Void stop;
// 10@ Public Boolean isDaemon;




// Daemon THread in java - it is a service provider thread that provides services to the user thread ;
// the life of the deamon thread depends on the mercy of the user thead;
// When all the user threads die jvm terminates this thread automatically;


// the most common example of jvm thread in java is finallizer;
// Deamon thread is a low priority thread;
 




//it is serveic provider thread which

//the life deamon thread in at mercy of user thread
//when all thread died jvm automatically deamon thread
//the most common ex is finalizer
//it is a low priority thread




// !Can We Start A Thread twice?
// *No after starting a thread it can never be starting again if u do so an illeagal thread state exception is thrown *In such case thread will run once but for second time it will throw exception


// !What will happen if we call run method directly instead of start method?
// *So in this case there will be a no context switching between different text and it will be treated a normal object and not thread object!





public class deamon_thread extends Thread {
    public deamon_thread(String name){
        super(name);
    }


    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }

        else
        {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args)
    {

        deamon_thread t1 = new deamon_thread("t1");
        deamon_thread t2 = new deamon_thread("t2");
        deamon_thread t3 = new deamon_thread("t3");

        t1.setPriority(5);
        t2.setPriority(8);
        t3.setPriority(2);
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);

        // starting first 2 threads
        t1.start();
        t2.start();

        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
    }
}
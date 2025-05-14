package designPattern.Creational.Singleton;

public class Logger2 {
    private static Logger2 instance;

    private Logger2(){}

    public static Logger2 getInstance(){
        if(instance == null){
            synchronized (Logger2.class){ // This ensures that only one thread at a time can enter this block.
                if(instance == null){
                    instance = new Logger2();
                }
            }
        }
        return instance;
    }

    public void printLog(String msg){
        System.out.println("Log: " + msg);
    }
}

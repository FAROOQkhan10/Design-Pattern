package designPattern.Creational.Singleton;

public class Logger1 {
    private static Logger1 instance;

    private Logger1(){}

    public static Logger1 getInstance(){

        if(instance == null){

            // Intentional delay to simulate race condition
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Logger1();
        }
       return instance;
    }

    public void printLog(String msg){
        System.out.println("Log: " + msg);
    }

}

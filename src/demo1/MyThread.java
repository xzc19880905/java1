package demo1;

/**
 * Created by x on 2016/5/22.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0;i < 500000;i++){
            System.out.println("i="+(i+1));
            if (this.isInterrupted()){
                System.out.println("end");
                return;
                int a = 0;
            }
        }
    }
}

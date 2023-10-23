package min.Thread.synchronization.exam04;

public class SharedCount {
    static int count;

    SharedCount(){

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SharedCount.count = count;
    }

    public static synchronized void increment(){
        setCount(getCount() + 1);
    }
}

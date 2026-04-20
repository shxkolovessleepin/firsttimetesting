import java.util.List;
import java.util.concurrent.Callable;

public class SecondLargestTask implements Callable<Integer> {
    List<Integer> arr;

    public SecondLargestTask(List<Integer> arr) {
        this.arr = arr;
    }
    //just basic 2nd largest finding algorithm
    @Override
    public Integer call() throws Exception {
        if (arr.size() < 2) return null;

        int fm = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > fm) {
                sm = fm;
                fm = n;
            } else if (n > sm && n < fm) {
                sm = n;
            }
        }
        if (sm == Integer.MIN_VALUE) return null;
        return sm;
    }
}

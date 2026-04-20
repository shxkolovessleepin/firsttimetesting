import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> arrrrrrrrrrrrrray = new ArrayList<>();
        List<Future<Integer>> futures = new ArrayList<>();

        //khoi tao mang cua mang
        System.out.print("So luong mang: ");
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print("So phan tu: ");
            int a = scanner.nextInt();
            List<Integer> arrray = new ArrayList<>();
            for (int y = 0; y < a; y++) {
                System.out.print("Enter number: ");
                arrray.add(scanner.nextInt());
            }
            arrrrrrrrrrrrrray.add(arrray);
        }

        ExecutorService executor = Executors.newFixedThreadPool(k - 2);

        for (List<Integer> liiiiist : arrrrrrrrrrrrrray) {
            Future<Integer> future = executor.submit(new SecondLargestTask(liiiiist));
            futures.add(future);
        }
        int sum = 0;
        for (Future<Integer> future : futures) {
            try {
                if (future.get() == null) {
                    System.out.println("Array " + futures.indexOf(future) + ": Not found");
                } else {
                    System.out.println("Array " + futures.indexOf(future) + ": second largest = " + future.get());
                    sum += future.get();
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum = " + sum);

        //bu cu tan bao


        executor.shutdown();
    }
}
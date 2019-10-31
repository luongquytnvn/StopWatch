

public class Test {
    public static void main(String[] args) {
        int arr[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.Start();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        stopWatch.End();
        System.out.println(stopWatch.getElapsedTime());
    }
}

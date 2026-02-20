import java.util.Arrays;
import java.util.concurrent.*;

public class MergeSort {

    static class MergeTask implements Callable<int[]> {
        private final int[] array;
        private final ExecutorService es;
        public MergeTask(int[] a, ExecutorService ess){
            array = a;
            es = ess;
        }
        public int[] call() throws ExecutionException, InterruptedException {
            if(array.length <=1){
                return array;
            }
            int mid = array.length/2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            Future<int[]> leftFuture = es.submit(new MergeTask(left, es));
            Future<int[]> rightFuture = es.submit(new MergeTask(right, es));


            int[] sortedLeft = leftFuture.get();
            int[] sortedRight = rightFuture.get();

            return merge(sortedLeft, sortedRight);


        }

        public int[] merge(int[] left, int[] right){
            int[] result = new int[left.length+right.length];
            int i=0,j=0,k=0;
            while (i<left.length && j< right.length){
                result[k++] = (left[i]<= right[j] ? left[i++]: right[j++]);
            }
            while (i<left.length) result[k++]= left[i++];
            while (j<right.length) result[k++]= right[j++];
            return result;

        }
    }

    public static void main(String[] arr) throws ExecutionException, InterruptedException {
        int[] arrs = {9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2,5,1,5,9,5,4,2};
        ExecutorService es2 = Executors.newFixedThreadPool(500);
        Future<int[]> rf = es2.submit(new MergeTask(arrs, es2));
        int[] result = rf.get();
        System.out.println(Arrays.toString(result));
    }
}

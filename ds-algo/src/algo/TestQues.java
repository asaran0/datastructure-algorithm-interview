package algo;

    import java.util.Comparator;
    import java.util.HashMap;

public class TestQues {

    public static void main(String argv[]) {
        int []ar =  {2, 7, 22, 25};
        findNumbersWithSum(ar,9);
    }

    //Input: nums = [2,7,11,15], target = 9

    private static void findNumbersWithSum(int ar[], int sum) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < ar.length; i++) {
            if(hash.containsKey(sum-ar[i])) {
                System.out.println("the 2 index with sum"+sum + " = "+ i +" "+ hash.get(sum-ar[i]) );
                return;
            } else {
                hash.put(ar[i], i);
            }

            
        }
    }

}

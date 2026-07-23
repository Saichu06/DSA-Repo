import java.util.*;

public class kthRowPascal {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<n;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            for(int j=0;j<i-1;j++){
                currRow.add(prevRow.get(j) + prevRow.get(j+1));
            }
            currRow.add(1);

            result.add(currRow);
        }

        for(int i=0;i<n;i++){
            for(int j = 0; j < result.get(i).size(); j++){
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
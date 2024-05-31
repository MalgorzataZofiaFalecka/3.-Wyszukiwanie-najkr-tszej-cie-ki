import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("Provide number of rows and columns of array: ");
        Scanner in = new Scanner(System.in);
        int arrayRowsNumber = in.nextInt();
        int arrayColumnsNumber = in.nextInt();
        int[][] array = new int[arrayRowsNumber][arrayColumnsNumber];

        ArrayManager arrayManager = new ArrayManager();
        arrayManager.populateArray(array, arrayRowsNumber, arrayColumnsNumber, in);

        System.out.println("--------------------------------");
        System.out.println(Arrays.deepToString(array)
                .replace("[", "")
                .replace("], ", "\n")
                .replace("[[", "")
                .replace("]]", ""));

        PathsStorage storage = new PathsStorage();
        arrayManager.calculateShortestPath(array, arrayRowsNumber, arrayColumnsNumber, storage);

        System.out.println("--------------------------------");
        System.out.println(storage.finalSum);
        System.out.println(Arrays.toString(storage.finalPath.toArray())
                .replace("[", "")
                .replace("]", ""));
    }
}
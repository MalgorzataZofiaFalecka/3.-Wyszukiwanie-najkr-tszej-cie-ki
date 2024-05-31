import java.util.Scanner;

public class ArrayManager {

    void populateArray(int[][] array, int rows, int columns, Scanner scanner) {
        for(int i=0; i < rows; i++){
            System.out.println("Provide values for row number " + i);
            for(int j=0; j < columns; j++){
                array[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    void calculateShortestPath(int[][] array, int arrayRowsNumber, int arrayColumnsNumber, PathsStorage storage){
        for(int i=0; i<arrayRowsNumber; i++) {
            calculateShortestPathForRoot(i, 0, array, arrayRowsNumber, arrayColumnsNumber, storage);
        }
    }

    void calculateShortestPathForRoot(int currentRow, int currentColumn, int[][] array, int arrayRowsNumber, int arrayColumnsNumber, PathsStorage storage){

        int nextRow = 0;
        boolean checkedAllDirections = false;
        Direction direction = Direction.DIAGONAL_UP;
        storage.sum += array[currentRow][currentColumn];
        storage.path.add(array[currentRow][currentColumn]);

        if(currentColumn + 1 < arrayColumnsNumber) {
            while(!checkedAllDirections) {
                if (direction == Direction.DIAGONAL_UP) {
                    nextRow = (currentRow - 1 < 0) ? arrayRowsNumber - 1 : currentRow - 1;
                    direction = Direction.RIGHT;
                } else if (direction == Direction.RIGHT) {
                    nextRow = currentRow;
                    direction = Direction.DIAGONAL_DOWN;
                } else {
                    nextRow = (currentRow + 1 >= arrayRowsNumber) ? 0 : currentRow + 1;
                    checkedAllDirections = true;
                }
                calculateShortestPathForRoot(nextRow, currentColumn + 1, array, arrayRowsNumber, arrayColumnsNumber, storage);
            }
        } else {
            if(storage.finalSum == 0 || storage.sum < storage.finalSum){
                storage.finalSum = storage.sum;
                storage.finalPath.clear();
                storage.finalPath.addAll(storage.path);
            }
        }
        storage.sum -= array[currentRow][currentColumn];
        storage.path.remove(storage.path.size()-1);
    }

    enum Direction {
        DIAGONAL_UP,
        RIGHT,
        DIAGONAL_DOWN
    }
}

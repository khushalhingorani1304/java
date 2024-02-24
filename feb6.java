import java.util.*;

public class feb6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the num of rows : ");
        x = sc.nextInt();
        System.out.println("Enter the num of columns : ");
        y = sc.nextInt();
        int inputArray[][] = new int[x][y];
        int a;
        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                inputArray[i][j] =sc.nextInt();
            }
        }

        
        int[][] sortedByRow = sortByRow(inputArray);
        System.out.println("Sorted by row:");
        printArray(sortedByRow);

        
        int[][] sortedByColumn = sortByColumn(inputArray);
        System.out.println("\nSorted by column:");
        printArray(sortedByColumn);

        
        int[][] fullSortedArray = fullSort(inputArray);
        System.out.println("\nFully sorted:");
        printArray(fullSortedArray);
    }

        public static int[][] sortByRow(int[][] array) {
        int[][] sortedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            Arrays.sort(row);
            sortedArray[i] = row;
        }
        return sortedArray;
    }

        public static int[][] sortByColumn(int[][] array) {
        int[][] transposedArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        for (int[] row : transposedArray) {
            Arrays.sort(row);
        }
        int[][] sortedArray = new int[array.length][array[0].length];
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[i].length; j++) {
                sortedArray[j][i] = transposedArray[i][j];
            }
        }
        return sortedArray;
    }


    public static int[][] fullSort(int[][] array) {
        int[] flattenedArray = new int[array.length * array[0].length];
        int index = 0;
        for (int[] row : array) {
            for (int element : row) {
                flattenedArray[index++] = element;
            }
        }
        Arrays.sort(flattenedArray);
        index = 0;
        int[][] sortedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sortedArray[i][j] = flattenedArray[index++];
            }
        }
        return sortedArray;
    }

    
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

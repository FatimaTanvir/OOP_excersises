import java.util.ArrayList;

public class Search2DArrayList {
    public static void main(String args[]) {
        // Initialize matrices
        int[][] matrix = { 
            { 1, 1, 3, 1, 5 }, 
            { 1, 1, 3, 1, 5 }, 
            { 1, 1, 3, 1, 5 }, 
            { 1, 1, 3, 1, 5 }, 
            { 1, 1, 3, 1, 5 }
        };

        int[][] matrix2 = { 
            { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 
            { -2, -1, 2, 1 }, 
            { }, 
            { 2, 2, 2 } 
        };

        // Convert matrices to 2D ArrayLists
        ArrayList<ArrayList<Integer>> Data1 = ConvertMatrixToMatrixList(matrix);
        ArrayList<ArrayList<Integer>> Data2 = ConvertMatrixToMatrixList(matrix2);

        // Use the SearchEven method to get even number coordinates
        ArrayList<String> Data1EvenCoords = SearchEven(Data1);
        ArrayList<String> Data2EvenCoords = SearchEven(Data2);

        // Use Display_Locations method to output the results
        System.out.println("Data1 Results:");
        Display_Locations(Data1EvenCoords);

        System.out.println("\nData2 Results:");
        Display_Locations(Data2EvenCoords);
    }

    // Method to convert a 2D array (int[][]) into a 2D ArrayList (ArrayList<ArrayList<Integer>>)
    public static ArrayList<ArrayList<Integer>> ConvertMatrixToMatrixList(int[][] dataArray) {
        ArrayList<ArrayList<Integer>> dataArrayList = new ArrayList<>();

        // Copy each number from the 2D array to the ArrayList
        for (int[] row : dataArray) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int element : row) {
                rowList.add(element);
            }
            dataArrayList.add(rowList);
        }
        return dataArrayList;
    }

    // Method to search for even numbers in a 2D ArrayList and return their coordinates
    public static ArrayList<String> SearchEven(ArrayList<ArrayList<Integer>> nums) {
        ArrayList<String> coords = new ArrayList<>();

        // Iterate through each row
        for (int i = 0; i < nums.size(); i++) {
            // Iterate through each element in the row
            for (int j = 0; j < nums.get(i).size(); j++) {
                // Check if the number is even
                if (nums.get(i).get(j) % 2 == 0) {
                    // Add the coordinates (row, column) to the list
                    coords.add(i + " " + j);
                }
            }
        }

        // If no even numbers were found, return -1
        if (coords.isEmpty()) {
            coords.add("-1");
        }
        return coords;
    }

    // Method to display the locations of even numbers or indicate if none were found
    public static void Display_Locations(ArrayList<String> locations) {
        // If the first item is "-1", indicate that no even numbers were found
        if (locations.get(0).equals("-1")) {
            System.out.println("No even numbers found.");
        } else {
            // Otherwise, display the row and column of each even number
            for (String coord : locations) {
                System.out.println(coord);
            }
        }
    }
}

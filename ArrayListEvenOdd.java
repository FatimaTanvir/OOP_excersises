import java.util.*;

public class ArrayListEvenOdd {
    public static void print2DArray(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[][] allNumbers = new int[5][5];
        
        //steps through each row and column of array printing a random number to that element
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
            {
                allNumbers[i][j] = rand.nextInt(100);
            }
        
        System.out.println("Random Numbers:\n");
        //function call to print array to console
        print2DArray(allNumbers);
        
        //declaring dynamic arrays
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        
        //steps through 2d array and checks to see if even with modulus
        //if even, adds element to evens arraylist
        //if odd, adds element to odd array list
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
            {
                if((allNumbers[i][j] % 2) == 0)
                    evens.add(allNumbers[i][j]);
                else
                    odds.add(allNumbers[i][j]);
            }
        
        System.out.println("\nEvens: " + evens);
        System.out.println("\nOdds: " + odds);
    }
}

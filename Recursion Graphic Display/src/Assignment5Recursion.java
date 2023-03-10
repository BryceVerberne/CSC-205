// Programmer:  Bryce Verberne
// Date:        07/04/2022
// Description: This program has three different algorithms returning the same answer of how many one-by-one
// squares will be generated after a specified number of iterations.



public class Assignment5Recursion {

    // Simple formula used to calculate the squares
    public static int puzzleFormula(int n) {

        return (2*(n*n))+(2*n)+1;
    }

    // Using a loop to calculate our answer
    public static int puzzleLoop(int n) {
        int total = 0;

        for (int i = 1; i <= n; ++i) {
            total += (2 * i) - 1;
        }
        total *= 2;

        return (2 * n) + 1 + total;
    }

    // Using recursion to get our answer
    public static int puzzleRecurse(int n) {

        if (n == 0) {
            return 1;
        }
        else {
            return puzzleRecurse(n - 1) + 4 * n;
        }

    }

}

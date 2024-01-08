public class cliArgs {
    static int add(int a, int b) { return a + b; }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Please provide two numbers as command line arguments.");
            return;
        }

        // Parsing command-line arguments as integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Adding the numbers and printing the result
        int result = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        System.err.println("Nihal Johann Thomas\n21MIC0180");
    }
}
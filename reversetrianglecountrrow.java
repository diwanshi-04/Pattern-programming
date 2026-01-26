// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=5;
        for (int i=n; i>=0; i--){
            for (int j=0; j<=i; j++){
            System.out.print(j);
            }
        System.out.println();
        }
    }
}

/*

OUTPUT

012345
01234
0123
012
01
0

=== Code Execution Successful ===
  */

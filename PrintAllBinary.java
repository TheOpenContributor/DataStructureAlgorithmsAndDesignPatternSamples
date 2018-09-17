public class PrintAllBinary{

    public void printBinary(int n, Integer[] bit) {
        
        if(bit == null)
            bit = new Integer[n];
        if(n < 1) {
            for(int i = 0; i < bit.length; i++)
                System.out.print(bit[i]);
            System.out.println();
        } else {
            bit[n-1] = 1;
            printBinary(n-1, bit);
            bit[n-1] = 0;
            printBinary(n-1, bit);
        }
    }
    
    public void printEmptyString() {
        System.out.println("*");
    }
    
    public void printAllBinaryStrings(int n, Integer[] bit) {
        for(int i = 0;i < n + 1; i++) {
            if(i == 0)
                printEmptyString();
            else
                printBinary(i, null);
        }
    }
    
     public static void main(String []args){
        System.out.println("Hello World");
        PrintAllBinary pAB = new PrintAllBinary();
        pAB.printAllBinaryStrings(3, null);
        
     }
}
public class PrintBinary{

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
    
     public static void main(String []args){
        System.out.println("Hello World");
        PrintBinary pB = new PrintBinary();
        pB.printBinary(3, null);
        
     }
}
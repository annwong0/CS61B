/**
 *  take SIZE and then print a triangle
 */
public class DrawTriangle {
    public static void main(String[] args) {
        PrintTriangle(Integer.parseInt(args[0]));
    }

    private static void PrintTriangle(int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

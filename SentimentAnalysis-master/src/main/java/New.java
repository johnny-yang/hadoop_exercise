public class New{
    public static void main(String[] args){
        int col = 1;
        int per_col = 1;
        while(col<=5){

            while(per_col<=col){
                System.out.print("*");
                if(per_col==col){
                    System.out.println();
                }
                per_col = per_col + 1;
            }}
        col = col + 1;

    }
}



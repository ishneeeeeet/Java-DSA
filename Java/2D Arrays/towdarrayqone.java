public class towdarrayqone {
    

    public static int sum(int array[][]) {
        int total = 0;
        for(int r = 0; r<=array.length-1; r++ ) {
            for(int c = 0; c<array[0].length; c++) {

                if(array[r][c] == 7) {
                    total++; 
                }
            }
     
       }

       return total;
    }




    public static void main(String[] args) {
        int array[][] = {
            {4,7,8},
            {8,7,7}
        };

        System.out.println(sum(array));
    }
}

public class twodarrayqtwo {


public static int sum(int nums[][]) {
int total = 0;

    for(int c = 0; c< nums[0].length; c++) {
        total = total + nums[2][c];
    }
    return total;
}






    public static void main(String[] args) {
        int nums[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        System.out.println(sum(nums));
    }
}

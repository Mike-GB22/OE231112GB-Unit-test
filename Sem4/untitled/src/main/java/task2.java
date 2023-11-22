public class task2 {
    public static void main(String[] args) {
        int[] arr = {1,-1,2,-2,3,-3,0,0,0,0};
        System.out.println(dola(arr));
    }

    public static String dola(int[] arr){
        if(arr.length == 0) return "Array is empty";
        int positiv = 0;
        int negativ = 0;
        int nulll = 0;

        for(int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            if(tmp > 0) positiv++;
            else if(tmp < 0) negativ++;
            else nulll++;
        }

        double dolaPositiv = (positiv * 10000 / arr.length)/100.0;
        double dolaNegativ = (negativ * 10000 / arr.length)/100.0;
        double dolaNulll = (nulll * 10000 / arr.length)/100.0;
        return "+: " + dolaPositiv + ", -: " + dolaNegativ  + ", 0: " + dolaNulll;
    }
}

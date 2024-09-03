public class sum {
    public static void main (String []args){
        int []arr= {2,5,7,9,10,13,29,38,39};
        System.out.println(sumChecker(arr));

    }
    public static String sumChecker(int []ar){
        int l=0;
        int r=ar.length-1;

        while (l<r){
            if (ar[l]+ar[r]>10){
                r-=1;
            }
            else if (ar[l]+ar[r]<10){
                l+=1;
            }
            else
            return "Index "+ l + " Index " + r;
        }
        return "DNE";

    }




}











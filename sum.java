public class sum {
    public static void main (String []args){
        int []arr= {1,2,5,7,9,10,13};
        System.out.println(sumChecker(arr));

    }
    public static String sumChecker(int []ar){
        int l=0;
        int r=ar.length-1;

        while (l<r){
            if (ar[l]+ar[r]>7){
                r-=1;
            }
            else if (ar[1]+ar[r]<7){
                l+=1;
            }
        }
        return "Index"+ l + " Index" + r;

    }




}











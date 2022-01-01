public class Max_custom {
    static int maxi(int a,int b, int c){
        int max = a;
        if(b>max)
            max = b;
        if(c>max)
            max = c;

        return max;
    }
}

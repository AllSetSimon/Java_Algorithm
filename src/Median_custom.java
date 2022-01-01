public class Median_custom {
    static int medi(int a, int b, int c){
        if(a >= b){
            if(a <= c){
                return a;
            } else if(b >= c){
                return b;
            } else {
                return c;
            }
        } else if(a > c){
            return a;
        } else if(b > c){
            return c;
        } else {
            return b;
        }
    }
}

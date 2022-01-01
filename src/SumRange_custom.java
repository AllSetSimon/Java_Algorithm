public class SumRange_custom {

    static int forResult(int num){
        int sumResult = 0;

        for (int i = 1; i <= num; i++) {
            sumResult += i;
        }

        return sumResult;
    }

    static int whileResult(int num){
        int i = 1;
        int sumResult = 0;

        while (i <= num) {
            sumResult += i;
            i++;
        }

        return sumResult;
    }
}

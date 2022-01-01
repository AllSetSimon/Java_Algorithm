public class LinearSearch {
    static int linSearch(int n, int key){
        //a = array , n = size of Array, key = answer

        int[] numArr = new int[n];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i+1;
        }

        int i = 0;

        while(true){
            if(i == n){
                return -1;
            } if ( numArr[i] == key){
                return i;
            }
            i++;
        }
    }
}

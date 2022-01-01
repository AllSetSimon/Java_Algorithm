public class Test {
    public static void main(String[] args) {
        //Apply method Section
        int max_num = Max_custom.maxi(1,3,2); // find maximum number
        int medi_num = Median_custom.medi(4,2,7); // find median number
        int sumResult = SumRange_custom.forResult(5); // find sumResult using for phrase
        int sumResult2 = SumRange_custom.whileResult(6); // find sumResult using while phrase
        int linSearch = LinearSearch.linSearch(7,7); // find num of idx using Linear Search(Sequence Search)

        // Print result Section
        System.out.println(max_num);
        System.out.println(medi_num);
        System.out.println(sumResult);
        System.out.println(sumResult2);
        System.out.println("num of idx : " + linSearch);

        //Directly practice Section
        String con_oper = (3>5)?"yes":"no"; // conditional operator
        System.out.println(con_oper);

    }
}

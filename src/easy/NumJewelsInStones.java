package easy;

public class NumJewelsInStones {

    public static int numJewelsInStones(String J, String S) {

        // this solution by StefanPochmann in October 26, 2018 1:34 AM
        return S.replaceAll("[^ " + J +"]","").length();
       /*
        int counter = 0;
        for(int i=0; i < J.length(); i++){
            for(int j=0; j< S.length(); j++){
                if (J.charAt(i) == S.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
        */
    }

}

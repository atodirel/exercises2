public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        if((int)(firstValue*1000) == (int)(secondValue*1000)){
            System.out.println((int)(firstValue*1000) + " " + (int)(secondValue*1000));
            return true;
        } else
            System.out.println((int)(firstValue*1000) + " " + (int)(secondValue*1000));
        return false;

    }
}

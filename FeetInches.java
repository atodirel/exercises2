public class FeetInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || (inches < 0 || inches > 12)) return -1;
        double centimeters = (feet*12 + inches) * 2.54;
        System.out.println(feet + " ft and " + inches + " in = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        double feet = inches / 12;
        double remainingInches = inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

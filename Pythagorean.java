public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        // a^2 + b^2 = c^2
        // System.out.println(Math.pow(legA, legB));
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }

    // double four = 4.0;
    // calling the sqrt static method of the Math class
    // double squareRoot = Math.sqrt(four); // 2.0
}
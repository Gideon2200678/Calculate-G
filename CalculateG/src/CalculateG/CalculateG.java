package CalculateG;

    public class CalculateG {

        //method for multiplication
        public static double multiply(double x, double y){
            return x * y;
        }

        //method for summation
        public static double summation(double x, double y){
            return x + y;
        }

        //method for powering to square
        public static double poweringtosqure(double x){
            return Math.pow(x, 2);
        }

        //method for printing out a result
        public static void outline(String message, double result){
            System.out.println(message + result);
        }

        public static void main(String[] args){

            double gravity = -9.81; // Earth's gravity in m/s^2
            double fallingTime = 30;
            double initialVelocity = 0.0;
            double initialPosition = 0.0;
            double finalVelocity;
            double finalPosition;

            // Formulas for position and velocity
            finalPosition = summation(multiply(0.5, gravity), multiply(poweringtosqure(fallingTime), gravity));
            finalPosition = summation(multiply(initialVelocity, fallingTime), summation(initialPosition, finalPosition));

            finalVelocity = multiply(gravity, fallingTime) + initialVelocity;

            // Output for final position
            String positionMessage = "The object's final position after " + fallingTime + " seconds is: ";
            outline(positionMessage, finalPosition);

            // Output for final velocity
            String velocityMessage = "The object's final velocity after " + fallingTime + " seconds is: ";
            outline(velocityMessage, finalVelocity);
        }
    }

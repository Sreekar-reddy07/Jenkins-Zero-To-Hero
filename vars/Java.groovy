def java() {
        sh '''
          # Ensure Maven is installed
          mvn --version
          
          # Java code
          echo "Running Java Program for Addition and Subtraction"
          echo '
          public class SimpleMath {
              public static void main(String[] args) {
                  int num1 = 88; // First number
                  int num2 = 12;  // Second number

                  // Perform addition and subtraction
                  int sum = num1 + num2;
                  int difference = num1 - num2;

                  // Display the results
                  System.out.println("Addition: " + sum);
                  System.out.println("Subtraction: " + difference);
              }
          }
          ' > SimpleMath.java
        '''
}

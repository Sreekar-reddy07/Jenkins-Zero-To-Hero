def nodejs() {
        sh '''
          # Ensure Node.js and npm are installed
          node --version
          npm --version

          # Run Node.js code
          echo "Running Node.js Program for Addition and Subtraction"
          echo "
          // Define two numbers
          const num1 = 56; // First number
          const num2 = 6;  // Second number

          // Perform addition and subtraction
          const sum = num1 + num2;
          const difference = num1 - num2;

          // Display the results
          console.log('Addition:', sum);
          console.log('Subtraction:', difference);
          " > math.js
        '''
}

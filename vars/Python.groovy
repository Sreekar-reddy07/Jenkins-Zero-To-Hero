def python() {
     sh '''
          # Ensure Python is installed
          python --version

          # Create Python script for addition and subtraction
          echo "Running Python Program for Addition and Subtraction"

          # Create math.py with proper indentation
          echo "num1 = 100  # First number" > math.py
          echo "num2 = 72   # Second number" >> math.py
          echo "" >> math.py
          echo "sum = num1 + num2" >> math.py
          echo "difference = num1 - num2" >> math.py
          echo "" >> math.py
          echo "print('Addition:', sum)" >> math.py
          echo "print('Subtraction:', difference)" 
          >> math.py
        '''
}

public class act2 {
    public static void main(String args[])   {   
            
        System.out.println("Tapar, Edel Mae T. Lab act2");

              int rows = 5 , k = 0;

              String strobj1 = "#Right-angled Triangle Pattern#";
                System.out.println(strobj1);
                

              //Right-angled Triangle Pattern
              for (int i = 1; i <= rows; ++i) {
                for (int j = 1; j <= i; ++j) {
                  System.out.print("* ");
                }
                System.out.println();
                
              }

              // Inverted Right-angled Triangle Pattern
              String strobj2 = "#Inverted Right-angled Triangle Pattern#";
              System.out.println(strobj2);

              for (int i = rows; i >= 1; --i) {
                for (int j = 1; j <= i; ++j) {
                  System.out.print("* ");
                }
                System.out.println();
              }

            
              // Pyramid Pattern
              String strobj5 = "#Pyramid Pattern#";
              System.out.println(strobj5);

              for (int i = 1; i <= rows; ++i, k = 0) {
                for (int space = 1; space <= rows - i; ++space) {
                  System.out.print("  ");
                }
          
                while (k != 2 * i - 1) {
                  System.out.print("* ");
                  ++k;
                }
          
                System.out.println();
              }

    //Finding the Maximum Value in an Array 
    String strobj3 = "#Finding the Maximum Value in an Array#";
              System.out.println(strobj3);

    int [] numbers = new int [] {1, 3, 5, 7, 9, 2, 4, 6, 8};   
     int max = numbers[0];  
    for (int i = 0; i < numbers.length; i++) {  
         if(numbers[i] > max)  
           max = numbers[i];  
    }  
    System.out.println("The maximum value in the array is:  " + max);  


    //Checking for a Prime Number

    String strobj4 = "#Checking for a Prime Number#";
              System.out.println(strobj4);

    int num = 29;
    boolean isPrime = false;
    for (int i = 2; i <= num / 2; ++i) {
        if (num % i == 0) {
            isPrime = true;
    break;
  }
}

if (!isPrime)
  System.out.println(num + " is a prime number.");
else
  System.out.println(num + " is not a prime number.");


  //Fibonacci Series

  String strobj6 = "#Fibonacci Series#";
  System.out.println(strobj6);
  
  int n = 55, t1 = 0, t2 = 1, t = 10;
    
  System.out.println("First " + t + " terms: ");
  
  while (t1 <= n) {
    System.out.print(t1 + ", ");

    int nextTerm = t1 + t2;
    t1 = t2;
    t2 = nextTerm;

  }
}
}

    


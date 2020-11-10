class Calculator3{
	public static int Add(){
 	int a = 10;
	int b = 20;
	int sum = a + b;
	 return sum;	
	}
	public static int Sub(){
	int x = 25;
	int y = 10;
	 int difference =x - y;
	 return difference;
	}
	public static double Mul(){
	 double m = 25.5;
	 double n = 45.5;
	 double Multiply = m * n;
	  return Multiply;
	 }
	public static int Div(){
	int a = 50;
	int b = 10;
	 int quotient = a/b;
	 return quotient;
	}
        public static void main(String args[]){
	 int sum = Calculator3.Add();
	 System.out.println("the sum of two no's ="+sum);
	 int difference = Calculator3.Sub();
	 System.out.println("the differnce of two no's ="+difference);
	  double Multiply = Calculator3.Mul();
	 System.out.println("the multiplication of two no's ="+Multiply);
	 int quotient = Calculator3.Div();
	 System.out.println("the division of two no's ="+quotient);
	}
}
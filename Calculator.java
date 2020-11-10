class Calculator{
	public static int Add(int a,int b){
	int sum = a + b;
	 return sum;
	}
	public static int Sub(int x,int y){
	int difference = x - y;
	 return difference;
	}
	public static double Mul(double m,double n){
	 double Multiply = m * n;
	 return Multiply;
	 }
	public static int Div(int a,int b){
	int quotient = a / b;
	 return quotient;
	}
     public static void main(String args[]){
	int sum = Calculator.Add(10,20);
	int difference = Calculator.Sub(25,10);
	double Multiply = Calculator.Mul(25.5,45.4);
	int qoutient = Calculator.Div(50,10);
	System.out.println("the sum of two no's ="+sum);
	System.out.println("the differnce of two no's ="+difference);
	System.out.println("the multiplication of two no's ="+Multiply);
	System.out.println("the division of two no's ="+qoutient);
	}
}
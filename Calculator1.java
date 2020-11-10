class Calculator1{
	public static void Add(){
 	int a = 10;
	int b = 20;
	int sum = a + b;
        System.out.println("the sum of two no's ="+sum);	
	}
	public static void Sub(){
	int x = 25;
	int y = 10;
	 int difference =x - y;
	 System.out.println("the differnce of two no's ="+difference);
	}
	public static void Mul(){
	 double m = 25.5;
	 double n = 45.5;
	 double Multiply = m * n;
	 System.out.println("the multiplication of two no's ="+Multiply);
	 }
	public static void Div(){
	int a = 50;
	int b = 10;
	 int quotient = a/b;
	System.out.println("the division of two no's ="+quotient);
	}
     public static void main(String args[]){
	 Calculator1.Add();
	 Calculator1.Sub();
	 Calculator1.Mul();
	 Calculator1.Div();
	}
}
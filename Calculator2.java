class Calculator2{
	public static void Add(int a,int b){
	int sum = a + b;
	 System.out.println("the sum of two no's ="+sum);
	}
	public static void Sub(int x,int y){
	int difference = x - y;
	System.out.println("the differnce of two no's ="+difference);
	}
	public static void Mul(double m,double n){
	 double Multiply = m * n;
	 System.out.println("the multiplication of two no's ="+Multiply);
	 }
	public static void Div(int a,int b){
	int quotient = a / b;
	System.out.println("the division of two no's ="+quotient);
	}
     public static void main(String args[]){
	 Calculator2.Add(10,20);
	 Calculator2.Sub(25,10);
	 Calculator2.Mul(25.5,45.4);
	 Calculator2.Div(50,10);
}
}
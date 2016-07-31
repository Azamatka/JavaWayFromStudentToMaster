public class Calculate{
	double value1=4;
	double value2=2;
	static double resault;
public static void main(String[] args){
	Calculate calc= new Calculate();
calc.multiply(resault);
calc.minus(resault);
calc.plus(resault);
calc.divide(resault);
}
public   void multiply(double resault){
	resault=(value1*value2); 
	System.out.println(resault);
}
public void minus(double resault){
		resault=(value1-value2);
		System.out.println(resault);
}
public void plus(double resault){
		resault=(value1+value2);
		System.out.println(resault);
}
public void divide(double resault){
		resault=(value1/value2);
		System.out.println(resault);

} 
}
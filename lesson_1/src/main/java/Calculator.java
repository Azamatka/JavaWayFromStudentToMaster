/**
* Calculator класс для вычисления арифмитеческих операций: + - *  и /
* @author Azamat
* @since 6.08.2016
* @version 1
*/
public class Calculator{
	  double result;
/**
* Умножение
* @param first первый аргумент
* @param second второй аргумент
* @param result записываем результат
*/
	public   void add(double first, double second){
		double mult=first*second; 
		result=mult;
	
	}
	/**
* Вычитание
* @param first первый аргумент
* @param second второй аргумент
* @param result записываем результат
*/
	public void add1 (double first, double second){
			double min=first-second;
			result=min;
			
	}
		/**
* Сложение
* @param first первый аргумент
* @param second второй аргумент
* @param result записываем результат
*/
	public void add2(double first, double second){
			double plus=first+second;
			result=plus;
			
	}
		/**
* Деление
* @param first первый аргумент
* @param second второй аргумент
* @param result записываем результат
*/
	public void add3(double first, double second){
			double div=first/second;
            result=div;
            

} 
}
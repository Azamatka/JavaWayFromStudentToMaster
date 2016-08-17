package zadanie3;
/**
 * MaxNum  класс для выявления  самой длинной стороны треугольника
 * @since 14.08.2016
 * @version 1
 */

public class MaxLenght{
	/**
	 * Метод для выявления самой длинной стороны треугольника
	 * @param t  аргумент типа Triangle
	 */
	public double max(Triangle t) {
		double ab1 = t.a.distanceTo(t.b);
		double bc1 = t.b.distanceTo(t.c);
		double ac1 = t.a.distanceTo(t.c);

		if(ac1<ab1&&ab1>bc1){
			return ab1; }

		else if(ab1<ac1&&ac1>bc1){
			return ac1;}

		else if(ab1<bc1&&bc1>ac1){
			return bc1;}
	 return ac1;
	}

}
package zadanie3;
/**
 * MaxNum  класс для выявления  самой длинной стороны треугольника
 * @since 14.08.2016
 * @version 1
 */
public class MaxNum  extends Triangle{
	/**
	 * Метод конструктор для инициализации  точек вершин треугольника
	 * @param a первый аргумент
	 * @param b второй аргумент
	 * @param c второй аргумент
	 */
	public MaxNum(Point a, Point b, Point c) {
		super(a, b, c);
	}
	/**
	 * Метод для   для выявления  самой длинной стороны треугольника
	 */
	public double max(){

			if(a.distanceTo(c)<a.distanceTo(b)&&a.distanceTo(b)>b.distanceTo(c)){
				return a.distanceTo(b); }
			
			else	if(a.distanceTo(b)<a.distanceTo(c)&&a.distanceTo(c)>b.distanceTo(c)){
				return a.distanceTo(c);}
			
			else if(a.distanceTo(b)<b.distanceTo(c)&&b.distanceTo(c)>a.distanceTo(c)){
				return b.distanceTo(c);}
		return max();
}
	}
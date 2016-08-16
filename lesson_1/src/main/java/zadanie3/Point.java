package zadanie3;
/**
 * Point  класс для определения и инициализации координат точек, и расчета расстояния межде ними
 * @author Azamat
 * @since 14.08.2016
 * @version 1
 */
public class Point {
public double x;
public double y;
	/**
	 * Метод конструктор для инициализации координат точек
	 * @param x первый аргумент
	 * @param y второй аргумент
	 */
public Point(double x, double y) {
this.x = x;
this.y = y;
}
	/**
	 * Метод для расчета расстояния между точками
	 */
public double distanceTo(Point point) {
double dp=x-point.x;
double dr=y-point.y;
return Math.sqrt(dp*dp+dr*dr);
}
}
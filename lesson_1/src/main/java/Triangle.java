/**
 * Triangle  класс для расчета площади треугольника
 * @author Azamat
 * @since 14.08.2016
 * @version 1
 */

public class Triangle {
public Point a;
public Point b;
public Point c;
	/**
	 * Метод конструктор для инициализации точек-вершин треугольника
	 * @param a первый аргумент
	 * @param b второй аргумент
	 * @param c второй аргумент
	 */
public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}
	/**
	 * Метод для расчета площади треугольника
	 */
public double area() {
	double ab=a.distanceTo(b);
	double ac=a.distanceTo(c);
	double bc=b.distanceTo(c);
	double per=(ab+ac+bc)/2;
	double area=Math.sqrt(per*(per-ab)*(per-ac)*(per-bc));
	if (area==0) {
		throw new IllegalArgumentException();
	}
return area;
}
}
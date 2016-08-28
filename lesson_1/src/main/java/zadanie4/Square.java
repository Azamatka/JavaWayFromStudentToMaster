package zadanie4;
/**
 * Square класс для расчета квадратного уравнения
 * @since 25.08.2016
 * @version 1
 */
public class Square {
    float a;
    float b;
    float  c;
    public  Square(float a,float b,float c){
        this.a=a;
        this.b=b;
       this.c=c;
    }
    /**
     * Метод calculate для вычисления квадратного уравнения
     * @param x  переменная квадратного уравнения
     */
    public float calculate(float x) {
        return (float) (a*Math.pow(x, 2) + b*x + c);
    }
    /**
     * Метод show  для вычисления квадратного уравнения с заданным шагом
     * @param start начальная переменная от которой будет рассчитываться шаг
     * @param finish конечная переменная до которой будет рассчитываться шаг
     * @param step  переменная шага
     */
    public void show(float start, float finish,float  step){
        Square sq=new Square(a,b,c);
        for(float x=start; start<finish; start=start+step){
          System.out.println(sq.calculate(start));
        }

    }
}
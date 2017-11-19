package No_Paralelogramos;

import Figuras.Cuadrilatero;
import Formulas.Distancia;

public class Trapezoide extends Cuadrilatero {

    private int x0;
    private int x2;
    private int y0;
    private int y2;

    public Trapezoide() {
    }

    public Trapezoide(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);

    }

    public Trapezoide(double lado1, double lado2, double lado3, double lado4,int x0,int x2,int y0,int y2) {
        super(lado1, lado2, lado3, lado4);
        
        this.x0=x0;
        this.x2=x2;
        this.y0=y0;
        this.y2=y2;

    }

    public int getX0() {
        return x0;
    }

    public int getX2() {
        return x2;
    }

    public int getY0() {
        return y0;
    }

    public int getY2() {
        return y2;
    }
    
    

    @Override
    public double calcularArea() {
        Distancia ac=new Distancia(getX0(),getX2(),getY0(),getY2());
        double trazo_ac=ac.calc_distancia();
        double SemiPerTs=(getLado1()+getLado2()+trazo_ac)/2;
        double SemiPerTi=(getLado3()+getLado4()+trazo_ac)/2;
        
        double preATs=SemiPerTs*(SemiPerTs-getLado1()*(SemiPerTs-getLado2())*(SemiPerTs-trazo_ac));
        double preATi=SemiPerTi*(SemiPerTi-getLado1()*(SemiPerTi-getLado2())*(SemiPerTi-trazo_ac));
        
        double area_Ts=(double)Math.sqrt(preATs);
        double area_Ti=(double)Math.sqrt(preATi);
        
        double area=area_Ti+area_Ts;
        return area;

    }

}

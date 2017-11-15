
package Formulas;


public class Distancia {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    public Distancia(int x1, int x2, int y1 ,int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double calc_distancia(){

        double respuest;
        double res1,res2;

        res1=x2-x1;   
        res2=y2-y1;
        res1=Math.pow(res1, 2)+Math.pow(res2, 2);
        respuest=Math.sqrt(res1);
         return respuest; }
}


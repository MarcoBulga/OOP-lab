public class Calculator {
    /*Non si dovrebbe fare ma ai fini di questo esercizio mi prendo questa libertà. 
     * In teoria si dovrebbero usare dei metodi getnOpDone() e getLastRes()
    */
    public int nOpDone;
    public double lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;
    }

    public double add(double a, double b) {
        this.nOpDone++;
        this.lastRes = a + b;
        return a + b;
    }

    public double sub(double a, double b) {
        this.nOpDone++;
        this.lastRes = a - b;
        return a - b;
    }

    public double mul(double a, double b) {
        this.nOpDone++;
        this.lastRes = a * b;
        return a * b;
    }

    public double div(double a, double b) {
        this.nOpDone++;
        this.lastRes = a / b;
        return a / b;
    }
}

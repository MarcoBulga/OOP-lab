public class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = null;
    }

    ComplexNum add(ComplexNum a, ComplexNum b) {
        ComplexNum returnValue = new ComplexNum();
        returnValue.build(a.re + b.re, a.im + b.im);
        return doOp(returnValue);
    }

    ComplexNum sub(ComplexNum a, ComplexNum b) {
        ComplexNum c = new ComplexNum();
        c.build(a.re - b.re, a.im - b.im);
        return doOp(c);
    }

    ComplexNum mul(ComplexNum a, ComplexNum b) {
        ComplexNum c = new ComplexNum();
        c.build(a.re * b.re - a.im * b.im, a.im * b.re + a.re * b.im);
        return doOp(c);
    }

    ComplexNum div(ComplexNum a, ComplexNum b) {
        ComplexNum c = new ComplexNum();
        double re = (a.re * b.re + a.im * b.im) / (b.re * b.re + b.im * b.im);
        double im = (a.im * b.re - a.re * b.im) / (b.re * b.re + b.im * b.im);
        c.build(re, im);
        return doOp(c);
    }

    ComplexNum doOp(ComplexNum result) {
        nOpDone++;
        lastRes = result;
        return lastRes;
    }
}

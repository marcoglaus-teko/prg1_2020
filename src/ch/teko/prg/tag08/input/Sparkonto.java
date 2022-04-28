package ch.teko.prg.tag08.input;

public class Sparkonto extends Konto {
    private double maxOut;

    public Sparkonto(double saldo, double rate) {
        super(saldo, rate);
        this.maxOut = 10000.0;
        
    }

    @Override
    public void payIn(double value) {
        super.payIn(value);
    }

}

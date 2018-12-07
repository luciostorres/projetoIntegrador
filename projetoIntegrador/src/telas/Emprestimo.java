package telas;
/**
 *
 * @author Done
 */
import java.util.ArrayList;

public class Emprestimo {
    
    double pv;
    double i;
    int n;
    
    ArrayList<Double> saldoInicial = new ArrayList<>();
    ArrayList<Double> juros = new ArrayList<>();
    ArrayList<Double> amortizacao = new ArrayList<>();
    ArrayList<Double> pmt = new ArrayList<>();
    ArrayList<Double> saldoFinal = new ArrayList<>();

    public Emprestimo() {
    }

    public Emprestimo(double pv, double i, int n, ArrayList<Double> saldoInicial, ArrayList<Double> juros, ArrayList<Double> amortizacao, ArrayList<Double> pmt, ArrayList<Double> saldoFinal) {
        this.pv = pv;
        this.i = i;
        this.n = n;
        this.saldoInicial = saldoInicial;
        this.juros = juros;
        this.amortizacao = amortizacao;
        this.pmt = pmt;
        this.saldoFinal = saldoFinal;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Double> getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(ArrayList<Double> saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public ArrayList<Double> getJuros() {
        return juros;
    }

    public void setJuros(ArrayList<Double> juros) {
        this.juros = juros;
    }

    public ArrayList<Double> getAmortizacao() {
        return amortizacao;
    }

    public void setAmortizacao(ArrayList<Double> amortizacao) {
        this.amortizacao = amortizacao;
    }

    public ArrayList<Double> getPmt() {
        return pmt;
    }

    public void setPmt(ArrayList<Double> pmt) {
        this.pmt = pmt;
    }

    public ArrayList<Double> getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(ArrayList<Double> saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "pv=" + pv + ", i=" + i + ", n=" + n + ", saldoInicial=" + saldoInicial + ", juros=" + juros + ", amortizacao=" + amortizacao + ", pmt=" + pmt + ", saldoFinal=" + saldoFinal + '}';
    }
    
}
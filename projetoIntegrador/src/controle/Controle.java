package controle;
/**
 *
 * @author Done
 */
import telas.Emprestimo;

public class Controle {

    public Controle() {
    }

    public Emprestimo calculoSAC(double pv, double i, int n) {

        Emprestimo emprestimoSAC = new Emprestimo();

        i = i / 100;
        
        double saldoInicial;
        double saldoFinal;
        double juros;
        double amortizacao;
        double pmt;

        amortizacao = pv / n;
        saldoFinal = pv;

        for (int j = n; j > 0; j--) {

            saldoInicial = saldoFinal;
            juros = saldoInicial * i;
            pmt = juros + amortizacao;
            saldoFinal = saldoInicial - amortizacao;

            emprestimoSAC.getSaldoInicial().add(saldoInicial);
            emprestimoSAC.getJuros().add(juros);
            emprestimoSAC.getAmortizacao().add(amortizacao);
            emprestimoSAC.getPmt().add(pmt);
            emprestimoSAC.getSaldoFinal().add(saldoFinal);

        }
        return emprestimoSAC;

    }

    public Emprestimo calculoPRICE(double pv, double i, int n) {

        Emprestimo emprestimoPRICE = new Emprestimo();

        i = i / 100;
        
        double saldoInicial;
        double saldoFinal;
        double juros;
        double amortizacao;
        double pmt;

        pmt = pv * ((i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1));

        saldoFinal = pv;
        
        for (int j = n; j > 0; j--) {

            saldoInicial = saldoFinal;
            juros = saldoInicial * i;
            amortizacao = pmt - juros;
            saldoFinal = saldoInicial - amortizacao;
            
            emprestimoPRICE.getSaldoInicial().add(saldoInicial);
            emprestimoPRICE.getJuros().add(juros);
            emprestimoPRICE.getAmortizacao().add(amortizacao);
            emprestimoPRICE.getPmt().add(pmt);
            emprestimoPRICE.getSaldoFinal().add(saldoFinal);

        }
        return emprestimoPRICE;

    }

}

package teste;
/**
 *
 * @author Done
 */
import bancoDados.ClienteDAO;
import entidade.Cliente;
import java.util.ArrayList;

public class TesteClienteDAO {
    public static void main(String[] args) throws Exception {
        ClienteDAO dao = new ClienteDAO("127.0.0.1", "postgres", "postgres");
        
        
        //Teste inserir
        Cliente novo = new Cliente();
        novo.setCpf("11122233349");
        novo.setNome("Fulano de Tal");
        novo.setSituacao("Pensionista");
        novo.setSalario(900.00);
        
        dao.inserirCliente(novo);
        //Teste buscar
        Cliente pesquisa = dao.buscarCliente("11122233347");
        System.out.println(pesquisa);
        
        System.out.println("-----------------------------------");
        //Teste alterar
        pesquisa.setNome("Cicrano de Tal");
        pesquisa.setSituacao("Celetista");
        pesquisa.setSalario(2000.00);
        dao.atualizarCliente(pesquisa);
        
        //Teste buscarTodos
        ArrayList<Cliente> lista = dao.buscarTodos();
        for (Cliente cadaCliente : lista) {
            System.out.println(cadaCliente);
        }
        
        //Teste apagar
        for (Cliente cadaCliente : lista) {
            dao.apagarCliente(cadaCliente);
        
        }
        
        System.out.println("-----------------------------------");
        
        lista = dao.buscarTodos();
        for (Cliente cadaCliente : lista) {
            System.out.println(cadaCliente);
        }
        
    }
}
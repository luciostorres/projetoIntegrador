package bancoDados;
/**
 *
 * @author Done
 */
import entidade.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    Connection conexao;
    
    //Construtor - Estabelecer a comunicação com o BD
    public ClienteDAO(String server, String user, String senha) throws Exception {
        Class.forName("org.postgresql.Driver");
	this.conexao = DriverManager.getConnection
        ("jdbc:postgresql://" + server + "/casa_bancaria", user, senha);
    }
    
    //CREATE
    public void inserirCliente(Cliente novoCliente) throws SQLException {
        String sql = "insert into cliente (cpf, nome, situacao, salario) values (?,?,?,?)";
        PreparedStatement query = conexao.prepareStatement(sql);
        query.setString(1, novoCliente.getCpf());
        query.setString(2, novoCliente.getNome());
        query.setString(3, novoCliente.getSituacao());
        query.setDouble(4, novoCliente.getSalario());
        query.executeUpdate();
    }
    
    //READ
    public Cliente buscarCliente(String cpfCliente) throws SQLException {
        Cliente clientePesquisado = null;
        String sql = "select * from cliente where cpf = ?";
        PreparedStatement query = conexao.prepareStatement(sql);
        query.setString(1, cpfCliente);
        ResultSet resultado = query.executeQuery();
        
        if (resultado.next()) {
            clientePesquisado = new Cliente();
            clientePesquisado.setCpf(resultado.getString("cpf"));
            clientePesquisado.setNome(resultado.getString("nome"));
            clientePesquisado.setSituacao(resultado.getString("situacao"));
            clientePesquisado.setSalario(resultado.getDouble("salario"));
        }
        return clientePesquisado;
    }
    
    public ArrayList<Cliente> buscarTodos () throws SQLException {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        String sql = "select * from cliente";
        PreparedStatement query = conexao.prepareStatement(sql);
        ResultSet resultado = query.executeQuery();
        while (resultado.next()) {
            Cliente clientePesquisado = new Cliente();
            clientePesquisado.setCpf(resultado.getString("cpf"));
            clientePesquisado.setNome(resultado.getString("nome"));
            clientePesquisado.setSituacao(resultado.getString("situacao"));
            clientePesquisado.setSalario(resultado.getDouble("salario"));
            listaClientes.add(clientePesquisado);
        }
        return listaClientes;
    }
    
    //UPDATE
    public void atualizarCliente(Cliente clienteAlterado) throws SQLException {
        String sql = "update cliente set nome = ?, situacao = ?, salario = ? where cpf = ?";
        PreparedStatement query = conexao.prepareStatement(sql);
        query.setString(1, clienteAlterado.getNome());
        query.setString(2, clienteAlterado.getSituacao());
        query.setDouble(3, clienteAlterado.getSalario());
        query.setString(4, clienteAlterado.getCpf());
        query.executeUpdate();
    }
    
    //DELETE
    public void apagarCliente (Cliente clienteExcluido) throws SQLException {
        String sql = "delete from cliente where cpf = ?";
        PreparedStatement query = conexao.prepareStatement(sql);
        query.setString(1, clienteExcluido.getCpf());
        query.executeUpdate();
    }
}
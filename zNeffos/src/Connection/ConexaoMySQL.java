package Connection;                   

//Classes necessárias para uso de Banco de dados //
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
//Início da classe de conexão//
 
public class ConexaoMySQL {
 
       public static String status = "Não conectou...";
       public static Connection connection = null; 
       public static ResultSet rs;
 
        public ConexaoMySQL() {
 
        }
 
    public static java.sql.Connection getConexaoMySQL() {
   
       try {
      
           String driverName = "com.mysql.jdbc.Driver";                        
           Class.forName(driverName);

           String stringConexao = "jdbc:mysql://localhost/zNeffos?autoReconnect=true&useSSL=false";
           connection = DriverManager.getConnection(stringConexao, "sa", "orkut22");

           if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
           } else {
               status = ("STATUS--->Não foi possivel realizar conexão");
           }
            
           return connection;

       } catch (ClassNotFoundException e) {  //Driver não encontrado
 
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
       
       } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
       

    }
 
 
    //Método que retorna o status da sua conexão//
 
    public static String statusConection() {
        return status;
    }
 
   //Método que fecha sua conexão//
 
    public static boolean FecharConexao() {
 
        try {
            ConexaoMySQL.getConexaoMySQL().close();
            return true;
 
        } catch (SQLException e) {
            return false;
        }
    }
 
   //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {
 
        FecharConexao();
        return ConexaoMySQL.getConexaoMySQL();
    }
    
    public static void Insert(String query) throws SQLException{
        Statement st = connection.createStatement();
        st.executeUpdate(query);
        st.close();
    }
    
    public static void Delete(String query) throws SQLException{
        Statement st = connection.createStatement();
        st.executeUpdate(query);
        st.close();
    }
    
    public static void Consult(String query) throws SQLException{
        Statement st = connection.createStatement();
        rs = st.executeQuery(query);
        
      /*  while(rs.next()){
            int id = rs.getInt("ID");
            String name = rs.getString("NOME");
            System.out.println(id + " Com o nome de: " + name);
        }
       */
    }
}
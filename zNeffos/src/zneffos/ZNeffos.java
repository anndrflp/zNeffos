
package zneffos;
import Connection.ConexaoMySQL;
import Objects.Adress.Adress;
import Objects.People.People;
import Objects.Phone.Phone;
import View.Page.Page;
import View.Page.Start;
import java.sql.SQLException;


/**
 *  
 * @    author Usuário
 */ 
public class ZNeffos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here]
        ConexaoMySQL conn = new ConexaoMySQL();
        conn.getConexaoMySQL();
        Start.main(null);
        
       
        
       
       
    }
    
}

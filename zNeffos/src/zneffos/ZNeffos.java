
package zneffos;
import DAO.ConexaoMySQL;
/**
 *
 * @author Usuário
 */
public class ZNeffos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        System.out.println("Teste");
        
        ConexaoMySQL conn = new ConexaoMySQL();
        
        conn.getConexaoMySQL();
    }
    
}

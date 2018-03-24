
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
        ConexaoMySQL conn = new ConexaoMySQL();
        conn.getConexaoMySQL();
        
        conn.statusConection();
        
        System.out.println("Eu amo a Fernanda");
    }
    
}

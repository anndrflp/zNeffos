
package zneffos;
import Connection.ConexaoMySQL;
import Objects.Adress.Adress;
import Objects.People.People;
import Objects.Phone.Phone;

/**
 *  
 * @    author Usuário
 */ 
public class ZNeffos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        ConexaoMySQL conn = new ConexaoMySQL();
        conn.getConexaoMySQL();
        
       Phone pp = new Phone();
       People pp1 = new People("", "", "", "");
    }
    
}

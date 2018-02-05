package tirocinio.domanda.gestore;

import bean.Azienda;
import bean.ListaAziende;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe ListaAziendeDao, si configura col database per gestire l'elenco 
 * delle aziende convenzionate.
 */
public class ListaAziendeDao {

  /**
   * Prende dal database le aziende convenzionate e le aggiunge alla lista.
   * @param azienda Lista di aziende convenzionate.
   * @throws SQLException Gestisce errori nelle interrogazioni al database.
   * @throws ClassNotFoundException  Gestisce errori nel individuzione della classe.
   */
  public void fillListaAziende(ListaAziende azienda) throws SQLException, ClassNotFoundException {
    Connection newConnection = null;

    String sql = "select * from azienda";

    Class.forName("com.mysql.jdbc.Driver");

    String ip = "localhost";
    String port = "3306";
    String db = "tirocinioeasy";
    String username = "root";
    String password = "root";

    newConnection = DriverManager.getConnection("jdbc:mysql://" + ip + ":"
        + port + "/" + db, username, password);

    try {
      java.sql.Statement st  = newConnection.createStatement();
      ResultSet rs = st.executeQuery(sql);

      while (rs.next()) {
 
        int idAzienda = rs.getInt("Id_Azienda");
        String nome = rs.getString("Nome");
        String sedeOperativa = rs.getString("Sede_Operativa");
        String amministrativa  = rs.getString("Sede_Amministrativa");
        Boolean convenzionata = rs.getBoolean("Convenzionata");
        String dirAzEmail = rs.getString("Dir_AziendaEmail");
        String tutorAzEmail = rs.getString("Tutor_AziendaleEmail");
        Azienda a = new Azienda(nome, sedeOperativa, amministrativa, dirAzEmail, 
            tutorAzEmail, idAzienda, convenzionata);
        azienda.aggiungi(a);
        
      }
      rs.close();
      newConnection.close();

    } catch (SQLException  e) { 
      e.printStackTrace();
    }
  }
  /**
 * Richiama il metodo fillListaAziende catturandone eccezioni.
* @param azienda oggetto della classe ListaAziende
*/
  
  public void fillListaAziende1(ListaAziende azienda) {

    try {
      fillListaAziende(azienda);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

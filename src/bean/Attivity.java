package bean;

import java.sql.Time;
import java.util.Date;

/**
 * Classe Attivity, rappresenta una singola attivit� svolta da un tirocinante che verr� annotata nel suo registro di tirocinio. 
 */
public class Attivity
{
  private Date data;
  private String luogo;
  private String Descrizione;
  private Time ora;
  private int id;
  private int RegistroID;
	
  /**
 * Costruttore parametrico
 * Istanzia un oggetto "Attivity" che rappresenta un attivit� svolta nel registro di tirocinio di un tirocinante.
 * @param iD_Attivit� Numero identificativo dell'attivit� svolta.
 * @param data2 Data in cui si � svolta l'attivit�.
 * @param ora2 Durata dell'attivit�
 * @param luogo Luogo in cui si � svolta l'attivit�
 * @param descrizione2 Descrizione dell'attivit�
 * @param RegistroID ID del Registro di tirocinio cui appartiene l'attivit�
 */

  public Attivity(int iD_Attivit�, Date data2, Time ora2, String descrizione2, int RegistroID) {
    this.id=iD_Attivit�;
    this.data=data2;
    this.ora=ora2;
    this.Descrizione=descrizione2;
    this.RegistroID=RegistroID;
  }
  
  
/**
 * Metodo di accesso
 * Restituisce l'identificativo dell'attivit� svolt�.
 * @return id
 */

  public int getId() {
    return id;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param id Codice identificativo dell'attivit� svolta
 */
  
  public void setId(int id) {
    this.id = id;
  }
  /**
 * Metodo di accesso
 * Restituisce la data dell'attivit� svolta.
 * @return data
 */
  
  public Date getData() {
    return data;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param data Data dell'attivit� svolta.
 */

  public void setData(Date data) {
    this.data = data;
  }
  /**
 * Metodo di accesso
 * Restituisce la durata espressa in h dell'attivit� svolta.
 * @return ora
 */

  public Time getOra() {
    return ora;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param ora Durata dell'attivit� svolta espressa come ore.
 */
  
  public void setOra(Time ora) {
    this.ora = ora;
  }
  /**
 * Metodo di accesso
 * Restituisce il luogo dove si � svolta l'attivit�.
 * @return luogo
 */

  public String getLuogo() {
    return luogo;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param luogo Stringa identificante il luogo dove si � svolta l'attivit�
 */
  
  public void setLuogo(String luogo) {
    this.luogo = luogo;
  }
  /**
 * Metodo di accesso
 * Restituisce la descrizione dell'attivit� svolta.
 * @return Descrizione
 */
  
  public String getDescrizione() {
    return Descrizione;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param descrizione Stringa descrittiva dell'attivit� svolta.
 */
  
  public void setDescrizione(String descrizione) {
    Descrizione = descrizione;
  }
  /**
 * Metodo di accesso
 * Restituisce l'identificativo univoco del registro di tirocinio in cui va inserita l'attivit�.
 * @return RegistroID
 */

  public int getRegistroID() {
    return RegistroID;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param registroID Identificativo del registro di tirocinio del tirocinante.
 */

  public void setRegistroID(int registroID) {
    RegistroID = registroID;
  }

}
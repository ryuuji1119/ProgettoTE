package bean;

import java.sql.Date;

/**
 * Classe RegistroTirocinio, rappresenta gli oggetti Registro Di Tirocinio, 
 * che verranno compilati dai tirocinanti con le attività svolte durante 
 * l'attività di tirocinio e convalidati dai tutor aziendali.
 */
public class RegistroTirocinio {

  private int idTirocinio;
  private int convalida;
  private Date dataAtt;
  private String tirEmail;
  private String tutorAzEmail;

  /**
* Costruttore parametrico.
* Istanzia un nuovo oggetto di tipo RegistroTirocinio con attributi:
* @param idTirocinio identificativo univoco dell'attività di tirocinio
* @param dataAtt Data inizio tirocinio
* @param convalida Convalida del registro di tirocinio da parte del tutor aziendale
* @param tirEmail Email del tirocinante
* @param tutorAzEmail Email del tutor aziendale
*/
  
  public RegistroTirocinio(int idTirocinio, Date dataAtt, int convalida, 
      String tirEmail, String tutorAzEmail) {
    this.idTirocinio = idTirocinio;
    this.dataAtt = dataAtt;
    this.convalida = convalida;
    this.tirEmail = tirEmail;
    this.tutorAzEmail = tutorAzEmail;
  }

  /**
* Metodo di accesso.
* Restituisce l'identificativo univoco del tirocinio.
* @return idTirocinio
*/

  public int getID_Tirocinio() {
    return idTirocinio;
  }

  /**
* Metodo di modifica.
* Imposta l'attributo identificativo univoco del tirocinio
* @param idTirocinio Identificativo univoco dell'attività di tirocinio
*/

  public void setID_Tirocinio(int idTirocinio) {
    this.idTirocinio = idTirocinio;
  }

  /**
* Metodo di accesso.
* Restituisce il valore del campo "convalida" del registro
* @return convalida
*/

  public int getConvalida_Tutor_Az() {
    return convalida;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param convalida Indica se il registro di tirocinio è convalidato o meno.
*/

  public void setConvalida_Tutor_Az(int convalida) {
    this.convalida = convalida;
  }
  /**
* Metodo di accesso.
* Restituisce la data di attivazione del tirocinio
* @return dataAtt
*/

  public Date getData_att() {
    return dataAtt;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param dataAtt Indica la data di inizio tirocinio
*/

  public void setData_att(Date dataAtt) {
    this.dataAtt = dataAtt;
  }
  /**
* Metodo di accesso
* Restituisce l'indirizzo email del tirocinante.
* @return Tirocinante_Email
*/

  public String getTirocinante_Email() {
    return tirEmail;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param tirEmail Email del tirocinante da aggiornare.
*/

  public void setTirocinante_Email(String tirEmail) {
    this.tirEmail = tirEmail;
  }
  /**
* Metodo di accesso
* Restituisce l'indirizzo email del tutor aziendale.
* @return tutorAzEmail
*/
  
  public String getTutor_Aziendale_Email() {
    return tutorAzEmail;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param tutorAzEmail Email del tutor aziendale.
*/
  
  public void setTutor_Aziendale_Email(String tutorAzEmail) {
    this.tutorAzEmail = tutorAzEmail;
  }

}
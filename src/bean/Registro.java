package bean;

import java.text.SimpleDateFormat;
//import java.util.Date;

/**
 * Classe Registro, rappresenta oggetti di tipo registro di tirocinio, 
 * vengono compilati dai tirocinanti inserendoci nuove attività
 *  e vengono convalidati dai tutor aziendali.
 */
public class Registro {

  private int id;
  private String data;
  private int  conv;
  private String tirEmail;
  private String tutorAzEmail;
  
  /**
 * Costruttore parametrico.
 * Istanzia un nuovo oggetto di tipo registro caratterizzato da:
 * @param id Identificativo registro di tirocinio
 * @param conv Convalida registro
 * @param tirEmail Email del tirocinante
 * @param tutorAzEmail Email del tutor aziendale
 */

  public Registro(int id, int conv, String tirEmail, String tutorAzEmail) {
    this.id = id;

    /**data odierna (?).*/
    java.util.Date dat = new java.util.Date();
    new java.sql.Date(dat.getTime());
    SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
    String da = dt1.format(dat);
    this.data = da;
    this.conv = conv;
    this.tirEmail = tirEmail;
    this.tutorAzEmail = tutorAzEmail;
  }
  /**
 * Metodo di accesso.
 * Restituisce l'identificato univoco del registro
 * @return id
 */

  public int getId() {
    return id;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param id Identificativo del registro di tirocinio.
 */

  public void setId(int id) {
    this.id = id;
  }
  /**
 * Metodo di accesso.
 * Restituisce la data di creazione del registro di tirocinio
 * @return data
 */

  public String getData() {
    return data;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param data Data di creazione del registro di tirocinio
 */

  public void setData(String data) {
    this.data = data;
  }
  /**
 * Metodo di accesso
 * Restituisce il valore del campo convalida, che serve per verificare 
 * se il registro è convalidato o no.
 * @return conv
 */

  public int getConv() {
    return conv;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param conv Convalida del registro 
 */

  public void setConv(int conv) {
    this.conv = conv;
  }
  /**
 * Metodo di accesso.
 * Restituisce l'indirizzo email del tirocinante
 * @return tir_em
 */

  public String getTir_em() {
    return tirEmail;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param tirEmail Indirizzo email del tirocinante.
 */

  public void setTir_em(String tirEmail) {
    this.tirEmail = tirEmail;
  }
  /**
 * Metodo di accesso.
 * Restituisce l'indirizzo email del tutor aziendale
 * @return tutorAzEmail
 */

  public String getTut_az_em() {
    return tutorAzEmail;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param tutorAzEmail Indirizzo email del tutor aziendale.
 */

  public void setTut_az_em(String tutorAzEmail) {
    this.tutorAzEmail = tutorAzEmail;
  }
}
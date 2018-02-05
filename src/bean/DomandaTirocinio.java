package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe DomandaTirocinio, rappresenta l'oggetto: Domanda di tirocinio, 
 * oggetto creato nel momento in cui l'utente Tirocinante compila la 
 * propria richiesta di tirocinio esterno.
 */
public class DomandaTirocinio {
 
  private int idDocumento;
  private String azienda;
  private String autore;
  private String tirEmail;
  private String tutorAzEmail;
  private String tutorUniEmail;
 
  private int firmaTutorUni;
  private int firmaTutorAz;
  private int firmaDirAz;
  private int firmaDirDip;


  private java.util.Date dataO = new java.util.Date();
  java.sql.Date oggi = new java.sql.Date(dataO.getTime());
  SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");

  private String da = dt1.format(dataO);


  /**
* Costruttore parametrico, istanzia un oggetto domanda di tirocinio 
* caratterizzato dai seguenti parametri.
* @param idDocumento identificativo univoco del documento di tipo int.
* @param tirEmail email del tirocinante (tipo string).
* @param tutorAzEmail email del tutor aziendale (tipo string).
* @param tutorUniEmail email del tutor universitario (tipo string).
* @param firmaDirAz campo firma del dirigente di azienda
* @param firmaDirDip campo firma del direttore di dipartimento
* @param firmaTutorUni campo firma del tutor universitario
* @param firmaTutorAz campo firma del tutor aziendale
*/
 
  public DomandaTirocinio(int idDocumento,/* String az ,*/int firmaTutorUni,  
      int firmaTutorAz, int firmaDirAz, int firmaDirDip, 
      String tutorUniEmail,  String tirEmail, String tutorAzEmail) {
 
    this.idDocumento = idDocumento;
    //this.Azienda=az;
    this.tirEmail = tirEmail;
    this.tutorAzEmail = tutorAzEmail;
    this.tutorUniEmail = tutorUniEmail;
    this.firmaDirAz = firmaDirAz;
    this.firmaDirDip = firmaDirDip;
    this.firmaTutorUni = firmaTutorUni;
    this.firmaTutorAz = firmaTutorAz;
  }

  /**
* Metodo di Accesso.
* @return idDocumento identificativo univoco del documento.
*/
  
  public int getId_Documento() {
    return idDocumento;
  }
  /**
* Metodo di modifica.
* Imposta l'identificativo univoco del documento.
* @param idDocumento identificativo univoco del documento (tipo int)
*/
  
  public void setId_Documento(int idDocumento) {
    this.idDocumento = idDocumento;
  }
  /**
* Metodo di accesso.
* Restituisce il nome dell'azienda presso cui viene svolto il tirocinio.
* @return Azienda 
*/

  public String getAzienda() {
    return azienda;
  }
  /**
* Metodo di modifica.
* Imposta il nome dell'azienda presso cui verrà svolto il tirocinio-
* @param azienda Nome dell'azienda (tipo string).
*/
  
  public void setAzienda(String azienda) {
    this.azienda = azienda;
  }
  /**
* Metodo di accesso.
* restiruisce l'autore della domanda.
* @return autore
*/
  
  public String getAutore() {
    return autore;
  }
  /**
* Metodo di modifica.
* Imposta l'autore della domanda
* @param autore Autore della domanda (tipo string).
*/
  
  public void setAutore(String autore) {
    this.autore = autore;
  }
  /**
* Metodo di accesso.
* Restituisce l'email del tirocinante
* @return TirEmail
*/
  
  public String getTirocinanteEmail() {
    return tirEmail;
  }
  /**
* Metodo di modifica.
* Imposta l'email del tirocinante
* @param tirEmail Email del tirocinante (tipo String).
*/

  public void setTirocinanteEmail(String tirEmail) {
    this.tirEmail = tirEmail;
  }
  /**
* Metodo di accesso.
* Restituisce l'email del tutor aziendale (tipo string).
* @return tutorAzEmail
*/
  
  public String getTutoAzrEmanil() {
    return tutorAzEmail;
  }
  /**
* Metodo di modifica.
* Imposta l'email del tutor aziendale
* @param tutorAzEmail Email del tutor aziendale (tipo string).
*/
  
  public void setTutoAzrEmanil(String tutorAzEmail) {
    this.tutorAzEmail = tutorAzEmail;
  }
  /**
* Metodo di accesso.
* Restituisce l'email del tutor universitario (tipo string).
* @return tutorUniEmail;
*/
  
  public String getTutoUnirEmanil() {
    return tutorUniEmail;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal dirigente di azienda
* @return firmaDirAz
*/
  
  public int getFirma_dir_az() {
    return firmaDirAz;
  }
  /**
* Metodo di modifica.
* Imposta il campo firma della domanda da parte del dirigente di azienda
* @param firmaDirAz firma del dirigente di azienda.
*/
  
  public void setFirma_dir_az(int firmaDirAz) {
    this.firmaDirAz = firmaDirAz;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal direttore di dipartimento.
* @return firmaDirDip
*/
  
  public int getFirma_dir_dip() {
    return firmaDirDip;
  }
  /**
* Metodo di modifica.
* Imposta il campo firma della domanda da parte del direttore di dipartimento
* @param firmaDirDip firma del direttore di dipartimento.
*/
  
  public void setFirma_dir_dip(int firmaDirDip) {
    this.firmaDirDip = firmaDirDip;
  }
  /**
* Metodo di modifica.
* Imposta l'email del tutor universitario.
* @param tutorUniEmail Email del tutor universitario (tipo string).
*/

  public void setTutoUnirEmanil(String tutorUniEmail) {
    this.tutorUniEmail = tutorUniEmail;
  }
  /**
* Metodo di accesso.
* Restituisce la data in cui è stata sottoposta la domanda di tirocinio.
* @return da
*/
  
  public String getData() {
    return  da; 
  }
  /**
* Metodo di modifica.
* Imposta la data in cui viene sottoposta la domanda di tirocinio.
* @param data data della creazione della domanda di trocinio
*/

  public void setData(Date data) {
    this.dataO = data;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal tutor universitario.
* @return Firma_tutor_universitario
*/
  
  public int getFirma_tutor_universitario() {
    return firmaTutorUni;
  }
  /**
* Metodo di modifica.
* Imposta il campo firma della domanda da parte del tutor universitario
* @param firmaTutorUni firma del tutor universitario.
*/

  public void setFirma_tutor_universitario(int firmaTutorUni) {
    this.firmaTutorUni = firmaTutorUni;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal tutor aziendale.
* @return Firma_tutor_aziendale
*/
  
  public int getFirma_tutor_aziendale() {
    return firmaTutorAz;
  }
  /**
* Metodo di modifica
* Imposta il campo firma della domanda da parte del tutor aziendale.
* @param firmaTutorAz firma del tutor aziendale.
*/

  public void setFirma_tutor_aziendale(int firmaTutorAz) {
    this.firmaTutorAz = firmaTutorAz;
  }

}

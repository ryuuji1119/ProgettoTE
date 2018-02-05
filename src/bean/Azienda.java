package bean;

/**
 * Classe Azienda, rappresenta un'azienda che ha stipulato o intende stipulare una convenzione 
 * con l'università per poter ospitare attività di tirocinio esterno.
 */
public class Azienda {
  private String  nome; 
  private String sedeOperativa;
  private String sedeAmministrativa;
  private String dirAzEmail;
  private String tutorAzEmail;
  private int idAzienda;
  private boolean  convenzionata;

  /**
* Costruttore nullo, serve per istanziare un oggetto Azienda senza attributi impostati.
*/
  public Azienda() { }
/**
* Costruttore parametrico.
* @param nome Stringa corrispondente al nome dell'azienda
* @param sedeOperativa Stringa indicante la sede operativa dell'azienda
* @param sedeAmministrativa Stringa indicante la sede amministrativa dell'azienda
* @param dirAzEmail Stringa corrispondente all'email del dirigente dell'azienda
* @param tutorAzEmail Stringa corrispondente all'email  del tutor aziendale
* @param idAzienda Identificatore univoco dell'azienda di tipi int.
* @param convenzionata Valore booleano, indica se l'azienda risulta già convenzionata o no.
*/
  
  public Azienda(String nome, String sedeOperativa, String sedeAmministrativa, 
      String dirAzEmail, String tutorAzEmail, int idAzienda, 
      Boolean convenzionata) { 
    this.sedeOperativa = sedeOperativa;
    this.convenzionata = convenzionata;
    this.idAzienda = idAzienda;
    this.nome = nome;
    this.sedeAmministrativa = sedeAmministrativa;
    this.dirAzEmail = dirAzEmail;
    this.tutorAzEmail = tutorAzEmail; 
  }
  /**
* Metodo di accesso.
* @return Sede operativa dell'azienda in formato string.
*/

  public String getSede_Operativa() {
    return sedeOperativa;
  }
  /**
* Metodo di accesso.
* @return Nome dell'azienda in formato string.
*/

  public String getNome() {
    return nome;
  }
  /**
* Metodo di accesso.
* @return Sede amministrativa dell'azienda in formato string.
*/

  public String getSede_Amministrativa() {
    return sedeAmministrativa;
  }
  /**
* Metodo di accesso.
* @return Email del dirigente d'azienda in formato string.
*/

  public String getDir_AziendaEmail() {
    return dirAzEmail;
  }
  /**
* Metodo di accesso.
* @return Email del tutor aziendale in formato string.
*/

  public String getTutor_AziendaEmail() {
    return tutorAzEmail;
  }
  /**
* Metodo di accesso.
* @return ID Azienda, Identificativo univoco dell'azienda in formato int.
*/

  public int getId_Azienda() {
    return idAzienda;
  }
  /**
* Metodo di controllo.
* @return true se l'azienda risulta convenzionata con l'università false altrimenti.
*/

  public boolean isConvenzionata() {
    return convenzionata;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param sedeOperativa Sede operativa dell'azienda in formato string.
*/

  public void setSedeOperativa(String sedeOperativa) {
    this.sedeOperativa = sedeOperativa;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param nome Nome dell'azienda in formato string.
*/

  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param sedeAmministrativa Sede amministrativa dell'azienda in formato string.
*/

  public void setSedeAmministrativa(String sedeAmministrativa) {
    this.sedeAmministrativa = sedeAmministrativa;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param dirAzEmail Email del dirigente di azienda in formato string.
*/

  public void setDirAziendaEmail(String dirAzEmail) {
    this.dirAzEmail = dirAzEmail;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param tutorAzEmail Email del tutor aziendale in formato string.
*/

  public void setTutorAziendaEmail(String tutorAzEmail) {
    this.tutorAzEmail = tutorAzEmail;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param idAzienda Identificativo univoco dell'azienda in formato int..
*/

  public void setId_Azienda(int idAzienda) {
    this.idAzienda = idAzienda;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param convenzionata Definisce se l'azienda è convenzionata o non con l'università.
*/

  public void setConvenzionata(boolean convenzionata) {
    this.convenzionata = convenzionata;
  }
}

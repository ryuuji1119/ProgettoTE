package tirocinio.registro.gestore.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tirocinio.registro.gestore.Attivitą;

public class AttivitąTest {

  @Test
  public void attivitąTest() {
    Attivitą att = new Attivitą(5,"2018-11-03",2,"via pino","Descrizione prova",2);
    assertNotNull(att);
    assertNull(att);
  }
  

}

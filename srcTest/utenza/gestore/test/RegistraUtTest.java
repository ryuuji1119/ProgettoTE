package utenza.gestore.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import utenza.gestore.RegistraUt;

public class RegistraUtTest {
  private RegistraUt user2 = new RegistraUt("R.Girobolli1@studenti.unisa.it",
         "Ringo", "Girobolli", "Zucchina", "admin@tirocinioeasy.it");
  
  @Test
  public void testRegistraUt() {
    RegistraUt user = new RegistraUt("R.Girobolli1@studenti.unisa.it",
         "Ringo", "Girobolli", "Zucchina", "admin@tirocinioeasy.it");
    assertNotNull(user);

  }

  @Test
  public void testGetEmail() {
    user2.getEmail();
    assertNotNull(user2);
    assertNull(user2);
    assertEquals("R.Girobolli1@studenti.unisa.it",user2.getEmail());
    assertNotEquals("R.Girosdali1@studenti.unisa.it",user2.getEmail());
  }

  @Test
  public void testSetEmail() {
    user2.setEmail("R.Girobolli1@studenti.unisa.it");
    assertNotNull(user2);
  }

  @Test
  public void testGetNome() {
    user2.getNome();
    assertNotNull(user2);
    assertEquals("Ringo",user2.getNome());
    assertNotEquals("Rindgo",user2.getNome());
  }

  @Test
  public void testSetNome() {
    user2.setNome("Gianfranco");
    assertNotNull(user2);
  }

  @Test
  public void testGetCognome() {
    user2.getCognome();
    assertNotNull(user2);
    assertEquals("Girobolli",user2.getCognome());
    assertNotEquals("Girasgdli",user2.getCognome());
  }

  @Test
  public void testSetCognome() {
    user2.setCognome("Rinaldi");
    assertNotNull(user2);
  }

  @Test
  public void testGetPassword() {
    user2.getPassword();
    assertNotNull(user2);
    assertEquals("Zucchina",user2.getPassword());
    assertNotEquals("pippo",user2.getPassword());
  }

  @Test
  public void testSetPassword() {
    user2.setPassword("Paperino");
    assertNotNull(user2);
  }

  @Test
  public void testGetAdminEmail() {
    user2.getAdminEmail();
    assertNotNull(user2);
    assertEquals("admin@tirocinioeasy.it",user2.getAdminEmail());
  }

  @Test
  public void testSetAdminEmail() {
    user2.setAdminEmail("admin@tirocinioeasy.it");
    assertNotNull(user2);
  }

  @Test
  public void testInsertAccount() throws SQLException {
    int num = 3;
    boolean flag = user2.insertAccount(num);
    assertEquals(flag,true);
    assertNotNull(user2);
    assertTrue(user2.insertAccount(num));
    assertFalse(user2.insertAccount(num));
  }
}

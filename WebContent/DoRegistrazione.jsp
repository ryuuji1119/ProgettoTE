
<%@page import="org.omg.PortableServer.ForwardRequest"%>
<%@page import="bean.DirettoreDip"%>
<%@page import="bean.Tirocinante"%>
<%@page import="bean.TutorAz"%>
<%@page import="bean.TutorUni"%>
<%@page import="utenza.gestore.RegistraUt"%>
 

 <jsp:useBean id="amministratore" class="bean.Amministratore" scope="session"/> 
<jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="request"/>
<jsp:useBean id="dirDip" class="bean.DirettoreDip" scope="request"/> 
<jsp:useBean id="tutorAz" class="bean.TutorAz" scope="request"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="request"/> 
<%
 
String email=request.getParameter("email"); 
String nome=request.getParameter("nome");
String cognome=request.getParameter("cognome");
String password= request.getParameter("password");
String adminemail=amministratore.getEmail();
 
String numUtente= request.getParameter("tipo");

int numTipoUtente= Integer.parseInt(numUtente);
 
 
RegistraUt registraUtente = new RegistraUt(email,nome,cognome,password,adminemail);

 
 boolean x = registraUtente.insertAccount(numTipoUtente);
  if (x){

    	%>

<jsp:forward page="Homepage.jsp" />

  <%
      }

         %>

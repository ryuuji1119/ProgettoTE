  
 
 <%@page import="tirocinio.registro.gestore.RegistroDao"%>
  
  <jsp:useBean id="listaA" 
    class="tirocinio.registro.gestore.ListaAttivit�"
     scope="request"/>
             
 <jsp:useBean id="user" 
 class="bean.User"
  scope="session"/>

<jsp:useBean id="tutorAz" 
class="bean.TutorAz" 
scope="session"/>

 

<% 

String mail= request.getParameter("mail");
RegistroDao reg= new RegistroDao();

// attivit.setRegistroID(reg.selectId("mail"));

reg.fillListaattivit�(listaA, mail);

 
%>

 <jsp:forward page="listaAttivitView.jsp"></jsp:forward>
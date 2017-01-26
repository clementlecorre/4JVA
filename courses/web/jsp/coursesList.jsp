<%-- 
    Document   : coursesList
    Created on : Jan 17, 2017, 6:35:40 PM
    Author     : maxime
--%>
<%@include file="inc/header.jsp" %>

<%@include file="inc/nav.jsp" %>

<table>
  <c:forEach items="${coursesList}" var="item">
    <tr>
      <td><c:out value="${item}" /></td>
    </tr>
  </c:forEach>
</table>
    
<%@include file="inc/footer.jsp" %>
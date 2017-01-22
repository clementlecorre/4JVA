<%-- 
    Document   : login
    Created on : 22 janv. 2017, 22:23:30
    Author     : clement
--%>
<%@include file="inc/header.jsp" %>
<%@include file="inc/nav.jsp" %>

<h3 class="text-center"> Log in</h3>
<div class="container">
    <p style="color:red" ><c:out value="${errorMsg}"/></p>
    <form name="registerForm" method="post" action="Register">
        <span id="reauth-email" class="reauth-email"></span>
        <input name="username" type="text"  class="form-control" placeholder="Username" required autofocus>
        <input name="password" type="password"  class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Goooo!</button>
    </form><!-- /form -->
    <a href="#" class="forgot-password">
        Forgot the password?
    </a>
</div><!-- /container -->
</br>
</br>
<%@include file="inc/footer.jsp" %>
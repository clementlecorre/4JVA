<%@include file="inc/header.jsp" %>
<%@include file="inc/nav.jsp" %>

<h3 class="text-center"> Register now for has access lot of courses online </h3>
<div class="container">
    <p style="color:red" ><c:out value="${errorMsg}"/></p>
    <form name="registerForm" method="post" action="Register">
        <span id="reauth-email" class="reauth-email"></span>
        <input name="username" type="text"  class="form-control" placeholder="Username" required autofocus>
        <input name="email" type="email" class="form-control" placeholder="Email address" required>
        <input name="password" type="password"  class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Register now</button>
    </form><!-- /form -->
</div><!-- /container -->
</br>
</br>
<%@include file="inc/footer.jsp" %>

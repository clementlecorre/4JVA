<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="header.jsp" %>
        <section>
            <form name="loginForm" method="post" action="/build/Login">
                Username: <input type="text" name="username"/> <br/>
                Password: <input type="password" name="password"/> <br/>
                <input type="submit" value="Login" />
            </form>
        </section>
        <div>
            <p>Take your courses online right now !</p>
        </div>
    </body>
</html>

<%-- 
    Document   : register
    Created on : Jan 17, 2017, 6:35:10 PM
    Author     : maxime
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div>Courses - Supinfo</div>
                <nav>
                    <ul>
                        <li><a href="Login">Home</a></li>
                        <li>Courses</li>
                        <li><a href="Register">Register</a></li>
                    </ul>
                </nav>
        </header>
        <section>
            <form name="registerForm" method="post" action="Register">
                Username: <input type="text" name="username"/> <br/>
                Password: <input type="password" name="password"/> <br/>
                Email : <input type="email" name="email"/> <br/>
                <input type="submit" value="Register" />
            </form>
        </section>
        <div>
            <p>Take your courses online right now !</p>
        </div>
    </body>
</html>

<%-- 
    Document   : Success
    Created on : Sep 28, 2017, 8:47:31 AM
    Author     : dovan
--%>

<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.*, Model.entities.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login success</title>
    </head>
    <body>
        <h1>Success</h1>
        <%
            Map<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute(Common.Constant.CART_SESSION);
            for (Map.Entry<String, Integer> item : cart.entrySet()) {
                out.println("<h1>Book id: " + item.getKey() + " - quantities: " + item.getValue()+ "</h1></br>");
            }
        %>
    </body>
</html>

<%-- 
    Document   : orderlist
    Created on : 20-03-2018, 13:00:20
    Author     : User
--%>

<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Orders</title>
    </head>
    <body>
        <h1>Here you can see all orders</h1>
        filler text.txt
        
         Vis resultat:
        
        <% Order order = (Order)request.getAttribute("order");%>
        
        <%=order.getLargeBrick()%>
        <%=order.getMediumBrick()%>
        <%=order.getSmallBrick()%>
        
        
    </body>
</html>

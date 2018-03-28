<%-- 
    Document   : orderpage
    Created on : 20-03-2018, 12:56:52
    Author     : User
--%>

<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
    </head>
    <body>
        
       
        <h1>Start your Order</h1>
        here is some filler text
        
        <br>
        <form action="FrontController" name="order" method="POST">
            <input type="hidden" name="command" value="createorder">
            <input type="number" name="length" placeholder="length">
            <input type="number" name="width" placeholder="width">
            <input type="number" name="height" placeholder="height">
            <input type="submit" value="Submit">
            </form>
        <br>
        
    </body>
</html>
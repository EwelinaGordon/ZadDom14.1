<%--
  Created by IntelliJ IDEA.
  User: gordo
  Date: 04.07.2018
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Kalkulator miar</title>
  </head>
  <body>
  <form method="post" action="CalcMeterServlet">
    <h1> Przelicznik metryczny </h1>
    <input type = "text" name = "metry"> <br>
    <input type = "text" name = "centymetry"><br>
    <input type = "text" name = "milimetry"><br>
    <input type = "submit" name = "Przelicz">
  </form>

  <form method="post" action="CalcWeightServlet">
    <h1> Przelicznik wag </h1>
    <input type = "text" name = "kilogramy"><br>
    <input type = "text" name = "gramy"><br>
    <input type = "text" name = "miligramy"><br>
    <input type = "submit" name = "Przelicz">

  </form>
  </body>
</html>

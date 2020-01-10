<%--
  Created by IntelliJ IDEA.
  User: ankit
  Date: 06/01/20
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ctc sucess page</title>
</head>
<body>

<center>



    <form action="" method="post">

        <h2>

            Contribustion  sucessfully....

        </h2>

        <% out.println("CTC Provided for "+session.getAttribute("ECODE_Session") + " is :");%>
        <br/>
        <% out.println(session.getAttribute("employerPfSession"));%>
        <% out.println(session.getAttribute("gratuitySession"));%>
        <% out.println(session.getAttribute("grossSsession"));%>
        <% out.println(session.getAttribute("employeePfSession"));%>
        <% out.println(session.getAttribute("employeeEsiSession"));%>


        <br/><input type="submit" value="Click to continue">
    </form>

</center>
</body>
</html>

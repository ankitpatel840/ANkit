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



    <form action="Controller" method="Post">

        <h2>

            CTC sucessfully....

        </h2>

        <% out.println("CTC Provided for "+session.getAttribute("ECODE_Session") + " is :");%>
        <br/>
        <% out.println(session.getAttribute("get_Ctc"));%>
         <br>

        <br>
        <table align="center">



            <tr>
                <td>ENTER LOCATION</td>
            </tr>

            <tr>
                <td>
                    <input type="text" size=25 name="LOC">
                </td>


            <tr>






        </table>
        <br/><input type="submit" value="Click to continue">
    </form>

</center>
</body>
</html>

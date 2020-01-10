<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ctc sucess page</title>
</head>
<body>

<center>



    <form action="Bonus" method="post">

        <h2>

            Basic sucessfully....

        </h2>

        <% out.println("Basic Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br/>
        <% out.println(session.getAttribute("getBasic"));%>
        <br>

        <h2>

            Bonus Sucessfully
        </h2>

        <% out.println("Bonus Provided for "+session.getAttribute("ECODE_Session") + " is :");%>


        <br>


        <% out.println(session.getAttribute("bonusGet"));%>

        <br>
        <h2>

            EmployerPF sucessfully....

        </h2>
        <br>


        <% out.println("EmployerPF Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>


        <% out.println(session.getAttribute("getEmployerPF"));%>
        <br>
        <h2>

            Gratuity sucessfully....

        </h2>
        <br>


        <% out.println("Gratuity Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>


        <% out.println(session.getAttribute("getGatutiy"));%>

        <br>
        <h2>

            Gross sucessfully....

        </h2>
        <br>

        <% out.println("Gross Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("getGross"));%>

        <br>
        <h2>

            EmployerESI sucessfully....

        </h2>
        <br>


        <% out.println("EmployerEsi Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("getEmployerEsi"));%>

        <br>
        <h2>

            EmployeePF sucessfully....

        </h2>
        <br>


        <% out.println("EmployeePf Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("getEmployeePf"));%>

        <br>
        <h2>

            Employee ESI sucessfully....

        </h2>
        <br>


        <% out.println("EmployeeEsi Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("getEmloyeeEsi"));%>


        <br>
        <h2>

            GrossDeduction sucessfully....

        </h2>
        <br>

        <% out.println("GrossDeduction Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("getGrossAndDeduction"));%>


        <br>
        <h2>

            Net Pay sucessfully....

        </h2>
        <br>


        <% out.println("NetPay Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("getNetPay"));%>


         <br>
        <h2>

            Net Take Home sucessfully....

        </h2>
        <br>


        <% out.println("Net Teke Home Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>

        <% out.println(session.getAttribute("netTakeHome"));%>


        <br>
        <h2>

            PT Gross sucessfully....

        </h2>
        <br>


        <% out.println("PT Gross Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>


        <% out.println(session.getAttribute("getPTGross"));%>



        <br>
        <h2>

          Differnec  sucessfully....

        </h2>
        <br>


        <% out.println("Differnec Provided for "+session.getAttribute("ECODE_Session") + " is :");%>

        <br>
        <h2>

           DIFFERENCE sucessfully....

        </h2>
        <br>

        <% out.println(session.getAttribute("getDiffernce"));%>


        <br>
        <h2>

            HRA sucessfully....

        </h2>
        <br>

        <% out.println(session.getAttribute("getHRA"));%>








    </form>

</center>
</body>
</html>

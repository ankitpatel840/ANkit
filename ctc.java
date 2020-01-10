package com.mypayroll.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class ctc extends HttpServlet
{
    @Override


    public void service(HttpServletRequest req,HttpServletResponse resp ) throws IOException {
        try {



            HttpSession session = req.getSession();
            String e_CODE_Session = (String) session.getAttribute("ECODE_Session");
            String ctc = req.getParameter("CTC");
         ///   String getLOC=req.getParameter("LOC");

            System.out.println(ctc);
            int get_Ctc = Integer.parseInt(ctc);
            System.out.println(ctc);
            Model m = new Model();
            m.setCTC(get_Ctc);
            m.setE_CODE(e_CODE_Session);
         //   m.setLOC(getLOC);
            boolean s=m.getLocation();

            boolean status = m.ctcCheak();





            if (status == true)
            {
                session.setAttribute("get_Ctc", get_Ctc);
                System.out.println(session.getAttribute("get_Ctc"));

                resp.sendRedirect("SuccessCTCT.jsp");


            } else {

                resp.sendRedirect("resovle.html");
            }

        } catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}

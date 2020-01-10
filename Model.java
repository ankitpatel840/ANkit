package com.mypayroll.app;

import com.sun.source.tree.WhileLoopTree;

import java.sql.*;

public class Model {
    String E_CODE;
    String E_NAME;
    String State;
    String Gender;
    int HRA;
    int Net_Take__Home;
    int CTC;
    int Basic;
    int Bonus;
    int SPALL;
    int EmployerPF;
    int EmployerESI;
    int Gratuity;
    int Gross;
    int EmployeePF;
    int EmployeeESI;
    int LWF;
    int ded;
    int diff;
    int PTGross;
    String LOC;
    int NET_PAY;

    public int getNET_PAY() {
        return NET_PAY;
    }

    public void setNET_PAY(int NET_PAY) {
        this.NET_PAY = NET_PAY;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC;
    }

    public int getMINIMUM_WAGE() {
        return MINIMUM_WAGE;
    }

    public void setMINIMUM_WAGE(int MINIMUM_WAGE) {
        this.MINIMUM_WAGE = MINIMUM_WAGE;
    }

    int MINIMUM_WAGE;


    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;

    public String getE_CODE() {
        return E_CODE;
    }

    public void setE_CODE(String e_CODE) {
        E_CODE = e_CODE;
    }

    public String getE_NAME() {
        return E_NAME;
    }

    public void setE_NAME(String e_NAME) {
        E_NAME = e_NAME;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getHRA() {
        return HRA;
    }

    public void setHRA(int HRA) {
        this.HRA = HRA;
    }

    public int getNet_Take__Home() {
        return Net_Take__Home;
    }

    public void setNet_Take__Home(int net_Take__Home) {
        Net_Take__Home = net_Take__Home;
    }

    public int getCTC() {
        return CTC;
    }

    public void setCTC(int CTC) {
        this.CTC = CTC;
    }

    public int getBasic() {
        return Basic;
    }

    public void setBasic(int basic) {
        Basic = basic;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public int getSPALL() {
        return SPALL;
    }

    public void setSPALL(int SPALL) {
        this.SPALL = SPALL;
    }

    public int getEmployerPF() {
        return EmployerPF;
    }

    public void setEmployerPF(int employerPF) {
        EmployerPF = employerPF;
    }

    public int getEmployerESI() {
        return EmployerESI;
    }

    public void setEmployerESI(int employerESI) {
        EmployerESI = employerESI;
    }

    public int getGratuity() {
        return Gratuity;
    }

    public void setGratuity(int gratuity) {
        Gratuity = gratuity;
    }

    public int getGross() {
        return Gross;
    }

    public void setGross(int gross) {
        Gross = gross;
    }

    public int getEmployeePF() {
        return EmployeePF;
    }

    public void setEmployeePF(int employeePF) {
        EmployeePF = employeePF;
    }

    public int getEmployeeESI() {
        return EmployeeESI;
    }

    public void setEmployeeESI(int employeeESI) {
        EmployeeESI = employeeESI;
    }

    public int getLWF() {
        return LWF;
    }

    public void setLWF(int LWF) {
        this.LWF = LWF;
    }

    public int getDed() {
        return ded;
    }

    public void setDed(int ded) {
        this.ded = ded;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public int getPTGross() {
        return PTGross;
    }

    public void setPTGross(int PTGross) {
        this.PTGross = PTGross;
    }


    Model() {
//
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "ANKIT", "SYSTEM");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    boolean cheak() throws SQLException {
        String s = "select * from EMPLOYEECTC where E_NAME=? and  E_CODE=?";
        pstmt = con.prepareStatement(s);
        pstmt.setString(1, E_NAME);
        System.out.println(E_NAME);
        pstmt.setString(2, E_CODE);
        System.out.println(E_CODE);
        res = pstmt.executeQuery();
        //  res=pstmt.executeQuery();

        System.out.println(res);

        while (res.next()) {

            E_CODE = res.getString(3);

            return true;
        }
        return false;
    }


    public boolean ctcCheak()
    {
        try {

            pstmt=con.prepareStatement("UPDATE EMPLOYEECTC SET CTC=? WHERE E_CODE=?");

            pstmt.setInt(1, CTC);
            pstmt.setString(2, E_CODE);
            int row = pstmt.executeUpdate();

            System.out.println(CTC);
            System.out.println(E_CODE);

            if(row==1)
            {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean basic_salary() {
        try {

            pstmt = con.prepareStatement("UPDATE EMPLOYEECTC SET BASIC=?,BONUS=?,EMPLOYER_PF=?, GRATUITY=?, GROSS=?,EMPLOYER_ESI=?, EMPLOYEE_PF=?,EMPLOYEE_ESI=?,NET_PAY=?,NET_TAKE_HOME=?,PT_GROSS=?, DIFF_=?,HRA=? WHERE E_CODE=?");

            pstmt.setInt(1, Basic);
            pstmt.setInt(2, Bonus);

            pstmt.setInt(3, EmployerPF);
            pstmt.setInt(4, Gratuity);
            pstmt.setInt(5, Gross);
            pstmt.setInt(6, EmployerESI);
            pstmt.setInt(7, EmployeePF);
            pstmt.setInt(8, EmployeeESI);
            pstmt.setInt(9, NET_PAY);
            pstmt.setInt(10, Net_Take__Home);

            pstmt.setInt(11, PTGross);
            pstmt.setInt(12, diff);
            pstmt.setInt(13, HRA);

            pstmt.setString(14, E_CODE);



            int row = pstmt.executeUpdate();


            System.out.println(HRA);
            System.out.println(Basic);
            System.out.println(E_CODE);

            if (row == 1)
            {

                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public boolean getMinimumWAge() throws SQLException {


        String s = "select * from BRANCHES where LOCATION=?";

        pstmt=con.prepareStatement(s);

        pstmt.setString(1,LOC);
        res = pstmt.executeQuery();
        while (res.next()) {

            HRA = res.getInt(3);

            System.out.println(getHRA());

            MINIMUM_WAGE=res.getInt(2);

            return true;
        }
        return false;

    }


    public boolean getLocation() throws SQLException {


        String s = "select * from BRANCHES where LOCATION=?";

        pstmt=con.prepareStatement(s);

        pstmt.setString(1,LOC);
        res = pstmt.executeQuery();
        while (res.next()) {

            HRA = res.getInt(3);

            System.out.println(getHRA());

            MINIMUM_WAGE=res.getInt(2);
            System.out.println(MINIMUM_WAGE);

            return true;
        }
        return false;
    }



}



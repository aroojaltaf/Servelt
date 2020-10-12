package servelet;

import db.DbConnection;
import sun.security.pkcs11.Secmod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bse171057 on 10/12/2020.
 */
@WebServlet(name = "Servletexample")
public class Servletexample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        out.println("Servet called");
        String name =request.getParameter(  "firstname" );
        out.println(name);

        DbConnection dbConnection = new DbConnection();
        dbConnection.insertRecord(name);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

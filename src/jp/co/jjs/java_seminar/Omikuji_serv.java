package jp.co.jjs.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class omikuji_serv
 */
@WebServlet("/Omikuji_serv")
public class Omikuji_serv extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Omikuji_serv() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        getpost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        getpost(request, response);

    }

    public void getpost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        int rand = (int)Math.floor(Math.random() * 5 + 1);
        String str = "";

        switch (rand) {
        case 1:
            str = "大吉！";
            break;
        case 2:
            str = "吉！";
            break;
        case 3:
            str = "中吉！";
            break;
        case 4:
            str = "小吉！";
            break;
        case 5:
            str = "大凶！";
            break;


        }
        request.setAttribute("result", str);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Omikuji_reserv.jsp");
        dispatcher.forward(request, response);
    }

}

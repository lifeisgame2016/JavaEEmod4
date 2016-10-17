package servlet;

import modul.ToDoList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Den on 16.10.2016.
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("toDoList", ToDoList.getInstance().getTaskList());
        getServletContext().getRequestDispatcher("/listToDo.jsp").forward(request, response);
    }
}

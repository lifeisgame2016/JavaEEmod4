package servlet;

import modul.Task;
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
@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String task = request.getParameter("task");
        String category = request.getParameter("category");
        ToDoList.getInstance().addParamToList(new Task(task, category));
        response.sendRedirect("main");
    }
}

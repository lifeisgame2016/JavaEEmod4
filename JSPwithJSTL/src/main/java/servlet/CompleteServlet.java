package servlet;

import modul.ToDoList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Den on 16.10.2016.
 */
@WebServlet("/complete")
public class CompleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] ids = request.getParameterValues("completed[]");
        List<Integer> completedTaskIds = Arrays.stream(ids).map(Integer::valueOf).collect(Collectors.toList());
        ToDoList.getInstance().removeById(completedTaskIds);
        response.sendRedirect("main");
    }
}

package servlet;

import lombok.extern.java.Log;
import model.DataStorage;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log
@WebServlet("")
public class PostListServlet extends HttpServlet {
    private @Inject
    DataStorage dataStorage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> postsNames = new ArrayList<String>(Arrays.asList("Post1","Post2","Post3","Post4"));
        req.setAttribute("posts", dataStorage.getPostList());
        resp.getWriter().println("");
        RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
        view.forward(req, resp);
        log.info("Post list was opened");
    }
}

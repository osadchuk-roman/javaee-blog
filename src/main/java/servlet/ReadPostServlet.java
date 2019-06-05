package servlet;

import lombok.extern.java.Log;
import model.DataStorage;
import model.Post;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log
@WebServlet("/readPost")
public class ReadPostServlet extends HttpServlet {
    private @Inject
    DataStorage dataStorage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id  = Long.parseLong(req.getParameter("id"));
        Post post = dataStorage.findById(id);
        req.setAttribute("post", post);
        RequestDispatcher view = req.getRequestDispatcher("/readPost.jsp");
        view.forward(req, resp);
        log.info(post + " was opened");
    }
}

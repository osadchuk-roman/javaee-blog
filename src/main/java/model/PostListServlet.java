package model;

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

@WebServlet("")
public class PostListServlet extends HttpServlet {
    private @Inject DataStorage dataStorage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> postsNames = new ArrayList<String>(Arrays.asList("Post1","Post2","Post3","Post4"));
        /*List<Post> postList = new ArrayList<>(Arrays.asList(
                new Post("Post1", "Subject1", "Text1"),
                new Post("Post2", "Subject2", "Text2"),
                new Post("Post3", "Subject3", "Text3"),
                new Post("Post4", "Subject4", "Text4")
        ));*/
        //req.setAttribute("postsNames", "Post1, Post2, Post3, Post4");
        //req.setAttribute("posts", postList);
        req.setAttribute("posts", dataStorage.getPostList());
        RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
        view.forward(req, resp);
    }
}

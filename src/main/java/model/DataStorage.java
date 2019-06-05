package model;

import lombok.extern.java.Log;
import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ejb.Startup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Startup
@Singleton
@Log
public class DataStorage {
    private  List<Post> postList;

    @PostConstruct
    private void init(){
        postList = new ArrayList<>(Arrays.asList(
                new Post(1,"Post1", "Subject1", "Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 " +
                        "Text1Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 "  +
                        "Text1Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 "  +
                        "Text1Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 "  +
                        "Text1Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 "  +
                        "Text1Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 Text1 " ),
                new Post(2, "Post2", "Subject2", "Text2"),
                new Post(3, "Post3", "Subject3", "Text3"),
                new Post(4,"Post4", "Subject4", "Text4")
        ));
        log.info("Post list was initialized");
    }

    public void addPost(Post post){
        postList.add(post);
        log.info(post + " was added to postList");
    }

    public  List<Post> getPostList() {
        return postList;
    }

    public Post findById(long id){
        Optional<Post> optionalPost = postList.stream().filter(p -> p.getId() == id).findAny();
        Post post = new Post();

        if (optionalPost.isPresent()) {
            post = optionalPost.get();
        } else {
            log.warning("Post with id = " + id + " not found.");
        }

        return post;
    }
}

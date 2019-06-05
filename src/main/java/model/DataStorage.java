package model;

import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ejb.Startup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Startup
@Singleton
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
    }

    public void addPost(Post post){
        postList.add(post);
    }

    public  List<Post> getPostList() {
        return postList;
    }
}

package model;

import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Startup
@Singleton
@Getter
public class DataStorage {
    private List<Post> postList;

    @PostConstruct
    private void init(){
        postList = new ArrayList<>(Arrays.asList(
                new Post("Post1", "Subject1", "Text1"),
                new Post("Post2", "Subject2", "Text2"),
                new Post("Post3", "Subject3", "Text3"),
                new Post("Post4", "Subject4", "Text4")
        ));
    }
}

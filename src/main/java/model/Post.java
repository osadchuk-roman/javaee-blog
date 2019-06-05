package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {
    private long id;
    private String name;
    private String subject;
    private String text;
}

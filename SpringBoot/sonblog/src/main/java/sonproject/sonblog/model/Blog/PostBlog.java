package sonproject.sonblog.model.Blog;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Post_blog")
public class PostBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="Title")
    String title;

    @Column(name="Content")
    String content;

    @Column(name = "Date_create")
    String date_create;


    public PostBlog() {
    }

    public PostBlog(Long id, String title, String content, String date_create) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date_create = date_create;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }
}

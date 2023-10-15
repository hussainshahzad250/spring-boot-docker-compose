package com.hussain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(title, post.title) && Objects.equals(body, post.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, body);
    }

}

package com.post.it.entities;

public class PostIt {
    private Integer id;
    private String name;
    private String content;

    public PostIt (Integer id, String name, String content) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndentifier() {
        return id;
    }

    public void setIndentifier(Integer indentifier) {
        this.id = indentifier;
    }

}

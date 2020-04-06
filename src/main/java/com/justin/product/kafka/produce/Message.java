package com.justin.product.kafka.produce;


public class Message {
    private long id;
    private String name;
    private String content;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }
}

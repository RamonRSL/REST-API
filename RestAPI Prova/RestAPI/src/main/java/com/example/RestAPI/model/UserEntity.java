package com.example.RestAPI.model;

        import org.springframework.data.annotation.Id;
        import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "noticias")
public class UserEntity {

    @Id
    private String id;

    public UserEntity(String id){
        this.id = id;
    }

    public String getId(){ return id;}

    public void setId(String id) {
        this.id = id;
    }
}


package study.springjackson.dummy.object.ref;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Setter;

@Setter
public class Child {

    public String name;
    @JsonBackReference
    public Parent parent;

    public Child(String name) {
        this.name = name;
    }

}

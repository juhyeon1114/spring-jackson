package study.springjackson.dummy.object.ref;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;

public class Parent {

    public String name;
    @JsonManagedReference
    public List<Child> children = new ArrayList<>();

    public Parent(String name) {
        this.name = name;
    }

    public void addChild(Child child) {
        children.add(child);
        child.setParent(this);
    }

}

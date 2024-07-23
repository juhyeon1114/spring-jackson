package study.springjackson.dummy.object.ref;

import java.util.ArrayList;
import java.util.List;

public class UnmanagedParent {

    public String name;
    public List<UnmanagedChild> children = new ArrayList<>();

    public UnmanagedParent(String name) {
        this.name = name;
    }

    public void addChild(UnmanagedChild child) {
        children.add(child);
        child.setParent(this);
    }

}

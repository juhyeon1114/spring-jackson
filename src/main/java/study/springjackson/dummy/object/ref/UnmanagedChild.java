package study.springjackson.dummy.object.ref;

import lombok.Setter;

@Setter
public class UnmanagedChild {

    public String name;
    public UnmanagedParent parent;

    public UnmanagedChild(String name) {
        this.name = name;
    }

}

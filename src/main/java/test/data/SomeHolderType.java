package test.data;

public class SomeHolderType extends TypeObject<Long> {

    public SomeHolderType(Long id) {
        this.setID(id);
    }

    public String name() {
        return "just a method";
    }
}

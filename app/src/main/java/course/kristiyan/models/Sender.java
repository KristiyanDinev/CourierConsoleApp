package course.kristiyan.models;

public class Sender {
    public String name;
    public String address;

    public Sender() {}
    public Sender(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sender(name="+name+", address="+address+")";
    }
}

package course.kristiyan.models;

public class Receiver {
    public String name;
    public String address;

    public Receiver() {}
    public Receiver(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Receiver(name="+name+", address="+address+")";
    }
}

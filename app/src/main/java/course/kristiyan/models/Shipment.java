package course.kristiyan.models;

import course.kristiyan.App;

public class Shipment {

    public int truckId;
    public Sender sender;
    public Receiver receiver;
    public String description;

    public Shipment(Sender sender, Receiver receiver,
                    String description) {
        // auto generate truckId
        App.truckIdSeq++;
        truckId = App.truckIdSeq;
        this.description = description;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Shipment(" +
                "truckId=" +
                truckId +
                ", sender=" +
                sender +
                ", receiver=" +
                receiver +
                ", description=" +
                description;
    }
}

package course.kristiyan.models;

import course.kristiyan.App;

public class Shipment {

    public int truckId;
    public Sender sender;
    public Receiver receiver;
    public String description;

    public Shipment(String senderName, String senderAddress,
                    String receiverName, String receiverAddress,
                    String description) {
        // auto generate truckId
        App.truckIdSeq++;
        truckId = App.truckIdSeq;
        this.description = description;
        sender = new Sender(senderName, senderAddress);
        receiver = new Receiver(receiverName, receiverAddress);
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

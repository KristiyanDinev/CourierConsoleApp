package course.kristiyan.services;

import course.kristiyan.App;
import course.kristiyan.models.Receiver;
import course.kristiyan.models.Sender;
import course.kristiyan.models.Shipment;
import course.kristiyan.utils.Menu;

public class ShipmentService {
    private Menu menu;

    public ShipmentService(Menu menu) {
        this.menu = menu;
    }


    public void createShipment() {
        String senderName = menu.getText("Sender's Name: ");
        String senderAddress = menu.getText("Sender's Address: ");
        String receiverName = menu.getText("Receiver's Name: ");
        String receiverAddress = menu.getText("Receiver's Address: ");
        String description = menu.getText("Description: ");
        Shipment shipment = new Shipment(
                new Sender(senderName, senderAddress),
                new Receiver(receiverName, receiverAddress),
                description);
        App.shipments.add(shipment);
        System.out.println("Added new Shipment: "+shipment);
    }

    public void trackShipment() {
        int truckId = menu.getInt("Enter in the truckId: ");
        for (Shipment shipment : App.shipments) {
            if (shipment.truckId == truckId) {
                System.out.println(shipment);
                return;
            }
        }
        System.out.println("Shipment with such ID is not found.");
    }

    public void markShipmentAsDelivered() {
        int truckId = menu.getInt("Enter in the truckId: ");
        for (Shipment shipment : App.shipments) {
            if (shipment.truckId == truckId) {
                shipment.description = "Delivered/Доставена";
                return;
            }
        }
        System.out.println("Shipment with such ID is not found.");
    }
}

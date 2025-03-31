# CourierConsoleApp
Simple Courier Console App for managing shipments with tracking.

### Menu
```
===Courier Console App===
1. Create Shipment
2. Track Shipment
3. Mark Shipment as delivered
4. Exit
```

Options:

`1` - You will be promted to give information for the shipment such as sender name, sender address, receiver name, receiver address and description.

`2` - You will be able to see the shipment object in the console.

`3` - You will automaticly update the shipment description with `Delivered/Доставен`.

`4` - You will exit from the program.

### Notes
- The truckId in the shipment is generated automaticly by incrementing from an integer like 0, 1, 2, 3 etc. This integer is in the `App.java` file and it plays as a sequence in the databases. Kinda the same thing.
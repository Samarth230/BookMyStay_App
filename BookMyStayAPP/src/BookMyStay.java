class Room {
    int roomNumber;
    double price;

    Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    void display() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price: " + price);
    }
}

class SingleRoom extends Room {
    SingleRoom(int roomNumber) {
        super(roomNumber, 1000);
    }
}

class DoubleRoom extends Room {
    DoubleRoom(int roomNumber) {
        super(roomNumber, 2000);
    }
}

class DeluxeRoom extends Room {
    DeluxeRoom(int roomNumber) {
        super(roomNumber, 3000);
    }
}

public class UseCase1HotelBookingApp {
    public static void main(String[] args) {
        SingleRoom single = new SingleRoom(101);
        DoubleRoom doubleRoom = new DoubleRoom(201);
        DeluxeRoom deluxe = new DeluxeRoom(301);

        single.display();
        doubleRoom.display();
        deluxe.display();
    }
}
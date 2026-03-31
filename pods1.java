class RoomBookingSystem {
    public void bookRoom(String name) {
        System.out.println("Номер забронирован для " + name);
    }

    public void cancelRoom(String name) {
        System.out.println("Бронь номера отменена для " + name);
    }
}

class RestaurantSystem {
    public void bookTable(String name) {
        System.out.println("Стол забронирован для " + name);
    }

    public void orderFood(String food) {
        System.out.println("Заказана еда: " + food);
    }
}

class EventManagementSystem {
    public void organizeEvent(String event) {
        System.out.println("Организовано мероприятие: " + event);
    }
}

class CleaningService {
    public void scheduleCleaning(String room) {
        System.out.println("Уборка запланирована для комнаты " + room);
    }
}

class TaxiService {
    public void callTaxi(String name) {
        System.out.println("Такси вызвано для " + name);
    }
}

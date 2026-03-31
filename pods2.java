class HotelFacade {
    private RoomBookingSystem roomSystem = new RoomBookingSystem();
    private RestaurantSystem restaurantSystem = new RestaurantSystem();
    private EventManagementSystem eventSystem = new EventManagementSystem();
    private CleaningService cleaningService = new CleaningService();
    private TaxiService taxiService = new TaxiService();

    public void bookRoomWithServices(String name) {
        roomSystem.bookRoom(name);
        restaurantSystem.orderFood("Завтрак");
        cleaningService.scheduleCleaning("101");
    }

    public void organizeEvent(String event, String guest) {
        eventSystem.organizeEvent(event);
        roomSystem.bookRoom(guest);
    }

    public void bookRestaurantWithTaxi(String name) {
        restaurantSystem.bookTable(name);
        taxiService.callTaxi(name);
    }

    public void cancelBooking(String name) {
        roomSystem.cancelRoom(name);
    }
}

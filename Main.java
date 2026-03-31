public class Main {
    public static void main(String[] args) {
        HotelFacade facade = new HotelFacade();

        facade.bookRoomWithServices("Nurdaulet");
        facade.organizeEvent("Conference", "Aman");
        facade.bookRestaurantWithTaxi("Ali");
        facade.cancelBooking("Nurdaulet");
    }
}

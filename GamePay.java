public class GamePay {
    private int id;
    private String name;
    private String price;
    private Player player;
    private Campaing campaing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public GamePay(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void sell(Player player, Campaing campaing) {
        System.out.println(this.name + " isimli oyun " + player.getFirstName() + " isimli oyuncuya " + campaing.getName() + " kampanyası ile " + this.price + " fiyatına satılmıştır");
    }

}

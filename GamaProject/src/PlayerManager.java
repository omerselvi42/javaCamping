public class PlayerManager implements BaseManager {


    private Player player;

    public PlayerManager(Player player) {
        this.player = player;
    }

    @Override
    public void add() {
        System.out.println("eklenen oyuncu" + player.getFirstName() + ' ' + player.getLastName());
    }

    @Override
    public void delete() {
        System.out.println("silinen oyuncu" + player.getFirstName() + ' ' + player.getLastName());

    }

    @Override
    public void update() {
        System.out.println("güncellenen oyuncu" + player.getFirstName() + ' ' + player.getLastName());

    }
}

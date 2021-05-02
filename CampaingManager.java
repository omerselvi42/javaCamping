public class CampaingManager implements BaseManager {

    private Campaing campaing;

    public CampaingManager(Campaing campaing) {
        this.campaing = campaing;
    }

    @Override
    public void add() {
        System.out.println(" kampanya eklendi " +campaing.getName() );
    }

    @Override
    public void delete() {
        System.out.println("kampanya silindi " + campaing.getName());

    }

    @Override
    public void update() {
        System.out.println("kampanya güncellendi "+ campaing.getName());

    }
}

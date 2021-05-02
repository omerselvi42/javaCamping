public class Main {

    public static void main(String[] args) {
        Player omer = new Player(1, "ömer", "selvi", "69202125928", 1995);
        Campaing anne = new Campaing("anneler günü özel kampanyası");
        BaseManager player = new PlayerManager(omer);
        BaseManager campaing = new CampaingManager(anne);
        GamePay gamePay = new GamePay(1, "age of 2 ", "100");
        player.add();
        campaing.add();
        gamePay.sell(omer, anne);

    }
}

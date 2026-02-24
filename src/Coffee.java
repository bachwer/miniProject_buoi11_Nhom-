public class Coffee extends Drink{
    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice() {
        if(hasMilk){
            return getPrice() + 5000;
        }else{
            return getPrice();
        }
    }


    @Override
    void displayInfo() {
        super.displayInfo();

        if (hasMilk) {
            System.out.println("Coffee with milk");
        } else {
            System.out.println("Black coffee");
        }
    }

    @Override
    void mix() {

    }


}

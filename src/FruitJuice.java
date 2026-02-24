public class FruitJuice extends Drink{
    private final double discountPercent;


    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice() {
        return getPrice() - (getPrice() * discountPercent / 100);
    }

    @Override
    void mix(){
        System.out.println("Dang Ep Trai Cay Tuoi");
    }

}

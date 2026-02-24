public class Main {
    public static void main(String[] args) {


        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("C01", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("F01", "Nước cam", 40000.0, 1);
        drinks[2] = null;

        System.out.println("===== HÓA ĐƠN =====");


        for (Drink drink : drinks) {

            if (drink != null) {

                drink.displayInfo();

                System.out.println("Thành tiền: "
                        + drink.calculatePrice());


                if (drink instanceof IMixable) {
                    ((IMixable) drink).mix();
                }

                System.out.println("-------------------");
            }
        }
    }
}
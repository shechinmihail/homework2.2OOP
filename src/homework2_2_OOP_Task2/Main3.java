package homework2_2_OOP_Task2;


public class Main3 {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[4];

        Flower commonRose = new Flower("Роза обыкновенная", "", "Голландия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
        Flower peony = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        flowers[0] = commonRose;
        flowers[1] = chrysanthemum;
        flowers[2] = peony;
        flowers[3] = gypsophila;

        System.out.println(commonRose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        bouquetCost(commonRose, commonRose, commonRose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                chrysanthemum, gypsophila);
    }

    public static void bouquetCost(Flower... flowers) {
        int minlifeSpan = Integer.MAX_VALUE;
        double summ = 0;
        String bouquet;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minlifeSpan) {
                minlifeSpan = flower.getLifeSpan();
            }
            System.out.println("В букете есть: " + flower.getName());
            summ += flower.getCost();
        }
        summ = summ * 1.10;

        bouquet = "\n";
        bouquet += "Сумма букета = " + String.format(" %.2f", summ);
        bouquet += "\n";
        bouquet += "Срок стояния букета = " + minlifeSpan;
        System.out.print(bouquet);
    }
}





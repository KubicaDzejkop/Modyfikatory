package pl.gornik;

import pl.gornik.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Product product = new Product("mleko", "nabiał", 3.99,
                1, "l");
        Product product1 = new Product("czekolada", "słodycze", 1.99,
                200, "g");
        Product product2 = new Product("kawa", "napój", 6.99,
                50, "g");
        Product product3 = new Product("olej", "tłuszcz", 3.99,
                100, "l");
        Product product4 = new Product("cukier", "słodycze", 6.32,
                2, "kg");
        Product product5 = new Product("biurko", "mebel", 121.99,
                50, "szt");


        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }

        System.out.println("---------------------------------");

        for (Product productTest : products) { // 2 sposob
            System.out.println(productTest);
        }

        System.out.println("----------Produkty z wybranej kategorii-----------");

        for (Product sprawdzanieProduktu : products) {
            if (sprawdzanieProduktu.getCategory().equalsIgnoreCase("nabiał")) {
                System.out.println(sprawdzanieProduktu);
            }
        }

        System.out.println("----------Produkty rozpoczynające się od A do K-----------");
        for (Product kodAscii : products) {
            if (kodAscii.getName().toUpperCase().charAt(0) > 64 &&
                    kodAscii.getName().toUpperCase().charAt(0) < 76) {
                System.out.println(kodAscii);
            }
        }

        System.out.println("----------Produkty rozpoczynające się od B do F-----------");
        for (Product kodAscii : products) {
            if (kodAscii.getName().toUpperCase().charAt(0) > 65 &&
                    kodAscii.getName().toUpperCase().charAt(0) < 71) {
                System.out.println(kodAscii);
            }
        }

        System.out.println("----------Drukowanie cen jednostkowych-----------");
            for(Product produkt : products){
                System.out.println("Produkt o nazwie " + produkt.getName() + ", wielkości " +
                        produkt.getSizePack() + " i jednostce " + produkt.getUnit() +
                        " wynosi " + produkt.calculateUnitPrice());
            }

        System.out.println("----------Drukowanie cen jednostkowych-----------");
        for (Product produkt1 : products) {
            produkt1.displayProduct();
        }
    }
}


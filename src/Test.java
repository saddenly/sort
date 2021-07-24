import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Ноутбук", "Сенсорный", 2_000));
        products.add(new Product("Мышка", "Беспроводная", 5000));
        products.add(new Product("PC", "Офисный", 10000));
        products.add(new Product("Телевизор", "Смарт", 12_000));
        products.add(new Product("Ноутбук", "Игровой", 1_000));


        System.out.println("Unsorted array: ");
        for (Product p : products) {
            System.out.println(p.getPrice());
        }

        System.out.println("Sorted with java: ");
        Product p1 = new Product("sth", "sth", 1);
        products.sort(p1);
        for (Product product : products) {
            System.out.println(product.getPrice());
        }

        System.out.println("Sorted array: ");
        Test t1 = new Test();
        for (Product product : t1.sortedArray(products)) {
            System.out.println(product.getPrice());
        }
    }

    public ArrayList<Product> sortedArray(ArrayList<Product> list) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.toArray().length - 1; i++) {
                int i1 = list.get(i).getPrice();
                int i2 = list.get(i + 1).getPrice();
                if (i1 > i2) {
                    Product p1 = new Product(list.get(i).getName(), list.get(i).getDescription(), list.get(i).getPrice());
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, p1);
                    sorted = false;
                }
            }
        }
        return list;
    }
}
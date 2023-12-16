package Task_2;

//Задача: Создание класса "Товар"
//
// Создайте класс Product для представления товара в интернет-магазине.
// Каждый товар должен иметь следующие характеристики:
// Название товара (name).
// Цена товара (price).
// Количество товара в наличии (quantity).
// Класс Product должен обеспечивать следующую функциональность:
// Конструктор, который принимает название, цену и количество товара и инициализирует соответствующие поля класса.
// Методы get и set для каждой из характеристик товара (название, цена, количество).
// Метод calculateTotalPrice, который будет вычислять общую стоимость товара на основе цены и количества.
// Метод displayProductInfo, который будет выводить информацию о товаре (название, цена, количество) на экран.
// Создайте несколько объектов класса Product и продемонстрируйте работу.

public class Product {
    private String name;
    private Double price;
    private int quantity;


    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private Double calculateTotalPrice(Double price, int quantity) {
        return price * quantity;
    }

    public static void displayProductInfo(Product product) {
        System.out.println("Название товара: " + product.getName() +
                           "\nЦена товара: " + product.getPrice() +
                           "\nКоличество товара: " + product.getQuantity());
    }
}

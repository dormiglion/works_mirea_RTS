package ru.mirea.work4;
import java.util.*;

public class Shop {
    private static Map<String, String> users = new HashMap<>();
    private static List<String> cart = new ArrayList<>();
    private static Map<String, List<String>> catalogues = new HashMap<>();

    public static void main(String[] args) {
        initializeData();

        if (!authenticate()) {
            System.out.println("Неправильный логин или пароль. Доступ запрещен.");
            return;
        }
        while (true) {
            System.out.println("\n1. Просмотр каталогов");
            System.out.println("2. Просмотр товаров каталога");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Посмотреть корзину");
            System.out.println("5. Оформить покупку");
            System.out.println("6. Выход");
            System.out.print("Выберите действие: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showCatalogues();
                    break;
                case 2:
                    showProductsInCatalogue();
                    break;
                case 3:
                    addProductToCart();
                    break;
                case 4:
                    viewCart();
                    break;
                case 5:
                    checkout();
                    break;
                case 6:
                    System.out.println("Спасибо за визит! До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
    private static void initializeData() {
        users.put("user1", "password1");
        users.put("user2", "password2");

        catalogues.put("Продукты", Arrays.asList("Помидоры", "Хлеб", "Чиабатта", "Энергетик"));
        catalogues.put("Одежда", Arrays.asList("Футболка", "Штаны", "Куртка", "Толстовка"));
        catalogues.put("Книги", Arrays.asList("1984", "Бойцовский клуб", "Война и мир", "Маленький принц"));
    }

    private static boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        return users.containsKey(login) && users.get(login).equals(password);
    }

    private static void showCatalogues() {
        System.out.println("\nКаталоги:");
        for (String catalogue : catalogues.keySet()) {
            System.out.println("- " + catalogue);
        }
    }

    private static void showProductsInCatalogue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название каталога: ");
        String catalogueName = scanner.nextLine();

        if (catalogues.containsKey(catalogueName)) {
            System.out.println("\nТовары в каталоге \"" + catalogueName + "\":");
            List<String> products = catalogues.get(catalogueName);
            for (String product : products) {
                System.out.println("- " + product);
            }
        } else {
            System.out.println("Такого каталога не существует.");
        }
    }

    private static void addProductToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара для добавления в корзину: ");
        String productName = scanner.nextLine();

        boolean productExists = catalogues.values().stream().anyMatch(products -> products.contains(productName));

        if (productExists) {
            cart.add(productName);
            System.out.println("Товар \"" + productName + "\" добавлен в корзину.");
        } else {
            System.out.println("Товар не найден в каталогах.");
        }
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("\nТовары в корзине:");
            for (String product : cart) {
                System.out.println("- " + product);
            }
        }
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста. Нечего покупать.");
        } else {
            System.out.println("\nВы купили следующие товары:");
            for (String product : cart) {
                System.out.println("- " + product);
            }
            cart.clear(); // Очищаем корзину после покупки
            System.out.println("Спасибо за покупку!");
        }
    }
}

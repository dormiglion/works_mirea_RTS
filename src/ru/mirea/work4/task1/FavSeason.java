package ru.mirea.work4.task1;

public class FavSeason {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonInfo(favoriteSeason);

        System.out.println("\nИнформация обо всех временах года:");
        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
    public static void printSeasonInfo(Seasons season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }
}


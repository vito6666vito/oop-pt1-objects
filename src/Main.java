public class Main {
    public static void main(String[] args) {
        Human[] person = new Human[4];
        person[0] = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        person[1] = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        person[2] = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        person[3] = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        for (Human k : person) {
            System.out.println(k);
        }
        System.out.println("");

        Car[] auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 3, "Черный", 2020, "Германия");
        auto[2] = new Car("BMW", "Z8", 3, "Черный", 2021, "Германия");
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        auto[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2015, "Южная Корея");
        for (Car j : auto) {
            System.out.println(j);
        }
    }
}
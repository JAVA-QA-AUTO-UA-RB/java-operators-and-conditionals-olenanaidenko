import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int health = 100;
        int luck = 50;

        System.out.println("Ласкаво просимо до казкового лісу! ");
        System.out.println("Ваше завдання - пройти через ліс, ухвалюючи правильні рішення. ");
        System.out.println("На старті у вас:");
        System.out.println("Здоров'я: " + health);
        System.out.println("Удача: " + luck);
        System.out.println("Подія 1: Ви знайшли роздоріжжя. Виберіть шлях:");
        System.out.println("1 - Стара хитка стежка");
        System.out.println("2 - Скарб серед кущів");


                Scanner sc = new Scanner(System.in);




        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            health -= 20;
            System.out.println("Ти обрав хитру стежку. Ти втрачаєш 20 очок здоров'я.Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else if (choice1 == 2) {
            luck +=30;
            System.out.println("Ти обрав скарб серед кущів. Тож ти отривуєщ 30 очок удачі. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else {
            health -= 10;
            System.out.println("Ти заплутався. Ти втрачаєш 10 очок здоров'я. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        }

        System.out.println("Подія 2: Колодязь. Ти натрапляєш на загадковий колодязь.");
        System.out.println("1 - Випити магічної води.");
        System.out.println("2 - Проігнорувати колодязь.");

        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            health += 50;
            System.out.println("Ти обрав випити магічної води. Ти отримуєш 50 очок здоров'я. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else if (choice2 == 2) {
            luck -= 10;
            System.out.println("Ти вирішив знехтувати цією нагодою. Тож ти стомлюєшся та втрачаєш 10 очок удачі. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else {
            System.out.println("Ти заплутався. Ти нічого не втрачаєш і не набуваєш. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        }


        System.out.println("Подія 3: Чарівна істота. Ти натрапляєш на чарівну істоту. Натиснити 1, 2 чи 3 щоб дізнатися яка ця істота.");

        int choice3 = sc.nextInt();
        if (choice3 == 1) {
            health += 20;
            System.out.println("Це дружня істота. Вона хоче поділитися їжею з тобою. Ти отримуєш 20 очок здоров'я. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else if (choice3 == 2) {
            luck -= 30;
            System.out.println("Це ворожа істота. Вона табе атакує. Тож ти втрачаєш 30 очок удачі. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else if (choice3 == 3){
            System.out.println("Це істота байдужа. Ти нічого не втрачаєш і не набуваєш. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        } else {
            System.out.println("Тобі не вдалося дізнатися що це за істота. Ти нічого не втрачаєш і не набуваєш. Наразі ти маєш " + luck + " очок удачі та " + health + " очок здоров'я.");

        }


        if (health <= 0 && luck <= 0) {
            System.out.println("Ти не змогли пройти ліс... Спробуйте ще раз!");

        } else if (health > 0 && luck <= 0) {
            System.out.println("Ти не змогли пройти ліс... Спробуйте ще раз!");

        } else if (health <= 0 && luck > 0) {
            System.out.println("Ти не змогли пройти ліс... Спробуйте ще раз!");

        } else {
            System.out.println("Вітаємо! Ви змогли пройти через чарівний ліс!");
        }











    }

}

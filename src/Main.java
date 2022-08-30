public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        //task8();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age < 18) System.out.println(" Ты еще слишком мал \n");
        else System.out.println(" Поздравляем с совершеннолетием \n");
        System.out.println();
    }

    private static <string> void task2() {
        System.out.println("Задача 2");
        int age = 2;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может поступать в университет");
        }
        if (age > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Неизвестно что делать этому бродяге");
        }

        System.out.println();

    }

    private static void task3() {
        System.out.println("Задание 3");
        int placesWagon = 102;
        int sitPlaces = 60;
        int wakePlaces = placesWagon - sitPlaces;
        int placesSit = 60;
        int placesWake = 42;
        int freePlacesSit = sitPlaces - placesSit;
        int freePlacesWake = wakePlaces - placesWake;
        int freePlaces = freePlacesWake + freePlacesSit;
        if (placesSit < sitPlaces && placesWake < wakePlaces) {
            System.out.printf("В вагоне свободно %d мест, из них стоячих %d мест и сидячих %d мест \n", freePlaces, freePlacesWake, freePlacesSit);
        } else {
            System.out.println("Свободных мест нет");
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println(" Задача из видеоурока");
        int age = 19;
        boolean canNotGoToSchool = age < 7 || age > 18;
        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый чтобы водить автомобиль, но недостаточно чтобы пить алкокголь");
        }
        if (canNotGoToSchool) {
            System.out.println("Я думаю ты не ходишь в школу");
            System.out.println();
        }
    }

    private static void task5() {
        System.out.println("Домашнее задание - 3 / Задача 1");
        int age = 20;
        String notGoToschool = "Детский сад";
        String School = " школу";
        String Univercity = " Университет";
        String Work = " работу ";
        boolean canNotGoToSchool = age >= 2 && age <= 6;
        boolean goToSchool = age >= 7 && age <= 18;
        boolean goToUnivercity = age >= 18 && age <= 24;
        boolean goToWork = age > 24;
        if (canNotGoToSchool) {
            System.out.printf(" Если возраст человека равен %d , то ему нужно ходить в %s \n", age, notGoToschool);
        }
        if (goToSchool) {
            System.out.printf(" Если возраст человека равен %d , то ему нужно ходить в %s \n", age, School);
        }
        if (goToUnivercity) {
            System.out.printf(" Если возраст человека равен %d , то ему нужно ходить в %s \n", age, Univercity);
        }
        if (goToWork) {
            System.out.printf(" Если возраст человека равен %d , то ему нужно ходить на %s \n", age, Work);
        }
    }


    private static void task6() {
        System.out.println("Домашнее задание - 3 / Задача 2  ");
        int childAge = 7;
        String Parents = " взрослый есть";
        boolean notAtracs = childAge < 5;
        boolean atracsParents = childAge >= 5 && childAge < 14;
        boolean freeAtracs = childAge > 14;
        boolean parents = Parents == " взрослый есть";
        if (notAtracs) {
            System.out.println(" Ребенку нельзя кататься");
        } else {
            if (parents) {
                System.out.println(" Ребенок может кататься в сопровождениии взрослого");
            } else {
                System.out.println(" Взрослого нет, ребенку кататься нельзя");
            }

            if (freeAtracs)
                System.out.println(" Ребенок может кататься один");

        }
    }

    private static void task7() {
        System.out.println(" Домашнее задание - 3 / Задача 3");
        int one = 230;
        int two = 430;
        int free = 1200;
        boolean ones = one > two && one > free;
        boolean twos = two > one && two > free;
        boolean frees = free > one && free > two;
        if (ones)
            System.out.println(" Greatest number one = " + one);
        if (twos)
            System.out.println(" Greatest number two = " + two);
        if (frees)
            System.out.println("Greatest number free = " + free);
    }
}





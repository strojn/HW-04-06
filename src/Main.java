// file "Main.java"
//Створіть проект з класом Main.java.
//
//        Створити клас, який представляє навчальний клас ClassRoom.
//        Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
//        Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil
//        і перевизначте кожен із методів, залежно від успішності учня.
//        Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися з 4 учнів.
//        Передбачте можливість, що користувач може передати 2 або 3 аргументи.
//        Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
public class Main {
    public static void main(String[] args) {

        ExcelentPupil excelentPupil = new ExcelentPupil();
        GoodPupil goodPupil = new GoodPupil();
        BadPupil badPupil = new BadPupil();

        ClassRoom classRoom4 = new ClassRoom(excelentPupil, goodPupil, badPupil, excelentPupil);
        ClassRoom classRoom3 = new ClassRoom(excelentPupil, goodPupil, badPupil);
        ClassRoom classRoom2 = new ClassRoom(badPupil, badPupil);

        System.out.println("\nКлас із двох наданих учнів.");
//        classRoom2.show();
        classRoom2.showNew();
        System.out.println("\nКлас із трьох наданих учнів.");
//        classRoom3.show();
        classRoom3.showNew();
        System.out.println("\nКлас із чотирьох наданих учнів.");
//        classRoom4.show();
        classRoom4.showNew();
    }
}
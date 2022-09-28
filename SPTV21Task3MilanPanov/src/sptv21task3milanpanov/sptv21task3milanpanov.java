package sptv21task3milanpanov;

import java.util.Scanner;

public class sptv21task3milanpanov{
    static enum month {Января,Февраля, Марта, Апреля, Мая, Июня, Июня, Августа, Сентября, Октября, Ноября, Декабря}
    public static int year2;
    public static void main(String[] args) {
        System.out.println("Имя(Латиницей) -  ");
        Scanner scanner_name = new Scanner(System.in);
        String Name = scanner_name.nextLine();
        System.out.println("Фамили(Латиницей) -  ");
        Scanner scanner_lastname = new Scanner(System.in);
        String Lastname = scanner_lastname.nextLine();
        System.out.println("Ваш ID код - ");
        Scanner scanner_isikukood = new Scanner(System.in);
        String Isikukood = scanner_isikukood.nextLine();
        String year = String.valueOf(Isikukood);
        year =year.substring(1, 3);
        int year1 = new Integer(year);
        if(year1>0 && year1<24){
            year2 = 20;
        } else {
            year2 = 19;
        }
        String mounth1 = String.valueOf(Isikukood);
        mounth1 = mounth1.substring(3,5);
        int mounth2 = new Integer(mounth1);
        String day = String.valueOf(Isikukood);
        day = day.substring(5,7);

        System.out.println(Name + " " + Lastname + " родился " +year2+year+" года "+ day + " " + month.values()[mounth2-1]);
    }
}

public class Main {
    public static void main(String[] args) {
        // homework 10 started
        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " + middleName);

        // task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        // task 3
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName1.replace('ё', 'е'));
    }
}
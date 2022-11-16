public class Main {
    public static void main(String[] args) {
        // homework 10 started
        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // task 2
        String fullName1 = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

        // task 3
        String fullName2 = "Иванов Семён Семёнович";
        String fixedFullName = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fixedFullName);

        // task 4 - is missed

        // task 5
        String fullName3 = "Ivanov Ivan Ivanovich";
        String firstName1;
        String middleName1;
        String lastName1;
        int firstIndexOfBlankSpace = fullName3.indexOf(' ');
        int lastIndexOfBlankSpace = fullName3.lastIndexOf(' ');
        firstName1 = fullName3.substring(firstIndexOfBlankSpace, lastIndexOfBlankSpace).trim();
        middleName1 = fullName3.substring(lastIndexOfBlankSpace).trim();
        lastName1 = fullName3.substring(0, firstIndexOfBlankSpace);
        System.out.println("Employee first name - " + firstName1);
        System.out.println("Employee last name - " + lastName1);
        System.out.println("Employee middle name - " + middleName1);

        // task 6
        String incorrectFullName = "ivanov ivan ivanovich";
        String correctFullName = "";
        correctFullName = correctFullName + incorrectFullName.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < incorrectFullName.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(incorrectFullName.substring(i - 1, i)))
                correctFullName = correctFullName + incorrectFullName.substring(i, i + 1).toUpperCase();
            else
                correctFullName = correctFullName + incorrectFullName.substring(i, i + 1);
        }
        System.out.println(correctFullName);

        // second variant of solving the task
        char[] incorrectFullNameArray = incorrectFullName.toCharArray();
        incorrectFullNameArray[0] = Character.toUpperCase(incorrectFullNameArray[0]);
        for (int i = 0; i < incorrectFullNameArray.length - 1; i++) {
            if (incorrectFullNameArray[i] == ' ') {
                incorrectFullNameArray[i + 1] = Character.toUpperCase(incorrectFullNameArray[i + 1]);
            }
        }
        String correctFullName1 = new String(incorrectFullNameArray);
        System.out.println(correctFullName1);

        // task 7
        String first = "135";
        String second = "246";
        String firstSecond;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            sb.append(first.charAt(i)).append(second.charAt(i));
        }
        firstSecond = sb.toString();
        System.out.println("String data - " + firstSecond);

        // task 8
        String alphabetDuplicatedLetters = "aabccddefgghiijjkk";
        char [] alphabetDuplicatedLettersArray = alphabetDuplicatedLetters.toCharArray();
        for (int i = 0; i < alphabetDuplicatedLettersArray.length; i++) {
            for (int j = i + 1; j < alphabetDuplicatedLettersArray.length; j++) {
                if (alphabetDuplicatedLettersArray[i] == alphabetDuplicatedLettersArray[j]) {
                    System.out.print(alphabetDuplicatedLettersArray[j]);
                }
            }
        }
    }
}
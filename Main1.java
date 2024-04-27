package HW3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void  main (String[] arg ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел (Фамилия Имя Отчество дата_рождения номер_телефона пол):");
        String input = scanner.nextLine();

        try {
            String[] parts = input.split("\s+");
            if (parts.length != 6) {
                throw new DataException("Неверное кол-во данных");
            }

            String firstname = parts[0];
            String secondname = parts[1];
            String patronymic = parts[2];
            String dateOfBirth = parts[3];
            long phoneNumber = Long.parseLong(parts[4]);
            char gender = parts[5].charAt(0);

            if (gender != 'f' && gender != 'm') {
                throw new DataException("Неверное значение пола");
            }

            // Cоздаём нашего Human
            Human human =new Human(firstname, secondname, patronymic, dateOfBirth, phoneNumber, gender);

            // Создание строки для записи в файл
            String line = firstname + " " + secondname + " " + patronymic + " " +
                    dateOfBirth + " " + phoneNumber + " " + gender;

           // побуждаем методы для разбора даты и номера телефона
            human.parseDateOfBirth(dateOfBirth);
            human.parsePhoneNumber(String.valueOf(phoneNumber));

            // Запись в один  файл с одинаковыми  фамилиями
            BufferedWriter writer = new BufferedWriter(new FileWriter(firstname + ".txt", true));
            writer.write(line);
            writer.newLine();
            writer.close();

            System.out.println("Данные введены корректно:");
            System.out.println("ФИО: " + human.getSecondName() + " " + human.getFirstName() + " " + human.getPatronymic());
            System.out.println("Дата рождения: " + human.getDateOfBirth());
            System.out.println("Номер телефона: " + human.getNumberPhone());
            System.out.println("Пол: " + human.getGender());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла:");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат номера телефона:");
            e.printStackTrace();
        } catch (DataException | DateException e) {
            System.err.println("Ошибка в данных:");
            System.err.println(e.getMessage());
        } finally{
            scanner.close();
        }
    }
}


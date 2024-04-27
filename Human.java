package HW3;

import java.util.Scanner;

public class Human {

        private String firstName;
        private String secondName;
        private String patronymic;
        private String dateOfBirth;
        private long numberPhone;
        private char gender;

        Scanner scanner = new Scanner(System.in);

        public Human(String firstName, String secondName, String patronymic, String dateOfBirth, long numberPhone,char  gender){
            this.firstName = firstName;
            this.secondName =secondName;
            this.patronymic = patronymic;
            this.dateOfBirth = dateOfBirth;
            this.numberPhone = numberPhone;
            this.gender = gender;

        }
        public String getFirstName() {
            return firstName;
        }
        public String getSecondName() {
            return secondName;
        }
        public String getPatronymic() {
            return patronymic;
        }
        public String getDateOfBirth(){
            return dateOfBirth;
        }
        public long getNumberPhone() {
            return numberPhone;
        }
        public char getGender() {
            return gender;
        }
        public Scanner getScanner() {
            return scanner;
        }

 // Если формат неверный, побуждаем исключение DateException
    public void parseDateOfBirth(String dateOfBirth) throws DateException {
    }
//  Если формат неверный, побуждаем исключение DataException
    public void parsePhoneNumber(String phoneNumber) throws DataException {
    }
}

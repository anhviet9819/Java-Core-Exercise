package Bai14;

import Bai14.Model.GoodStudent;
import Bai14.Model.NormalStudent;
import Bai14.Model.Student;
import Bai14.Service.ManageCareer;
import Bai14.Validation.FieldValidate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ManageCareer manageCareer = new ManageCareer();
        while (true) {
            System.out.println("Manage Employee Application");
            System.out.println("Enter 1: Add new student");
            System.out.println("Enter 2: Show all student");
            System.out.println("Enter 3: Show all good student");
            System.out.println("Enter 4: Show all normal student");
            System.out.println("Enter 5: Recruit");
            System.out.println("Enter 6: Exit");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    String type = "";
                    do {
                        System.out.println("Choose employee you want to add");
                        System.out.println("Enter 1 to add new good student");
                        System.out.println("Enter 2 to add new normal student");
                        System.out.printf("Enter your choice: ");
                        type = sc.nextLine();
                        if (!type.equals("1") & !type.equals("2")) {
                            System.out.println("You 've entered invalid number. Try again!");
                        }
                    } while (!type.equals("1") & !type.equals("2"));

                    System.out.println("Enter student's info: ");

                    String fullName = "";
                    do{
                        System.out.print("Enter full name(max 50 char, min 10 char, not include numbers): ");
                        fullName = sc.nextLine();
                        if(!FieldValidate.isFullname(fullName)){
                            System.out.println("Invalid full name. Try again!");
                        }
                    }while (!FieldValidate.isFullname(fullName));

                    String birthday = "";
                    do{
                        System.out.print("Enter birthday(dd/mm/yyyy): ");
                        birthday = sc.nextLine();
                        if(!FieldValidate.isBirthday(birthday)){
                            System.out.println("Invalid birthday. Try again!");
                        }
                    }while (!FieldValidate.isBirthday(birthday));

                    String phoneNumber = "";
                    do{
                        System.out.print("Enter phone number(10 digits, no whitespace, starts with 090, 098, 091, 031, 035, 038): ");
                        phoneNumber = sc.nextLine();
                        if(!FieldValidate.isPhoneNumber(phoneNumber)){
                            System.out.println("Invalid phone number. Try again!");
                        }
                    }while (!FieldValidate.isPhoneNumber(phoneNumber));

                    String sex = "";
                    do{
                        System.out.print("Enter sex(man, woman, other): ");
                        sex = sc.nextLine();
                        if(!FieldValidate.isSex(sex)){
                            System.out.println("Invalid sex. Try again!");
                        }
                    }while (!FieldValidate.isSex(sex));

                    System.out.print("Enter university name: ");
                    String universityName = sc.nextLine();

                    System.out.println("************");
                    switch (type) {
                        case "1": {
                            String gpa = "";
                            do{
                                System.out.print("Enter GPA(0 < GPA <= 4): ");
                                gpa = sc.nextLine();
                                if(!FieldValidate.isGPA(gpa)){
                                    System.out.println("Invalid GPA. Try again!");
                                }
                            }while (!FieldValidate.isGPA(gpa));
                            Double gpa1 = Double.valueOf(gpa);
//                            sc.nextLine();

                            System.out.print("Enter best reward: ");
                            String bestReward = sc.nextLine();

                            Student goodStudent = new GoodStudent(fullName, birthday, sex, phoneNumber, universityName, "good", gpa1, bestReward);
                            if (goodStudent instanceof Student) {
                                manageCareer.addStudent(goodStudent);
                            }
                            break;
                        }
                        case "2": {
                            String englishScore = "";
                            do{
                                System.out.print("Enter toeic score(0 < GPA <= 990): ");
                                englishScore = sc.nextLine();
                                if(!FieldValidate.isEnglishScore(englishScore)){
                                    System.out.println("Invalid english score. Try again!");
                                }
                            }while (!FieldValidate.isEnglishScore(englishScore));
                            Integer englishScore1 = Integer.valueOf(englishScore);

                            String entryTestScore = "";
                            do{
                                System.out.print("Enter entry test score(0 < GPA <= 100): ");
                                entryTestScore = sc.nextLine();
                                if(!FieldValidate.isEntryTestScore(entryTestScore)){
                                    System.out.println("Invalid entry test score. Try again!");
                                }
                            }while (!FieldValidate.isEntryTestScore(entryTestScore));
                            Integer entryTestScore1 = Integer.valueOf(englishScore);

                            Student normalStudent = new NormalStudent(fullName, birthday, sex, phoneNumber, universityName, "normal", englishScore1, entryTestScore1);
                            if (normalStudent instanceof Student) {
                                manageCareer.addStudent(normalStudent);
                            }
//                            sc.nextLine();
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    manageCareer.showAllStudent();
                    break;
                }
                case "3": {
                    manageCareer.showAllGoodStudent();
                    break;
                }
                case "4": {
                    manageCareer.showAllNormalStudent();
                    break;
                }
                case "5": {
                    Integer amount = 0;
                    do{
                        System.out.print("Enter amount you want to recruit(11 <= amount <= 15): ");
                        amount = sc.nextInt();
                        if(!FieldValidate.isValidInputAmount(amount)){
                            System.out.println("Invalid amount. Try again!");
                        }
                    }while (!FieldValidate.isValidInputAmount(amount));
                    manageCareer.manageStudentCareer(amount);
                    sc.nextLine();
                    break;
                }
                case "6": {
                    return;
                }
                default:
                    System.out.println("You 've enter invalid choice! Try again!");
                    continue;
            }
        }
    }
}
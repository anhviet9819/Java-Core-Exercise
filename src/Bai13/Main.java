package Bai13;

import Bai12.*;
import Bai13.Exception.BirthDayException;
import Bai13.Exception.EmailException;
import Bai13.Exception.PhoneException;
import Bai13.Model.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

    public static void main(String[] args) throws EmailException {
        Scanner sc = new Scanner(System.in);
        ManageEmployee manageEmployee = new ManageEmployee();
        while (true) {
            System.out.println("Manage Employee Application");
            System.out.println("Enter 1: Add new employee");
            System.out.println("Enter 2: Delete employee");
            System.out.println("Enter 3: Update employee");
            System.out.println("Enter 4: Show all intern");
            System.out.println("Enter 5: Show all fresher");
            System.out.println("Enter 6: Show all experience");
            System.out.println("Enter 7: Exit");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    List<Certificate> certificateList = new ArrayList<>();
                    String type = "";
                    do {
                        System.out.println(Employee.employeeCount);
                        System.out.println("Choose employee you want to add");
                        System.out.println("Enter 1 to add new intern");
                        System.out.println("Enter 2 to add new fresher");
                        System.out.println("Enter 3 to add new experience employee");
                        System.out.printf("Enter your choice: ");
                        type = sc.nextLine();
                        if (!type.equals("1") & !type.equals("2") & !type.equals("3")) {
                            System.out.println("You 've entered invalid number. Try again!");
                        }
                    } while (!type.equals("1") & !type.equals("2") & !type.equals("3"));
                    System.out.println("Enter employee's info: ");
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    Employee employeeeAdd = manageEmployee.getEmployeeList().stream().filter(employee1 -> employee1.getId().equals(id)).findAny().orElse(null);
                    if(employeeeAdd != null){
                        System.out.println("Error. ID is already existed!");
                        break;
                    }
                    System.out.print("Enter full name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter birthday(yyyy-mm-dd): ");
                    String birthday = sc.nextLine();
                    Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
                    Matcher matcherBirthday = pattern.matcher(birthday);
                    if (!matcherBirthday.find()) throw new BirthDayException("Birthday is not valid!");
                    System.out.print("Enter phone number(10 digits and no whitespace): ");
                    String phoneNumber = sc.nextLine();
                    Pattern pattern1 = Pattern.compile("^\\d{10}$");
                    Matcher matcherPhone = pattern1.matcher(phoneNumber);
                    if (!matcherPhone.find()) throw new PhoneException("Phone number is not valid!");
//                    sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    Matcher matcherEmail = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
                    if (!matcherEmail.find()) throw new EmailException("Email is not valid!");
                    System.out.print("How many certificate you want to add? ");
                    int certiCount = sc.nextInt();
                    sc.nextLine();
                    for(int i = 1; i <= certiCount; i++){
                        System.out.println("Enter certificate "+i+" info:");
                        System.out.print("Enter certificate id: ");
                        String certificateId = sc.nextLine();
                        System.out.print("Enter certificate name: ");
                        String certificateName = sc.nextLine();
                        System.out.print("Enter certificate rank: ");
                        String certificateRank = sc.nextLine();
                        System.out.print("Enter certificate date(yyyy-mm-dd): ");
                        String certificateDate = sc.nextLine();
                        Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
                        certificateList.add(certificate);
                    }
                    System.out.println("************");
                    switch (type) {
                        case "1": {
                            System.out.print("Enter major: ");
                            String majors = sc.nextLine();
//                            sc.nextLine();
                            System.out.print("Enter semester: ");
                            Integer semester = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter university name: ");
                            String universityName = sc.nextLine();
                            Employee intern = new Intern(id, fullName, birthday, phoneNumber, email, 2, certificateList,  majors, semester, universityName);
                            if (intern instanceof Employee) {
                                manageEmployee.addEmployee(intern);
                            }
                            break;
                        }
                        case "2": {
                            System.out.print("Enter graduation date: ");
                            String graduationDate = sc.nextLine();
                            System.out.print("Enter graduation rank: ");
                            String graduationRank = sc.nextLine();
                            System.out.print("Enter education: ");
                            String education = sc.nextLine();
                            Employee fresher = new Fresher(id, fullName, birthday, phoneNumber, email, 1, certificateList, graduationDate, graduationRank, education);
                            if (fresher instanceof Employee) {
                                manageEmployee.addEmployee(fresher);
                            }
//                            sc.nextLine();
                            break;
                        }
                        case "3": {
                            System.out.print("Enter experience year: ");
                            Integer expInYear = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter professional skill: ");
                            String proSkill = sc.nextLine();
                            Employee experience = new Experience(id, fullName, birthday, phoneNumber, email, 1, certificateList, expInYear, proSkill);
                            if (experience instanceof Employee) {
                                manageEmployee.addEmployee(experience);
                            }
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter employee's id that you want to delete: ");
                    String id = sc.nextLine();
                    manageEmployee.deleteEmployee(id);
                    break;
                }
                case "3": {
                    List<Certificate> certificateList = new ArrayList<>();
                    System.out.print("Enter employee's id that you want to update: ");
                    String id = sc.nextLine();
                    Employee employeeUpdate = manageEmployee.searchEmployee(id);

                    if (employeeUpdate != null) {
                        System.out.println("Enter employee's info: ");
                        System.out.print("Update full name: ");
                        String fullName = sc.nextLine();
                        System.out.print("Update birthday(yyyy-mm-dd): ");
                        String birthday = sc.nextLine();
                        Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
                        Matcher matcherBirthday = pattern.matcher(birthday);
                        if (!matcherBirthday.find()) throw new BirthDayException("Birthday is not valid!");
                        System.out.print("Update phone number(10 digits and no whitespace): ");
                        String phoneNumber = sc.nextLine();
                        Pattern pattern1 = Pattern.compile("^\\d{10}$");
                        Matcher matcherPhone = pattern1.matcher(phoneNumber);
                        if (!matcherPhone.find()) throw new PhoneException("Phone number is not valid!");
//                    sc.nextLine();
                        System.out.print("Update email: ");
                        String email = sc.nextLine();
                        Matcher matcherEmail = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
                        if (!matcherEmail.find()) throw new EmailException("Email is not valid!");
                        String addCertiChoice = "";
                        do{
                            System.out.println("You want to update or add certificate? Choose 1 to continue and 2 to exit");
                            addCertiChoice = sc.nextLine();
                            if(!addCertiChoice.equals("1") & !addCertiChoice.equals("2")){
                                System.out.println("Invalid choice! Try again.");
                            }
                        }while (!addCertiChoice.equals("1") & !addCertiChoice.equals("2"));
                        if(addCertiChoice.equals("1")){
                            System.out.print("How many certificate you want to add? ");
                            int certiCount = sc.nextInt();
                            sc.nextLine();
                            for(int i = 1; i <= certiCount; i++){
                                System.out.println("Enter certificate "+i+" info:");
                                System.out.print("Enter certificate id: ");
                                String certificateId = sc.nextLine();
                                System.out.print("Enter certificate name: ");
                                String certificateName = sc.nextLine();
                                System.out.print("Enter certificate rank: ");
                                String certificateRank = sc.nextLine();
                                System.out.print("Enter certificate date(yyyy-mm-dd): ");
                                String certificateDate = sc.nextLine();
                                Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
                                certificateList.add(certificate);
                            }
                        }else{
                            certificateList = employeeUpdate.getCertificateList();
                        }
                        if (employeeUpdate.getEmployeeType() == 2) {
                            System.out.print("Enter major: ");
                            String majors = sc.nextLine();
//                            sc.nextLine();
                            System.out.print("Enter semester: ");
                            Integer semester = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter university name: ");
                            String universityName = sc.nextLine();
                            Employee intern = new Intern(id, fullName, birthday, phoneNumber, email, 2,certificateList, majors, semester, universityName);
                            manageEmployee.updateEmployee(id, intern);

                            break;
                        } else if (employeeUpdate.getEmployeeType() == 1) {
                            System.out.print("Enter graduation date: ");
                            String graduationDate = sc.nextLine();
                            System.out.print("Enter graduation rank: ");
                            String graduationRank = sc.nextLine();
                            System.out.print("Enter education: ");
                            String education = sc.nextLine();
                            Employee fresher = new Fresher(id, fullName, birthday, phoneNumber, email, 1,certificateList, graduationDate, graduationRank, education);
                            manageEmployee.updateEmployee(id, fresher);
//                            sc.nextLine();
                            break;
                        } else {
                            System.out.print("Enter experience year: ");
                            Integer expInYear = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter professional skill: ");
                            String proSkill = sc.nextLine();
                            Employee experience = new Experience(id, fullName, birthday, phoneNumber, email, 1,certificateList, expInYear, proSkill);
                            manageEmployee.updateEmployee(id, experience);
                            break;
                        }
                    }
                    else{
                        System.out.println("Not found employee!");
                    }
                    break;
                }
                case "4": {
                    manageEmployee.showAllIntern();
                    break;
                }
                case "5": {
                    manageEmployee.showAllFresher();
                    break;
                }
                case "6": {
                    manageEmployee.showAllExperience();
                    break;
                }
                case "7": {
                    return;
                }
                default:
                    System.out.println("You 've enter invalid choice! Try again!");
                    continue;
            }
        }
    }
}
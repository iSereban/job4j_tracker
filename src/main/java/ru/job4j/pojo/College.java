package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Koval");
        student.setName("Sergey");
        student.setPatronymic("Anatolevich");
        student.setGroup("P4");
        student.setReceiptDate(new Date());
        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic() + " "
                + student.getGroup() + " " + student.getReceiptDate());
    }
}

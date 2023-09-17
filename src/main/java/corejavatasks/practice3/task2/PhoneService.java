package corejavatasks.practice3.task2;


import practice3.task2.Phone;

public class PhoneService {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneMark("Samsung");
        phone.setPhoneModel("A51");
        phone.setPhonePrice(1000);

        System.out.println(phone.getPhoneMark());
        System.out.println(phone.getPhoneModel());
        System.out.println(phone.getPhonePrice() + " AZN");
        System.out.println(phone);

    }
}

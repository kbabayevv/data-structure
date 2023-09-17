package corejavatasks.practice3.task2;



public class Phone {
    private String phoneMark;
    private String phoneModel;
    private Integer phonePrice;

    public String getPhoneMark() {
        return phoneMark;
    }

    public void setPhoneMark(String phoneMark) {
        this.phoneMark = phoneMark;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public Integer getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Integer phonePrice) {
        this.phonePrice = phonePrice;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "phoneMark='" + phoneMark + '\'' +
                ", phoneModel='" + phoneModel + '\'' +
                ", phonePrice=" + phonePrice + " AZN" +
                '}';
    }



}

package org.dimigo.oop;

public class Car3 {
    //필드 선언
    private String company = "현대자동차";
    private String model = "제네시스";
    private String color = "검정색";
    private int speed = 225;
    private int price = 50000000;


    //기본생성자
    public Car3(){
        System.out.println("기본생성자 호출");
    }

    //생성자 추가
    public Car3(String company, String model, String color, int speed, int price){
        this.company = company;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    public Car3(String company, String model, String color, int speed){
        this(company, model, color, speed,0);
    }

    public Car3(String company, String model, String color){
        this(company, model, color, 0);
    }

    //메소드 선언 Getter

    public String getCompany(){
        return company;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getSpeed(){
        return speed;
    }

    public int getPrice(){
        return price;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSpeed(int speed){
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }


}


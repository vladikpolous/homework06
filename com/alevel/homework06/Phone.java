package com.alevel.homework06;

public class Phone {
    int number;
    String model;
    double weight;
    static String receiveCall(String name){
       return "Calling " + name;
    }
    static int getNumber(int number){
        return number;
    }
    public Phone(int number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){}
    public static void main(String[] args) {
        Phone Xiaomi = new Phone();
        Xiaomi.number = 11111;
        Xiaomi.model = "Poco X3";
        Xiaomi.weight = 202.3;

        Phone Samsung = new Phone();
        Samsung.number = 222222;
        Samsung.model = "A51";
        Samsung.weight = 195.3;
        Phone Lenovo = new Phone();
        Lenovo.number = 33333;
        Lenovo.model = "Vibe k5 Note";
        Lenovo.weight = 179.0;
        System.out.println("Number: " + Xiaomi.number + " Model: " + Xiaomi.model + " Weight: " + Xiaomi.weight);
        System.out.println("Number: " + Samsung.number + " Model: " + Samsung.model + " Weight: " + Samsung.weight);
        System.out.println("Number: " + Lenovo.number + " Model: " + Lenovo.model + " Weight: " + Lenovo.weight);
        System.out.println(receiveCall("Vlad"));
        System.out.println(getNumber(Xiaomi.number));
        System.out.println(getNumber(Samsung.number));
        System.out.println(getNumber(Lenovo.number));
        Phone Realme = new Phone(44444, "X6",213.3);
        System.out.println("Number: " + Realme.number + " Model: " + Realme.model + " Weight: " + Realme.weight);
        Phone Sony = new Phone(5555, "Exp777");
        System.out.println("Number: " + Sony.number + " Model: " + Sony.model + " Weight: " + Sony.weight);
        Phone Apple = new Phone();
        System.out.println("Number: " + Apple.number + " Model: " + Apple.model + " Weight: " + Apple.weight);
    }
}

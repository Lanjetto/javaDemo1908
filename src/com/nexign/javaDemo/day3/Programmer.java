package com.nexign.javaDemo.day3;

public class Programmer extends Manager{
    private String language;
    public Programmer(int age, String name, String lastName, String task, String language) {
        super(age, name, lastName, task);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("IM CODING");
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer(25,
                        "Alex",
                        "Mityasov",
                        "JSK-86",
                        "Java");
        programmer.work();
    }
}

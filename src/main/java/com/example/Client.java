package com.example;

class Client {
    private double  finance;
    private String  cpf;
    private boolean special;
    private char    gender;
    
    public Client() {
        System.out.println();
        System.out.println("Generate client");
        System.out.println();
    }

    public Client(double finance, String cpf, char gender) {
        this();
        setFinance(finance);
        setCpf(cpf);
        setGender(gender);
        setSpecial();
    }

    public double getFinance() {
        return finance;
    }

    public void setFinance(double finance) {
        if (finance < 0){System.out.println("Invalid value!");}
        else {this.finance = finance;}
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() < 11 || cpf.length() > 11) {
            System.out.println("Invalid cpf!");
            return;
        } else { this.cpf = cpf; }
        
    }
    public void isSpecial() {
        if (this.special) { System.out.println("You is a special Client");}
        return;
    }
    private void setSpecial() {
        if (this.finance >= 2000) {
            this.special = true;
        } else {this.special = false;}
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f'){ System.out.println("Entrou aqui"); this.gender = gender;} 
        else { System.out.println("Invalid gender!"); }   
    }
}
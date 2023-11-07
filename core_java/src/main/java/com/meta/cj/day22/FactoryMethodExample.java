package com.meta.cj.day22;
interface Currency{
    String getSymbol();
}

class India implements Currency{
    public String getSymbol(){
        return "Rs";
    }

}

class US implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
}

class UK implements Currency{
    @Override
    public String getSymbol() {
        return "3";
    }
}

enum CountryCode{
    IND , US , UK
}
public class FactoryMethodExample {

    public static void main(String[] args) {
        Currency currency = getInstance(CountryCode.IND);
        System.out.println(currency.getSymbol());
    }

    public static Currency getInstance(CountryCode code) {
        switch (code) {
            case UK -> {
                return new UK();
            }
            case US -> {
                return new US();
            }
            case IND -> {
                return new India();
            }
            default -> throw new IllegalArgumentException("Invalid country code");
        }
    }
}

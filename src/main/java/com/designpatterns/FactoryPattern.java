package com.designpatterns;

import lombok.extern.slf4j.Slf4j;

/**
 * Factory pattern is creational type design pattern which provides an interface
 * for creating objects, but allows subclasses to alter the type of objects that
 * will be created.
 * <p>
 * Use when:
 * 1. Client code doesn't know the exact concrete object it will be working with.
 * 2. Client code needs to work with different objects without knowing their
 * specific classes.
 * 3. Client code needs to be decoupled from object creation process.
 */
interface Country {
    String getCountryName();


    String getSymbol();
}


class India implements Country {

    @Override
    public String getCountryName() {
        return "India";
    }


    @Override
    public String getSymbol() {
        return "INR";
    }

}


class Australia implements Country {

    @Override
    public String getCountryName() {
        return "Australia";
    }


    @Override
    public String getSymbol() {
        return "$";
    }

}

@Slf4j
public class FactoryPattern {
    public static Country getCurrencyByCountry(String country) throws Exception {
        if ("India".equalsIgnoreCase(country)) {
            return new India();
        } else if ("Australia".equalsIgnoreCase(country)) {
            return new Australia();
        }
        throw new Exception("Invalid Country");
    }


    public static void main(String[] args) {
        try {
            Country country = FactoryPattern.getCurrencyByCountry("India");
            System.out.println("Country: " + country.getCountryName());
            System.out.println("Currency: " + country.getSymbol());
        } catch (Exception e) {
            log.error("Exception occurred:", e);
        }
    }
}

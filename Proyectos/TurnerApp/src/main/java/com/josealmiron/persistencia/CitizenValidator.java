package com.josealmiron.persistencia;

public class CitizenValidator {

    public static boolean validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        return name.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean validateSurname(String surname) {
        if (surname == null || surname.trim().isEmpty()) {
            return false;
        }
        return surname.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false; 
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
    
    public static boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            return false; 
        }
        return phoneNumber.matches("^\\d{9,}$");
    }

    public static boolean validateCitizen(String name, String surname, String email, String phoneNumber) {
        return validateName(name) && validateSurname(surname) && validateEmail(email) && validatePhoneNumber(phoneNumber);
    }
}

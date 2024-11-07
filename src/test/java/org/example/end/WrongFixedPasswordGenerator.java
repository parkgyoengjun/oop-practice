package org.example.end;

import org.example.end.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}

package org.example.end;

import org.example.end.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}

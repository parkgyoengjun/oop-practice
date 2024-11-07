package org.example.end;

public class User {

    private String password;

    public void initPasssword(PasswordGenerator passwordGenerator) {
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();

        /**
         *  비밀번호는 최소 8자이상, 12자이하여야한다.
         */
        if (password.length() >=8 && password.length() <=12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

}

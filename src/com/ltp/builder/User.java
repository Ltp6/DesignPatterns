
package com.ltp.builder;


/**
 * @author Ltp
 */
public class User {

    private String username;

    private String password;


    User(final String username, final String password) {
        this.username = username;
        this.password = password;

    }

    public static Builder builder() {
        return new Builder();
    }


    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }


    public void setUsername(final String username) {
        this.username = username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UmsAdminParam{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static final class Builder {

        private String username;

        private String password;

        Builder() {

        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this.username, this.password);
        }

    }
}

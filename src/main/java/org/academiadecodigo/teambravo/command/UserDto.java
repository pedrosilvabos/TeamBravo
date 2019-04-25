package org.academiadecodigo.teambravo.command;

import javax.validation.constraints.*;

public class UserDto {

    private Integer customerId;

    @NotNull(message = "Please insert your first name")
    @NotBlank(message = "Please insert your first name")
    @Size(min = 2, max = 70)
    private String firstName;

    @NotNull(message = "Please insert your last name")
    @NotBlank(message = "Please insert your last name")
    @Size(min = 2, max = 70)
    private String lastName;

    @NotNull(message = "Please insert your email")
    @NotBlank(message = "Please insert your email")
    @Size(min = 2, max = 70)
    @Email
    private String email;

    @NotNull(message = "Please insert your phone number")
    @NotBlank(message = "Please insert your phone number")
    @Pattern(regexp = "^\\+?[0-9]*$", message = "Please insert a valid phone number")
    @Size(min = 9, max = 16)
    private String phone;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "UserDto{" +
                "customerId=" + customerId +
                ", firstName=" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}

package org.academiadecodigo.teambravo.command;

import org.academiadecodigo.teambravo.persistence.model.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class UserDto {

    private Integer userId;

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

    @NotNull(message = "Please insert your citizen number")
    @NotBlank(message = "Please insert your citizen number")
    @Size(min = 1, max = 10)
    private Integer citizenNumber;


    @NotNull(message = "Please insert your birth date")
    @NotBlank(message = "Please insert your birth date")
    @Size(min = 1, max = 10)
    private Date dateOfBirth;


    @NotNull(message = "Please insert your gender")
    @NotBlank(message = "Please insert your gender")
    @Size(min = 1, max = 10)
    private Gender gender;


    public Integer getCustomerId() {
        return userId;
    }

    public void setCustomerId(Integer customerId) {
        this.userId = customerId;
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
                "customerId=" + userId +
                ", firstName=" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}

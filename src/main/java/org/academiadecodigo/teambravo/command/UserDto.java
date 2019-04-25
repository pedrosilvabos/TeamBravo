package org.academiadecodigo.teambravo.command;

import org.academiadecodigo.teambravo.persistence.model.Gender;
import org.academiadecodigo.teambravo.persistence.model.Location;
import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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


    @NotNull(message = "Please insert your location")
    @NotBlank(message = "Please insert your location")
    @Size(min = 2, max = 70)
    private Location location;

    private Integer creditHours;


    private Integer rating;


    private Map<Skill, Integer> userSkills = new HashMap<>();


    public Integer getCreditHours() {
        return creditHours;
    }

    public Map<Skill, Integer> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(Map<Skill, Integer> userSkills) {
        this.userSkills = userSkills;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }



    public Integer getUserId() {
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

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCitizenNumber() {
        return citizenNumber;
    }

    public void setCitizenNumber(Integer citizenNumber) {
        this.citizenNumber = citizenNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", citizenNumber=" + citizenNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

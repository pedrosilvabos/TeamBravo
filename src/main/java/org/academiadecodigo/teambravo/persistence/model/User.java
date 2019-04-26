package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Entity
@Table(name = "user")
public class User extends AbstractModel {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Integer citizenNumber;

    private Integer rating;

    @OneToOne
    private Location location;

    private Date dateOfBirth;

    private Gender gender;

    private Integer creditHours;

    @ElementCollection
    @CollectionTable(name = "users_skills")
    @MapKeyColumn(name = "skill_name")
    @JoinColumn(name = "user_id")
    private Map<Skill, Integer> userSkills = new HashMap<>();



    public List<Skill> getUserSkills() {
        return userSkills;
    }


    public void setUserSkills(Map<Skill, Integer> userSkills) {
        this.userSkills = userSkills;
    }

    public Integer getCitizenNumber() {
        return citizenNumber;
    }

    public void setCitizenNumber(Integer citizenNumber) {
        this.citizenNumber = citizenNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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

    public Integer getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
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

    public void addSkill(Skill skill, Integer rating) {
        skill.addUser(this);
        userSkills.put(skill, rating);
    }


    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {

        Collection<Integer> list = userSkills.values();

        int sum = 0;
        int count = 0;
        for (Integer inte : list
        ) {
            count++;
            sum += inte;
        }

        this.rating = sum / count;

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", citizenNumber=" + citizenNumber +
                ", rating=" + rating +
                ", location=" + location +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", creditHours=" + creditHours +
                ", userSkills=" + userSkills +
                '}';
    }
}


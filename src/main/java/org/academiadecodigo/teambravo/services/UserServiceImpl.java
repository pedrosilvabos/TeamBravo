package org.academiadecodigo.teambravo.services;

import org.academiadecodigo.teambravo.persistence.model.Gender;
import org.academiadecodigo.teambravo.persistence.model.Location;
import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.academiadecodigo.teambravo.persistence.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    public User user1 = new User();
    public User user2 = new User();
    public User user3 = new User();
    public User user4 = new User();
    public User user5 = new User();
    private Skill skill1 = new Skill();
    private Skill skill2 = new Skill();
    private Skill skill3 = new Skill();
    private Skill skill4 = new Skill();
    private Skill skill5 = new Skill();
    private Location location = new Location();
    private Location location1 = new Location();


    public UserServiceImpl() {
        this.user1.setId(1);
        this.user1.setFirstName("Pedro");
        this.user1.setLastName("Silva");
        this.user1.setPhone("919615391");
        this.user1.setGender(Gender.MALE);
        this.user1.setEmail("pedrinho@pedrinho.com");
        this.user1.setCreditHours(5);
        this.user1.setRating(8);
        this.user1.setCitizenNumber(283748484);

        this.user1.setId(2);
        this.user2.setFirstName("Vasco");
        this.user2.setLastName("Rodrigues");
        this.user2.setPhone("919615391");
        this.user2.setGender(Gender.MALE);
        this.user2.setEmail("vasco@vasco.com");
        this.user2.setCreditHours(7);
        this.user2.setRating(9);
        this.user2.setCitizenNumber(289746444);

        this.user1.setId(3);
        this.user3.setFirstName("Ana");
        this.user3.setLastName("Fonseca");
        this.user3.setPhone("969758492");
        this.user3.setGender(Gender.FEMALE);
        this.user3.setEmail("ana@fonseca.com");
        this.user3.setCreditHours(5);
        this.user3.setRating(8);
        this.user3.setCitizenNumber(229496594);

        this.user1.setId(4);
        this.user4.setFirstName("Ruben");
        this.user4.setLastName("Armas");
        this.user4.setPhone("911645461");
        this.user4.setGender(Gender.MALE);
        this.user4.setEmail("ruben@armas.com");
        this.user4.setCreditHours(4);
        this.user4.setRating(6);
        this.user4.setCitizenNumber(184448934);

        this.user1.setId(5);
        this.user5.setFirstName("Pedro");
        this.user5.setLastName("Silveira");
        this.user5.setPhone("919185442");
        this.user5.setGender(Gender.MALE);
        this.user5.setEmail("pedro@silveira.com");
        this.user5.setCreditHours(4);
        this.user5.setRating(7);
        this.user5.setCitizenNumber(222246494);

        this.skill1.setId(1);
        this.skill1.setName("Programmer");
        this.skill1.setUser(user1);

        this.skill2.setId(2);
        this.skill2.setName("Painter");
        this.skill2.setUser(user2);

        this.skill3.setId(3);
        this.skill3.setName("Gardner");
        this.skill3.setUser(user3);

        this.skill4.setId(4);
        this.skill4.setName("Paint");
        this.skill4.setUser(user4);

        this.skill5.setId(5);
        this.skill5.setName("Mason");
        this.skill5.setUser(user5);

        this.location.setName("Angra");
        this.location.setId(1);
        this.location1.setName("Praia");
        this.location1.setId(2);

    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public void deleteSkill(Integer id, Integer skId) {


    }


    @Override
    public void addSkill(Integer id, Integer skId) {


    }


    @Override
    public List<Location> getAllLocations() {
        List<Location> locations = new LinkedList<>();
        locations.add(location);
        locations.add(location1);
        return locations;
    }

    @Override
    public List<User> getUsersBySkill(Skill skill) {
        List<User> list = new LinkedList<>();
        List<User> list1 = new LinkedList<>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);


        for (User user : list
        ) {
            if (user.getSkills().contains(skill)) {
                list1.add(user);
            }


        }


        return list1;
    }

    @Override
    public Skill getSkillById(Integer id) {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public List<Skill> getUserSkills(Integer id) {
        return null;
    }

    @Override
    public List<Skill> getAllSkills() {
        List<Skill> skills = new LinkedList<>();
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        skills.add(skill4);
        skills.add(skill5);
        return skills;
    }


    @Override
    public Integer getUserRating(Integer id) {
        return null;
    }
}

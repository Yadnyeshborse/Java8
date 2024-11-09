package Map;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping_to_DTO {
    public static void main(String[] args) {
        List<User> us=new ArrayList<User>();
        us.add(new User(1,"Raj","Patil","raj@hmail.com"));
        us.add(new User(2,"Tau","Borse","tau@gmail.com"));
        us.add(new User(3,"Rahul","Shinde","rahul@gmail.com"));
        us.add(new User(4,"Manish","Kaval","man@gmail.com"));

        List<UserDTO> userDTOS=new ArrayList<UserDTO>();
        for (User i:us){
            userDTOS.add(new UserDTO(i.getId(),i.getName(),i.getAddress()));
        }

        for (UserDTO e:userDTOS){
            System.out.println(e);
        }
        //by lambda expresstion
        System.out.println("By Lambda expression Directly Printing");
        us.stream()
                .map(user -> new UserDTO(user.getId(), user.getName(), user.getAddress()))  // Mapping User to UserDTO
                .forEach(System.out::println);

        //storing and than printing
        List<UserDTO> kl=us.stream().map(user -> new UserDTO(user.getId(),user.getName(),user.getAddress())).collect(Collectors.toList());
        for (UserDTO g:kl){
            System.out.println("Storing and printing "+g);
        }


    }
}

class UserDTO{
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserDTO(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public UserDTO() {
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}

class User{
    private int id;
    private String name;
    private String password;
    private String address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int id, String name, String password, String address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User() {
    }



}

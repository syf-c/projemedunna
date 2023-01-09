package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Us02ApiUserPojo {
    /*
    {
    "id": 338735,
    "login": "cristopher.mills",
    "firstName": "Lavette",
    "lastName": "Howell",
    "ssn": "311-83-6975",
    "email": "elliott.baumbach@hotmail.com",

}
     */
    private Integer id;
    private String login;
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;

    public Us02ApiUserPojo() {
    }

    public Us02ApiUserPojo(Integer id, String login, String firstName, String lastName, String ssn, String email) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Us02ApiUserPojo{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
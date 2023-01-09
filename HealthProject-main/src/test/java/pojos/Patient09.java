package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient09 {

    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private User user;
    private Appointments appointments;
    private InPatients[] inPatients;
    private Country country;
    private State cstate;

    public Patient09() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", appointments=" + appointments +
                ", inPatients=" + Arrays.toString(inPatients) +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAppointments(Appointments appointments) {
        this.appointments = appointments;
    }

    public void setInPatients(InPatients[] inPatients) {
        this.inPatients = inPatients;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCstate(State cstate) {
        this.cstate = cstate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public Appointments getAppointments() {
        return appointments;
    }

    public InPatients[] getInPatients() {
        return inPatients;
    }

    public Country getCountry() {
        return country;
    }

    public State getCstate() {
        return cstate;
    }

    public Patient09(String createdBy, String createdDate, int id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String email, String description, User user, Appointments appointments, InPatients[] inPatients, Country country, State cstate) {

        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.user = user;
        this.appointments = appointments;
        this.inPatients = inPatients;
        this.country = country;
        this.cstate = cstate;
    }





}
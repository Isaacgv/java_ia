package fr.epita.titanic.datamodel;

public class Passenger {

    private Integer passengerId;
    private Integer pClass;
    private String name;
    private String sex;
    private Integer sibSp;
    private Integer parch;
    private Double age;
    private String ticket;
    private Double fare;
    private String cabin;
    private String Embarked;

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public void setpClass(int pClass) {
        this.pClass = pClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setpClass(Integer pClass) {
        this.pClass = pClass;
    }

    public void setSibSp(Integer sibSp) {
        this.sibSp = sibSp;
    }

    public void setParch(Integer parch) {
        this.parch = parch;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public void setEmbarked(String embarked) {
        Embarked = embarked;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public Integer getpClass() {
        return pClass;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getSibSp() {
        return sibSp;
    }

    public Integer getParch() {
        return parch;
    }

    public Double getAge() {
        return age;
    }

    public String getTicket() {
        return ticket;
    }

    public Double getFare() {
        return fare;
    }

    public String getCabin() {
        return cabin;
    }

    public String getEmbarked() {
        return Embarked;
    }
}

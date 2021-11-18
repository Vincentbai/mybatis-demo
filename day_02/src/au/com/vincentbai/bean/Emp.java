package au.com.vincentbai.bean;

public class Emp {
    private Integer eid;

    private String ename;

    private Integer age;

    private String gender;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Emp() {
    }

    public Emp(Integer eid, String ename, Integer age, String gender) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
        this.gender = gender;
    }
}

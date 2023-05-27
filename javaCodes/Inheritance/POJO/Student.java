package Inheritance.POJO;

public class Student {

    //INSTANCE FIELDS
    private String id;
    private String name;
    private String dateOfBirth;
    private String subjectClass;

    //CONSTRUCTOR
    public Student(String id, String name, String dateOfBirth, String subjectClass){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.subjectClass = subjectClass;
    }

    //OVERIDDEN METHOD
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", subjectClass='" + subjectClass + '\'' +
                '}';
    }

    //GETTER
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getSubjectClass(){
        return subjectClass;
    }

    //SETTER
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setSubjectClass(String subjectClass) {
        this.subjectClass = subjectClass;
    }

}

package Inheritance.JavaLangObject;

public class Main extends java.lang.Object {
    public static void main(String[] args) {

        Student jerome = new Student("Jerome", 22);
        System.out.println(jerome);

        ParentName bilourfe = new ParentName("Chris Jhon",20,"Bilourfe");
        System.out.println(bilourfe);
    }
}
class Student {
      private String name;
      private int age;

      Student(String name, int age){
          this.name = name;
          this.age = age;
      }

      @Override
      public String toString(){
          return name+ " age is " +age;
      }
}

class ParentName extends Student {
    private String parentName;

    ParentName(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString(){
        return parentName+ "'s child, " +super.toString();
    }


}
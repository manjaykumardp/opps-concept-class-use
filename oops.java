package oops;

//import javax.security.auth.Subject;

public class oops {
    public static void main(String[] args) {
        //System.out.println("Person Name and Age");

        {  //college name
            college c = new college();
            c.collegeName= " I.T.S engineering college";
            //All details about person1
            {
                person p1 = new person();
                //Name of person
                p1.name = "manjay kumar";
                //Age of person
                p1.age = 19;
                //qualification of person1
                p1.qualification = "B.tech" + " computer science";
                subject s1 = new subject();
                s1.subject= "Data Structure"+" java";
                //
                System.out.println("Name -" + " " + p1.name + " \n" + "Age -" + " " + p1.age  +"\n"+"College Name :-"+c.collegeName+"\n"+ "Course - "+p1.qualification);

                System.out.println("subject :-" + " " + s1.subject + " ");
            }

            person p2 = new person();
            //Name of person
            p2.name = "praveen kumar singh";
            //Age of person
            p2.age = 21;
            //qualification of person2
            p2.qualification="B.tech"+" Civil engineering";

            subject s2= new subject();

            s2.subject="Transportation"+" "+"Design of concrete";
            System.out.println("Name -" + " " + p2.name + " \n" + "Age -" + p2.age+"\n"+"College Name :-"+" "+c.collegeName +"\n"+"Course -"+p2.qualification+"\n"+"subject :-" + " " + s2.subject + " ");
            //System.out.println("subject :-" + " " + s2.subject + " ");
        }
    }
    }

    class person{
    String name;
    int age;
    String qualification;

    }
 class subject{
    String subject;

 }
 class college{
    String collegeName;
 }

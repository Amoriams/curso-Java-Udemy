package entities;

public class Student {

    public String name;
    public int note1;
    public int note2;


    public String finalResults(){

        int media = (note1 + note2) / 2;

        if (media >= 6){
                 return "congratulations, " + name +  " you are approved! your final result is: " + media;
             }else {

                 return "Sorry, " +  name + " you failed, your result is: " + media + ", try again next time!";
             }

         }
    }


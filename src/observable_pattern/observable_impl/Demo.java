package observable_pattern.observable_impl;

public class Demo {


    //Note Observable is deprecated today due to design flaws

    public static void main(String[] args) {
        //Observable Created
        SportData sportData = new SportData();

        //Observer Created and Registered with Observable via constructor injection
        Espn espn = new Espn(sportData);

        //Setting score will notifiy users and call the observer's (espn) updates method. Which then displays scores in the console.
        sportData.setScore(2,7);

        sportData.setScore(4, 10);

    }




}

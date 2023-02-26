package BehaviourPattern.Command;

//https://www.geeksforgeeks.org/command-pattern/


public class Main {

    public static void main(String[] args){

        Light light = new Light();

        Remote remote = null;
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote = new Remote(lightOnCommand);
        remote.buttonPressed();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote = new Remote(lightOffCommand);
        remote.buttonPressed();

    }

}

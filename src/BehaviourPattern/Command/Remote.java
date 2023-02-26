package BehaviourPattern.Command;

public class Remote {

    private Command command;

    Remote(Command command){
        this.command = command;
    }

    public void buttonPressed(){
        command.execute();
    }
}

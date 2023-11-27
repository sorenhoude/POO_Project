/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

/**
 *
 * @author grand
 */
public class Command {
    
    GoAction go = new GoAction();
    HelpAction help = new HelpAction();
    QuitAction quit = new QuitAction();
    LookAction look = new LookAction();
    TakeAction take = new TakeAction();
    UseAction use = new UseAction();
    AttackAction attack = new AttackAction();
    BuyAction buy = new BuyAction();
    ReadAction read = new ReadAction();
    TalkAction talk = new TalkAction();
    SleepAction sleep = new SleepAction();
    SaveAction save = new SaveAction();
    
    public void doCommand(String verb, String noun1, String noun2){
        switch(verb){
            case "go":
                go.doAction(noun1);
                //go_cmd(noun1);
                break;
            case "help":
                help.doAction();
                break;
            case "quit":
                quit.doAction();
                break;
            case "look":
                look.doAction(noun1);;
                break;
            case "take":
                take.doAction(noun1);
                break;
            case "use":
                if(!noun2.equals("")){
                    use.doAction(noun1, noun2);
                } else{
                    use.doAction(noun1);
                }
                break;
            case "attack":
                attack.doAction(noun1);
                break;
            case "buy":
                buy.doAction(noun1);
                break;
            case "read":
                read.doAction(noun1);;
                break;
            case "talk":
                talk.doAction(noun1);
                break;
            case "sleep":
                sleep.doAction();
                break;
            case "save":
                save.doAction();
                break;
        }
    }
    
    /*
    List<String> commands = new ArrayList<>(Arrays.asList(
            "go", "help", "quit", "look", "take", "use",
            "attack", "buy", "read", "talk", "sleep", "save"));
    
     List<String> objects = new ArrayList<>(Arrays.asList(
            "sword", "mirror"));
     
     List<String> second_object = new ArrayList<>(Arrays.asList(
            "arrow"));
    */
     
    
}

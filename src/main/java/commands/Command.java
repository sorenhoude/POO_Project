/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import main.Manor;

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
    DropAction drop = new DropAction();
    UnlockAction unlock = new UnlockAction();
    
    public void doCommand(Manor manor, String verb, String noun1, String noun2){
        switch(verb){
            case "go":
                go.doAction(manor, noun1);
                break;
            case "help":
                help.doAction();
                break;
            case "quit":
                quit.doAction();
                break;
            case "look":
                if(!noun2.equals("")){
                    look.doAction(manor, noun1, noun2);
                } else if(noun1.equals("")){
                    look.doAction(manor);
                } else{
                    look.doAction(manor, noun1);
                }
                break;
            case "take":
                if(!noun2.equals("")){
                    take.doAction(manor, noun1, noun2);
                } else{
                    take.doAction(manor, noun1);
                }
                break;
            case "use":
                if(!noun2.equals("")){
                    use.doAction(manor, noun1, noun2);
                } else{
                    use.doAction(manor, noun1);
                }
                break;
            case "attack":
                attack.doAction(manor, noun1);
                break;
            case "buy":
                buy.doAction(manor, noun1);
                break;
            case "read":
                read.doAction(manor, noun1);;
                break;
            case "talk":
                talk.doAction(manor, noun1);
                break;
            case "sleep":
                sleep.doAction(manor);
                break;
            case "drop":
                drop.doAction(manor, noun1);
                break;
            case "unlock":
                unlock.doAction(manor, noun1, noun2);
                break;
        }
    }
}

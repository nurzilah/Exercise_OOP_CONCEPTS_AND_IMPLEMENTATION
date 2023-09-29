/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class RedHeadDuck  extends Duck {
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    public void display(){
        System.out.println("I'm a real Headed duck");
    }
    
}
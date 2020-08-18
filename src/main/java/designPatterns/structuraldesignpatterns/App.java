package designPatterns.structuraldesignpatterns;

import java.util.*;

import adapter.Employee;
import adapter.EmployeeClient;
import bridge.BlueColor;
import bridge.Color;
import composite.Menu;
import composite.MenuItem;
import decorator.DressingDecorator;
import decorator.*;
import bridge.*;
import flyweight.*;
import proxy.*;

/**
 * Hello world!
 *
 */ 
public class App 
{
    public static void main( String[] args )
    {
//    	Color blue = new BlueColor();
//    	Color red = new RedColor();
//    	
//    	Shape circle = new Circle(red);
//    	circle.applyColor();
//    	
//    	circle = new Circle(blue);
//    	circle.applyColor();
    	//---------------------------------------------------------------
//    	Menu mainMenu = new Menu("Main","/main");
//    	MenuItem safetyMenuItem = new MenuItem("Safety","/safety");
//    	
//    	mainMenu.add(safetyMenuItem);
//    	
//    	Menu claimsSubMenu = new Menu("Claims","/claims");
//    	
//    	mainMenu.add(claimsSubMenu);
//    	
//    	MenuItem personalClaimsMenu = new MenuItem("Personal Claim","/personalClaims");
//    	claimsSubMenu.add(personalClaimsMenu);
    	
//    	System.out.println(mainMenu.toString());
    	
    	//----------------------------------------------------
    	
//    	Sandwich sw = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
//    	
//    	System.out.println(sw.make());
//    	
    	//------------------------------------------------------
    	
//    	 InventorySystem ims = new InventorySystem();
//    	 
//    	 ims.takeOrder("pita", 111);
//    	 ims.takeOrder("lapte", 511);
//    	 ims.takeOrder("oua", 116);
//    	 ims.takeOrder("slanina", 112);
//    	 ims.takeOrder("porodici", 131);
//    	 ims.takeOrder("porodici", 132);
//    	 ims.takeOrder("porodici", 133);
//    	 
//    	 ims.process();
//    	 
//    	 System.out.println(ims.report());
    	
    	//-----------------------------------------------------
    	
    	TwitterServiceInterface service = (TwitterServiceInterface)SecurityProxy.newInstance(new TwitterServiceStub());
    	
    	System.out.println(service.getTimeline("qwerq231"));
    	
    	
    }
}

package composite;

import java.util.*;

public abstract class MenuComponent {
	
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
	public abstract String toString();
	
	public String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
		
	}
	
}

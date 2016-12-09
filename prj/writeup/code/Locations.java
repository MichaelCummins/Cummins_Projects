import java.util.ArrayList;

public class Locations {
  // Has attributes for name, description of the location, an item,
  // checks whether the items been taken, 
  // and checks if locations has been visited
  String name, description;
  ArrayList<Item> item;
  Boolean itemTaken, visited;
	
  public Locale (String name, String description) {
    this.name = name;
    this.description = description;
    this.item = new ArrayList<Item>();
    this.itemTaken = false;
    this.visited = false;
  }
  @Override
  public String toString() {
    return "Location: the " + this.name + ". " + this.description;
  }
}
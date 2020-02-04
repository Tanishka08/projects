public class Elevator{
  private boolean doorOpen=false;
  private int currentFloor=1;
  public static final int MAX_FLOORS=10;
  public static final int MIN_FLOORS=1;
  
  public void openDoor(){
  System.out.println("Opening door");
  doorOpen=true;
  System.out.println("Door is open");
  
  }
  public void closeDoor(){
  System.out.println("Closing door");
  doorOpen=false;
  System.out.println("Door is closed");
  
  }
  public void goUp(){
  
  if(currentFloor<MAX_FLOORS && (doorOpen==false)){
    System.out.println("Going up one floor");
  currentFloor++;
  }
  System.out.println("Floor: "+currentFloor);
  }
  public void goDown(){
  
  if(currentFloor>MIN_FLOORS && (doorOpen==false)){
    System.out.println("Going down one floor");
  currentFloor--;
  }
  System.out.println("Floor: "+currentFloor);
  }
  
  public int getFloor(){
   return currentFloor; 
  }
  public boolean checkDoorStatus(){
  return doorOpen;
  
  }
}

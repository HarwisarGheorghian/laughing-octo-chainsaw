import javafx.scene.paint.Color;

public class Room{
    private Color paintColor;
    private int temp;

    public Room(Color paintColor, int temp){
        this.paintColor = paintColor;
        this.temp = temp;
    }

    public Room(){
        
    }

    public Color getPaintColor(){
        return this.paintColor;
    }

    public void setPaintColor(Color paintColor){
        this.paintColor = paintColor;
    }

    public int getTemp(){
        return this.temp;
    }

    public void setTemp(int temp){
        this.temp = temp;
    }

    public void changeToRoomTemp(){
        System.out.println("I'm changing the temperature of the room to 69 degrees");
        setTemp(69);
    }
}
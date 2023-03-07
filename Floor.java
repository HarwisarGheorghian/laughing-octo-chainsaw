import javafx.scene.paint.Color;

public class Floor extends Room{
    private boolean hasClutter;

    public Floor(Color paintColor, int temp, boolean hasClutter){
        super(paintColor, temp);
        this.hasClutter = hasClutter;
    }

    public Floor(){
        
    }

    public boolean hasClutter(){
        return this.hasClutter;
    }

    public void setHasClutter(boolean hasClutter){
        this.hasClutter = hasClutter;
    }

    public void addWater(){
        System.out.println("There's now tons of water on the floor");
    }
}

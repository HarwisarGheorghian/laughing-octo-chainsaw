import javafx.scene.paint.Color;

public class Ceiling extends Room{
    public boolean leaky;

    public Ceiling(Color paintColor, int temp, boolean leaky){
        super(paintColor, temp);
        this.leaky = leaky;
    }

    public boolean getLeaky(){
        return this.leaky;
    }

    public void setLeaky(boolean leak){
        this.leaky = leak;
    }

    public void measureLeaky(){
        if(leaky){
            System.out.println("The room is very leaky");
        } else {
            System.out.println("The room isn't very leaky");
        }
    }

    public void dropDryWall(){
        System.out.println("A piece of dry wall fell off the ceiling");
    }
}

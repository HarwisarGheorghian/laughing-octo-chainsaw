import javafx.scene.paint.Color;

public class Wall extends Room{
    private int piecesOfDryWall;
    public Wall(Color paintColor, int temp, int piecesOfDryWall){
        super(paintColor, temp);
        this.piecesOfDryWall = piecesOfDryWall;
    }

    public Wall(){
        
    }
    public void setPiecesOfDryWall(int piecesOfDryWall){
        this.piecesOfDryWall = piecesOfDryWall;
    }

    public int getPiecesOfDryWall(){
        return this.piecesOfDryWall;
    }

    public void removeWall(){
        System.out.println("You kicked the wall and it collasped");
        setPiecesOfDryWall(getPiecesOfDryWall() + 4234);
    }

}

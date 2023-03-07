import javafx.scene.paint.Color;

public class Picture extends Wall{
    private int beautyScale;
    private Color pic;

    public Picture(int beautyScale, Color pic){
        super();
        this.beautyScale = beautyScale;
        this.pic = pic;
    }
    public void judgeBeauty(){
        if(beautyScale >= 5){
            System.out.println("its very pretty");
        } else {
            System.out.println("its mid");
        }
    }

    public int getBeauty(){
        return beautyScale;
    }

    public void removePic(){
        System.out.println("WOOSH");
        System.out.println("The picture disappeared out of thin air");
    }
    public Color getPic(){
        return pic;
    }

    public void setBeauty(int beauty){
        this.beautyScale = beauty;
    }

    public void setPic(Color pic){
        this.pic = pic;
    }
}

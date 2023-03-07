public class Toy extends Floor{
    private int painScale;

    public Toy(int painScale){
        super();
        this.painScale = painScale;
    }

    public int getPainScale(){
        return this.painScale;
    }

    public void setPainScale(int painScale){
        this.painScale = painScale;
    }

    public void removeToy(){
        System.out.println("AHHHHHH");
        System.out.println("The toy disappeared out of thin air");
    }

    public void playSound(){
        System.out.println("KLOMP");
    }

    
}

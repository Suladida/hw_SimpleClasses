public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int takeDrink(){
        volume = volume - 10;
        return volume;
    }

    public int Empty(){
        volume = 0;
        return volume;
    }

    public int Fill(){
        volume = 100;
        return volume;
    }

}

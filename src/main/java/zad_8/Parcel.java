package zad_8;

public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    @Override
    public boolean validate(Parcel input) {
        int xyzLength = input.getxLength() + input.getyLength() + input.getzLength();

        if(input.getWeight() >= 30){
            isExpress = false;
        } else {
            isExpress = true;
        }

        boolean isCorrect = xyzLength <= 300 && input.getzLength() >= 30 && input.getyLength() >= 30 && input.getxLength() >= 30 && isExpress;
        if(isCorrect) {
            System.out.println("parametry są OK");
        } else {
            System.out.println("popraw");
        }
        return isCorrect;
    }
}

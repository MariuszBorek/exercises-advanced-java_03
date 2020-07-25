package zad_8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate(Parcel input) {
        int xyzLength = input.getXLength() + input.getYLength() + input.getZLength();

        if(input.getWeight() >= 30){
            isExpress = false;
        } else {
            isExpress = true;
        }

        boolean isCorrect = xyzLength <= 300 && input.getZLength() >= 30 && input.getYLength() >= 30 && input.getXLength() >= 30 && isExpress;

        if(isCorrect) {
            System.out.println("parametry są OK");
        } else {
            System.out.println("popraw");
        }
        return isCorrect;
    }
}

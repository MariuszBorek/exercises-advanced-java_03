package zajecia.zad_8;

public class App {
    public static void main(String[] args) {

        Parcel parcel = new Parcel(99, 100, 99, 24);
        parcel.validate(parcel);

        Parcel parcel2 = new Parcel(300, 100, 99, 24);
        parcel.validate(parcel2);

        Parcel parcel3 = new Parcel(20, 100, 99, 24);
        parcel.validate(parcel3);

        Parcel parcel4 = new Parcel(20, 100, 99, 40);
        parcel.validate(parcel4);


    }
}

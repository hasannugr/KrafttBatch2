package Day_45_OOP_ReviewCont.abstraction;

public class Mod2 extends D3Print {

    public Mod2(String model, String fileFormat) {
        super(model, fileFormat);
        System.out.println(fileFormatCheck());
        if (fileFormat.equals("OBJ")){
            polish();
        }else {
            fileFormatCheck();
        }
        System.out.println(counter());
    }

    @Override
    public void extrude() {
        System.out.println("printing a " + model + " with " + fileFormat + "fileformat.");


    }

    @Override
    public void polish() {
        System.out.println("printing " + model + " is polishing.");

    }
}

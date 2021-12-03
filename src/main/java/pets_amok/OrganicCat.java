package pets_amok;

public class OrganicCat extends OrganicPet implements LitterBoxable {


    private int litterBoxTick = 0;

    public OrganicCat(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
    }



    @Override
    public void tick() {

    }

    @Override
    public boolean isLitterBoxFull(int litterBoxTick) {
        int litterBoxVar = litterBoxTick;
        if (litterBoxVar >= 3){
            return true;
        }
        return false;
    }

//    public java.lang.String getName() {
//        return petName;
//    }
//
//    public int getHealth(){
//        return petHealth;
//    }
//
//    public void feed(){
//        petHunger++;
//    }
//
//    public int getHunger(){
//        return petHunger;
//    }
//
//    public int getThirst(){
//        return petThirst;
//    }
}


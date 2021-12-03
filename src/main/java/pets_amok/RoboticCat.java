package pets_amok;

public class RoboticCat extends RoboticPet implements LitterBoxable{


    private int rustAttackTick = 0; //meow meow

    public RoboticCat(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        super(petName, petType, animalType, petHealth, petHunger, petHappiness, petThirst, petBoredom, petMood);
        this.rustAttackTick = rustAttackTick;
    }


    public void feedPet(VirtualPet myVirtualPet) {
        myVirtualPet.increaseHealthLevel(10);
    }


    public void walkPet(VirtualPet myVirtualPet) {
        myVirtualPet.decreaseHealthLevel(10);
    }


    public int Tick() {
        return 90000;
    }


    public boolean checkRustLevel(int rustLevel) {

        int rustLevelVar = rustLevel;
        if (rustLevelVar >= 3) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isLitterBoxFull(int litterBoxTick) {
        int litterBoxVar = litterBoxTick;
        if (litterBoxVar >= 3){
            return true;
        }
        return false;
    }
}


package pets_amok;

public abstract class VirtualPet {


    protected String petName;
    protected String animalType;
    protected String petType;
    protected int petHealth;
    protected int petHunger;
    protected int petHappiness;
    protected int petThirst;
    protected int petBoredom;
    protected String petMood;
    protected int healthCalculation = 100;

    public void VirtualPet(){}

    public VirtualPet(String petName, String petType, String animalType, int petHealth, int petHunger, int petHappiness, int petThirst, int petBoredom, String petMood) {
        this.petName  = petName;
        this.petType = petType;
        this.animalType = animalType;
        this.petHealth = petHealth;
        this.petHunger = petHunger;
        this.petHappiness = petHappiness;
        this.petThirst = petThirst;
        this.petBoredom = petBoredom;
        this.petMood = petMood;
    }



    public abstract void tick();

    public String getName (){ return petName;}

    public String getPetType (){ return petType;}

    public String getAnimalType (){ return animalType;}

    public int getHealth(){ return petHealth; }

    public int getHunger(){
        return petHunger;
    }

    public int getHappiness(){
        return petHappiness;
    }

    public int getThirst(){
        return petThirst;
    }

    public int getBoredom(){
        return petBoredom;
    }

    public String getPetMood (){ return petMood;}

    public void increaseHealthLevel(int i) {
        petHealth = petHealth + i;
    }

    public void decreaseHealthLevel(int i) {
        petHealth = petHealth - i;
    }

    public void feedVirtualPet(){
        petHunger-=2;
//        petHealth +=5;
        petHappiness +=7;
    }

    public void waterVirtualPet(){
        petThirst-=2;
//        petHealth +=5;
        petHappiness +=7;
    }


    public int getHealthCalculation() {
        healthCalculation = (petHappiness + (100- petBoredom));
        return healthCalculation;
    }

    public void playWithPet() {
        petHunger+=2;
        petThirst+=2;
        petHappiness +=5;
        petBoredom -=5;

    }

    public void oilRoboticPet() {
//        petHealth +=7;
        petHappiness +=5;
        petBoredom -= 5;
    }

    public void increaseHappinessLevel(int i) {
        petHappiness = petHappiness + i;
    }
    public void decreaseHappinessLevel(int i) {
        petHappiness = petHappiness - i;
        petBoredom+=10;
    }
    public void decreaseBoredomLevel(int i) {

        petBoredom = petBoredom -i;
    }

    public void roboticPetGetsRusty() {
        petHappiness -=5;
        petBoredom+=10;
    }

//    public void decreasePoopChance(int i) {
////        Walkable.isCagePoopFull(i);
//    }


//    public void setHealthCalculation(int healthCalculation) {
//        this.healthCalculation = healthCalculation;
//    }
}

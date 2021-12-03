package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> petList = new HashMap<>();
    public static Map<String, VirtualPet> pets = new HashMap<>();

    public void intializePets() {
        OrganicCat OC = new OrganicCat("salem", "organic", "cat", 50, 50, 50, 50, 50, "is happy");
        OrganicDog OD = new OrganicDog("lassie", "organic", "dog", 50, 50, 50, 50, 50, "is hungry");
        RoboticCat RC = new RoboticCat("marley", "robotic", "cat", 50, 50, 50, 50, 50, "is bored");
        RoboticDog RD = new RoboticDog("jimmy", "robotic", "dog", 50, 50, 50, 50, 50, "is thirsty");
        VirtualCat VC = new VirtualCat("carrie", "virtual", "cat", 50, 50, 50, 50, 50, "is meowing");
        VirtualDog VD = new VirtualDog("mrwoof", "virtual", "dog", 50, 50, 50, 50, 50, "is barking");

        pets.put(OC.getName(), OC);
        pets.put(OD.getName(), OD);
        pets.put(RC.getName(), RC);
        pets.put(RD.getName(), RD);
        pets.put(VC.getName(), VC);
        pets.put(VD.getName(), VD);

    }

    public void add(VirtualPet VirtualPet) {
        petList.put(VirtualPet.getName(), VirtualPet);
        pets.put(VirtualPet.getName(), VirtualPet);
    }

    public void remove(VirtualPet VirtualPet) {
        pets.remove(VirtualPet.getName());
    }


    public void feed() {
        for (VirtualPet pets : pets.values()) {
            pets.feedVirtualPet();
        }
    }

    public void water() {
        for (VirtualPet pets : pets.values()) {
            pets.waterVirtualPet();
        }
    }


    public VirtualPet findPet(String petName) {
        return pets.get(petName);

    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void showPets1() {
        for (VirtualPet pets : pets.values()) {
            System.out.println(pets.getName() + "\t| " + pets.getAnimalType() + " \t| " + pets.getPetType() + " \t|\t" + pets.getHealthCalculation() + "\t|\t" + pets.getHunger() +
                    "\t|\t" + pets.getHappiness() + "\t  |\t" + pets.getThirst() + "\t |\t" +
                    pets.getBoredom());
        }
    }

    public void showPets2() {
        for (VirtualPet pets : pets.values()) {
            System.out.println(pets.getName() + "\t|\t" + pets.getPetMood());
        }
    }

    public Collection<VirtualPet> getOrganicPetsToFeed() {
        Collection<VirtualPet> organicPets = new ArrayList<>();
        for (VirtualPet organicPet : pets.values()) {
            if (organicPet instanceof OrganicPet) {
                organicPet.feedVirtualPet();
            }
        }
        return organicPets;
    }

    public static Collection<VirtualPet> getRoboticPetsToDropHealth() {
        Collection<VirtualPet> roboticPets = new ArrayList<>();
        for (VirtualPet roboticPet : pets.values()) {
            if (roboticPet instanceof RoboticPet) {
                roboticPet.roboticPetGetsRusty();
            }
        }
        return roboticPets;
    }

    public Collection<VirtualPet> getRoboticPetsToOil() {
        Collection<VirtualPet> roboticPets = new ArrayList<>();
        for (VirtualPet roboticPet : pets.values()) {
            if (roboticPet instanceof RoboticPet) {
                roboticPet.oilRoboticPet();
            }
        }
        return roboticPets;
    }

    public Collection<VirtualPet> getVirtualPetsToFeed() {
        Collection<VirtualPet> virtualPets = new ArrayList<>();
        for (VirtualPet virtualPet : pets.values()) {
            if (virtualPet instanceof VirtualAnimals) {
                virtualPet.feedVirtualPet();
            }
        }
        return virtualPets;
    }

    public Collection<VirtualPet> getWalkablePets() {
        Collection<VirtualPet> walkablePets = new ArrayList<>();
        for (VirtualPet walkablePet : pets.values()) {
            if (walkablePet instanceof Walkable) {
                walkablePet.increaseHappinessLevel(6);
                walkablePet.decreaseBoredomLevel(18);
            }
        }
        return walkablePets;
    }

    public Collection<VirtualPet> getWalkablePetsToCleanCages() {
        Collection<VirtualPet> walkablePets = new ArrayList<>();
        for (VirtualPet walkablePet : pets.values()) {
            if (walkablePet instanceof Walkable) {
                walkablePet.increaseHappinessLevel(6);
            }
        }
        return walkablePets;
    }

    public Collection<VirtualPet> getLitterBoxablePetsToCleanLitterBox() {
        Collection<VirtualPet> litterBoxablePets = new ArrayList<>();
        for (VirtualPet litterBoxablePet : pets.values()) {
            if (litterBoxablePet instanceof LitterBoxable) {
                litterBoxablePet.increaseHappinessLevel(6);
            }
        }
        return litterBoxablePets;
    }

    public Collection<VirtualPet> getOrganicPetsForWater() {
        Collection<VirtualPet> organicPets = new ArrayList<>();
        for (VirtualPet organicPet : pets.values()) {
            if (organicPet instanceof OrganicPet) {
                organicPet.waterVirtualPet();
            }
        }
        return organicPets;

    }

    public Collection<VirtualPet> getVirtualPetsForWater() {
        Collection<VirtualPet> virtualPets = new ArrayList<>();
        for (VirtualPet virtualPet : pets.values()) {
            if (virtualPet instanceof VirtualAnimals) {
                virtualPet.waterVirtualPet();
            }
        }
        return virtualPets;

    }


    public static Collection<VirtualPet> getLitterBoxablePetsHealthToDrop() {
        Collection<VirtualPet> litterBoxablePets = new ArrayList<>();
        for (VirtualPet litterBoxablePet : pets.values()) {
            if (litterBoxablePet instanceof LitterBoxable) {
                litterBoxablePet.decreaseHappinessLevel(6);
            }
        }
        return litterBoxablePets;
    }




    public static Collection<VirtualPet> getWalkablePetsHealthToDrop() {
        Collection<VirtualPet> walkablePets = new ArrayList<>();
        for (VirtualPet walkablePet : pets.values()) {
            if (walkablePet instanceof Walkable) {
                walkablePet.decreaseHappinessLevel(6);
            }
        }
        return walkablePets;
    }
}
package pets_amok;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userChoice;
        String userChoice2;
        int tick = 0;
        int cagePoop = 0;
        int litterBox = 0;
        int petRustLevel = 0;

        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.intializePets();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        System.out.println("Welcome to the Pet Playground & Palace");
        System.out.println("+-------------------------------------+");
        System.out.println("|     ____      ____     ____         |");
        System.out.println("|    |     )   |     )  |     )       |");
        System.out.println("|    | ___/    | ___/   | ___/        |");
        System.out.println("|    |         |        |             |");
        System.out.println("|    |         |        |             |");
        System.out.println("|    |         |        |             |");
        System.out.println("+-------------------------------------+");
        System.out.println("Oh noes! Your virtual pet shelter has become a mess! \nSince we began accepting different types of pets, everything has become disheveled" +
                "\nYou still have to feed, provide water, and play with your pets to keep them healthy.");
        System.out.println("You must now take care of Organic, Virtual, and Robotic pets which can get difficult at times.  \nAlways remember:  ");
        System.out.println("\t1. That robotic pets do not require any food or hunger to sustain themselves.");
        System.out.println("\t2. That you have to keep your pets happy or their health will drop.");
        System.out.println("\t3. That you will have to oil up your robotic pets because their health will drop.");
        System.out.println("\t4. That the cat litterbox needs to be emptied on a regular basis or the cats' health will drop.");
        System.out.println("\t5. That the dog cages have to be cleaned out on a regular basis or the dogs' health will drop.");
        System.out.println("\t6. Tending to your animals will increase their health level.\nHere is the status of your pets: ");
        System.out.println("Pet Name|Type\t|Animal Type| Health| Hunger|Happiness|Thirst|Boredom");
        //        System.out.println("Pet Name  \t |Pet Type\t|\tAnimal Type\t|\tHealth\t|\tHunger\t| Happiness\t|\tThirst\t|\tBoredom");
        System.out.println("___________________________________________________");
        myShelter.showPets1();
        System.out.println("___________________________________________________");
        System.out.println("Litter Box - Waste Level: " + litterBox + "\t \t|Cage Pet -   Waste Level: " + cagePoop + " \t  |Robotic Pets    - Rust  Level  " + petRustLevel + "\n");
        System.out.println("What would you like to do? Please select from the menu below: ");
        System.out.println("1. Walk the Dogs\t       \t|4. Give water to the animals\t   \t|7. Clean the dog cages" +
                "\n2. Play with an animal\t \t|5. Oil up your Robotic Pets\t  \t|8. Admit a pet " +
                "\n3. Feed the animals\t     \t|6. Clean the cat litter box\t  \t|9. Adopt a pet \t0. Exit");
        System.out.println("");
        userChoice = input.nextLine();
        while (!userChoice.equals("0")) {
            if (userChoice.equals("1")) {
                tick++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to walk the dogs");
                myShelter.getWalkablePets();
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                cagePoop = 1;
                System.out.println("Litter Box Pets - Waste Level: " + litterBox);
                System.out.println("Cage Pets       - Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("2")) {
                tick++;
                cagePoop++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to play with a pet");
                System.out.println("");
                System.out.println("Pet Name  \t |\tDescription");
                System.out.println("___________________________________________________________");
                myShelter.showPets2();
                System.out.println("___________________________________________________________");
                System.out.println("Please enter the name of the pet you would like to play with: ");
                userChoice2 = input.nextLine();
                myShelter.pets.get(userChoice2).playWithPet();
                cagePoop += 3;
                litterBox += 3;
                petRustLevel +=2;
                myShelter.pets.get(userChoice2).decreaseBoredomLevel(12);
                System.out.println("");
                System.out.println("You have just played with " + userChoice2 + " pet.  They are now happier, hungrier, thirstier, and less bored.  Good Job!!");
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("3")) {
                cagePoop++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to feed the animals");
                System.out.println("1. Feed the Organic Pets");
                System.out.println("2. Feed the Robotic Pets");
                System.out.println("3. Feed the Virtual Pets");
                System.out.println("0. To go back");
                System.out.println("Choose an option from above: ");
                userChoice2 = input.nextLine();
                while (!userChoice2.equals("0")) {
                    if (userChoice2.equals("1")) {
                        System.out.println("You have just fed your Organic Pets.  Their happiness has increased.  Good job!");
                        myShelter.getOrganicPetsToFeed();
                        cagePoop++;
                        litterBox++;
                        tick++;
                    } else if (userChoice2.equals("2")) {
                        System.out.println("Robotic pets don't need food silly.");
                        cagePoop++;
                        litterBox++;
                    } else if (userChoice2.equals("3")) {
                        System.out.println("You have just fed your Virtual Pets.  Their happiness has increased.  Good job!");
                        myShelter.getVirtualPetsToFeed();
                        cagePoop++;
                        litterBox++;
                        tick++;
                    } else {
                        System.out.println("I did not understand, please try again: ");

                    }
                    System.out.println("");
                    System.out.println("You have chosen to feed the animals");
                    System.out.println("1. Feed the Organic Pets");
                    System.out.println("2. Feed the Robotic Pets");
                    System.out.println("3. Feed the Virtual Pets");
                    System.out.println("0. To go back");
                    System.out.println("Choose an option from above: ");
                    userChoice2 = input.nextLine();
                }
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("4")) {
                petRustLevel++;
                petRustLevel++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to give water to the animals");
                System.out.println("");
                System.out.println("1. Give water to the Organic Pets");
                System.out.println("2. Give water to the Robotic Pets");
                System.out.println("3. Give water to the Virtual Pets");
                System.out.println("0. To go back");
                System.out.println("Choose an option from above: ");
                userChoice2 = input.nextLine();
                while (!userChoice2.equals("0")) {
                    if (userChoice2.equals("1")) {
                        System.out.println("You have just given water to your Organic Pets.  Their happiness has increased.  Good job!");
                        myShelter.getOrganicPetsForWater();
                        cagePoop++;
                        litterBox++;
                        tick++;
                    } else if (userChoice2.equals("2")) {
                        System.out.println("Robotic pets don't need water silly. ");
                        cagePoop++;
                        litterBox++;
                    } else if (userChoice2.equals("3")) {
                        System.out.println("You have just given water to your Virtual Pets.  Their happiness has increased.  Good job!");
                        myShelter.getVirtualPetsForWater();
                        cagePoop++;
                        litterBox++;
                        tick++;
                    } else {
                        System.out.println("I did not understand, please try again: ");

                    }
                    System.out.println("");
                    System.out.println("You have chosen to feed the animals");
                    System.out.println("1. Feed the Organic Pets");
                    System.out.println("2. Feed the Robotic Pets");
                    System.out.println("3. Feed the Virtual Pets");
                    System.out.println("0. To go back");
                    System.out.println("Choose an option from above: ");
                    userChoice2 = input.nextLine();
                }
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("5")) {
                tick++;
                cagePoop++;
                litterBox++;
                System.out.println("");
                System.out.println("You have chosen to oil up your Robotic Pets");
                myShelter.getRoboticPetsToOil();
                petRustLevel = 0;
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("6")) {
                tick++;
                cagePoop++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to clean the cat litterbox");
                myShelter.getLitterBoxablePetsToCleanLitterBox();
                litterBox = 0;
                System.out.println("");
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("7")) {
                tick++;
                cagePoop++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to clean the dog cages");
                myShelter.getWalkablePetsToCleanCages();
                cagePoop = 0;
                System.out.println("");
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("8")) {
                tick++;
                cagePoop++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to admit a pet");
                System.out.println("");
                System.out.println("Please enter the name of the animal you would like to admit to the PPP: ");
                String newAnimalName = input.nextLine();
                System.out.println("Please enter the type of animal (Dog or Cat) you would like to admit to the PPP: ");
                String newAnimalPetType = input.nextLine();
                System.out.println("Please enter the type of pet (Virtual, Organic, Robotic) you would like to admit to the PPP: ");
                String newAnimalAnimalType = input.nextLine();
                System.out.println("Please enter the current health level of the animal between 1-100");
                int newAnimalHealth = input.nextInt();
                System.out.println("Please enter the current hunger level of the animal between 1-100");
                int newAnimalHunger = input.nextInt();
                System.out.println("Please enter the current happiness level of the animal between 1-100");
                int newAnimalHappiness = input.nextInt();
                System.out.println("Please enter the current thirst level of the animal between 1-100");
                int newAnimalThirst = input.nextInt();
                System.out.println("Please enter the current boredom level of the animal between 1-100");
                int newAnimalBoredom = input.nextInt();
                System.out.println("Please enter the mood of the animal you would like to admit to the PPP: ");
                String newAnimalMood = input.nextLine();
                VirtualPet newVirtualPet = new VirtualPet(newAnimalName + " \t ", newAnimalAnimalType, newAnimalPetType, newAnimalHealth, newAnimalHunger, newAnimalHappiness, newAnimalThirst, newAnimalBoredom, newAnimalMood) {
                    @Override
                    public void tick() {

                    }

                };
                myShelter.add(newVirtualPet);
                System.out.println("");
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                cagePoop++;
                litterBox++;
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            } else if (userChoice.equals("9")) {
                tick++;
                cagePoop++;
                litterBox++;
                petRustLevel++;
                System.out.println("");
                System.out.println("You have chosen to adopt a pet");
                System.out.println("Choose the pet you would like to adopt from the list: ");
                System.out.println("");
                String userChoice3 = input.nextLine();
                myShelter.pets.remove(userChoice3);
                System.out.println("");
                System.out.println("Congratulations!! You have officially adopted " + userChoice3);
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!\n");
                System.out.println("Litter Box - Waste Level: " + litterBox);
                System.out.println("Cage Pet -   Waste Level: " + cagePoop);
                System.out.println("Robotic Pets    - Rust  Level  " + petRustLevel);
                tick(cagePoop, litterBox, petRustLevel);
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                cagePoop++;
                litterBox++;
            } else {
                System.out.println("I did not understand your request, please try again.");
            }
            System.out.println("Here is the status of your pets: ");

            System.out.println("Pet Name|Type\t|Animal Type| Health| Hunger|Happiness|Thirst|Boredom");
//            System.out.println("Pet Name  \t |Pet Type\t|\tAnimal Type\t|\t Health \t|\tHunger\t| Happiness\t|\tThirst\t|\tBoredom");
            System.out.println("___________________________________________________");

            myShelter.showPets1();

            System.out.println("___________________________________________________");

            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("Please select from the menu below");
            System.out.println(" ");
            System.out.println("Press 1 to Walk the Dogs");
            System.out.println("Press 2 to Play with an animal");
            System.out.println("Press 3 to Feed the animals");
            System.out.println("Press 4 to Give water to the animals");
            System.out.println("Press 5 to Oil up your Robotic Pets");
            System.out.println("Press 6 to Clean the cat litter box");
            System.out.println("Press 7 to Clean the dog cages");
            System.out.println("Press 8 to admit a pet");
            System.out.println("Press 9 to adopt a pet");
            System.out.println("Press 0 to exit");
            System.out.println("");
            userChoice = input.nextLine();

        }


        System.out.println("Thanks for visiting the PPP!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.exit(0);


    }

    private static void tick(int cagePoop, int litterBox, int petRustLevel) {
        if (cagePoop >= 8) {
            System.out.println("!!!!!!!!!!!!!!!WARNING: CAGE POOP TOO HIGH.  PET HEALTH HAS DROPPED!!!!!!!!!!!!!!!!");
            VirtualPetShelter.getWalkablePetsHealthToDrop();
        }
        if (litterBox >= 8) {
            System.out.println("!!!!!!!!!!!!!!!WARNING: LITTER BOX POOP TOO HIGH.  PET HEALTH HAS DROPPED!!!!!!!!!!!!!!!!");
            VirtualPetShelter.getLitterBoxablePetsHealthToDrop();
        }
        if (petRustLevel >= 6) {
            System.out.println("!!!!!!!!!!!!!!!WARNING: ROBOTIC PET HAS BECOME TOO RUSTY.  PET HEALTH HAS DROPPED!!!!!!!!!!!!!!!!");
            VirtualPetShelter.getRoboticPetsToDropHealth();
        }
    }


}

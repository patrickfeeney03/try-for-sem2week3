package ie.atu.week3;

public class Database {
    public static Product getProduct(String productCode) {
        Product p = null;

        if (productCode.equalsIgnoreCase("callaita")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Urban/Trap song of the Year");
            myMusic.setPrice(10.0);
            myMusic.setArtist("Bad Bunny");
            myMusic.setLabel("Rimas");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("life goes on")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("\"Life Goes On\" is a song by American singer-songwriter Oliver Tree. It was " +
                    "released on May 28, 2021, through Atlantic Records, as the second single from the deluxe version " +
                    "of his debut studio album, Ugly Is Beautiful (2020). Tree and DJ Getter co-wrote and produced " +
                    "\"Life Goes On\".");
            myMusic.setPrice(15.0);
            myMusic.setArtist("Oliver Tree");
            myMusic.setLabel("Atlantic");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("deceptacon")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Le Tigre is the debut studio album of American music trio Le Tigre. It was released " +
                    "October 25, 1999[2] on Mr. Lady Records. The album combined pop music with the band's feminist " +
                    "political lyrics. It received positive reviews from music critics.");
            myMusic.setPrice(1.0);
            myMusic.setArtist("Le Tigre");
            myMusic.setLabel("Deceptacon");
            p = myMusic;
        }

        return p;
    }

    public static Animal getAnimal(String productCode) {
        Animal a = null;

        if (productCode.equalsIgnoreCase("dog1")) {
            Dog myDog = new Dog();
            myDog.setType("Type1");
            myDog.setAge(3);
            myDog.setBreed("German Shepherd");
            myDog.setVaccination("Fully Vaccinated");
            myDog.setShedding("Minimal shedding.");
            myDog.setNeutered("Not neutered.");
            a = myDog;
        } else if (productCode.equalsIgnoreCase("dog2")) {
            Dog myDog = new Dog();
            myDog.setType("Type2");
            myDog.setAge(5);
            myDog.setBreed("Mix");
            myDog.setVaccination("Partially Vaccinated");
            myDog.setShedding("No shredding.");
            myDog.setNeutered("Not neutered.");
            a = myDog;
        } else if (productCode.equalsIgnoreCase("dog3")) {
            Dog myDog = new Dog();
            myDog.setType("Type3");
            myDog.setAge(30);
            myDog.setBreed("German Shepherd");
            myDog.setVaccination("Fully Vaccinated");
            myDog.setShedding("Minimal shedding.");
            myDog.setNeutered("Not neutered.");
            a = myDog;
        }

        return a;
    }


}

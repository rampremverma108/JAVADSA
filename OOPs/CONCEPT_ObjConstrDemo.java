public class SmartphoneExample {
    public static void main(String args[]) {
        
        // --- TAREERA 1: Constructor Se Call Karna (At the time of creation) ---
        // Phone bante hi humne bata diya ki ye "iPhone 15" hai aur isme "8GB" RAM hai.
        Smartphone myPhone = new Smartphone("iPhone 15", "8GB");
        
        System.out.println("Phone Model: " + myPhone.model);
        System.out.println("Phone RAM: " + myPhone.ram);
        
        System.out.println("-------------------------------------");

        // --- TAREERA 2: Methods/Setters Se Call Karna (Baad mein changes karna) ---
        // Phone kharidne ke baad humne usme SIM card dala aur wallpaper lagaya.
        myPhone.setSimCard("Jio");
        myPhone.setWallpaper("Neon Lights");
        
        System.out.println("Sim Card: " + myPhone.simCard);
        System.out.println("Wallpaper: " + myPhone.wallpaper);

        System.out.println("-------------------------------------");

        // --- TAREERA 3: Direct Variable Se Change Karna (2nd way to set) ---
        // Humne bina method ke directly variable ki value change kar di.
        myPhone.wallpaper = "Nature View"; 
        System.out.println("Updated Wallpaper: " + myPhone.wallpaper);
    }
}

class Smartphone {
    // Properties (Variables)
    String model;
    String ram;
    String simCard;
    String wallpaper;

    // 1. CONSTRUCTOR: Object bante hi variables ko set karne ke liye
    Smartphone(String model, String ram) {
        this.model = model;
        this.ram = ram;
        System.out.println("Factory Output: Phone initialized with Model & RAM.");
    }

    // 2. METHODS (SETTERS): Baad mein variables ko change/set karne ke liye
    void setSimCard(String newSim) {
        simCard = newSim;
    }

    void setWallpaper(String newWallpaper) {
        wallpaper = newWallpaper;
    }
}
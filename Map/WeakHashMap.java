package Map;


import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) {
        java.util.WeakHashMap<String, Image> imageCache = new java.util.WeakHashMap<>();
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }

    public static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));
    }


    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
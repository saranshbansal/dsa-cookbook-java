package com.designpatterns;

import lombok.extern.slf4j.Slf4j;

/**
 * Proxy Design Pattern (Structural Pattern)
 * <p>
 * This pattern provides a surrogate or placeholder for another object to control access to it.
 * It is structural pattern as it is used to form an object structure between other objects.
 * <p>
 * Use When:
 * 1. Delayed Initialization
 * 2. Virtual Proxy
 * 3. Remote Proxy
 * 4. Protection Proxy
 * 5. Cache Proxy
 * 6. Logging Proxy
 */
@Slf4j
public class ProxyPattern {

    //Step 1: Create an interface.
    interface Image {
        void displayImage();
    }

    //Step 2: Create concrete classes implementing the same interface.
    static class RealImage implements Image {

        private String filename;

        public RealImage(String filename) {
            this.filename = filename;
            loadFromDisk();
        }

        @Override
        public void displayImage() {
            System.out.println("Displaying... " + filename);
        }

        private void loadFromDisk() {
            System.out.println("Loading... " + filename);
        }
    }

    //Step 3: Create a proxy class which implements the same interface.
    static class ProxyImage implements Image {

        private RealImage image;
        private String filename;

        public ProxyImage(String filename) {
            this.filename = filename;
        }

        @Override
        public void displayImage() {
            if (image == null) {
                image = new RealImage(filename);
            }
            image.displayImage();
        }
    }

    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");
        System.out.println("> Displaying image 1st time");
        image.displayImage();

        System.out.println("> Displaying image again to show that it is loaded from disk only once");
        image.displayImage();
    }
}

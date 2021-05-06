package com.tts;

import com.tts.creational.SingletonClass;
import com.tts.structural.adapter.Bird;
import com.tts.structural.adapter.BirdAdapter;
import com.tts.structural.adapter.Sparrow;
import com.tts.structural.adapter.ToyDuck;

public class Main {
    public static void main(String[] args) {

        SingletonClass mySingleton = SingletonClass.getInstance();

        System.out.println(mySingleton.getMessage());

        Sparrow sparrow = new Sparrow();
//        Ostrich ostrich = new Ostrich();
        ToyDuck birdAdapter = new BirdAdapter((Bird)sparrow);

        // we are adapting bird to toyduck
        // this squeak method will not result in "squeak"
        // it'll instead call the bird's makeSound method
        birdAdapter.squeak();
    }
}

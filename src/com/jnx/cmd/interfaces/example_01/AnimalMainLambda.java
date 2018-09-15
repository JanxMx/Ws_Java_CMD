/**
 * Now to iterate and perform some simple operation on every item in list,
 * all you need to do is:
 */
package com.jnx.cmd.interfaces.example_01;

import java.util.ArrayList;
import java.util.List;

public class AnimalMainLambda implements Moveable {

    public static void main(String[] args) {
        List<AnimalMainLambda> list = new ArrayList<>();
        list.add(new AnimalMainLambda());
        list.add(new AnimalMainLambda());
        list.add(new AnimalMainLambda());

        // Iterator code reduced to one line
        list.forEach((Moveable p) -> p.move());
    }
}
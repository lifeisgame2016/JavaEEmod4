package com.java.mod1;

import java.io.IOException;

/**
 * Created by Den on 18.08.2016.
 */
public class Runner {
    public static void main(String[] args)throws IOException {
        CollectionsWtiter collectionsEfficiency = new CollectionsWtiter();
        int[] elements = {100, 1000, 10000};

        for (int i = 0; i < elements.length; i++){
            collectionsEfficiency.printAndWriteFile(elements[i]);
        }
    }
}

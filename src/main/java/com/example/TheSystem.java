package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;
   

     TheSystem() {
        
    }
	
	private Item readingFromLine(String line) { 

    }
    
    public HashMap<String, Item> getItemCollection(){
    	
    }
    
    public void setItemCollection(HashMap<String, Item> copy) {
        
    }
    
    public Boolean checkAvailability(Item item) {
       
    }
    
    public Boolean add(Item item) {
        
    }

    public Item remove(String itemName) {
        
    }

    public abstract void display();
}

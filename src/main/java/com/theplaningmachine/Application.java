/*
 * Application.java
 * 
 * Copyright 2024 ric <ric@Alian>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.#EEEEEC
 * 
 * 
 */

package com.theplaningmachine;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public int countWords(String words){
        String[] separateWords = StringUtils.split(words,' ');
        return (separateWords == null)? 0: separateWords.length;
    }

    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        for(String greeting: greetings){
            System.out.println("Greeting: "+ greeting);
        }
    }
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application2");
	    Application app = new Application();
        app.greet();  
        int count = app.countWords("I have four words");
        System.out.println(count);
      
    }
}

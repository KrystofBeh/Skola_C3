package org.example.prvnitestoprava;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private ArrayList<Countries> data;

    public Data(){
        this.data = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File("idk.csv"));
            sc.nextLine();
            while(sc.hasNextLine()){
                String[] parts = sc.nextLine().split(",");

                data.add(
                        new Countries(
                                parts[0],
                                parts[1],
                                Integer.parseInt(parts[2]),
                                Double.parseDouble(parts[3])
                        )
                );
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Countries> getData() {
        return data;
    }
}



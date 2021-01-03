package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Data newData = new Data();
        Scanner dataType = new Scanner(System.in);
        System.out.println("Input region type: ");

        String regionType = dataType.nextLine();
        System.out.println("Region type is: " + regionType);

        if (!regionType.equalsIgnoreCase("general")){
            Scanner regionName = new Scanner(System.in);
            System.out.println("Input location name: ");

            String location = regionName.nextLine();
            System.out.println("Location is: " + location);
            newData.findInformation(location, regionType);
        }
        else {
            newData.findInformation(regionType, regionType);
        }
    }
}
package com.enigma;

public class TimeConversation {

    public String convertTime(String time){

        String[] timeSplit = time.split("");

        String newTime = "";

            String hour = timeSplit[0]+timeSplit[1];
            int hours = Integer.parseInt(hour);
            int newHour = hours + 12;

            if(timeSplit[8].equals("A") && newHour == 24) {
                newTime = "00"+timeSplit[2]+timeSplit[3]+timeSplit[4]+timeSplit[5]+timeSplit[6]+timeSplit[7];
            } else if(timeSplit[8].equals("A")) {
                newTime = timeSplit[0]+timeSplit[1]+timeSplit[2]+timeSplit[3]+timeSplit[4]+timeSplit[5]+timeSplit[6]+timeSplit[7];
            } else if (timeSplit[8].equals("P") && newHour == 24){
                newTime = timeSplit[0]+timeSplit[1]+timeSplit[2]+timeSplit[3]+timeSplit[4]+timeSplit[5]+timeSplit[6]+timeSplit[7];
            } else {
                newTime = Integer.toString(newHour)+timeSplit[2]+timeSplit[3]+timeSplit[4]+timeSplit[5]+timeSplit[6]+timeSplit[7];
            }

        return newTime;
    }

}

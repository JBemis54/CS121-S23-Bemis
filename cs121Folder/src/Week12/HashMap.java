package Week12;

import java.util.Map;

public class HashMap {
    private Map<String, Integer> birthDateMap =new java.util.HashMap<>();

    public void addBirthDate(String name, int date){
        birthDateMap.put(name, date);
    }
    public void removeBirthdate(String name){
        birthDateMap.remove(name);
    }

    public Object showDate(String name){
        Object date;
        if(birthDateMap.containsKey(name)) {
            date = birthDateMap.get(name);
        }else{
            date = "date not found";
        }
        return date;
    }

    public void displayBirthDate(){
        birthDateMap.forEach((name,date) ->{
            System.out.printf("Name: %s | Date: %d \n", name, date);
        });
    }

}

package pl.edu.amu.wmi.wmitimetable.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

// Singleton to store and access local data
public class World {
    private static World mInstance = null;

    //@Getter @Setter
    //private ArrayList<Schedule> schedules = new ArrayList<>();

    @Getter @Setter
    Boolean loaded = false;

    @Getter @Setter
    private ArrayList<Meeting> meetings = new ArrayList<>();

    private World(){

    }
    public static World getInstance(){
        if(mInstance == null)
        {
            mInstance = new World();
        }
        return mInstance;
    }
}
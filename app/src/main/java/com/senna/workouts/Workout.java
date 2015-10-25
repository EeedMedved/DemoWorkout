package com.senna.workouts;

/**
 * Created by Eduard on 24.10.2015.
 */
public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 отжиманий\n10 приседаний на одной ноге\n15 подтягиваний"),
            new Workout("Core agony",
                    "100 pull-ups\n100 push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special",
                    "5 pull-ups\n10 push-ups\n15 squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}

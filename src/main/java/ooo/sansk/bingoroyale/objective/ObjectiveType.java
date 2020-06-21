package ooo.sansk.bingoroyale.objective;

import ooo.sansk.bingoroyale.objective.factory.*;

public enum ObjectiveType {

    BREED(new BreedAnimalObjectiveFactory()),
    CRAFT(new CraftItemObjectiveFactory()),
    KILL(new KillEntityTypeObjectiveFactory()),
    PORTAL(new NetherPortalEnterObjectiveFactory()),
    SLEEP(new SleepInBedObjectiveFactory()),
    KILL_PLAYER(new KillPlayerObjectiveFactory()),
    EXPERIENCE(new GainLevelObjectiveFactory()),
    CATCH_FISH(new CatchFishObjectiveFactory());
    //Build golems
    //Shear a snow golem
    //Tame a horse

    private final ObjectiveFactory factory;

    ObjectiveType(ObjectiveFactory factory) {
        this.factory = factory;
    }

    public ObjectiveFactory getFactory() {
        return factory;
    }
}

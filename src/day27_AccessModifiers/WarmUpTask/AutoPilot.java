package day27_AccessModifiers.WarmUpTask;

public interface AutoPilot extends AutoPark {

    //we can extend interfaces
    //autoPark is the parent of autoPilot, because all autoPilots also have autoPark feature
    //but all autoParks do not have the autoPilot feature


    void selfDrive();   //abstract by default




}
/*
Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()


 */
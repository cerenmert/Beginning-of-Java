package Oops;

public class SampleFinalKeyword{

    final int maxAge = 100;

    public void setAge() {
        //maxAge = 110;

        //it gives warning! because:
        //java will not allow override or change the value of final.
        //variable is defined with 'final' above, so we can not change it.
    }
}

package JavaConcepts.Comparator;

import java.util.Comparator;

public class sortByspiesListSize implements Comparator<Attribute> {


    @Override
    public int compare(Attribute a1, Attribute a2) {
        return a1.getSuspectList().size() - a2.getSuspectList().size();
    }


}

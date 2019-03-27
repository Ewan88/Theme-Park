package Behaviours;

import ThemePark.Visitor;

public interface ISecurity {

    boolean isAllowed(Visitor visitor);

}

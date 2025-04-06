package javamonCore;

//This enum contains moves that Javamons use
public enum Move
{
    QUICK_ATTACK("Quick Attack", Type.NORMAL, MoveType.PHYSICAL, (short)40, (short)100, (short)30),
    THUNDER_SHOCK("Thunder Shock", Type.ELECTRIC, MoveType.SPECIAL, (short)40, (short)100, (short)30),
    CHARM("Charm", Type.FAIRY, MoveType.STATUS, (short)0, (short)100, (short)20),
    NUZZLE("Nuzzle", Type.ELECTRIC, MoveType.PHYSICAL, (short)20, (short)100, (short)20);

    private final String NAME;
    private final Type TYPE;
    private final MoveType MOVE_TYPE;
    private final short POWER;
    private final short ACCURACY;
    private final short PP;

    Move(String name, Type type, MoveType move_type, short power, short accuracy, short pp)
    {
        NAME = name;
        TYPE = type;
        MOVE_TYPE = move_type;
        POWER = power;
        ACCURACY = accuracy;
        PP = pp;
    }
}


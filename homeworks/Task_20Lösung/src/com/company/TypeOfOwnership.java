package com.company;

public enum TypeOfOwnership {
    GmbH {
                public String getTypeString(){
                    return "GmbH";
                }
            },
    AG {
        @Override
        public String getTypeString() {
            return "AG";
        }
    },
    EV {
        @Override
        public String getTypeString() {
            return "e.V.";
        }
    };

    public abstract String getTypeString();

    public static TypeOfOwnership getTypeStringByString(String s) {
        if (s.equals("GmbH")) {
            return TypeOfOwnership.GmbH;
        } else if (s.equals("AG")) {
            return TypeOfOwnership.AG;
        } else if (s.equals("e.V.") || s.equals("eV")) {
            return TypeOfOwnership.EV;
        } else {
            return null;
        }
    };

    @Override
    public String toString() {
        return getTypeString();
    }
}

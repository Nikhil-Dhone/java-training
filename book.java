enum Subjects {
    DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
}


public class book {
    public static void main(String[] args){
        Subjects[] s = Subjects.values();
        for (Subjects subjects : s){
            System.out.println("Value of Enum "+subjects.name());
            System.out.println("Index Value of Enum "+subjects.ordinal());
        }
    }
}

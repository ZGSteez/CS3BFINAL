public class Class extends Group {

    public Class(String groupName, int groupSize) {
        super(groupName, groupSize);
        setGroupID("C" + calculateGroupID());
    }
}


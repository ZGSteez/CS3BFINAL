import java.util.Random;

public class Group {
    public Group(String groupName, int groupSize){
        this.groupName = groupName;
        this.groupSize = groupSize;

    }
    private String groupName;
    private int groupSize;
    private String groupID;

    public String calculateGroupID(){

        Random random = new Random();
        int num = random.nextInt(256);
        char firstASCII = (char)num;
        char secondASCII;
        char firstLetter = groupName.charAt(0);
        if (groupName.length() > 2){
            int number = random.nextInt(256);
            secondASCII = (char)number;
        return String.valueOf(firstASCII + secondASCII + firstLetter);

        }

        else
            return String.valueOf(firstASCII + firstLetter);
    }

    public void setGroupID(String groupID){
        this.groupID = groupID;
    }
}

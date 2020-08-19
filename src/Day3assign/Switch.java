package Day3assign;

public class Switch {

    public static void main(String[] args) {
        int i= 2;
	String Month="";
        switch (i)
        {
            case 1:
                Month = "January";
                break;
            case 2:
                Month="February";
                break;
            case 3:
                Month="March";
                break;
            case 4:
                Month="April";
            default:
                Month="None";
        }
        System.out.println(Month);
    }
    }
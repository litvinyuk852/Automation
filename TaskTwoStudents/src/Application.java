import java.util.Arrays;
import java.util.Collections;

public class Application {
    public static void main (String [] args) {
        Student [] certainStudent=new Student [10];
        certainStudent[0]=new Student ();
        certainStudent[1]=new Student ();
        certainStudent[2]=new Student ();
        certainStudent[3]=new Student ();
        certainStudent[4]=new Student ();
        certainStudent[5]=new Student ();
        certainStudent[6]=new Student ();
        certainStudent[7]=new Student ();
        certainStudent[8]=new Student ();
        certainStudent[9]=new Student ();

        certainStudent[0].name="Ann";
        certainStudent[1].name="Brad";
        certainStudent[2].name="Cindy";
        certainStudent[3].name="Dave";
        certainStudent[4].name="Eve";
        certainStudent[5].name="Frank";
        certainStudent[6].name="Gretchen";
        certainStudent[7].name="Harry";
        certainStudent[8].name="Ivy";
        certainStudent[9].name="James";

        certainStudent[0].lastName="Applewhite";
        certainStudent[1].lastName="Brooks";
        certainStudent[2].lastName="Campbell";
        certainStudent[3].lastName="Dalloway";
        certainStudent[4].lastName="Emery";
        certainStudent[5].lastName="Fauls";
        certainStudent[6].lastName="Ganby";
        certainStudent[7].lastName="Himms";
        certainStudent[8].lastName="Ivory";
        certainStudent[9].lastName="Jones";

        Group firstGroup=new Group();
        firstGroup.groupId=1;

        Group secondGroup=new Group();
        secondGroup.groupId=2;

        certainStudent[0].groupId=1;
        certainStudent[1].groupId=2;
        certainStudent[2].groupId=1;
        certainStudent[3].groupId=2;
        certainStudent[4].groupId=1;
        certainStudent[5].groupId=2;
        certainStudent[6].groupId=1;
        certainStudent[7].groupId=2;
        certainStudent[8].groupId=1;
        certainStudent[9].groupId=2;

        int [] result=new int [5];
        result[0]=1;
        result[1]=2;
        result[2]=3;
        result[3]=4;
        result[4]=5;

        Ticket [] examTicket=new Ticket [10];
        examTicket[0]=new Ticket ();
        examTicket[1]=new Ticket ();
        examTicket[2]=new Ticket ();
        examTicket[3]=new Ticket ();
        examTicket[4]=new Ticket ();
        examTicket[5]=new Ticket ();
        examTicket[6]=new Ticket ();
        examTicket[7]=new Ticket ();
        examTicket[8]=new Ticket ();
        examTicket[9]=new Ticket ();

        examTicket[0].id=1;
        examTicket[1].id=2;
        examTicket[2].id=3;
        examTicket[3].id=4;
        examTicket[4].id=5;
        examTicket[5].id=6;
        examTicket[6].id=7;
        examTicket[7].id=8;
        examTicket[8].id=9;
        examTicket[9].id=10;

        examTicket[0].question="Uganda capital";
        examTicket[1].question="Rwanda capital";
        examTicket[2].question="Kenya capital";
        examTicket[3].question="Tanzania capital";
        examTicket[4].question="Morocco capital";
        examTicket[5].question="Ethiopia capital";
        examTicket[6].question="Sudan capital";
        examTicket[7].question="Angola capital";
        examTicket[8].question="Mali capital";
        examTicket[9].question="Algeria capital";

        System.out.println("Group 1 students result:");

        int z=0;
        int sum=0;
        int [] oneResultA=new int[10];
        while (z<certainStudent.length) {
            if (certainStudent[z].groupId == 1) {
                int randomResult = (int) (Math.random() * result.length);
                int randomTicket = (int) (Math.random() * examTicket.length);
                System.out.println(certainStudent[z].name + " " + certainStudent[z].lastName + " gets #" + examTicket[randomTicket].id + " ticket: " + examTicket[randomTicket].question + ". Gets mark: " + result[randomResult]);
                sum = sum + result[randomResult];
                oneResultA[z]=result[randomResult];
            }
            z = z + 1;
        }
        Arrays.sort(oneResultA);
        int min1 = oneResultA[5];
        int max1 = oneResultA[oneResultA.length -1];
        System.out.println("Min Result in Group 1 = " + min1);
        System.out.println("Max Result in Group 1 = " + max1);
        float avgResultOne = (float) sum / (certainStudent.length/2);
        System.out.println("Average group student result: " + avgResultOne);
        System.out.println("");

        System.out.println("Group 2 students result:");

        int y=0;
        int sum1=0;
        int [] twoResultA=new int[10];
        while (y<certainStudent.length) {
            if (certainStudent[y].groupId == 2) {
                int randomResult = (int) (Math.random() * result.length);
                int randomTicket = (int) (Math.random() * examTicket.length);
                System.out.println(certainStudent[y].name + " " + certainStudent[y].lastName + " gets #" + examTicket[randomTicket].id + " ticket: " + examTicket[randomTicket].question + ". Gets mark: " + result[randomResult]);
                sum1 = sum1 + result[randomResult];
                twoResultA[y]=result[randomResult];
                }
               y = y + 1;
        }

        Arrays.sort(twoResultA);
        int min2 = twoResultA[5];
        int max2 = twoResultA[twoResultA.length -1];
        System.out.println("Min Result in Group 2 = " + min2);
        System.out.println("Max Result in Group 2 = " + max2);

        float avgResultTwo = (float) sum1 / (certainStudent.length/2);
        System.out.println("Average group student result: " + avgResultTwo);
        }
    }

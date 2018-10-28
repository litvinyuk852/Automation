public class Application {
    public static void main (String [] args) {
        Student [] certainStudent=new Student [5];
        certainStudent[0]=new Student ();
        certainStudent[1]=new Student ();
        certainStudent[2]=new Student ();
        certainStudent[3]=new Student ();
        certainStudent[4]=new Student ();

        certainStudent[0].name="Ann";
        certainStudent[1].name="Brad";
        certainStudent[2].name="Cindy";
        certainStudent[3].name="Dave";
        certainStudent[4].name="Eve";

        certainStudent[0].lastName="Applewhite";
        certainStudent[1].lastName="Brooks";
        certainStudent[2].lastName="Campbell";
        certainStudent[3].lastName="Dalloway";
        certainStudent[4].lastName="Emery";

        int [] result=new int [5];
        result[0]=1;
        result[1]=2;
        result[2]=3;
        result[3]=4;
        result[4]=5;

        int resultLength = result.length;

        int z=0;
        int sum=0;
        while (z<certainStudent.length) {
            int randomResult = (int) (Math.random() * resultLength);
            System.out.println(certainStudent[z].name+" "+certainStudent[z].lastName+" "+result[randomResult]);
            sum=sum+result[randomResult];
            z = z + 1;
        }
        float avgResult=(float) sum/certainStudent.length;
        System.out.print(avgResult);
    }
}

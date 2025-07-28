enum Status{
    Running, Pending, Failed, Success;
}

public class Main{
    public static void main(String args[]){
        Status s = Status.Running;
        System.out.println(s.ordinal());//Gives you the index of current status 
        Status[] ss = s.values();//Returns all values of the status 
        for(Status i: ss){
            System.out.println(i);
        }

        /*We can also use switch and if else according to our status
          here we will use switch statement
        */
        
        switch(s){
            case Running:
            System.out.println("All good currently working..");
            break;
            case Failed:
            System.out.println("try Again");
            break;
            case Pending:
            System.out.println("Please Wait..");
            break;
            case Success:
            System.out.println("Completed");
            break;
        }
    }
}

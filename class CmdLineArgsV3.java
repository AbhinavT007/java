import java.io.*;
public class CmdLineArgsV3 extends Object {
    public static void main(String args[]) {
        CmdLineArgsV3 Obj = new CmdLineArgsV3();
        if(args.length !=2) {
            System.out.println("Invalid number of arguments \n you need pass two positive integers less than 50");
        }
        else{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = x+y;
            System.out.println("sum of " +x+ " and " +y+ " is " +z);
        }
    }
}

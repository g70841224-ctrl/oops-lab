import java.util.*;
class even implements Runnable
{
    public int x;
    public even(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("New Thread "+ x +" is EVEN and Square of "+ x + " is: " + x * x);
    }
}

class odd implements Runnable
{
    public int x;
    public odd(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("New Thread "+ x +" is ODD and Cube of "+ x + " is: " + x * x * x);
    }
}

class A extends Thread
{
    public void run()
    {
        int num = 0;
        Random r = new Random();
        try
        {
            for (int i = 0; i < 5; i++)
            {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number is " + num);
                if (num % 2 == 0)
                {
                    Thread t1 = new Thread(new even(num));
                    t1.start();
                }
                else
                {
                    Thread t2 = new Thread(new odd(num));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println("................................");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

public class ThreadProgram
{
    public static void main(String[] args)
    {
        A a = new A();
        a.start();
    }
}
/*
New Thread 8 is EVEN and Square of 8 is: 64
New Thread 5 is ODD and Cube of 5 is: 125
New Thread 12 is EVEN and Square of 12 is: 144
New Thread 7 is ODD and Cube of 7 is: 343
New Thread 4 is EVEN and Square of 4 is: 16
*/

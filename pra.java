    class pra extends Thread 

    {

 Thread t;

 pra()

        {

     t = new Thread(this,"My Thread");

     t.start();

 }

 public void run()

        {

            try

            {

                t.join()   

         System.out.println(t.getName());

            }

            catch(Exception e)

            {

            System.out.print("Exception");

            }

 }

    }

    class multithreaded_programing

    {

        public static void main(String args[])

        {

            new newthread();        

        }

    }


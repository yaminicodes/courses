public class Overloading {

        public static void name(char x, char y)
        {
           // x= 'Yamini'; y = 'Mhalas' ;
            System.out.println(x + " " + y);
        }

        public static void name()
        {
            String str = "try out string";
            System.out.println("she is from India ,"+ str+ "!");
        }


        public static void name(char x, char y , char z)
        {

            System.out.println("she loves "+ x + "," + y + " and " + z );
        }


        public static void main(String args[])
        {
            //Overloading s = new Overloading();
            name('Y','M');
            name();
            name('s' , 'r', 'e');


        }
    }


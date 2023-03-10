public class PartialTesterInfiniteInt
{
    public static void main(String[] args)
    {
        InfiniteInt int1;
        InfiniteInt int2;
        InfiniteInt int3;

        System.out.println("Test1: building an InfiniteInt with default constructor (your toString must work)");
        try
        {
            int2 = new InfiniteInt();
            System.out.println("Expected: 0");
            System.out.println("Got:      " + int2);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest2: building an InfiniteInt with 6 numbers (your toString must work)");
        try
        {
            int2 = new InfiniteInt("543534");
            System.out.println("Input to constructor: \"543534\"...");
            System.out.println("Expected: 543,534");
            System.out.println("Got:      " + int2);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest3: building an InfiniteInt with 12 numbers (your toString must work)");
        try
        {
            int2 = new InfiniteInt("543534123456");
            System.out.println("Input to constructor: \"543534123456\"...");
            System.out.println("Expected: 543,534,123,456");
            System.out.println("Got:      " + int2);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest4: building an InfiniteInt with 7 numbers (your toString must work)");
        try
        {
            int2 = new InfiniteInt("5435341");
            System.out.println("Input to constructor: \"5435341\"...");
            System.out.println("Expected: 5,435,341");
            System.out.println("Got:      " + int2);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }


        System.out.println("\nTest5: building an InfiniteInt with 8 numbers (your toString must work)");
        try
        {
            int2 = new InfiniteInt("25435341");
            System.out.println("Input to constructor: \"25435341\"...");
            System.out.println("Expected: 25,435,341");
            System.out.println("Got:      " + int2);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest6: does your toString fill in 0's correctly?");
        try
        {
            int2 = new InfiniteInt("120100000");
            System.out.println("Input to constructor: \"120100000\"...");
            System.out.println("Expected: 120,100,000\"");
            System.out.println("Got:      " + int2);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest7: trying to create an InfiniteInt with an illegal input");
        try
        {
            System.out.println("input to constructor: \"111a1\"...");
            System.out.println("Expected: java.lang.IllegalArgumentException: <your message>");
            int1 = new InfiniteInt("111a1");
            System.out.println("Got:      " + "no exception");
        }
        catch(Throwable ex)
        {
            System.out.println("Got:      " + ex);
        }



        System.out.println("\nTest8: a simple add");
        try
        {
            int1 = new InfiniteInt("23");
            int2 = new InfiniteInt("15");
            int3 = InfiniteInt.add(int1, int2);
            System.out.println("adding 23+15...");
            System.out.println("Expected: 38");
            System.out.println("Got:      " + int3);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest9: a simple add with a carry in the calculation");
        try
        {
            int1 = new InfiniteInt("23");
            int2 = new InfiniteInt("19");
            int3 = InfiniteInt.add(int1, int2);
            System.out.println("adding 23+19...");
            System.out.println("Expected: 42");
            System.out.println("Got:      " + int3);
        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

        System.out.println("\nTest10: a simple add with a final carry");
        try
        {
            int1 = new InfiniteInt("900");
            int2 = new InfiniteInt("121");
            int3 = InfiniteInt.add( int1, int2 );
            System.out.println("adding 900+121...");
            System.out.println("Expected: 1,021");
            System.out.println("Got:      " + int3);

        }
        catch( Throwable ex )
        {
            ex.printStackTrace();
        }



        System.out.println("\nTest11: a simple add with a final carry");
        try
        {
            int1 = new InfiniteInt("999");
            int2 = new InfiniteInt("999");
            int3 = InfiniteInt.add( int1, int2 );
            System.out.println("adding 999+999...");
            System.out.println("Expected: 1,998");
            System.out.println("Got:      " + int3);

        }
        catch( Throwable ex )
        {
            ex.printStackTrace();
        }



        System.out.println("\nTest12: the example from the requirements");
        try
        {
            int1 = new InfiniteInt("646746734");
            int2 = new InfiniteInt("543534");
            int3 = InfiniteInt.add(int1, int2);
            System.out.println("adding 646746734+543534...");
            System.out.println("Expected: 647,290,268");
            System.out.println("Got:      " + int3);				//should print 647,290,268
        }
        catch( Throwable ex )
        {
            ex.printStackTrace();
        }



        System.out.println("\nTest13: adding two HUGE ints (to be sure it does not use regular ints to do it");
        try
        {
            int1 = new InfiniteInt("646746734");
            int2 = new InfiniteInt("5435341234567");
            int3 = InfiniteInt.add(int1, int2);
            System.out.println("adding 646746734+5435341234567...");
            System.out.println("Expected: 5,435,987,981,301");
            System.out.println("Got:      " + int3);				//should print 647,290,268
        }
        catch( Throwable ex )
        {
            ex.printStackTrace();
        }



        System.out.println("\nTest14: telling a new InfiniteInt(\"24\") to compareTo(itself)");
        try
        {
            int1 = new InfiniteInt("24");
            System.out.println("Expected: 0");
            System.out.println("Got:      " + int1.compareTo( int1 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }



        System.out.println("\nTest15: telling a new InfiniteInt(\"24567\") to compareTo(new InfiniteInt(\"6\") - more nodes...");
        try
        {
            int1 = new InfiniteInt("24567");
            int2 = new InfiniteInt("6");
            System.out.println("Expected: 1");
            System.out.println("Got:      " + int1.compareTo( int2 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        System.out.println("\nTest16: telling a new InfiniteInt(\"6\") to compareTo(new InfiniteInt(\"24567\") - less nodes...");
        try
        {
            int1 = new InfiniteInt("6");
            int2 = new InfiniteInt("24567");
            System.out.println("Expected: -1");
            System.out.println("Got:      " + int1.compareTo( int2 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        System.out.println("\nTest17: telling a new InfiniteInt(\"24\") to compareTo(a different new InfiniteInt(\"24\")");
        try
        {
            int1 = new InfiniteInt("24");
            int2 = new InfiniteInt("24");
            System.out.println("Expected: 0");
            System.out.println("Got:      " + int1.compareTo( int2 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        System.out.println("\nTest18: telling a new InfiniteInt(\"242999123\") to compareTo(a different new InfiniteInt(\"242999876\")");
        try
        {
            int1 = new InfiniteInt("242999123");
            int2 = new InfiniteInt("242999876");
            System.out.println("Expected: -1");
            System.out.println("Got:      " + int1.compareTo( int2 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        System.out.println("\nTest19: telling a new InfiniteInt(\"242999123\") to compareTo(a different new InfiniteInt(\"242999876\")");
        try
        {
            int1 = new InfiniteInt("242999876");
            int2 = new InfiniteInt("242999123");
            System.out.println("Expected: 1");
            System.out.println("Got:      " + int1.compareTo( int2 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        /*
        
        System.out.println("\nTest20: telling a new InfiniteInt(\"24\") to compareTo(a new Integer(24))");
        try
        {
            int1 = new InfiniteInt("24");
            Integer int6 = new Integer("24");
            System.out.println("Expected: Exception");
            System.out.println("Got:      " + int1.compareTo( int6 ) );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        */

        System.out.println("\nTest21: telling a new InfiniteInt(\"456123\") to reverse and remove commas (revAndRemoveToString())");
        try
        {
            int1 = new InfiniteInt("456123");
            Integer int6 = new Integer("456123");
            System.out.println("Expected: 321654");
            System.out.println("Got:      " + int1.revAndRemoveToString() );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }

        System.out.println("\nTest22: telling a new InfiniteInt(\"123456\") to reverse and remove commas (revAndRemoveToString())");
        try
        {
            int1 = new InfiniteInt("123456");
            Integer int6 = new Integer("123456");
            System.out.println("Expected: 654321");
            System.out.println("Got:      " + int1.revAndRemoveToString() );
        }
        catch( Throwable ex )
        {
            System.out.println( ex );
        }
    }
}
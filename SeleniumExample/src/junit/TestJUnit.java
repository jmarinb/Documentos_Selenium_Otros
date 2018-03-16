package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//clase para llamar los dos test clases en junit

@RunWith(Suite.class)
//@SuiteClasses( { MyFirstClassTest.class , MySecondClassTest.class } )
@SuiteClasses( { MySecondClassTest.class , MyFirstClassTest.class } )
public class TestJUnit {

}

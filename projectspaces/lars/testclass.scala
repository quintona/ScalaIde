package xtest {
    
    class HelloWorldTest {
        def say() : String  = {
            return "Hello"
        }
        
    }
    
    object HelloWorldTest{
        def apply = {
            val v = new HelloWorldTest()
        }
    }
    
    
    
    
}
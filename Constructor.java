// constructor exaple

class test {
    String test1;
    // default constructor
    test() {
       test1 = " rajasekhar";
        
    }
    // parametarized constructor
    // test(String s){
    //     test1 = "new rajasekhar";
    // }
    test(String test1){
        //instance variable hiding
        this.test1 =  test1; // this represents current instance variables.
        // test1 = "naya rajasekhar";
    }
}



class Constructor {
    public static void main(String[] args){
        test t = new test();
        System.out.println("Test is writen by"+t.test1);

        test k = new test("raj");
        System.out.println("here is the new text: "+k.test1);
    }
}
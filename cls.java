class human {
    String a;
    int b;

    void c() {
        System.out.println(a+"is something");
    }
    void d() {
        System.out.println(a+"is nothing");
    }
        }
    class cls {
        // driver class
        public static void main(String[] args) {
            // Creating rajasekhar object
            human rajasekhar = new human();
            rajasekhar.a="it's me rajasekhar";
            rajasekhar.b =23;
            
            rajasekhar.c();
            rajasekhar.d();
            human mom = new human();
	mom.a = "mom";
            mom.c();
            mom.d();
        }
    }
    
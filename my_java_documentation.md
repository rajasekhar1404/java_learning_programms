## introduction to java
```
 - invented by james gosling in 1990

 - platform indipendent language

 - java first called as "oak"

 - java is object oriented programming

 - class file can be understood by JVM(java virtual machine) only

 - java is owned by oracle

 - java -- version to check the java verion

 - javac example.java to excecute the .java file

 - java example to run the class file
```

## comments in java
```
 - // is used to write the single line comment

 - /*.......*/ is used to write the multi line comments

 - /**.........*/ is used to give the documentation called as documentation comments, documentation comments are used to create api for user guide.

```

## Hello world
```
 - every java program should be with in the class boundary

 - every java program excecution will start from main method.

 - java program must be saved with the same name as the main method class name has.
 
 - public static void main(String[] args)

 - in the above line, public stands for "giving the access to use it publically. to let the JVM come and excecute the java program."

 - static: to access any methods in a class we need to create a object with in the method, if we want to access the method without a object we use this "static" keyword.

 - void: it tell that the following method doesn't return any value, if that method return any value, we need to give the type of variable instead of void.

 - main: it is the name of the method

 - String[]: is used to store all the values and inputs given to the main method.

 - System.out.println("Hello world !");

 - the above statement is used to print any values.

 - every statement should end with a semicollon (;)
 ```

## Data types in java

## Operators

## Control statements

## inputs and outputs in java

## Arrays in java

## Multidimentional array

## Strings in java

## StringBuffer in java

## Introduction to oops

## oops features

## class and objects

## methods in java

## Constructors in java

## Inheritance in java

## super keyword

## Abstract classes in java

## Interfaces in java
```
this is also a class whic is only allow abstract methods, abstract methods doesn't have any object, we need to create a class and define the objects for each abstract.
```

## pakages in java
```
a pakage is a directory that contains related classes and interfaces.

- package packagename; is used to create a package.

- we need to keep all the class files in a folder to make them as a package, for tha we can manually excecute the .java file and the created .class file can be moved to the package folder.

- to make this process much easiar and faster, we use the command called: javac -d . example.java

- now a package is automatically created with the same name you have given in the code and the class file will be moved into that folder.

- to let the classes access other packages, we need to make that class and methods and variables as a public in class.

- while creating a object we need to call it with the package name to use that class ex: raja.firstpak = new raja.firstpak
in the above example raja is the package name, firstpak is my class name.

- we can use import raja.firstpak; to import that package instead of adding it infront of each object.

- we can also import all the packages available in a folder by using import raja.*; statement, but to use user defined packages, we need to keep the .java file of that package also in the package folder.

- if we want to run the main program which class file is available in raja package, we need to use this command, javac raja.Mainclass 

- we can create sub packages in a package using this command, package raja.raja1.raja2;

- we can see all the pre defined java packages at here : https://docs.oracle.com/javase/7/docs/api/

- java lang is the default package which can not required to import, we can use it directly, except java lang to use any other package we need to import them.

```

## Access modifiers (specifiers)
```
 - Access modifiers are used to priovide the different levels of security to the variables, methods and classes.

 - types of Access modifiers: public, private, protected, default(no modifier)

 - we can access a variable or methods in two methods, 1 is by creating a object to that class 2nd one is creating a subclass for that class.


 -              public      private       protected       Default

 - Same Class     ✔️          ✔️            ✔️            ✔️

 - Same Package   ✔️          ❌            ✔️            ✔️
    sub Class
 - Same Pakage    ✔️           ❌           ✔️            ✔️ 
   non Subclass
 - Other pakage   ✔️           ❌            ✔️           ❌    
   sub class
 - Other package  ✔️           ❌            ❌           ❌   
   non sub class
   
```

## Final keyword
```
 - Final keyword is used to make the variable values fixed(constant).

 - If we use Final keyword to a method in superclass and try to create a same method in subclass, it prevents from overriding.

 - If we use Final keyword with class, we cannot create a subclass for that superclass.
 
```

## Exception handling
```
 - we have 3 types of general errors in java
 - 1.Compile time errors - missing syntax (semi colon, case, closing bracket..etc...)

 - 2.Run time errors - resource fail or missing (missing the import, out of storage etc...), it is also called as exception.

 - 3.Logical Errors - getting unwanted error due to missing the logic (getting subtraction istead of sum, issues with loops, etc)

5 key word to work with exceptions.

 - try: it will idetify the error and create a object and throw them

 - catch: it will handle the exeptions thrown by try.

 - throw: this is used to create a manuall expeption and throw to catch block, whereas try will automatically do this process.
 
 - throws: checked exceptions can be handled by system automatically using this keyword.

 - finally: the statements which are kept in finally block will excecute even how many error are there in the above code, it acts as a mandatory statement, ex: closing a file.

 - we must provide a pair for try, try with catch or finally.

 - checked exception: which can be identified at the time of compile time.
 - unchecked exceptions: can be identified only in the run time. it has to be handled manually using throw catch methods.

```

# User Defined Exception
```
 - It is used to created own defined exceptions.
 - if we get any unwrited exception error, we need to use throws keywordi in the main method.
```
# command line arguments
```
 - if we send the inputs while excecuting the java programm, we call those inputs as command line arguments.

 - we can convert a String value to intiger using Integer.parseInt(args[0]);
```

# Files in java
```
 - all the packages related to files will be stored in java.io package.
 -  we can use lot of features of a file and check lot of feature of a file using different predefined classes that are already created in Files class, we just need to import them and use them.
 - to know what operations we can do using a Files class, we can check the Api of java to get the high knowledge on Files class.
```

# Files Reading, Writing,. Copying in Java
```
 - We use streams in java to move the data from one file to another file.
 - we use *Steam* concept to do any type of action with files.
 - stream is pipe which transfers the data.
 - types of stream
    byte stream, text streams or character streams.
    byte stream - it transfers the data by each byte, it is used to access video or audio type of files.
    text stream - it transfers the data by each characters, it is used for plain text.
 - if a keyword *Stream* is used in a class, then it is considered as Byte steams.
 - if Reader/writer keyword is used in a class, then it is considered as charecter stream.
 - -1 is used to indicate the end of the file.
 - by usign the append mode we can insert the new content next to the existing content, for using this append mode, we need to use *true* keyword next to the file name while calling it.
```
# Wrapper classes
```
 - wrappers converts premitive data types to objects.
 - Number is the super class for all the wrapper classes realated to numbers.
 - Number: Integer, Byte, Short, Long, Float, Double
 - ex:
    int a = 10;
    Integer i = new Integer(a);
    above will convert the a int to wrapper class.
 - Character: to convert char type
 - string is already a class, no need to convert it.
 - Boolean: to convert boolean type values
 
```
# Collection framework
```
 - collection framework consist of set of interfaces and frameworks.
 - collection framework is used to perform actions on collection of objects.
 - we can create array's for classes also, not only for variables, we need to give the class name instead of variable type.
 ex: int a[] = {10, 20, 30, 40, 50} <!-- this is a array for a variable -->
 - Students a[] =new Student[5]; <!-- this is a array of Students class -->
 - disadvantage of using array for classes is, we can not store different type of values in one array.
 - we can not insert data inbetween two values using arrays.
 - collection classes or collection containers are available in java.util

 - collection of classes to handle group of objects is called collection framework.

 - Interface types:
      Set<T> : It will allows to store set of values, and it will expands storage automatically, it will not allow duplicate values.

         Implement classes:
         HashSet<T> : it will not garentee the order of the elements.
         LinkedHashSet<T> : it will garentee the order of the elements

            We can perform actions on individual elements using following types.
            - for-each loop
            - Iterator - it can go only in forward way, it can't go back.
            - ListIterator - used to operate in both tbe directions.
            - Enumeratoin
            
      List<T>: It is also stores group of eliments and grows automatically, the main difference between Set and List is, List can allow *duplicate values*.

         Stack<T>: 
               if follow LIFO(Last in first out) scheme, 
               push: inserting a elements to stack is called push, 
               pop: removing a element is called pop.
               peek: it will show the top most element.
               Search: to find a element present in this class or not.
               we cannot insert inbetween the list.

         LinkedList<T>
               it will stores the data in nodes,
               in each node there will be three blocks,
               Those blocks consists of Link, data and again Link.
               with this method we can get the previous and next element data.

         ArrayList<T>
               it will use array to store the elements.
               
         Vector<T>
      Queue<T>: It allow elements to arrange in a order.
      Speciality of queue is: FIFO(first in first out).

         LinkedList<T>

      Map<T>:it is allowd to store values in key values pair.

         HashMap<K,V>
         Hashtable<K,V>
```
# Important classes in Java util package
```
 - Arrays: we have planty of predefined classes in java.util class,, with them we can do lot of usefull stuff like sorting a array, finding whether a array is equals to another array or not..etc.
 
 - StringTokenizer: It will divide a large string into small parts and assign each part a tocken.
 - calander and date:
```

# Multi Threding in java
```
 - Single Tasking:
      Sequential - one after another
 - Multi Tasking:
      Concurrent or parallel execution, means each task runs for few time.
      Types of multi tasking:
         - process based: multiple programs runs each for some time.
               It will take more storage(memory)(each program takes separate memory), also called as heavy-weight-processing.
         - Thread-based: One program is divided with multiple modules.
               There is only one program, so less memory allocated, compared to process-based., also called as light-weight processing.
 - Thread: it is a single flow of excecution.

 *Steps to create and run threads:*
   1. create a class that extends Thread or implements Runnable

   2. Write run() method.

   3. create an object to above class.

   4. create Thread object and link it with our class object which is created in step-3.

   5. Run the thread using start()

   we can set priorities to tell which thread should run first, 
   for that we have setPriority(Field/priority)
   MAX_PRIORITY - 10
   NORM_PRIORITY - 5 (Default)
   MIN_PRIORITY - 1

   sleep or suspend a thread:
      sleep(milliseconds)
      suspend(), resume() - deprecated
      wait(), notify()/notifyall()

      join(): it will stop the next thread until a thread completes excecuting.

   Daemon Threads:
      Server thread

      there are two types of threads, one is user thread, next one is Daemon thread, these will service user threads, they starts automatically when the system starts until the system ends.

      we can convert a user thread to Daemon thread using setDaemon(true);
      we can check if it as Daemon thread using: isDaemon();

   Thread Life cycle:
      new/create
      Runnable
      Running/execute
      blocked
      end/terminated

   Synchronization:
      
      it will allow an object to be used by one thread at a time.

      we can add a keyword *synchronized* to a method, and we can make that method run only one thread at a time.

      or we can give a synchronized block with in a method.

   Deadlock:
      permenent blocking of a thread.

```

# AWT in java
```
 -  Object - checkboxGroup
        - Component     -  Lablel
                        -  Button
                        -  Checkbox
                        -  Choice
                        -  List
                        -  Canvas
                        -  Scrollbar
                        -  TextComponentf  - TextArea
                                           - TextFeild
                        -  Container -  Panel -  Applet
                                     - Window -  Frame


 - Event delegation model:
      it is used to run the code behind the gui, if we click a button, it will run the code.
      Event:
         performing some action on component.

      steps for creating an event delegation model; windowlistener
         1. add the componenet to the application
         2. add listeners to the components. Ex: Actionlistener, 
         3. implement methods related to the listener.

 - Layout Managers
      1. Flow Layout - Left to right and top to bottom.
      2. Border Layout - to add the buttons in the borders, north, west, south, east positions.
      3. Grid Layout - it will create a grid structures and insert the required component in them.
      4. Card Layout - it is used to show the different cards on the top.
      5. GridBag Layout - 
```

----

| Component | Listener |
|-----------|----------|
| Button | ActionListner |
| CheckBox | ItemListener |
| CheckBoxGroup | ItemListener |
| TextField | ActionListener, FocusedListener |
| Choice | ActionListener, ItemListener |
| List | ActionListener, ItemListener |
| Scrollbar | AdjustmentListener, MouseMotionListener |
| Frame | WindowListener |
| Keyboard | KeyListener |


----

# Swings in java

 - Swings are advanced way for awt classes. 
 - awt classes will use C concepts

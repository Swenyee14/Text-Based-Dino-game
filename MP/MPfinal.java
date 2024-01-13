// name: Swenyee Maung
// Student ID: 220190576
// version 1
// date: 18/10/2022
// Mini Porject Level 1
import java.util.Scanner; 
import java.util.Random;
import java.io.*;

// Contains information of transcended beings on earth
class transcended {
    String name;
    int power;
    String attack;
    String last_words;
}

// class containing information of dinosaurs in a lab
class dinosaurLab {
    final int size = 3; //sets size to 3 as they will make 3 dinosaurs
    int [] hunger = new int [size];
    int [] anger = new int [size];
    String [] name = new String [size];
    String [] fav_activity = new String [size];
    String [] fav_food = new String [size];
}

class MPfinal {
    
    public static void main (String [] a) throws IOException {
        program();
        return;
    }

    // Method takes in message as a String parameter and returns textInput
    public static String inputString (String message) {
        Scanner scanner = new Scanner(System.in);
        String textInput;
        System.out.println(message);
        textInput = scanner.nextLine();    
        return textInput;
    }

    // Method takes in message as a String paramater which converts the string data type to an integer data type that then return back to the method
    public static int inputInt (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return Integer.parseInt(scanner.nextLine());
    }

    // Method takes in message as a String paramater which converts the string data type to an integer data type that then return back to the method.
    // Checks if the user input is an integer or not. Tells the user if the input is not an Integer and tells them to re do the input.
    public static int int_validation (String message) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean isNum;

        do {
            System.out.println(message);
            if (input.hasNextInt()) {
                num = input.nextInt();
                isNum = true;
            } else {
                System.out.println("Sorry, your input is not registered correctly");
                isNum = false;
                input.next();
            }
        } while (!(isNum));

        System.out.println("You entered: " + num);
       
        return num;
    }

    // Method setup as an arguement that takes in message as a String parameter and returns statement
    // Checks if the user input is a string or not. Tells the user if the input is not a string and tells them to re do the input
    public static String string_validation (String message) {
        String statement = "haha";
        boolean isString;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            if (input.hasNextInt()) {
                System.out.println("Sorry, your input is not registered correctly");
                isString = false;
                input.next();
            } else {
                statement = input.nextLine();
                isString = true;
            }
        } while (!(isString));

        System.out.println("You entered: " + statement);
       
        return statement;
    }  

    // Method prints out a series of statements to the terminal
    public static void welcome() {
        System.out.println("Hello, welcome to the Jurassic World Program!");
        System.out.println("In this program you will be looking after a variety of dinosaurs");
        return;
    }
    
     // Method uses inputString to print out a message and take in user input. Input is stored in a variable which is then returned back to the method
    public static String name_a_dinosaur() {
        String dinosaur_name;
        dinosaur_name = inputString("Please name a dinosaur you would like to know more about. (t rex / triceratops / spinosaurus)");
        return dinosaur_name;
    }

    // Calls name_a_dinosaur and stores it in a String variable user_dinosaur
    // user_dinosaur is compared to the different possible cases in the various if statements
    // Different if statements give different outputs
    public static int data_storage() {
        int T_rex_hunger = 3;
        int T_rex_anger = 4;
        int triceratops_hunger = 2;
        int triceratops_anger = 1;
        int spinosaurus_hunger = 3;
        int spinosaurus_anger = 5;
        int overall_score = 0;
        String user_dinosaur = name_a_dinosaur();
        
        if (user_dinosaur.equalsIgnoreCase("T rex")) {
            System.out.println("The T rex's hunger levels are " + T_rex_hunger);
            System.out.println("The T rex's anger levels are " + T_rex_anger);
            overall_score = T_rex_anger + T_rex_hunger;          
        }        
        else if (user_dinosaur.equalsIgnoreCase("triceratops")) {
            System.out.println("The triceratop's hunger levels are " + triceratops_hunger);
            System.out.println("The triceratop's anger levels are " + triceratops_anger);
            overall_score = triceratops_anger + triceratops_hunger;
        }
        else if (user_dinosaur.equalsIgnoreCase("spinosaurus")) {
            System.out.println("The spinosaurs' hunger levels are " + spinosaurus_hunger);
            System.out.println("The spinosaurs' anger levels are " + spinosaurus_anger);
            overall_score = spinosaurus_anger + spinosaurus_hunger;
        }
        else {
            overall_score = -1;
            System.out.println("Sorry, we do not currenty have data on this dinosaur species.");
        }
        return overall_score;
    }

    // Method takes in danger_score as an integer parameter
    // Stores a statement in String danger_message
    // Returns danger_mesage back to the method
    public static String danger_score(int danger_score) {
        String danger_message= "";
        if (danger_score > 0) {
            danger_message = "The danger score is " + danger_score + ".";
        }
        return danger_message;
    }
    
    // Methods above are called to show case the first attraction in the park which is the beginner dinosaur exhibit
    // int score is passed through various possible if statements
    // Different if statements print out different statements
    public static void danger_announcement() {
        int score = data_storage();
        String message = danger_score(score);
        System.out.println(message);
        if (score<=3 & score>0) {
            System.out.println("A score of " + score + " means the dinosaur is calm.");
        }
        else if (score > 3 & score <= 6 ) {
            System.out.println("A score of " + score + " means the dinosaur is somewhat hangry, your safe...for now.");
        }
        else if (score > 6 & score <= 9) {
            System.out.println("A score of " + score + " means the dinosaur is somewhat...well...goodluck.");
        }
        else {
            System.out.println("We do not exactly know what this means but best to be safe and leave the park, have a good day :D");
        }
        return;
    }

    // takes in size and happiness_counter as integer paramaters
    // runs a for loop for the determined size integer
    // returns happiness_counter back to the method
    public static int happiness_calculator(int size, int happiness_counter) {
        for (int i=0; i<size; i++) {
            happiness_counter = happiness_counter + 1;
        }
        System.out.println("Paimon's happiness level is now " + happiness_counter + ".");
        return happiness_counter;
    } 

    // Method that prints out many statements
    public static void Paimon_speech() {
        System.out.println("Hello fellow visitors, we are happy to present you the new bio-engineered dinosaur");
        System.out.println("It is for people who want to forever give happines to a lovely dinosaur with pets and a variety of different foods >0.0<");
        System.out.println("Her name is Paimon");
        System.out.println("The main genetic breakthrough in this research is that Paimon can only get happier than she was before");
        System.out.println("Now...after hearing all that what would you like to do?");
        return;
    }

    // Methods starts of by printing a series of statements
    // Starts a while loop
    // In the while loop contains various possible if statements
    // The if statements use inputInt to call for an integer, uses happiness_calculator which is stored in variable happiness and prints out a final statement
    // The while loop can be either continued or closed depending on the users input to the terminal
    public static void new_dinosaur() {
        String answer, food_choice;
        int happiness = 0;
        final int pets = 1, apples = 3, steaks = 5, fish = 7;
        Paimon_speech();
        answer = inputString("Would you like to pet or give food to Paimon, different foods give different happiness levels: Choose pet/food ?");

        while (answer.equalsIgnoreCase("pet") | answer.equalsIgnoreCase("food")) {
            if (answer.equalsIgnoreCase("pet") | answer.equalsIgnoreCase("pets")) {
                int size = inputInt("Choose the number of times you would like to pet Paimon.");
                happiness = happiness_calculator(pets*size, happiness);
            }
            else if (answer.equalsIgnoreCase("food")) {
                food_choice = inputString("Choose either apple(s), steak(s) or fish(s)");
                if (food_choice.equalsIgnoreCase("apple") | food_choice.equalsIgnoreCase("apple")){
                    int size = inputInt("Choose the number of times you would like to pet Paimon.");
                    happiness = happiness_calculator(apples*size, happiness);
                }
                else if (food_choice.equalsIgnoreCase("steak") | food_choice.equalsIgnoreCase("steaks")) {
                    int size = inputInt("Choose the number of times you would like to feed Paimon.");
                    happiness = happiness_calculator(steaks*size, happiness);
                }
                else if (food_choice.equalsIgnoreCase("fish") | food_choice.equalsIgnoreCase("fishs") | food_choice.equalsIgnoreCase("fishes") | food_choice.equalsIgnoreCase("fish's")) {
                    int size = inputInt("Choose the number of times you would like to feed Paimon.");
                    happiness = happiness_calculator(fish*size, happiness);
                }
                else {
                    System.out.println("Sorry, we don't have that option at the moment.");
                }
            }
            answer = inputString("To continue choose either pet/food if not press enter.");
            
        }
        System.out.println("Thank you for being here :D");
        return;
    }

    // Return a random number between 0 (inclusive) and bound (exclusive)
    public static int random_num (int bound) {
        Random r = new Random();
        return r.nextInt(bound);
    }

    // Takes in different arrays as parameters. Then runs them through the method producing an integer expression stored in int type danger
    // return int danger to method
    public static int danger_calculator(int [] anger, int [] hunger, int i) {
        int danger;
        danger = anger[i] + hunger[i];
        return danger;
    }

    // Method that allows user to create different sets of dinosaurs with random "stats" which is shown to the user at the end of each set creation
    public static void create_your_own() {
        final int num_size, set_size;
        int random;
        set_size = inputInt("How many sets of dinosaurs would you like to create?");
        num_size = inputInt("How many dinosaurs would you like to create in each set?");
        String [] dino_name = new String [num_size];
        int [] dino_hunger = new int [num_size];
        int [] dino_anger = new int[num_size];
        int [] dino_score = new int[num_size];

        for (int j=0; j<set_size; j++) {
            System.out.println("Please create set " + (j+1));

            for (int i=0; i<num_size; i++) {
                dino_name [i] = inputString("What would you like to call dino number " + (i+1) + "?");
                random = random_num(10);
                dino_hunger [i] = random + 1;
                random = random_num(10);
                dino_anger [i] = random + 1;
                System.out.println("Just letting you know, its hunger and anger levels will be random at birth...be careful.");
                dino_score[i] = danger_calculator(dino_anger, dino_hunger, i);  
            }

            for (int i=0; i<num_size; i++) {
                System.out.println("Dino " + (i+1) + ": their name is " + dino_name[i] + ".");
                System.out.println(dino_name[i] + " has a hunger level of " + dino_hunger[i] + ".");
                System.out.println(dino_name[i] + " has a anger level of " + dino_anger[i] + ".");
                System.out.println(dino_name[i] + " has an overall danger level of " + dino_score[i] + ".");
            }
        }
        System.out.println("Thank you for creating the dinosaurs.");
        return;
    }

    // Read gozilla details from a file  and then print them
    public static void Godzilla_arrives() throws IOException { //file input
        String filename = string_validation("Type in a file you would like to access (we only have godzilla.txt right now)");
        BufferedReader inputStream = new BufferedReader (new FileReader(filename));
        //final int creature_count = Integer.parseInt(inputStream.readLine());
        transcended creature = new transcended();

        creature.name = inputStream.readLine(); // this block reads the file
        creature.power = Integer.parseInt(inputStream.readLine());
        creature.attack = inputStream.readLine();
        creature.last_words = inputStream.readLine();

        System.out.println("The transcended creatures name is " + creature.name); // this block prints the file contents into sentences
        System.out.println(creature.name + "'s powerlevel is " + creature.power);
        System.out.println(creature.name + " does " + creature.attack);
        System.out.println(creature.name + "'s last words for us are..." + creature.last_words);
        
        System.out.println("BYEBYE");
            
        inputStream.close(); // close file
    }

    // Create jeep file to view whenever
    public static void Jeep() throws IOException { //file output
        System.out.println("Time for something different...lets create a jeep to travel the park :D");
        String answer = string_validation("Would you like to create a new jeep file or open an existing file [Y to create/N to open]");
        
        if (answer.equalsIgnoreCase("y")) {
            String file_to_write = inputString("What file should the information about the jeep be saved in? (make it end in .txt)");
            PrintWriter jeep_file = new PrintWriter (new FileWriter(file_to_write));
            String colour = string_validation("What will the colour of the jeep be");
            jeep_file.println(colour);
            int tyre_size = int_validation("What will the size of the tyres be [sizes 1-3]");
            jeep_file.println(tyre_size);
            System.out.println("All data is now stored");
            jeep_file.close();
        }
        else if (answer.equalsIgnoreCase("n")) {
            String filename = string_validation("Type in a file you would like to access");
            try {
                BufferedReader inputStream = new BufferedReader (new FileReader(filename));
                final int lines = 2;

                for (int i=0; i<lines; i++) {
                    String s = inputStream.readLine();
                    System.out.println(s);
                }

                inputStream.close();
            } catch (Exception e) {
                System.out.println("Sorry, there is no existing file called " + filename);
            }
        }
        else {
            System.out.println("Please type either Y or N");
        }
    }
    

    // Creates a dinosaur 
    public static dinosaurLab createDinosaur () {
        dinosaurLab d = new dinosaurLab();
        return d;
    }

    // Given a dinosaur, sets the information into a dinosaur returning the updated dinosaur
    public static dinosaurLab setInfo (dinosaurLab d, int hg, int ag, String nm, String fa, String ff, int i) {
        d.hunger[i] = hg;
        d.anger[i] = ag;
        d.name[i] = nm;
        d.fav_activity[i] = fa;
        d.fav_food[i] = ff;
        return d;
    }



    // Given a dinosaur, asks information about the dinosaur and sets the user input into the dinosaur
    public static dinosaurLab askInfo (dinosaurLab d, int i, String message1, String message2, String message3, String message4, String message5) {
        String nm = string_validation(message3);
        int hg = int_validation(message1);
        int ag = int_validation(message2);
        String fa = string_validation(message4);
        String ff = string_validation(message5);
        setInfo(d, hg, ag, nm, fa, ff, i);
        return d;
    }

    // A series of print statements that show the user their creation of a dinosaur
    public static void getDinoInfo (dinosaurLab d, int i) {
        System.out.println("The name of dinosaur " + (i+1) + " is " + d.name[i]);
        System.out.println("Its hunger levels are " + d.hunger[i]);
        System.out.println("Its anger levels are " + d.anger[i]);
        System.out.println("Dino " + (i+1) + "'s favourite activity is " + d.fav_activity[i]);
        System.out.println("Its favourite food is " + d.fav_food[i]);
        return;
    }

    // Creates 3 different dinosaurs
    public static void tri_maker () {
        final int size = 3;
        String message1 = "What is the hunger level of your dinosaur?";
        String message2 = "What is the anger level of your dinosaur?";
        String message4 = "What is your dinosaurs favourite activity?";
        String message5 = "What is your dinosaurs favourite food?";
        dinosaurLab dino = createDinosaur();
        System.out.println(("Time to create 3 dinosaurs with more data :D"));

        for (int i=0; i<size; i++) { // Sets information the user inputs into the dinosaurs
            askInfo(dino, i, message1, message2, "What is the name of dino " + (i+1) + ":", message4, message5);
        }
 
        for (int i=0; i<size; i++) { // Prints all the informatino about the dinosaurs
            getDinoInfo(dino, i);
        }

        return;
    }

    public static void program() throws IOException {
        welcome();
        danger_announcement();
        new_dinosaur();
        create_your_own();
        Jeep();   
        tri_maker();
        Godzilla_arrives();
        return;
    }
}

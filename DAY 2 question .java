// Example 1 — Parameterless Constructor
// wrong
class Automata {
    int states;

    // ❌ Wrong: constructor has return type
    void Automata() {
        states = 4;
        System.out.println("Parameterless constructor called");
    }
    void display() {
        System.out.println("States: " + states);
    }
}
public class Main {
    public static void main(String[] args) {
        Automata A = new Automata();   // ERROR: no valid constructor
        A.display();
    }
}

// corrected
class Automata {
    int states;

    // Parameterless constructor
    Automata() {
        states = 4;
        System.out.println("Parameterless constructor called");
    }
    void display() {
        System.out.println("States: " + states);
    }
}
public class Main {
    public static void main(String[] args) {
        Automata A = new Automata();   // Correct
        A.display();
    }
}


// Example 2 — Parameterized Constructor
// Wrong
class Automata {
    int states;

    // ❌ Wrong: constructor has return type
    int Automata(int s) {
        states = s;
        System.out.println("Parameterized constructor called");
        return 0;
    }
    void display() {
        System.out.println("States: " + states);
    }
}
public class Main {
    public static void main(String[] args) {
        Automata A = new Automata(5);   // ERROR: no valid constructor
        A.display();
    }
}


// Correct
class Automata {
    int states;
    // Parameterized constructor
    Automata(int s) {
        states = s;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("States: " + states);
    }
}
public class Main {
    public static void main(String[] args) {
        Automata A = new Automata(5);   // Correct
        A.display();
    }
}




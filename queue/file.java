In public class {
 public static void main(String[] args) {
// Create a queue with room for 3 items
 SimpleQue queue = new SimpleQueue(3);

// --- ADDING ELEMENTS ---
 queue. add(10); // Added: 10
 queue. add(20); // Added:20
 queue. add(30); // Added:30

// Trying to add to a full queue
 queue. add(40); // Queue is Full!

 System. out. println();

// --- REMOVING ELEMENTS ---
 queue. remove(); // Removes 10 (First-In, First-Out)
 queue. remove(); // Removes 20

 System. out. println();

// --- ADDING MORE AFTER REMOVING ---
 queue. add(40); // Added: 40 (reuses emptied space)

// --- REMOVING REST ---
 queue. remove(); // Removes 30
 queue. remove(); // Removes 40
 queue. remove(); // Queue is Empty!
}
}

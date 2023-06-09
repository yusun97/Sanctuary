# Project 6 - Primates MVC
<img width="713" alt="Screen Shot 2022-12-12 at 2 03 23 AM" src="https://user-images.githubusercontent.com/113145079/207017629-735d1d25-fdca-4a05-b0cd-7d6632b4ba3c.png">


# Problem overview
The Jungle Friends Primate Sanctuary provides a permanent home and high-quality sanctuary care for New World primates who have been cast off from the pet trade, retired from research, or confiscated by authorities. They are seeking to replace all of their paper records with computer records where they can keep track of the individual animals that are in their care. This program is such a system that can satisfy their needs.

# Features of the program
- The Sanctuary consists of two different types of housing:
  Isolation is used to keep monkeys when they first arrive at the sanctuary and anytime they are receiving medical attention. Isolation consists of a series of cages each of which can house a single animal.
  Enclosures are much larger and can host a single troop of monkeys. Each troop consists of a single species: drill, guereza, howler, mangabey, saki,   spider, squirrel, and tamarin.
- Each enclosure is configured to house a particular species of monkeys.
- Monkeys that are received by the sanctuary must first go into isolation. At this time, each individual monkey is given a name, a species designation, a sex, a size, a weight, an approximate age, and a favorite food. The choices of favorite food include eggs, fruits, insects, leaves, nuts, seeds, and tree sap. 
- Monkeys that have received medical attention may be moved to an enclosure.
- The Sanctuary has room for twenty monkeys in isolation (cages) and eight enclosure spaces (one for each species of monkey). 
- Produce a list for every enclosure that shows each individual monkey that is currently housed there. For each individual monkey, the list should include their name, sex, and favorite food.
- Produce an alphabetical list (by name) of all of the monkeys housed in the Sanctuary.

# Run the program using JAR
JAVA 11 needed. 
Please use the JAR file in res folder.
Here is the JAR instruction https://www.jetbrains.com/help/idea/compiling-applications.html#run_packaged_jar
- Create a run configuration
- Execute the run configuration

# How to interact with the program
There are three tabs: Create Monkeys, Move Monkeys, and Print Monkeys.
- Create Monkeys: enter all information and then click the button to create a new monkey
<img width="1122" alt="Screen Shot 2023-03-15 at 7 13 32 PM" src="https://user-images.githubusercontent.com/113145079/225494030-6dcc44b5-443f-4123-9437-41190f63cfe7.png">
Once successful, there will be an message shown.
<img width="446" alt="Screen Shot 2023-03-15 at 7 13 52 PM" src="https://user-images.githubusercontent.com/113145079/225494208-f7d7e998-4e74-4435-baa0-f0cb167d2bb0.png">
- Move Monkeys: enter the name of the monkey to move it to different places or treat this monkey.
<img width="1005" alt="Screen Shot 2023-03-15 at 7 15 50 PM" src="https://user-images.githubusercontent.com/113145079/225494283-824d59b6-bbf7-43a8-92f2-75d22dace03e.png">
The moved monkey should be healthy
<img width="595" alt="Screen Shot 2023-03-15 at 7 16 08 PM" src="https://user-images.githubusercontent.com/113145079/225494438-ac3ba246-a2fc-4ede-a0c6-2168df2604c2.png">
if not, please treat it before move it
<img width="430" alt="Screen Shot 2023-03-15 at 7 16 19 PM" src="https://user-images.githubusercontent.com/113145079/225494530-97ba56fb-fa75-4d4e-8cf0-8fabc2794d22.png">
- Print Monkeys: print a list of a given enclosure or a list of all monkeys in the Sanctuary
<img width="1122" alt="Screen Shot 2023-03-15 at 7 37 21 PM" src="https://user-images.githubusercontent.com/113145079/225495986-9ecd0476-16e8-419a-97c2-0e523d9107bb.png">
monkeys in the given enclosure
<img width="1005" alt="Screen Shot 2023-03-15 at 7 37 41 PM" src="https://user-images.githubusercontent.com/113145079/225496007-83201a06-fc6a-49b3-9ced-c0bb6d0eb27f.png">
all monkeys in the sanctuary
<img width="1005" alt="Screen Shot 2023-03-15 at 7 38 02 PM" src="https://user-images.githubusercontent.com/113145079/225496054-fc502cde-7c7b-417c-8f71-31e7275e4b48.png">
- Exit: click the exit button to exit the whole program

# Assumptions
- There are only three kinds of Size: small, medium, and large
- The monkey will never die, so it will never be removed from the Sanctuary
- Each enclosure can hold monkeys as many as we want

# Limitations
- There is no reset Button. So We cannot reset the program except by exiting and running the program again
- Each enclosure should have a maximum capacity

# Bibliograph
1. “How to Use Tabbed Panes.” How to Use Tabbed Panes (The Java™ Tutorials &gt; Creating a GUI With Swing &gt; Using Swing Components), https://docs.oracle.com/javase/tutorial/uiswing/components/tabbedpane.html.
2. JTextField (Java Platform SE 7 ), 24 June 2020, https://docs.oracle.com/javase/7/docs/api/javax/swing/JTextField.html. 
3. JComboBox (Java Platform SE 7 ), 24 June 2020, https://docs.oracle.com/javase/7/docs/api/javax/swing/JComboBox.html. 

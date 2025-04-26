# alarmclock.py
This code creates an alarm clock application using Python's Tkinter library for the graphical interface and the playsound library to play an alarm sound.
It allows the user to set a specific time for the alarm and plays a sound when the current time matches the set time.

### Libraries
- tkinter.

Python's standard library for creating graphical interfaces.
It allows you to create windows, buttons, labels, text boxes, and other interface components.
It makes it easy to create and manage windows and user events.

- ttk.

A subset of tkinter that provides a number of thematically enhanced widgets.
It includes spinboxes, which are checkboxes that allow the user to choose numeric values.

- time is used to get the current time.
- playsound is used to play a sound file.

## Function
- This function is called when the "Set Alarm" button is pressed.
- It gets the user-defined alarm time from the spinboxes.
- In a continuous loop, it checks the current time and compares it to the alarm time.
- When the current time matches the alarm time, it plays the alarm sound and exits the loop.

## Interface
- A main window is created with the title "Alarm Clock".
- A label instructing the user to select the alarm time is added.
- Three spinboxes are created to allow the user to select the hour, minute, and second of the alarm.
- A button is added to allow the user to set the alarm. When clicked, it calls the alarm function.

## GUI Main Loop
root.mainloop() starts the GUI main loop, which keeps the window open and interactive.

### execution

python3 alarmclock.py

## What is GUI? GUI (Graphical User Interface) is a type of interface that allows users to interact with electronic devices through graphical elements such as windows, icons, buttons, and other visual controls.
Instead of using command-line commands, users can perform actions by clicking and dragging with the mouse or touching the screen.
In the context of this code, GUI allows the user to set an alarm in an intuitive and visual way.



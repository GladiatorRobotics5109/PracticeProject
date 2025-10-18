# Programming Practice Project Overview
This project comes with a simple simulated robot:
- It has one motor that controls how far the robot moves forward and backward. 
- The motor’s position is multiplied by the wheel radius to calculate how far the robot has “driven” in this simulation (ask me if you want a break-down on the math behind this).

You’ll be working with three main pieces of code:
- DriveSubsystem: Controls the robot’s drive motor
- DriveIO / DriveIOSim: Handles real/simulated motor input/output
- Autos: Defines commands that tell the robot what to do automatically

# Assignments
## 1 - Drive Forward
Make the robot move forward in autonomous by implementing the ```Autos.driveForward()``` command. 
The ```Autos``` class contains the ```setDriveVoltage``` command which can be used to move the robot. 
This command will tell the ```DriveSubsystem``` to set its motor to the provided voltage, moving the robot forward/backward. 
[The Format of a Command](#the-format-of-a-command) for how a command is formatted.

## 2 - Drive Forward and Backward
Write a ```Autos.driveForwardAndBack``` method that makes the robot drive forward for 5 seconds, then drive backwards for 3 seconds, then stops moving.

Hint: You'll probably want to use ```Commands.sequence()``` to construct a command that drives the robot forward, waits 5 seconds, drives the robot backwards (negative applied voltage), waits for 3 seconds, then sets the drive voltage to 0.

## 3 - Basic Controller
Make the robot execute the ```Autos.driveForwardAndBack``` command when the driver presses 'a'.

# Resources
## The Format of a Command
```java
  /** An example command */
  public static Command exampleCommand() {
    // Return the command to be run
    return Commands.sequence(                        // 'Commands.sequence()' runs the following commands in the order that they are provided
      Commands.print("This is an example command!"), // 'Commands.print()' is a command that prints a message to the console
      Commands.waitSeconds(1),                       // 'Commands.waitSeconds()' is a command that pauses for the provided number of seconds
      Commands.print("Hello after 1 second!")
    );
  }
```

## Using a Controller
```java
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
    private final CommandXboxController m_controller;

    public RobotContainer() {
        m_controller = new CommandXboxController(0);
    }

    public void configureBindings() {
        m_controller.a().onTrue(Commands.print("A was pressed!"));
    }
}
```

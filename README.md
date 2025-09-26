# Programming Practice Project
## 1 - Drive Forward
Make the robot move forward in autonomous by implementing the ``` Autos.driveForward() ``` command. The ```Autos``` class contains the ```setDriveVoltage``` command which can be used to move the robot. This command will tell the ```DriveSubsystem``` to set its motors to the provided voltage, moving the robot forward.

## 2 - Drive Forward and Backward
Write a new command inside the ```Autos``` class that makes the robot drive forward for 5 seconds, then drive backwards for 3 seconds, then stops moving.

# Resources
## The Format of a Command
```java
  /** An example command */
  public static Command exampleCommand() {
    return Commands.sequence( // 'Commands.sequence()' runs the following commands in the order that they are provided
      Commands.print("This is an example command!"), // 'Commands.print()' returns a command that prints a message to the console
      Commands.waitSeconds(1), // 'Commands.waitSeconds()' returns a command that pauses for the provided number of seconds
      Commands.print("Hello after 1 second!")
    );
  }
```

## Using a Controller
```java

```
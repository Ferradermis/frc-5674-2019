/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.Shift;
import frc.robot.commands.VisionTrack;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  /*
  public XboxController controller = new XboxController(0);

  public double getLeftStick() {
    return controller.getRawAxis(1);
  }

  public double getRightStick() {
    return -controller.getRawAxis(3);
  }
  */

  Joystick stick = new Joystick(0);
  Button trigger = new JoystickButton(stick, 1);
  Button button3 = new JoystickButton(stick, 3);
  
  public double getX() {
    return -stick.getRawAxis(0);
  }

  public double getY() {
    return -stick.getRawAxis(1);
  }

  public OI() {
    trigger.whileHeld(new VisionTrack());
    button3.whenPressed(new Shift());
  }

  //Button button = new JoystickButton(stick, 0);


  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

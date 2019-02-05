/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  /*
    PWM port values
  */
  public static final int BLINKIN_ID = -1;

  /*
    CAN ID values
  */
  /** Front left drive train motor CAN ID. */
  public static final int FRONT_LEFT_CAN_ID = 1;
  /** Back left drive train motor CAN ID. */
  public static final int BACK_LEFT_CAN_ID = 3;
  /** Front right drive train motor CAN ID. */
  public static final int FRONT_RIGHT_CAN_ID = 2;
  /** Back right drive train motor CAN ID. */
  public static final int BACK_RIGHT_CAN_ID = 4;
  
  /** Wedge deployment motor CAN ID. */
  public static final int WEDGE_MOTOR_CAN_ID = -1;

  /** Cargo intake motor CAN ID. */
  public static final int CARGO_INTAKE_CAN_ID = -1;
  /** Cargo deploy motor CAN ID. */
  public static final int CARGO_DEPLOY_CAN_ID = -1;
  
  /** Climb lift extension CAN ID. */
  public static final int CLIMB_EXTENDER_CAN_ID = -1;
  /** Climb wheel CAN ID. */
  public static final int CLIMB_WHEEL_CAN_ID = -1;

  /** Front lift CAN ID. */
  public static final int FRONT_LIFT_CAN_ID = -1;

  /*
    PCM ID values
  */
  /** Hatch intake solenoid ID. */
  public static final int HATCH_EXTENDER_ID = -1;

}

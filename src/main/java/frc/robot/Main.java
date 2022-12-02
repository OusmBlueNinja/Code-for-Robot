// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
    Spark spark = new Spark(0); // 0 is the RIO PWM port this is connected to

    spark.set(-0.75); // the % output of the motor, between -1 and 1

    VictorSP victor = new VictorSP(0); // 0 is the RIO PWM port this is connected to

    victor.set(0.6); // the % output of the motor, between -1 and 1
  }

  PWMSparkMax m_motorRight = new PWMSparkMax(0);

@Override
public void robotInit() {
   m_motorRight.setInverted(true);
}
}

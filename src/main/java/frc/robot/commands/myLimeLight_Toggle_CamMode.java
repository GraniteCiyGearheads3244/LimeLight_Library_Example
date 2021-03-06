/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import oi.limelightvision.limelight.frc.ControlMode.CamMode;

/**
 * Add your docs here.
 */
public class myLimeLight_Toggle_CamMode extends InstantCommand {
  /**
   * Add your docs here.
   */
  public myLimeLight_Toggle_CamMode() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.mylimelight);
    setRunWhenDisabled(true);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    if(Robot.mylimelight.getLimeLight().getCamMode() == CamMode.kdriver){
      Robot.mylimelight.getLimeLight().setCamMode(CamMode.kvision);
    }else{
      Robot.mylimelight.getLimeLight().setCamMode(CamMode.kdriver);
    }
    
  }

}

package frc.robot.subsystems;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.system.LinearSystem;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.system.plant.LinearSystemId;
import edu.wpi.first.wpilibj.simulation.DCMotorSim;
import frc.robot.Robot;

public class DriveIOSim implements DriveIO {
    private final DCMotor m_motor;
    private final DCMotorSim m_sim;

    public DriveIOSim() {
        m_motor = DCMotor.getKrakenX60(1);
        m_sim = new DCMotorSim(
            LinearSystemId.createDCMotorSystem(m_motor, 5, 1.0), 
            m_motor, 
            0.0,
            0.0
        );
    }

    @Override
    public void updateInputs(ExampleIOInputs inputs) {
        inputs.appliedVolts = m_sim.getInputVoltage();

        inputs.positionRad = m_sim.getAngularPositionRad();
        inputs.velocityRadPerSec = m_sim.getAngularVelocityRadPerSec();
        inputs.accelerationRadPerSecSq = m_sim.getAngularAccelerationRadPerSecSq();
    }

    @Override
    public void setVoltage(double volts) {
        m_sim.setInputVoltage(MathUtil.clamp(volts, -12.0, 12.0));
    }

    @Override
    public void periodic() {
        m_sim.update(Robot.defaultPeriodSecs);
    }
}

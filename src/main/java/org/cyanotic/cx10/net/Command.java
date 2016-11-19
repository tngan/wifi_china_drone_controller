package org.cyanotic.cx10.net;

/**
 * Created by cyanotic on 19/11/2016.
 */
public class Command {

    private int pitch;
    private int yaw;
    private int roll;
    private int throttle;

    public Command() {
        this(0, 0, 0, 0);
    }

    public Command(int pitch, int yaw, int roll, int throttle) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
        this.throttle = throttle;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        if (pitch < 0) {
            pitch = 0;
        } else if (pitch > 254) {
            pitch = 254;
        }
        this.pitch = pitch;
    }

    public int getYaw() {
        return yaw;
    }

    public void setYaw(int yaw) {
        if (yaw < 0) {
            yaw = 0;
        } else if (yaw > 254) {
            yaw = 254;
        }
        this.yaw = yaw;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        if (roll < 0) {
            roll = 0;
        } else if (roll > 254) {
            roll = 254;
        }
        this.roll = roll;
    }

    public int getThrottle() {
        return throttle;
    }

    public void setThrottle(int throttle) {
        if (throttle < 0) {
            throttle = 0;
        } else if (throttle > 254) {
            throttle = 254;
        }
        this.throttle = throttle;
    }

    @Override
    public String toString() {
        return "Command{" +
                "\npitch=" + pitch +
                "\nyaw=" + yaw +
                "\nroll=" + roll +
                "\nthrottle=" + throttle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Command command = (Command) o;

        if (pitch != command.pitch) return false;
        if (yaw != command.yaw) return false;
        if (roll != command.roll) return false;
        return throttle == command.throttle;

    }

    @Override
    public int hashCode() {
        int result = pitch;
        result = 31 * result + yaw;
        result = 31 * result + roll;
        result = 31 * result + throttle;
        return result;
    }
}

package LLD.Behavioural_Design_Pattern.Command_Design_Pattern;

// create command Interface
interface CommandII {
    void execute();
}

// Create ConcreteCommand: LightCommands class
class LightCommands {
    public static class LightCommandOn implements CommandII {
        private final Light light;

        public LightCommandOn(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            this.light.turnOnLight();
        }
    }

    public static class LightCommandOff implements Command {
        private final Light light;

        public LightCommandOff(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            this.light.turnOffLight();
        }
    }
}

// Create ConcreteCommand: FanCommands class
class FanCommands {
    public static class FanCommandOn implements Command {
        private final Fan fan;
        public FanCommandOn(Fan fan) {
            this.fan = fan;
        }
        @Override
        public void execute() {
            this.fan.turnOnFan();
        }
    }

    public static class FanCommandOff implements Command {
        private final Fan fan;

        public FanCommandOff(Fan fan) {
            this.fan = fan;
        }

        @Override
        public void execute() {
            this.fan.turnOffFan();
        }
    }
}

// Create Receiver: Fan class, Light class
class Fan {
    public void turnOnFan() {
        System.out.println("Fan turned ON!!");
    }

    public void turnOffFan() {
        System.out.println("Fan turned OFF!!");
    }
}

class Light {
    public void turnOnLight() {
        System.out.println("Light turned ON!!");
    }

    public void turnOffLight() {
        System.out.println("Light turned OFF!!");
    }
}

// Create Invoker: RemoteControl class
class RemoteControl {
    private LightCommands.LightCommandOn lightCommandOn;
    private LightCommands.LightCommandOff lightCommandOff;
    private FanCommands.FanCommandOn fanCommandOn;
    private FanCommands.FanCommandOff fanCommandOff;

    // set the values in the action buttons on RemoteControl.
    public void setLightCommandOn(LightCommands.LightCommandOn lightCommandOn) {
        this.lightCommandOn = lightCommandOn;
    }

    public void setLightCommandOff(LightCommands.LightCommandOff lightCommandOff) {
        this.lightCommandOff = lightCommandOff;
    }

    public void setFanCommandOff(FanCommands.FanCommandOff fanCommandOff) {
        this.fanCommandOff = fanCommandOff;
    }

    public void setFanCommandOn(FanCommands.FanCommandOn fanCommandOn) {
        this.fanCommandOn = fanCommandOn;
    }

    // Action button for RemoteControl.
    public void lightOn() {
        if (this.lightCommandOn != null) {
            this.lightCommandOn.execute();
        }
    }

    public void lightOff() {
        if (this.lightCommandOff != null) {
            this.lightCommandOff.execute();
        }
    }

    public void fanOn() {
        if (this.fanCommandOn != null) {
            this.fanCommandOn.execute();
        }
    }

    public void fanOff() {
        if (this.fanCommandOff != null) {
            this.fanCommandOff.execute();
        }
    }
}

// Client code
public class CommandPatternII {
    public static void main(String[] args) {
        // Create receiver objects
        Light light = new Light();
        Fan fan = new Fan();

        // Create ConcreteCommand objects
        LightCommands.LightCommandOn lightCommandOn = new LightCommands.LightCommandOn(light);
        LightCommands.LightCommandOff lightCommandOff = new LightCommands.LightCommandOff(light);

        FanCommands.FanCommandOn fanCommandOn = new FanCommands.FanCommandOn(fan);
        FanCommands.FanCommandOff fanCommandOff = new FanCommands.FanCommandOff(fan);

        // create Invoker object.
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setLightCommandOn(lightCommandOn);
        remoteControl.setLightCommandOff(lightCommandOff);
        remoteControl.setFanCommandOn(fanCommandOn);
        remoteControl.setFanCommandOff(fanCommandOff);

        // Perform action using Invoker object
        remoteControl.lightOn();
        remoteControl.lightOff();
    }
}

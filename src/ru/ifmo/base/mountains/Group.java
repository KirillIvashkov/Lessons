package ru.ifmo.base.mountains;

public class Group {
    private boolean isOpen;
    private Climber[] climbers;
    private Mountains mountain;

    public Group(boolean isOpen, Climber[] climbers, Mountains mountain) {
        this.isOpen = isOpen;
        this.climbers = climbers;
        this.mountain = mountain;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        if (true){
            System.out.println("Набор открыт");
        }
        else {
            System.out.println("Набор закрыт");
        }
        isOpen = open;
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public void setClimbers(Climber[] climbers) {
        this.climbers = climbers;
    }

    public Mountains getMountain() {
        return mountain;
    }

    public void setMountain(Mountains mountain) {
        this.mountain = mountain;
    }
    public void addClimber(Climber newCLimber) {
        for (int i = 0; i < climbers.length ; i++) {
            if (isOpen = true && climbers[i] == null) {
                climbers[i] = newCLimber;
            }
        }
    }

    }


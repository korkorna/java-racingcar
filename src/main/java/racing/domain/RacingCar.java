package racing.domain;

public class RacingCar {
    private final int MOVE_CONIDTION = 4;

    private String name = null;
    private int position = 0;

    public RacingCar(String name) {
        this(name, 0);
    }
    
    public RacingCar(String name, int position) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("자동차 이름이 반드시 필요합니다.");
        }
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return position;
    }

    public void move(int drivingForce) {
        if (canMove(drivingForce)) {
            position++;
        }
    }

    private boolean canMove(int drivingForce) {
        return drivingForce >= MOVE_CONIDTION;
    }

    public boolean isPosition(int position) {
        return this.position == position;
    }
}

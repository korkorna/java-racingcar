package racing.domain;

import racing.utils.RandomMoveGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private int times;
    private List<RacingCar> cars = null;

    private  final int MAX_MOVE_SIZE = 10;
    private final String SEPERATOR = ",";

    public RacingGame(int times, String carNames) {
        if (carNames == null || carNames.length() == 0) {
            throw new IllegalArgumentException("자동차 이름이 반드시 필요합니다.");
        }
        this.times = times;
        readyRacingCars(carNames);
    }

    private void readyRacingCars(String carNames) {
        cars = new ArrayList<>();
        for (String name: carNames.split(SEPERATOR)) {
            cars.add(new RacingCar(name));
        }
    }

    public List<RacingCar> move() {
        validateGameDoing();
        moveCars();
        decreaseTimes();
        return cars;
    }

    private void validateGameDoing() {
        if (isFinish()) {
            throw new RacingGameException("RacingGame is over.");
        }
    }

    private void moveCars() {
        for (RacingCar car : cars) {
            car.move(generateMoveNumber());
        }
    }

    public List<RacingCar> getResultOfTheGame() {
        return Collections.unmodifiableList(cars);
    }

    public boolean isFinish() {
        return times == 0;
    }

    private void decreaseTimes() {
        --times;
    }

    private int generateMoveNumber() {
        return RandomMoveGenerator.nextInt(MAX_MOVE_SIZE);
    }
}
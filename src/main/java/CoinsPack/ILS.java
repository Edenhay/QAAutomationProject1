package CoinsPack;

public class ILS extends Coin {

    final double value = 0.28;

    @Override
    double getValue() {
        return value;
    }

    @Override
    public double calculate(double input) {
        return input * getValue();
    }
}

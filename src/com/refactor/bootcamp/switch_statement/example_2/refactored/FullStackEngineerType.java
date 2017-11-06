package com.refactor.bootcamp.switch_statement.example_2.refactored;

public class FullStackEngineerType extends EngineerType {

    @Override
    String getType() {
        return "FullStack";
    }

    @Override
    public double getBillableAmount(double unit) {
        double base = unit * 0.6;
        double tax = base * 0.1;
        return base + tax;
    }
}

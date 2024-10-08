package com.machine.washing.domain;


public class Temperature {

        private TemperatureScale scale;
        private double value;

        public Temperature(TemperatureScale scale) {
            this.scale = scale;
            this.value = value;

        }


        @Override
        public String toString(){
            return value + scale.toString();
        }


        public double getValue() {

            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public TemperatureScale getScale() {
            return scale;
        }

        public void setScale(TemperatureScale scale) {
            this.scale = scale;
        }
    }



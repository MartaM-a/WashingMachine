package com.machine.washing.domain;

public class Program {

        private ProgramName name;
        private int minV;
        private int maxV;
        private double minTemp;
        private double maxTemp;
        private TemperatureScale scale;


        public Program( ProgramName name, int minV, int maxV, double maxTemp, double minTemp, TemperatureScale scale) {
            this.name = name;
            this.minV = minV;
            this.maxV = maxV;
            this.maxTemp = maxTemp;
            this.minTemp = minTemp;
            this.scale = scale;

        }

        public ProgramName getName() {
            return name;
        }

        public int getMinV() {
            return minV;
        }

        public int getMaxV() {
            return maxV;
        }

        public double getMinTemp() {
            return minTemp;
        }

        public double getMaxTemp() {
            return maxTemp;
        }

        public TemperatureScale getScale() {
            return scale;
        }


    }




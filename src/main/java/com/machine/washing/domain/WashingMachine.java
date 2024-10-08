package com.machine.washing.domain;

import java.util.ArrayList;
import java.util.List;

public class  WashingMachine {

    private Integer id;
    private List<Program> programs = new ArrayList<>();
    private Integer currentProgram;
    private Temperature currentTemp;
    private int currentV;


    public void setPrograms(int i) {
        if (i >= programs.size()) {
            throw new IllegalArgumentException();
        }
        currentProgram = i;
    }

    public Program getProgram() {
        if (currentProgram != null) {
            return programs.get(currentProgram);
        } else {
            return null;
        }


    }



    public Program previosProgram() {
        if (currentProgram == null) {
            throw new IllegalArgumentException();
        }
        --currentProgram;
        if (currentProgram < 0) {
            currentProgram = programs.size() - 1;
        }

        return programs.get(currentProgram);

    }

    public Program nextProgram() {
        if (currentProgram == null) {
            throw new IllegalArgumentException();
        }
        ++currentProgram;
        if (currentProgram == programs.size()) {
            currentProgram = 0;
        }

        return programs.get(currentProgram);


    }

}




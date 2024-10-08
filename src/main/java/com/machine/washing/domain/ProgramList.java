package com.machine.washing.domain;

import java.util.HashMap;
import java.util.Map;



    public class ProgramList {

        private Map<ProgramName, Program> map = new HashMap<>();
        public void add(Program program){
            if (map.containsKey(program.getName())){

                throw new IllegalArgumentException("Program " + program.getName() + " exists");

            }
            map.put( program.getName(),program);

        }

    }



package Assembler;

public class FinalCode {
    private String[] reserved = {
      "$0",
      "$at",
      // Used for expression evaluations and to hold the integer type function results.
      // Also used to pass the static link when calling nested procedures.
      "$2..$3",
      ""
    };
    private static final String REGISTER_EVALUATION = "$at";

    public FinalCode(){

    }
}

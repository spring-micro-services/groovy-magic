package com.virtusa.groovy.test

import com.virtusa.Adder
import spock.lang.Specification

/**
 * Created by tvajjala on 8/6/17.
 */
class AdditionTest extends  Specification{

    def "Two number addition"(){

        given: "An adder"
            Adder adder=new Adder();

        expect: "that calculates sum of two numbers"
            adder.sum(first, second)==result

        where:"Some scenarios are"
            first       ||      second      || result
            2           ||       3          ||   5
            5           ||       2          ||   7
            5           ||       8          ||   13
            4           ||       9          ||   13
            2           ||       4          ||   6


    }
}

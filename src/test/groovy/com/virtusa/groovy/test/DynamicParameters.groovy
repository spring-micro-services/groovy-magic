package com.virtusa.groovy.test

import com.virtusa.Adder
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class DynamicParameters extends  Specification{

    def "Adding #first and #second numbers"(){
        given: "A calculator"
             Adder adder=new Adder()
        expect: "that give positive number always"
             adder.sum first , second
        where: "some scenarios are"
            first << (20..80)
            second << (2..10)
    }
}

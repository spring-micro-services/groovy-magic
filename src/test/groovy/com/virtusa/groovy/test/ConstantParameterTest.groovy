package com.virtusa.groovy.test

import com.virtusa.groovy.Calculator
import spock.lang.Specification
import spock.lang.Unroll

@Unroll("Multiplying #first and #second ")
class ConstantParameterTest extends  Specification{


    def "Multiplying #first and #second number is always negative "(){

        given:" a calculator"
            Calculator calculator=new Calculator()
        expect: "that multiplying a positive and negative number results in "
            calculator.multiply(first , second) <0
        where: "some scenarios are"
            first<< [20,10,2,9,34]
            second =-1
    }
}

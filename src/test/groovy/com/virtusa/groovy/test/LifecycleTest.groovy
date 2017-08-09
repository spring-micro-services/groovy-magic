package com.virtusa.groovy.test

import com.virtusa.Adder
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class LifecycleTest extends  Specification{

    Logger  LOGGER=LoggerFactory.getLogger(LifecycleTest.class);

        def setup(){
            println "Setup prepares next run"
        }

        def "Addition test for #first + #second = #sum"(){
            given: "an adder"
                Adder adder=new Adder()
                println "Given: block runs"
            when: "the add method is called for two numbers"
                int result=adder.sum first,second
                println "When: block runs for first=$first and second = $second"
                LOGGER.info("Adding two number {$first} and {$second}")
            then: "the result should be the sum of them"
                result==sum
                println "Then: block is evaluated for sum= $sum"
            where: "some scenarios are"
                first   |   second  || sum
                1       |   1       || 2
                1       |   3       || 5
               -2       |   3       || 1
        }

        def cleanup(){
            println "Cleanup releases resources of the last run\n"
        }

}

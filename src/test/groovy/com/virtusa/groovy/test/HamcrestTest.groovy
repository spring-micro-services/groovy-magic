package com.virtusa.groovy.test

import spock.lang.Specification
import static org.hamcrest.core.IsCollectionContaining.*
import static org.hamcrest.core.IsNot.*
/**
 * Created by tvajjala on 8/4/17.
 */
class HamcrestTest extends  Specification{

    def "simple test with hamcrest"(){

        given: "A list of products"
            List<String> products=["camera","laptop","hifi"]
        expect: "Camera should be one of the item"
            products hasItem("camera")
        and: "iPad is not one of them"
            products not(hasItem("iPad"))

    }

}

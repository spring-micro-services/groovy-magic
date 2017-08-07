package com.virtusa.groovy.test

import spock.lang.Specification
import static org.hamcrest.BaseMatcher.*;

import static org.hamcrest.core.IsCollectionContaining.*
import static org.hamcrest.core.IsNot.*
/**
 * Created by tvajjala on 8/6/17.
 */
class HamcrestTwoTest extends  Specification{

    def "trivial test with hamcrest "(){

        given: "an empty list"
        List<String> products=new ArrayList<>();

        when: "it is filled with products"
        products.add "laptop"
        products.add "ipad"
        products.add "hifi"


        then: "Camera should be one amount them"
        //expect(products,hasItem("camera"))
        and: "hotdog is not one of them"
        //that(products,not(hasItem("hotdog")))


    }
}

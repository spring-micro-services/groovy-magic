package com.virtusa.groovy.test

import com.virtusa.WarehouseI
import spock.lang.Specification

class SpockTest extends Specification {

    def "if warehouse has the product on stock "(){
        given: "a basket and a TV"
        and:" a warehouse with enough stock"
            WarehouseI inv=Stub(WarehouseI)
        expect: "user checks out the tv"
            inv.count()==false
    }
}

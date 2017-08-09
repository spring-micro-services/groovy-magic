package com.virtusa.groovy.test

import com.virtusa.groovy.ImageValidator
import spock.lang.Specification

class OneColumnTest extends  Specification{

    def setup(){
        println "setup "
    }
    def "image invalid extensions"() {

        given: "an image extension checker"
          ImageValidator validator = new ImageValidator()

        expect: "that only valid file names are accepted"
             validator.isValidImageExtension(pictureName)

        where: "sample image names are Second column must be underscore"
            pictureName     || _
            "screen.png"    || _
            "image.jpg"     || _

    }

    def cleanup(){
        println "cleanup of the code"
    }
}



package com.virtusa.groovy.test

import com.virtusa.groovy.ImageValidator
import spock.lang.Specification

/**
 * Created by tvajjala on 8/6/17.
 */
class ParameterizedTest extends  Specification{

    def "Valid images are PNG and JPEG files"(){

        given: "an image extension checker"
            ImageValidator validator=new ImageValidator()

        expect:"that accepts only valid file names"
            validator.isValidImageExtension(pictureFile)==validPicture
        where: "same image names are"

            pictureFile         || validPicture
            "wood-trail.jpg"    || true
            "car.jpg"           || true
            "civic.png"         || true
            "toyota.gif"        || false


    }
}

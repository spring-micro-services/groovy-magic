package com.virtusa.groovy.test

import com.virtusa.groovy.ImageValidator
import spock.lang.Specification
import spock.lang.Unroll

@Unroll("Checking image name #pictureFile")
class CombinationsTest extends  Specification {

    def "All kinds of JPEG files are accepted"(){
        given:"an image extension checker"
            ImageValidator validator=new ImageValidator()
        expect:" that all jpeg filenames are accepted regarless of case"
            validator.isValidImageExtension(pictureFile)
        where: "sample image names are"
            pictureFile <<
        GroovyCollections.combinations([["sample.","Sample.","SAMPLE."],['j','J'],['p','P'],['g','G']])*.join()
    }
}

package com.virtusa.groovy.test

import com.virtusa.groovy.ImageValidator
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class DataPipesTest extends  Specification{

    def "valid images are PNG and JPEF files only filename is #pictureFile"(){
        given: "an image extension checker"
            ImageValidator validator=new ImageValidator();
        expect:"that only valid filenames are accepted"
            validator.isValidImageExtension(pictureFile)==validPicture
        where: "sample image names are"
            pictureFile<<["scenary.jpg","house.jpeg","car.png","sky.tiff"]
            validPicture<<[true,true,true,false]


    }
}

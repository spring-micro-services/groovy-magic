package com.virtusa.groovy

/**
 * Created by tvajjala on 8/6/17.
 */
class ImageValidator {


    boolean isValidImageExtension(String image){
        return image.toLowerCase().endsWith(".png")||image.toLowerCase().endsWith(".jpg");
    }
}

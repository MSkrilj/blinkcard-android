package com.microblink.blinkcard.result.extract.util.images;

public class EncodedImagesUtil {

    public static boolean shouldShowEncodedImageEntry(byte[] encodedImage) {
        return encodedImage != null && encodedImage.length > 0;
    }

}

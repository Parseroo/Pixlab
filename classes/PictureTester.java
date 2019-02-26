//package com.gradescope.pixlab;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester {
  /** Method to test zeroBlue */
  public static void testZeroBlue() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.zeroBlue();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }

  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue() {
      Picture beach = new Picture("images/beach.jpg");
      beach.explore(); //comment these out in repl.it
      beach.keepOnlyBlue();
      beach.explore(); //comment these out in repl.it
  }

    /** Method to test keepOnlyRed */
    public static void testKeepOnlyRed() {
        Picture beach = new Picture("images/beach.jpg");
        beach.explore(); //comment these out in repl.it
        beach.keepOnlyRed();
        beach.explore(); //comment these out in repl.it
    }

    public static void testKeepOnlyGreen() {
        Picture beach = new Picture("images/beach.jpg");
        beach.explore(); //comment these out in repl.it
        beach.keepOnlyGreen();
        beach.explore(); //comment these out in repl.it
    }


  /** Method to test negate */
  public static void testNegate() {
      Picture beach = new Picture("images/beach.jpg");
      beach.explore(); //comment these out in repl.it
      beach.negate();
      beach.explore(); //comment these out in repl.it
  }

  /** Method to test greyscale */
  public static void testGreyscale() {
      Picture beach = new Picture("images/beach.jpg");
      beach.explore();
      beach.greyscale();
      beach.explore();
  }

  /** Method to test fixUnderwater */
  public static void testFixUnderwater() {
      Picture water = new Picture("images/water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }

  /** Method to test MirrorVerticalRightToLeft */
    /*public static void testMirrorVerticalRightToleft() {
        Picture beach = new Picture("images/beach.jpg");
        beach.explore();
        beach.mirrorVerticalRightToLeft();
        beach.explore();
    }*/


    /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args) {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGreyscale();
    //testFixUnderwater();
      //testMirrorVerticalRightToLeft();
      testMirrorVertical();
    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
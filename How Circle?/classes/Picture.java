import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.io.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj: rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that keeps only the blue color - sets the red and green
    * to zero */
//  public void keepOnlyBlue()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    // The nested enhanced for loops commented out here are equivalent to the 
//    // traditional nested for loops from the teacher guide
////     for (Pixel[] rowArray : pixels)
////     {
////       for (Pixel pixel: rowArray)
////       {
////         pixel.setRed(0);
////         pixel.setGreen(0);
////       }
////     }
//    // Code from the teacher guide that is equivalent to the nested enhanced for loops above
//    Pixel pixel = null;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        pixel = pixels[row][col];
//        pixel.setRed(0);
//        pixel.setGreen(0);
//      }
//    }
//  }
//  
//  /** Method that keeps only the red color */
//  public void keepOnlyRed()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    for (Pixel[] rowArray : pixels)
//    {
//      for (Pixel pixel: rowArray)
//      {
//        pixel.setBlue(0);
//        pixel.setGreen(0);
//      }
//    }
//  }
//  
//  /** Method that keeps only the green color */
//  public void keepOnlyGreen()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    for (Pixel[] rowArray : pixels)
//    {
//      for (Pixel pixel: rowArray)
//      {
//        pixel.setRed(0);
//        pixel.setBlue(0);
//      }
//    }
//  }
//  
//  /** Method that negates the colors in the picture */
//  public void negate()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    // The nested enhanced for loops commented out here are equivalent to the 
//    // traditional nested for loops from the teacher guide
////     for (Pixel[] rowArray : pixels)
////     {
////       for (Pixel pixel: rowArray)
////       {
////         pixel.setRed(255-pixel.getRed());
////         pixel.setGreen(255-pixel.getGreen());
////         pixel.setBlue(255-pixel.getBlue());
////       }
////     }
//    // Code from the teacher guide that is equivalent to the nested enhanced for loops above
//    Pixel pixel = null;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        pixel = pixels[row][col];
//        pixel.setRed(255-pixel.getRed());
//        pixel.setGreen(255-pixel.getGreen());
//        pixel.setBlue(255-pixel.getBlue());
//      }
//    }
//  }
//  
//  /** Method that makes the picture all shades of gray */
//  public void grayscale()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    // The nested enhanced for loops commented out here are equivalent to the 
//    // traditional nested for loops from the teacher guide
////     int total = 0;
////     int average = 0;
////     for (Pixel[] rowArray : pixels)
////     {
////       for (Pixel pixel: rowArray)
////       {
////         total = pixel.getRed();
////         total = total + pixel.getGreen();
////         total = total + pixel.getBlue();
////         average = total / 3;
////         pixel.setColor(new Color(average, average, average));  
////       }
////     }
//    // Code from the teacher guide that is equivalent to the nested enhanced for loops above
//    Pixel pixel = null;
//    int total = 0;
//    int average = 0;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        total = 0;
//        pixel = pixels[row][col];
//        total = total + pixel.getRed();
//        total = total + pixel.getGreen();
//        total = total + pixel.getBlue();
//        average = total / 3;
//        pixel.setColor(new Color(average, average, average)); 
//      }
//    }
//  }
//  
//  /**
//   * Method to fix pictures taken underwater
//   */
//  public void fixUnderwater()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    // The nested enhanced for loops commented out here are equivalent to the 
//    // traditional nested for loops from the teacher guide
////     for (Pixel[] rowArray : pixels)
////     {
////       for (Pixel pixel: rowArray)
////       {
////         pixel.setRed(pixel.getRed() * 3);
////       }
////     }
//    // Code from the teacher guide that is equivalent to the nested enhanced for loops above
//    Pixel pixel = null;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        pixel = pixels[row][col];
//        pixel.setRed(pixel.getRed() * 3);
//      }
//    }
//  }
// 
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
//  public void mirrorVertical()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel leftPixel = null;
//    Pixel rightPixel = null;
//    int width = pixels[0].length;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; col < width / 2; col++)
//      {
//        leftPixel = pixels[row][col];
//        rightPixel = pixels[row][width - 1 - col];
//        rightPixel.setColor(leftPixel.getColor());
//      }
//    } 
//  }
//  
//  /** Method that mirrors the picture around a 
//    * vertical mirror in the center of the picture
//     * from right to left */
//  public void mirrorVerticalRightToLeft()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel leftPixel = null;
//    Pixel rightPixel = null;
//    int width = pixels[0].length;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; col < width / 2; col++)
//      {
//        leftPixel = pixels[row][col];
//        rightPixel = pixels[row][width - col - 1];
//        leftPixel.setColor(rightPixel.getColor());
//      }
//    } 
//  }
//  
//  /** Method that mirrors the picture around a 
//    * horizontal mirror in the center of the picture
//     * from top to botttom */
//  public void mirrorHorizontal()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel topPixel = null;
//    Pixel botPixel = null;
//    int height = pixels.length;
//    for (int row = 0; row < height / 2; row++)
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        topPixel = pixels[row][col];
//        botPixel = pixels[height - row - 1][col];
//        botPixel.setColor(topPixel.getColor());
//      }
//    } 
//  }
//  
//  /** Method that mirrors the picture around a 
//    * horizontal mirror in the center of the picture
//     * from bottom to top */
//  public void mirrorHorizontalBotToTop()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel topPixel = null;
//    Pixel botPixel = null;
//    int height = pixels.length;
//    for (int row = 0; row < height / 2; row++)
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        topPixel = pixels[row][col];
//        botPixel = pixels[height - row - 1][col];
//        topPixel.setColor(botPixel.getColor());
//      }
//   } 
// }
//  
//  /** Mirror around a mirror positioned on the diagonal line
//    * from bottom left to top right
//    */
//  public void mirrorDiagonal()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel leftPixel = null;
//    Pixel rightPixel = null;
//    
//    // calculate the max area to mirror (the min of the width or height)
//    int max = pixels.length;
//    if (pixels[0].length < max)
//      max = pixels[0].length;
//    
//    // loop through to the left of the diagonal line (row=col)
//    for (int row = 1; row < max; row++)
//    {
//      for (int col = 0; col < row; col++)
//      {
//        leftPixel = pixels[row][col];
//        rightPixel = pixels[col][row];
//        rightPixel.setColor(leftPixel.getColor());
//      }
//    }
//  }
//  
//  /** Mirror just part of a picture of a temple */
//  public void mirrorTemple()
//  {
//    int mirrorPoint = 276;
//    Pixel leftPixel = null;
//    Pixel rightPixel = null;
//    int count = 0;
//    Pixel[][] pixels = this.getPixels2D();
//    
//    // loop through the rows
//    for (int row = 27; row < 97; row++)
//    {
//      // loop from 13 to just before the mirror point
//      for (int col = 13; col < mirrorPoint; col++)
//      {
//        count++;
//        leftPixel = pixels[row][col];      
//        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
//        rightPixel.setColor(leftPixel.getColor());
//      }
//    }
//    System.out.println(count);
//  }
//  
//  /** Mirror just part of a picture of a snowman */
//  public void mirrorArms()
//  {
//    Pixel topPixel = null;
//    Pixel botPixel = null;
//    Pixel[][] pixels = this.getPixels2D();
//    
//    // loop through the rows
//    for (int row = 155; row < 191; row++)
//    {
//      // loop through the columns
//      for (int col = 98; col < 169; col++)
//      {
//        topPixel = pixels[row][col];      
//        botPixel = pixels[191-row+191][col];
//        botPixel.setColor(topPixel.getColor());
//      }
//    }
//    
//    // loop through the rows
//    for (int row = 155; row < 191; row++)
//    {
//      // loop through the columns
//      for (int col = 238; col < 296; col++)
//      {
//        topPixel = pixels[row][col];      
//        botPixel = pixels[191-row+191][col];
//        botPixel.setColor(topPixel.getColor());
//      }
//    }
//  }
//  
//  /** Mirror just the gull */
//  public void mirrorGull()
//  {
//    int mirrorPoint = 350;
//    Pixel leftPixel = null;
//    Pixel rightPixel = null;
//    Pixel[][] pixels = this.getPixels2D();
//    
//    // loop through the rows
//    for (int row = 225; row < 332; row++)
//    {
//      // loop from 13 to just before the mirror point
//      for (int col = 219; col < mirrorPoint; col++)
//      {
//        leftPixel = pixels[row][col];      
//        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
//        rightPixel.setColor(leftPixel.getColor());
//      }
//    }
//  }
//  
//  /** copy from the passed fromPic to the
//    * specified startRow and startCol in the
//    * current picture
//    * @param fromPic the picture to copy from
//    * @param startRow the start row to copy to
//    * @param startCol the start col to copy to
//    */
//  public void copy(Picture fromPic, 
//                   int startRow, int startCol)
//  {
//    Pixel fromPixel = null;
//    Pixel toPixel = null;
//    Pixel[][] toPixels = this.getPixels2D();
//    Pixel[][] fromPixels = fromPic.getPixels2D();
//    for (int fromRow = 0, toRow = startRow; 
//         fromRow < fromPixels.length &&
//         toRow < toPixels.length; 
//         fromRow++, toRow++)
//    {
//      for (int fromCol = 0, toCol = startCol; 
//           fromCol < fromPixels[0].length &&
//           toCol < toPixels[0].length;  
//           fromCol++, toCol++)
//      {
//        fromPixel = fromPixels[fromRow][fromCol];
//        toPixel = toPixels[toRow][toCol];
//        toPixel.setColor(fromPixel.getColor());
//      }
//    }   
//  }
//
//  /** Method to create a collage of several pictures */
//  public void createCollage()
//  {
//    Picture flower1 = new Picture("flower1.jpg");
//    Picture flower2 = new Picture("flower2.jpg");
//    this.copy(flower1,0,0);
//    this.copy(flower2,100,0);
//    this.copy(flower1,200,0);
//    Picture flowerNoBlue = new Picture(flower2);
//    flowerNoBlue.zeroBlue();
//    this.copy(flowerNoBlue,300,0);
//    this.copy(flower1,400,0);
//    this.copy(flower2,500,0);
//    this.mirrorVertical();
//    this.write("c:/Temp/collage.jpg");
//  }
//  
//  /** copy from the passed fromPic to the
//    * specified startRow and startCol in the
//    * current picture
//    * @param fromPic the picture to copy from
//    * @param fromStartRow the row to start coping
//    * from in the from picture
//    * @param fromStartCol the column to start
//    * copying from in the from picture
//    * @param fromEndRow the row to stop before in the from picture 
//    * @param fromEndCol the column to stop before in the from picture
//    * @param toStartRow the row to start copying to
//    * @param toStartCol the column to start copying to
//    */
//  public void copy(Picture fromPic, 
//                   int fromStartRow,
//                   int fromStartCol,
//                   int fromEndRow,
//                   int fromEndCol,
//                   int toStartRow, 
//                   int toStartCol)
//  {
//    Pixel fromPixel = null;
//    Pixel toPixel = null;
//    Pixel[][] toPixels = this.getPixels2D();
//    Pixel[][] fromPixels = fromPic.getPixels2D();
//    for (int fromRow = fromStartRow, toRow = toStartRow; 
//         fromRow <= fromEndRow &&
//         toRow < toPixels.length; 
//         fromRow++, toRow++)
//    {
//      for (int fromCol = fromStartCol, toCol = toStartCol; 
//           fromCol <= fromEndCol &&
//           toCol < toPixels[0].length;  
//           fromCol++, toCol++)
//      {
//        fromPixel = fromPixels[fromRow][fromCol];
//        toPixel = toPixels[toRow][toCol];
//        toPixel.setColor(fromPixel.getColor());
//      }
//    }   
//  }
//  
//  /** Method to show large changes in color 
//    * @param edgeDist the distance for finding edges
//    */
//  public void edgeDetection(int edgeDist)
//  {
//    Pixel leftPixel = null;
//    Pixel rightPixel = null;
//    Pixel[][] pixels = this.getPixels2D();
//    Color rightColor = null;
//    for (int row = 0; row < pixels.length; row++)
//    {
//      for (int col = 0; 
//           col < pixels[0].length-1; col++)
//      {
//        leftPixel = pixels[row][col];
//        rightPixel = pixels[row][col+1];
//        rightColor = rightPixel.getColor();
//        if (leftPixel.colorDistance(rightColor) > 
//            edgeDist)
//          leftPixel.setColor(Color.BLACK);
//        else
//          leftPixel.setColor(Color.WHITE);
//      }
//    }
//  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection2(int edgeDist)
  {
    Picture copy = new Picture(this);
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
    // compare a pixel with one to the right of it
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    // now compare a pixel with the one below it
    Pixel[][] copyPixels = copy.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    Color botColor = null;
    for (int row = 0; row < copyPixels.length-1; row++)
    {
      for (int col = 0; col < copyPixels[0].length; col++)
      {
        topPixel = copyPixels[row][col];
        botPixel = copyPixels[row+1][col];
        botColor = botPixel.getColor();
        if (topPixel.colorDistance(botColor) > 
            edgeDist)
          pixels[row][col].setColor(Color.BLACK);
        
      }
    }
  }
  
  
  
    public void detection(int edgeDist)
  {
    Picture copy = new Picture(this);
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        if (leftPixel.colorDistance(Color.WHITE) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
    
    public void drawCircle(int centerx,int centery, int radius)
  {
    Picture copy = new Picture(this);
    Pixel leftPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        if ((Math.pow(col-centerx, 2)+ Math.pow(row-centery, 2) < (Math.pow(radius, 2) + (2*radius)))&&(Math.pow(col-centerx, 2)+ Math.pow(row-centery, 2) > (Math.pow(radius, 2) - (2*radius))))
        {
          leftPixel.setColor(Color.RED);
        }
      }
    }
  }
  
  
  /** Method to replace the blue background with
    * the pixels in the newBack picture
    * @param newBack the picture to copy from
    */
//  public void chromakey(Picture newBack)
//  {
//    Pixel fromPixel = null;
//    Pixel toPixel = null;
//    Pixel[][] toPixels = this.getPixels2D();
//    Pixel[][] fromPixels = newBack.getPixels2D();
//    for (int row = 0; row < this.getHeight(); row++)
//    {
//      for (int col=0; col < this.getWidth(); col++)
//      {
//        toPixel = toPixels[row][col];
//        if (toPixel.getBlue() > toPixel.getRed())
//        {
//          fromPixel = fromPixels[row][col];
//          toPixel.setColor(fromPixel.getColor());
//        }
//      }
//    }
//  }
//  
//  /** Hide a black and white message in the current
//    * picture by changing the red to even and then
//    * setting it to odd if the message pixel is black 
//    * @param messagePict the picture with a message
//    */
//  public void encode(Picture messagePict)
//  {
//    
//    Pixel[][] messagePixels = messagePict.getPixels2D();
//    Pixel[][] currPixels = this.getPixels2D();
//    Pixel currPixel = null;
//    Pixel messagePixel = null;
//    int count = 0;
//    for (int row = 0; row < this.getHeight(); row++)
//    {
//      for (int col = 0; col < this.getWidth(); col++)
//      {
//        // if the current pixel red is odd make it even
//        currPixel = currPixels[row][col];
//        if (currPixel.getRed() % 2 == 1)
//          currPixel.setRed(currPixel.getRed() - 1);
//        messagePixel = messagePixels[row][col];
//        if (messagePixel.colorDistance(Color.BLACK) < 50)
//        {
//          currPixel.setRed(currPixel.getRed() + 1);
//          count++;
//        }
//      }
//    }
//    System.out.println(count);
//  }
//  
//  /**
//   * Method to decode a message hidden in the
//   * red value of the current picture
//   * @return the picture with the hidden message
//   */
//  public Picture decode()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    int height = this.getHeight();
//    int width = this.getWidth();
//    Pixel currPixel = null;
//    Pixel messagePixel = null;
//    Picture messagePicture = new Picture(height,width);
//    Pixel[][] messagePixels = messagePicture.getPixels2D();
//    int count = 0;
//    for (int row = 0; row < this.getHeight(); row++)
//    {
//      for (int col = 0; col < this.getWidth(); col++)
//      {
//        currPixel = pixels[row][col];
//        messagePixel = messagePixels[row][col];
//        if (currPixel.getRed() % 2 == 1)
//        {
//          messagePixel.setColor(Color.BLACK);
//          count++;
//        }
//      }
//    }
//    System.out.println(count);
//    return messagePicture;
//  }
//  
//  /** 
//   * Method to return the count of the number
//   * of pixels with a red value greater than
//   * the passed value
//   * @param value the value to compare to
//   * @return the count
//   */
//  public int getCountRedOverValue(int value)
//  {
//    int count = 0; 
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel currPixel = null;
//    for (int row = 0; row < pixels.length; row++) 
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        currPixel = pixels[row][col];
//        if (currPixel.getRed() > value) 
//        {
//          count++;
//        }
//      }
//    }
//    return count;
//  }
//  
//  /** Method to set the red in the top half of the picture
//    * to half the original value */
//  public void setRedToHalfValueInTopHalf()
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel currPixel = null;
//    for (int row = 0; row < pixels.length/2; row++) 
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        currPixel = pixels[row][col];
//        currPixel.setRed(currPixel.getRed() / 2);
//      }
//    }
//  }
//  
//  /** Method to clear the blue (set to 0) if it is over the passed 
//    * value
//    * @param value the value to compare to
//    */
//  public void clearBlueOverValue(int value)
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel currPixel = null;
//    for (int row = 0; row < pixels.length; row++) 
//    {
//      for (int col = 0; col < pixels[0].length; col++)
//      {
//        currPixel = pixels[row][col];
//        if (currPixel.getBlue() > value)
//        {
//          currPixel.setBlue(0);
//        }
//      }
//    }
//  }
//  
//  /** Method to return the average value for the specified column
//    * @param col the column index to get the average from
//    * @return the average of the values in that column
//    */
//  public int[] getAverageForColumn(int col) 
//  {
//    Pixel[][] pixels = this.getPixels2D();
//    Pixel currPixel = null;
//    int[] averageArray = new int[pixels[col].length];
//    int total = 0;
//    
//    for (int row = 0; row < pixels.length; row++)
//    {
//      currPixel = pixels[row][col];
//      total = currPixel.getRed() +
//              currPixel.getGreen() +
//              currPixel.getBlue();
//      averageArray[row] = total / 3;
//    }
//    return averageArray;
//  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static final String FILE_NAME = "points.csv";
  public static void main(String[] args) 
  {
    Picture circle = new Picture("circle61.jpg"); //THE CIRCLE TO TEST!!!
    circle.explore();
    circle.detection(100);
    circle.explore(); 
    Pixel thisPixel = null;
    Pixel[][] pixels = circle.getPixels2D();
    Color rightColor = null;
    ArrayList<Integer> x3 = new ArrayList<Integer>();
    ArrayList<Integer> y3 = new ArrayList<Integer>();
    
    // compare a pixel with one to the right of it
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        thisPixel = pixels[row][col];
        if (thisPixel.colorDistance(Color.BLACK) < 2)
        {
          y3.add(row);
          x3.add(col);
        }
    }
    FileWriter writer = null;
    try {
            writer = new FileWriter(new File(FILE_NAME));
        } catch (Exception e) {
            System.exit(0);
        }
        
                FileWriter fileWriter = null;
                 
        try {
            fileWriter = new FileWriter(FILE_NAME);
                fileWriter.append("\n");
                for(int i = 0; i < x3.size(); i++)
     { 
       fileWriter.append(String.valueOf(x3.get(i)));
       fileWriter.append(',');
       fileWriter.append(String.valueOf(y3.get(i)));
       fileWriter.append("\n");
       
     }
            
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
             
        }
    }
    
     Scanner f = null;
        try {
            f = new Scanner(new File(FILE_NAME));
        } catch (Exception e) {
            System.exit(0);
        }
        f.nextLine();
        ArrayList x5 = new ArrayList<Double>();
        ArrayList y5 = new ArrayList<Double>();
        while (f.hasNextLine()) {
            String line = f.nextLine();
            String[] tokens = line.split(",");
            x5.add(Double.parseDouble(tokens[0])); //add the x
            y5.add(Double.parseDouble(tokens[1])); //add the x
            //System.out.println(Arrays.toString(tokens));
        }
   
     
//
//     int done = 0;

//     while(done == 0)
//     {
//       Scanner sc = new Scanner(System.in); //Ask for x and y
//     System.out.println("Enter x or 'done' if finished");
//     String nextx = sc.nextLine();
//     if(nextx.equals( "done"))
//     {
//       done = 1;
//     }
//     else
//     {
//      double value = Double.parseDouble(nextx);
//      x5.add(value);
//     System.out.println("Enter y");
//     y5.add(sc.nextDouble());
//     }
//     }
     
     double x[] = new double[x5.size()];
     for(int i = 0; i < x5.size(); i++)
     { 
       x[i] = Double.valueOf((Double)x5.get(i));
     }
     double y[] = new double[y5.size()];
     for(int i = 0; i < y5.size(); i++)
     { 
       y[i] = Double.valueOf((Double)y5.get(i));
     }
//     
     //======= End of Scanner and Casting=======
     
     //=======List of points, comment/disable is entering lots of points.
//     System.out.println("List of points:");
//     
//     for(int i = 0; i < x.length; i++)
//     {
//       System.out.println( "(" + x[i] + ", " + y[i] + ")");
//       
//     }
//     System.out.println();
     
     //======
     double fxcoef = 0;
     double fxconstant = 0;
     double fxxconstant = 0;
     double fycoef = 0;
     double fyconstant = 0;
     double fyyconstant = 0;
     for(int i=0;i < y.length;i++)
     {
       fxcoef = fxcoef + 2;
     }
     for(int i=0;i < y.length;i++)
     {
       fxconstant = fxconstant - 2*y[i];
     }
     fxxconstant = fxcoef;
     
     for(int i=0;i < x.length;i++)
     {
       fycoef = fycoef + 2;
     }
     for(int i=0;i < x.length;i++)
     {
       fyconstant = fyconstant - 2*x[i];
     }
     fyyconstant = fycoef;
     
     System.out.println( "fx = " + fxcoef + "y + (" + fxconstant + ")");
     System.out.println( "fxx = " + fxxconstant);
     System.out.println( "fy = " + fycoef + "x + (" + fyconstant + ")");
     System.out.println( "fyy = " + fyyconstant);
     
     double xcenter = (-fyconstant)/(fycoef);//x of center of the circle where you set fy = 0
     double ycenter = (-fxconstant)/(fxcoef);//y of center of the circle where you set fx = 0
     
     System.out.println("xcenter: " + xcenter);
     System.out.println("ycenter: " + ycenter);
     
     
     double[] distance = new double[x.length];
     
     for(int i = 0; i < distance.length; i++)
     {
       distance [i] = Math.sqrt(Math.pow(x[i]-xcenter,2) + Math.pow(y[i] - ycenter,2));
     }
//     System.out.print("List of distances: ");
//     for(int i = 0; i < distance.length; i++)
//     {
//       System.out.print(distance[i] + " ");
//     }
     
     double radius = 0;
     for(int i = 0; i < distance.length; i++) //radius = (sum of all the distances)/(number of distances)
     {
       radius = radius + distance[i];
     }
     radius = radius/(distance.length);
     System.out.println("Avg radius = " + radius);
     
     double[] newdistance = new double[distance.length];//adjusted distances to newly unitized radius of 1
     for(int i = 0; i < newdistance.length; i++) 
     {
       newdistance[i] = distance[i]/radius;
     }
//     System.out.print("List of newly adjusted distances: ");
//     for(int i = 0; i < newdistance.length; i++)
//     {
//       System.out.print(newdistance[i] + " ");
//     }
     double[] difference = new double[distance.length];
     

     
     for(int i = 0; i < difference.length; i++)
     {
       difference[i] = Math.abs(newdistance[i] - 1); //radius = 1
     }
     System.out.println();
     double totaldifference = 0;
     for(int i = 0; i < difference.length; i++)
     {
       totaldifference = totaldifference + difference[i];
     }
     totaldifference = totaldifference/difference.length;
     System.out.println("Total Difference/Total given points aka (how different from a circle): " + totaldifference);
     
     System.out.println("Percent Circle: " + (1-totaldifference)*100 + "%");
     int centerx2 = (int)Math.round(xcenter); //rounded to the nearest unit because there cannot be half a pixel
     int centery2 = (int)Math.round(ycenter); //rounded to the nearest unit because there cannot be half a pixel
     int radius2 = (int)Math.round(radius);//rounded to the nearest unit because there cannot be half a pixel
     circle.drawCircle(centerx2,centery2,radius2);
     circle.explore(); 
     
     

  }
  
} // this } is the end of class Picture, put all new methods before this

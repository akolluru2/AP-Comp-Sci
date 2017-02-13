public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
}
  
public void negate(){
  Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels){
        for (Pixel pixelObj : rowArray){
          int red = pixelObj.getRed();
          int blue = pixelObj.getBlue();
          int green = pixelObj.getGreen();
          pixelObj.setGreen(255-green);
          pixelObj.setRed(255-red);
          pixelObj.setBlue(255-blue);
        }
      }
}

public void grayscale(){
  Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels){
        for (Pixel pixelObj : rowArray){
          int red = pixelObj.getRed();
          int blue = pixelObj.getBlue();
          int green = pixelObj.getGreen();
          int avg = (red+blue+green)/3;
          pixelObj.setGreen(avg);
          pixelObj.setRed(avg);
          pixelObj.setBlue(avg);
        }
      }
}

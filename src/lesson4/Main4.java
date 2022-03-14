package lesson4;

public class Main4 {
    public static void main(String[] args) {
       String pathToImage = "D://gftr/kiutrr/jdj.png";

       if(pathToImage.endsWith("png") || pathToImage.endsWith("jpg")){
           System.out.println("Это картинка");
       }
    }
}

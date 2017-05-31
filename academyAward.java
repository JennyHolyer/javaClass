import java.io.BufferedReader; //try and catch
import java.io.FileReader; //ready the file
import java.io.IOException;//allow us to catch any errors and explain to us in details what the errors are
import java.util.HashMap; //handles duplicates
import java.util.Map; //handles duplicates
import java.util.Arrays;


// public class Award{
//   private int year;
//   private String actress;
//   private String movie;
//
//   public Award(int year, String actress, String movie) {
//     this.year = year;
//     this.actress = actress;
//     this.movie = movie;
//   }
// }


public class academyAward {

  public academyAward(int year, String actress, String movie) {
      this.year = year;
      this.actress = actress;
      this.movie = movie;

   String csvFile = "";
   try {
     csvFile = args[0];
   } catch(Exception e) {
     System.out.print("please provide the file name");
     System.exit(0);
   }

   String line = "";
   String csvSplitBy = ",";
  //  HashMap newObj = new HashMap();
   Map < String, String > newObj = new HashMap < String, String > ();


   try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
    //   while ((line = br.readLine()) != null) {
    //     String [] data = line.split(csvSplitBy);
    //
    // //  Arrays myArr = new Arrays();
    //
    //     newObj.put("Year", data[1]);
    //     newObj.put("Actress", data[1]);
    //     newObj.put("Movie", data[2]);

        // Arrays.push(newObj);
        Pattern pattern = Pattern.compile(",");

        List<academyAward> academyAwards = in 
          .lines()
          .skip(1)
          .map(line -> {
            String[] x = pattern.split(line);
            return new academyAward(Integer.parseInt(x[0]), x[1], x[2]);
          })

          .collect(Collectors.toList());

          ObjectMapper mapper = new ObjectMapper();
          mapper.enable(SerializationFeature.INDENT_OUTPUT);
          mapper.writeValue(System.out, academyAwards);


        // System.out.println(newObj);
        // System.out.println(data[1]);



      // } //end of while
      // Arrays.toString(newObj);
      // System.out.println(newObj);


   } catch (IOException e) {
   e.printStackTrace();
 } //end try and catch block


 } //end main
} //end class

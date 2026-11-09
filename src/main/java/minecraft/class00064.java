package minecraft;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record class00064(String name, String value) implements class04942 {
   public class00064(String name, String value) {
      this.name = name;
      this.value = value;
   }

   @SerializedName("value")
   public String y() {
      return this.value;
   }

   public static boolean N(List<class00064> var0) {
      for (class00064 class00064 : var0) {
         if (class00064.N().equals("hardcore")) {
            return Boolean.parseBoolean(class00064.y());
         }
      }

      return false;
   }

   @SerializedName("name")
   public String N() {
      return this.name;
   }

   public static class00064 N(boolean var0) {
      return new class00064("hardcore", Boolean.toString(var0));
   }
}

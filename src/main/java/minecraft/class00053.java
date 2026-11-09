package minecraft;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record class00053(List<class00065> regionData) implements class04942 {
   public class00053(List<class00065> regionData) {
      super();
      this.regionData = regionData;
   }

   @SerializedName("regionDataList")
   public List<class00065> y() {
      return this.regionData;
   }

   public static class00053 N() {
      return new class00053(List.of());
   }
}

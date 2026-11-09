package minecraft;

import com.google.gson.annotations.SerializedName;

public record class00065(class00082 region, class00073 serviceQuality) implements class04942 {
   public class00065(class00082 region, class00073 serviceQuality) {
      this.region = region;
      this.serviceQuality = serviceQuality;
   }

   @SerializedName("serviceQuality")
   public class00073 y() {
      return this.serviceQuality;
   }

   @SerializedName("regionName")
   public class00082 N() {
      return this.region;
   }
}

package minecraft;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record class00114(class00082 region, class00073 serviceQuality) implements class04942 {
   public class00114(@Nullable class00082 region, @Nullable class00073 serviceQuality) {
      super();
      this.region = region;
      this.serviceQuality = serviceQuality;
   }

   @SerializedName("serviceQuality")
   @Nullable
   public class00073 y() {
      return this.serviceQuality;
   }

   @SerializedName("regionName")
   @Nullable
   public class00082 N() {
      return this.region;
   }
}

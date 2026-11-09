package minecraft;

import com.google.gson.annotations.SerializedName;
import java.util.Locale;

public record class04970(String regionName, int ping) implements class04942 {
   public class04970(String regionName, int ping) {
      super();
      this.regionName = regionName;
      this.ping = ping;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "%s --> %.2f ms", this.regionName, (float)this.ping);
   }

   @SerializedName("ping")
   public int y() {
      return this.ping;
   }

   @SerializedName("regionName")
   public String N() {
      return this.regionName;
   }
}

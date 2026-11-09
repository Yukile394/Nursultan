package minecraft;

import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class00093(String address, String resourcePackUrl, String resourcePackHash, class00114 regionData) implements class04942 {
   private static final Logger i = LogUtils.getLogger();
   private static final class00093 R = new class00093(null, null, null, null);

   @SerializedName("resourcePackHash")
   @Nullable
   public String L() {
      return this.resourcePackHash;
   }

   public class00093(@Nullable String address, @Nullable String resourcePackUrl, @Nullable String resourcePackHash, @Nullable class00114 regionData) {
      super();
      this.address = address;
      this.resourcePackUrl = resourcePackUrl;
      this.resourcePackHash = resourcePackHash;
      this.regionData = regionData;
   }

   @SerializedName("sessionRegionData")
   @Nullable
   public class00114 u() {
      return this.regionData;
   }

   @SerializedName("resourcePackUrl")
   @Nullable
   public String y() {
      return this.resourcePackUrl;
   }

   public static class00093 N(class04968 var0, String var1) {
      try {
         class00093 class00093 = var0.N(var1, class00093.class);
         if (class00093 == null) {
            i.error("Could not parse RealmsServerAddress: {}", var1);
            return R;
         } else {
            return class00093;
         }
      } catch (Exception exception) {
         i.error("Could not parse RealmsServerAddress", exception);
         return R;
      }
   }

   @SerializedName("address")
   @Nullable
   public String N() {
      return this.address;
   }
}

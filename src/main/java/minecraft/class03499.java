package minecraft;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public enum class03499 {
   field_44650("icons"),
   field_44651("icons", "snapshot");

   private final String[] field_44652;

   private class03499(String... var3) {
      this.field_44652 = var3;
   }

   public class03652<InputStream> y(class01622 var1) throws IOException {
      return this.N(var1, "minecraft.icns");
   }

   public List<class03652<InputStream>> N(class01622 var1) throws IOException {
      return List.of(
         this.N(var1, "icon_16x16.png"),
         this.N(var1, "icon_32x32.png"),
         this.N(var1, "icon_48x48.png"),
         this.N(var1, "icon_128x128.png"),
         this.N(var1, "icon_256x256.png")
      );
   }

   private class03652<InputStream> N(class01622 var1, String var2) throws IOException {
      String[] astring = (String[])ArrayUtils.add(this.field_44652, var2);
      class03652<InputStream> class03652 = var1.method_14410(astring);
      if (class03652 == null) {
         throw new FileNotFoundException(String.join("/", astring));
      } else {
         return class03652;
      }
   }
}

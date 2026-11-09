package minecraft;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class class00045 extends TypeAdapter<class00050> {
   private static final Logger N = LogUtils.getLogger();

   public class00045() {
      super();
   }

   public void write(JsonWriter var1, class00050 var2) throws IOException {
      var1.value(var2.field_60230);
   }

   public class00050 read(JsonReader var1) throws IOException {
      int i = var1.nextInt();

      for (class00050 class00050 : class00050.values()) {
         if (class00050.field_60230 == i) {
            return class00050;
         }
      }

      N.warn("Unsupported RegionSelectionPreference {}", i);
      return class00050.field_60229;
   }
}

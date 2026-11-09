package minecraft;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class class00047 extends TypeAdapter<class00073> {
   private static final Logger N = LogUtils.getLogger();

   public class00047() {
      super();
   }

   public void write(JsonWriter var1, class00073 var2) throws IOException {
      var1.value(var2.field_60238);
   }

   public class00073 read(JsonReader var1) throws IOException {
      int i = var1.nextInt();
      class00073 class00073 = class00073.N(i);
      if (class00073 == null) {
         N.warn("Unsupported ServiceQuality {}", i);
         return class00073.field_60237;
      } else {
         return class00073;
      }
   }
}

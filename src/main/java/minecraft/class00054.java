package minecraft;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class class00054 extends TypeAdapter<class00082> {
   private static final Logger N = LogUtils.getLogger();

   public class00054() {
      super();
   }

   public void write(JsonWriter var1, class00082 var2) throws IOException {
      var1.value(var2.field_60200);
   }

   public class00082 read(JsonReader var1) throws IOException {
      String s = var1.nextString();
      class00082 class00082 = class00082.N(s);
      if (class00082 == null) {
         N.warn("Unsupported RealmsRegion {}", s);
         return class00082.field_60199;
      } else {
         return class00082;
      }
   }
}

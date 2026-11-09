package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class01598 implements class01622 {
   private static final Logger field_14182 = LogUtils.getLogger();
   private final class02267 field_49031;

   public class01598(class02267 var1) {
      super();
      this.field_49031 = var1;
   }

   @Override
   public class02267 method_56926() {
      return this.field_49031;
   }

   @Nullable
   public static <T> T method_14392(class02968<T> var0, InputStream var1, class02267 var2) {
      JsonObject jsonobject;
      try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8))) {
         jsonobject = class05001.N(bufferedreader);
      } catch (Exception exception) {
         field_14182.error("Couldn't load {} {} metadata: {}", new Object[]{var2.N(), var0.N(), exception.getMessage()});
         return null;
      }

      return (T)(!jsonobject.has(var0.N())
         ? null
         : var0.y()
            .parse(JsonOps.INSTANCE, jsonobject.get(var0.N()))
            .ifError(var2x -> field_14182.error("Couldn't load {} {} metadata: {}", new Object[]{var2.N(), var0.N(), var2x.message()}))
            .result()
            .orElse(null));
   }

   @Nullable
   @Override
   public <T> T method_14407(class02968<T> var1) throws IOException {
      class03652<InputStream> class03652 = this.method_14410(new String[]{"pack.mcmeta"});
      if (class03652 == null) {
         return null;
      } else {
         Object object;
         try (InputStream inputstream = class03652.get()) {
            object = method_14392(var1, inputstream, this.field_49031);
         }

         return (T)object;
      }
   }
}

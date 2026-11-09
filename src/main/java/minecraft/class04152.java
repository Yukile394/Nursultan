package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public record class04152(class04548<class08735> format, String overlay) {
   public class04152(class04548<class08735> format, String overlay) {
      this.format = format;
      this.overlay = overlay;
   }

   public String y() {
      return this.overlay;
   }

   public class04548<class08735> N() {
      return this.format;
   }

   public boolean N(class08735 var1) {
      return this.format.N(var1);
   }

   static Codec<List<class04152>> N(class01603 var0) {
      int i = class08735.N(var0);
      return class04166.N
         .listOf()
         .flatXmap(
            var1x -> class08735.N(var1x, i, (var0xx, var1xx) -> new class04152(var1xx, var0xx.y())),
            var1x -> DataResult.success(var1x.stream().map(var1xx -> new class04166(class08780.N(var1xx.N(), i), var1xx.y())).toList())
         );
   }
}

package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

public enum class07664 {
   field_9853("feet", (var0, var1) -> var0),
   field_9851("eyes", (var0, var1) -> new class06889(var0.M, var0.B + var1.method_5751(), var0.Z));

   static final Map<String, class07664> field_9852 = class07536.N(Maps.newHashMap(), var0 -> {
      for (class07664 class07664 : values()) {
         var0.put(class07664.field_9849, class07664);
      }
   });
   private final String field_9849;
   private final BiFunction<class06889, class07049, class06889> field_9848;

   private class07664(String var3, BiFunction<class06889, class07049, class06889> var4) {
      this.field_9849 = var3;
      this.field_9848 = var4;
   }

   public class06889 N(class07701 var1) {
      class07049 class07049 = var1.M();
      return class07049 == null ? var1.i() : this.field_9848.apply(var1.i(), class07049);
   }

   public class06889 N(class07049 var1) {
      return this.field_9848.apply(var1.method_73189(), var1);
   }

   @Nullable
   public static class07664 N(String var0) {
      return field_9852.get(var0);
   }
}

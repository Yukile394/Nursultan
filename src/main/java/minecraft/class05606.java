package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class class05606 implements class05603 {
   class05606(class05630 var1, PrintWriter var2) {
      super();
      this.N = var2;
   }

   @Override
   public <T> T N(String var1, T var2, Function<String, T> var3, Function<T, String> var4) {
      this.N(var1);
      this.N.println((String)var4.apply(this.N(var2, var1)));
      return (T)var2;
   }

   @Override
   public float N(String var1, float var2) {
      this.N(var1);
      this.N.println(var2);
      return var2;
   }

   private static List N(List var0) {
      ArrayList arraylist = new ArrayList(var0.size());
      class01623 class01623 = class06202.Nq().t();

      for (String s : var0) {
         class01055 class01055 = class01623.L(s);
         if (class01055 == null || !class01055.fabric$isHidden()) {
            arraylist.add(s);
         }
      }

      return arraylist;
   }

   private Object N(Object var1, String var2) {
      return "resourcePacks".equals(var2) && var1 instanceof List ? N((List)var1) : var1;
   }

   public void N(String var1) {
      this.N.print(var1);
      this.N.print(':');
   }

   @Override
   public <T> void N(String var1, class04370<T> var2) {
      var2.method_42404()
         .encodeStart(JsonOps.INSTANCE, var2.method_41753())
         .ifError(var1x -> class05630.N.error("Error saving option {}: {}", var2, var1x.message()))
         .ifSuccess(var3 -> {
            this.N(var1);
            var2x.println(class05630.y.toJson(var3));
         });
   }

   @Override
   public int N(String var1, int var2) {
      this.N(var1);
      this.N.println(var2);
      return var2;
   }

   @Override
   public boolean N(String var1, boolean var2) {
      this.N(var1);
      this.N.println(var2);
      return var2;
   }

   @Override
   public String N(String var1, String var2) {
      this.N(var1);
      this.N.println(var2);
      return var2;
   }
}

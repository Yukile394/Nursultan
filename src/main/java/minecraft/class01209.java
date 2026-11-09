package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class class01209 extends class04890 {
   private static final Logger i = LogUtils.getLogger();
   protected final String N;
   protected class01207 y;
   protected class01233 L;
   protected class07209 u;

   public class01209(class04878 var1, int var2, class01224 var3, class01894 var4, String var5, class01233 var6, class07209 var7) {
      super(var1, var2, var3.N(var4).y(var6, var7));
      this.N(class07211.field_11043);
      this.N = var5;
      this.u = var7;
      this.y = var3.N(var4);
      this.L = var6;
   }

   public class01209(class04878 var1, class07001 var2, class01224 var3, Function<class01894, class01233> var4) {
      super(var1, var2);
      this.N(class07211.field_11043);
      this.N = var2.y("Template", "");
      this.u = new class07209(var2.y("TPX", 0), var2.y("TPY", 0), var2.y("TPZ", 0));
      class01894 class01894 = this.N();
      this.y = var3.N(class01894);
      this.L = (class01233)var4.apply(class01894);
      this.k = this.y.y(this.L, this.u);
   }

   public class01207 Z() {
      return this.y;
   }

   public class01233 U() {
      return this.L;
   }

   public class07209 z() {
      return this.u;
   }

   @Deprecated
   @Override
   public void N(int var1, int var2, int var3) {
      super.N(var1, var2, var3);
      this.u = this.u.method_10069(var1, var2, var3);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      var2.N("TPX", this.u.method_10263());
      var2.N("TPY", this.u.method_10264());
      var2.N("TPZ", this.u.method_10260());
      var2.N_67("Template", this.N);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.L.N(var5);
      this.k = this.y.y(this.L, this.u);
      if (this.y.N(var1, this.u, var7, this.L, var4, 2)) {
         for (class01228 var10 : this.y.N(this.u, this.L, class00869.sh)) {
            if (var10.L() != null) {
               class08070 class08070 = var10.L().<class08070>N_15("mode", class08070.field_56673).orElseThrow();
               if (class08070 == class08070.field_12696) {
                  this.N(var10.L().y("metadata", ""), var10.N(), var1, var4, var5);
               }
            }
         }

         for (class01228 class01228x : this.y.N(this.u, this.L, class00869.sr)) {
            if (class01228x.L() != null) {
               String s = class01228x.L().y("final_state", "minecraft:air");
               class00500 class00500 = class00869.N.W();

               try {
                  class00500 = class00892.N(var1.N_51(class04227.Z), s, true).N();
               } catch (CommandSyntaxException commandsyntaxexception) {
                  i.error("Error while parsing blockstate {} in jigsaw block @ {}", s, class01228x.N());
               }

               var1.method_8652(class01228x.N(), class00500, 3);
            }
         }
      }
   }

   protected abstract void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5);

   protected class01894 N() {
      return class01894.N(this.N);
   }

   @Override
   public class06993 R() {
      return this.L.u();
   }
}

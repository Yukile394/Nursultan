package minecraft;

import java.util.List;
import java.util.Map;
import net.fabricmc.fabric.mixin.loot.FileToIdConverterAccessor;

public class class03069 implements FileToIdConverterAccessor, net.fabricmc.fabric.mixin.resource.conditions.FileToIdConverterAccessor {
   private final String N;
   private final String y;

   public class03069(String var1, String var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class01894 y(class01894 var1) {
      String s = var1.N();
      return var1.i(s.substring(this.N.length() + 1, s.length() - this.y.length()));
   }

   public Map<class01894, List<class01079>> y(class01089 var1) {
      return var1.L(this.N, var1x -> var1x.N().endsWith(this.y));
   }

   public Map<class01894, class01079> N(class01089 var1) {
      return var1.y(this.N, var1x -> var1x.N().endsWith(this.y));
   }

   public static class03069 N(String var0) {
      return new class03069(var0, ".json");
   }

   public static class03069 N(class05946<? extends class00751<?>> var0) {
      return N(class04227.L(var0));
   }

   public class01894 N(class01894 var1) {
      return var1.i(this.N + "/" + var1.N() + this.y);
   }
}

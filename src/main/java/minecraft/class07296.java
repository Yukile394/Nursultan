package minecraft;

import com.mojang.serialization.Codec;

public enum class07296 implements class05033 {
   field_1254("task", class06541.field_1060),
   field_1250("challenge", class06541.field_1064),
   field_1249("goal", class06541.field_1060);

   public static final Codec<class07296> field_47186 = class05033.N(class07296::values);
   private final String field_1251;
   private final class06541 field_1255;
   private final class00392 field_26386;

   private class07296(String var3, class06541 var4) {
      this.field_1251 = var3;
      this.field_1255 = var4;
      this.field_26386 = class00392.L("advancements.toast." + var3);
   }

   public class00392 y() {
      return this.field_26386;
   }

   public class06541 N() {
      return this.field_1255;
   }

   public class05216 N(class03711 var1, class04770 var2) {
      return class00392.N("chat.type.advancement." + this.field_1251, var2.method_5476(), class07151.N(var1));
   }

   @Override
   public String method_15434() {
      return this.field_1251;
   }
}

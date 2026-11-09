package minecraft;

import com.mojang.serialization.Codec;

public enum class02424 implements class05033 {
   field_52743("minimized", "options.inactivityFpsLimit.minimized"),
   field_52744("afk", "options.inactivityFpsLimit.afk");

   public static final Codec<class02424> field_52745 = class05033.N(class02424::values);
   private final String field_52747;
   private final class00392 field_64422;

   private class02424(String var3, String var4) {
      this.field_52747 = var3;
      this.field_64422 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64422;
   }

   @Override
   public String method_15434() {
      return this.field_52747;
   }
}

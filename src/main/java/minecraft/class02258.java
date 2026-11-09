package minecraft;

import com.mojang.serialization.Codec;

public enum class02258 implements class05033 {
   field_29313(class07211.field_11036, 1, "ceiling"),
   field_29314(class07211.field_11033, -1, "floor");

   public static final Codec<class02258> field_29315 = class05033.N(class02258::values);
   private final class07211 field_29316;
   private final int field_29317;
   private final String field_29318;

   private class02258(class07211 var3, int var4, String var5) {
      this.field_29316 = var3;
      this.field_29317 = var4;
      this.field_29318 = var5;
   }

   public int y() {
      return this.field_29317;
   }

   public class07211 N() {
      return this.field_29316;
   }

   @Override
   public String method_15434() {
      return this.field_29318;
   }
}

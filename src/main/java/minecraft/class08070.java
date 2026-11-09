package minecraft;

import com.mojang.serialization.Codec;

public enum class08070 implements class05033 {
   field_12695("save"),
   field_12697("load"),
   field_12699("corner"),
   field_12696("data");

   @Deprecated
   public static final Codec<class08070> field_56673 = class06338.L(class08070::valueOf);
   private final String field_12698;
   private final class00392 field_26444;

   private class08070(String var3) {
      this.field_12698 = var3;
      this.field_26444 = class00392.L("structure_block.mode_info." + var3);
   }

   public class00392 N() {
      return this.field_26444;
   }

   @Override
   public String method_15434() {
      return this.field_12698;
   }
}

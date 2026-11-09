package minecraft;

import com.mojang.serialization.Codec;

public enum class06040 implements class05033 {
   field_28922("none"),
   field_28923("bury"),
   field_38431("beard_thin"),
   field_38432("beard_box"),
   field_51413("encapsulate");

   public static final Codec<class06040> field_38433 = class05033.N(class06040::values);
   private final String field_38434;

   private class06040(String var3) {
      this.field_38434 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_38434;
   }
}

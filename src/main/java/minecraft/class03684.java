package minecraft;

import com.mojang.serialization.Codec;

public enum class03684 implements class05033 {
   field_42450("center"),
   field_42451("left"),
   field_42452("right");

   public static final Codec<class03684> field_42453 = class05033.N(class03684::values);
   private final String field_42454;

   private class03684(String var3) {
      this.field_42454 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_42454;
   }
}

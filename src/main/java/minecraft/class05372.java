package minecraft;

import java.util.function.Predicate;

public enum class05372 {
   field_18487(class05377::i),
   field_18488(class05377::R),
   field_18489(var0 -> true);

   private final Predicate<? super class05377> field_18490;

   private class05372(Predicate<? super class05377> var3) {
      this.field_18490 = var3;
   }

   public Predicate<? super class05377> N() {
      return this.field_18490;
   }
}

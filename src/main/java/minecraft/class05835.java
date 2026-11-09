package minecraft;

import java.util.function.Predicate;

public enum class05835 {
   field_1348(var0 -> false),
   field_1345(class04688::u),
   field_1347(var0 -> !var0.W()),
   field_36338(var0 -> var0.N(class01231.N));

   private final Predicate<class04688> field_1346;

   private class05835(Predicate<class04688> var3) {
      this.field_1346 = var3;
   }

   public boolean N(class04688 var1) {
      return this.field_1346.test(var1);
   }
}

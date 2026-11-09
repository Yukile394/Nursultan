package minecraft;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

enum class01581 {
   field_13644("points", class08036::method_7255, (var0, var1) -> {
      if (var1 >= var0.method_7349()) {
         return false;
      } else {
         var0.method_14228(var1);
         return true;
      }
   }, var0 -> class04995.y(var0.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 * var0.method_7349())),
   field_13641("levels", class04770::method_7316, (var0, var1) -> {
      var0.method_14252(var1);
      return true;
   }, var0 -> var0.fields_37fa3311b0e9d3e9b883d09222919bf5a_0);

   public final BiConsumer<class04770, Integer> field_13639;
   public final BiPredicate<class04770, Integer> field_13642;
   public final String field_13643;
   final ToIntFunction<class04770> field_13645;

   private class01581(String var3, BiConsumer<class04770, Integer> var4, BiPredicate<class04770, Integer> var5, ToIntFunction<class04770> var6) {
      this.field_13639 = var4;
      this.field_13643 = var3;
      this.field_13642 = var5;
      this.field_13645 = var6;
   }
}

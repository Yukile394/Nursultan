package minecraft;

import it.unimi.dsi.fastutil.ints.IntComparator;

public enum class03249 {
   field_41826,
   field_41827,
   field_41828,
   field_41829;

   private final IntComparator field_41830 = (var1x, var2x) -> var1x == var2x ? 0 : (this.y(var1x, var2x) ? -1 : 1);

   public boolean L() {
      return switch (this) {
         case field_41826, field_41828 -> false;
         case field_41827, field_41829 -> true;
      };
   }

   private class03249() {
   }

   public IntComparator u() {
      return this.field_41830;
   }

   public class03249 y() {
      return switch (this) {
         case field_41826 -> field_41827;
         case field_41827 -> field_41826;
         case field_41828 -> field_41829;
         case field_41829 -> field_41828;
      };
   }

   public boolean y(int var1, int var2) {
      return this.L() ? var1 < var2 : var2 < var1;
   }

   public class03287 N() {
      return switch (this) {
         case field_41826, field_41827 -> class03287.field_41823;
         case field_41828, field_41829 -> class03287.field_41822;
      };
   }

   public boolean N(int var1, int var2) {
      return this.L() ? var1 > var2 : var2 > var1;
   }
}

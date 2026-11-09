package minecraft;

public enum class03287 {
   field_41822,
   field_41823;

   public class03249 L() {
      return switch (this) {
         case field_41822 -> class03249.field_41828;
         case field_41823 -> class03249.field_41826;
      };
   }

   private class03287() {
   }

   public class03249 y() {
      return switch (this) {
         case field_41822 -> class03249.field_41829;
         case field_41823 -> class03249.field_41827;
      };
   }

   public class03287 N() {
      return switch (this) {
         case field_41822 -> field_41823;
         case field_41823 -> field_41822;
      };
   }

   public class03249 N(boolean var1) {
      return var1 ? this.y() : this.L();
   }
}

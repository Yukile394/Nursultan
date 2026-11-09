package minecraft;

import java.util.Locale;

public enum class08768 {
   field_61022(class08743.field_60923, class08743.field_60925),
   field_61023(class08743.field_60926),
   field_61024(class08743.field_60927);

   private final String field_61025;
   private final class08743[] field_61026;

   public class08066 L() {
      class06202 class06202 = class06202.Nq();

      class08066 class08066 = switch (this) {
         case field_61023 -> ((class03063)class06202.B_2).P();
         case field_61024 -> ((class03063)class06202.B_2).b();
         default -> class06202.e();
      };
      return class08066 != null ? class08066 : class06202.e();
   }

   private class08768(class08743... var3) {
      this.field_61026 = var3;
      this.field_61025 = this.toString().toLowerCase(Locale.ROOT);
   }

   public class08743[] y() {
      return this.field_61026;
   }

   public String N() {
      return this.field_61025;
   }
}

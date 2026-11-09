package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class06642 implements class00381<class07280> {
   public static final class02362<class00667, class06642> N = class00381.N(class06642::N, class06642::new);
   private final class01890 y;
   private final String L;

   public class06642(class01890 var1, @Nullable class00518 var2) {
      super();
      this.y = var1;
      if (var2 == null) {
         this.L = "";
      } else {
         this.L = var2.L();
      }
   }

   private class06642(class00667 var1) {
      super();
      this.y = var1.N(class01890.field_45176);
      this.L = var1.s();
   }

   @Nullable
   public String y() {
      return Objects.equals(this.L, "") ? null : this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class01890 N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.N(class01890::N, this.y);
      var1.N(this.L);
   }

   @Override
   public class02897<class06642> method_65080() {
      return class04248.NK;
   }
}

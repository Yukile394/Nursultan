package minecraft;

import java.util.ArrayList;

public class class04695 extends class05914 {
   private static final class00392 N = class00392.L("options.skinCustomisation.title");

   public class04695(class05096 var1, class05630 var2) {
      super(var1, var2, N);
   }

   @Override
   protected void method_60325() {
      ArrayList arraylist = new ArrayList();

      for (class08030 class08030 : class08030.values()) {
         arraylist.add(class06366.N(this.field_21336.N(class08030)).N(class08030.u(), (var2, var3) -> this.field_21336.N(class08030, var3)));
      }

      arraylist.add(this.field_21336.O().method_57701(this.field_21336));
      this.field_51824.N(arraylist);
   }
}

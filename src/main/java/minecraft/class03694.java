package minecraft;

import org.jspecify.annotations.Nullable;

public class class03694 extends class03688 {
   private static final String s = "item";
   private static final String T = "item_display";
   private static final class02131<class06584> b = class03289.N(class03694.class, class02154.B);
   private static final class02131<Byte> j = class03289.N(class03694.class, class02154.N);
   private final class04803 v = class04803.N(this::s, this::N);
   @Nullable
   private class03666 n;

   public final class03662 T() {
      return class03662.field_42469.apply(this.field_6011.N(j));
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return var1 == 0 ? this.v : null;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (b.equals(var1) || j.equals(var1)) {
         this.P = true;
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(b, class06584.E);
      var1.N(j, class03662.field_4315.N());
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      class06584 class06584 = this.s();
      if (!class06584.R()) {
         var1.N("item", class06584.y, class06584);
      }

      var1.N("item_display", class03662.field_42468, this.T());
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class06584>N("item", class06584.y).orElse(class06584.E));
      this.N(var1.<class03662>N("item_display", class03662.field_42468).orElse(class03662.field_4315));
   }

   public class03694(class07078<?> var1, class07299 var2) {
      super(var1, var2);
   }

   @Nullable
   public class03666 b() {
      return this.n;
   }

   public final class06584 s() {
      return this.field_6011.N(b);
   }

   public final void N(class03662 var1) {
      this.field_6011.N(j, var1.N());
   }

   @Override
   protected void N(boolean var1, float var2) {
      class06584 class06584 = this.s();
      class06584.N(this);
      this.n = new class03666(class06584, this.T());
   }

   public final void N(class06584 var1) {
      this.field_6011.N(b, var1);
   }
}

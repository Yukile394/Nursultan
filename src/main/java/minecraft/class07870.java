package minecraft;

import org.jspecify.annotations.Nullable;

public class class07870 extends class07643 {
   private static final String N = "type";
   private static final class02131<Integer> y = class03289.N(class07870.class, class02154.y);

   public class07861 Q() {
      return class07861.field_55008.apply(this.field_6011.N(y));
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (y.equals(var1)) {
         this.method_18382();
      }
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.No);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(y, class07861.field_57618.N());
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("type", class07861.field_52473, this.Q());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.No ? method_66651(var1, this.Q()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class07861>N("type", class07861.field_52473).orElse(class07861.field_57618));
   }

   public class07870(class07078<? extends class07870> var1, class07299 var2) {
      super(var1, var2);
      this.method_18382();
   }

   @Override
   protected class04891 s() {
      return class04909.dw;
   }

   @Override
   protected class04891 m() {
      return class04909.dY;
   }

   @Override
   public int v() {
      return 5;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class02136 class02136 = class04540.y();
      class02136.N(class07861.field_52470, 30);
      class02136.N(class07861.field_52471, 50);
      class02136.N(class07861.field_52472, 15);
      class02136.N().N(this.field_5974).ifPresent(this::N);
      return super.N(var1, var2, var3, var4);
   }

   private void N(class07861 var1) {
      this.field_6011.N(y, var1.field_55009);
   }

   public float O() {
      return this.Q().field_53975;
   }

   @Override
   public class06584 Y() {
      return new class06584(class06570.jj);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.No) {
         this.N(method_66651(class02484.No, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public void e_(class06584 var1) {
      class05549.N(this, var1);
      var1.N(class02484.No, this);
   }

   @Override
   public class04891 method_6002() {
      return class04909.dk;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return super.method_55694(var1).N(this.O());
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.dQ;
   }
}

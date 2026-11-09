package minecraft;

import java.util.EnumSet;

public class class07454 extends class07473 {
   private final class07475 N;

   @Override
   public void L() {
      this.M();
   }

   private void M() {
      Iterable<class07209> iterable = class07209.method_10094(
         class04995.N(this.N.method_23317() - 1.0),
         this.N.method_31478(),
         class04995.N(this.N.method_23321() - 1.0),
         class04995.N(this.N.method_23317() + 1.0),
         class04995.N(this.N.method_23318() + 8.0),
         class04995.N(this.N.method_23321() + 1.0)
      );
      class07209 class07209x = null;

      for (class07209 class07209x : iterable) {
         if (this.N(this.N.method_73183(), class07209x)) {
            class07209x = class07209x;
            break;
         }
      }

      if (class07209x == null) {
         class07209x = class07209.method_49637(this.N.method_23317(), this.N.method_23318() + 8.0, this.N.method_23321());
      }

      this.N.f().N((double)class07209x.method_10263(), (double)(class07209x.method_10264() + 1), (double)class07209x.method_10260(), 1.0);
   }

   public class07454(class07475 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      this.M();
      this.N
         .method_5724(
            0.02F,
            new class06889(
               this.N.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue(),
               this.N.fields_7212a028292fd3c078969e3ee4c71d9e8_1.floatValue(),
               this.N.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue()
            )
         );
      this.N.method_5784(class07451.field_6308, this.N.method_18798());
   }

   @Override
   public boolean y() {
      return this.N();
   }

   private boolean N(class05487 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      return (var1.method_8316(var2).W() || class00500.N(class00869.PN)) && class00500.N(class08791.field_50);
   }

   @Override
   public boolean N() {
      return this.N.method_5669() < 140;
   }

   @Override
   public boolean O_() {
      return false;
   }
}

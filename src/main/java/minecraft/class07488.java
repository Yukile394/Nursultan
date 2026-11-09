package minecraft;

import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class07488 extends class05668 {
   private long N = 0L;

   @Override
   public void method_64615(class07062 var1) {
      if (var1 != class07062.field_27001) {
         this.y();
      }

      super.method_64615(var1);
   }

   @Override
   public void method_5773() {
      if (this.method_73183() instanceof class04782 class04782) {
         int j = class01296.y(this.method_73189().N());
         int i = class01296.y(this.method_73189().L());
         class07049 class07049 = this.i != null ? N(class04782, this.i.L()) : null;
         if (class07049 instanceof class04770 class04770x
            && !class07049.method_5805()
            && !class04770x.field_13989
            && class04770x.method_51469().method_64395().N(class07305.z)) {
            this.method_31472();
         } else {
            super.method_5773();
         }

         if (this.method_5805()) {
            class07209 class07209 = class07209.method_49638(this.method_73189());
            if ((--this.N <= 0L || j != class01296.N(class07209.method_10263()) || i != class01296.N(class07209.method_10260()))
               && class07049 instanceof class04770 class04770) {
               this.N = class04770.method_64133(this);
            }
         }
      } else {
         super.method_5773();
      }
   }

   @Override
   protected void method_5622(class00500 var1) {
      super.method_5622(var1);
      if (var1.N(class00869.EY)) {
         class07049 class07049 = this.z();
         if (class07049 instanceof class04770) {
            ((class04770)class07049).method_5622(var1);
         }
      }
   }

   @Override
   public void method_5700(boolean var1, class07209 var2) {
      class07049.method_67123(this, var1, var2);
   }

   @Override
   public void method_5764(boolean var1) {
      class07049.method_67124(this, var1);
   }

   @Nullable
   @Override
   public class07049 method_5731(class01032 var1) {
      class07049 class07049 = super.method_5731(var1);
      if (class07049 != null) {
         class07049.method_60950(class07209.method_49638(class07049.method_73189()));
      }

      return class07049;
   }

   @Override
   public boolean method_61113(class07299 var1, class07299 var2) {
      return var1.method_27983() == class07299.field_25181 && var2.method_27983() == class07299.field_25179 && this.z() instanceof class04770 class04770
         ? super.method_61113(var1, var2) && class04770.field_13969
         : super.method_61113(var1, var2);
   }

   public class07488(class07078<? extends class07488> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07488(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.C, var2, var1, var3);
   }

   @Nullable
   @Override
   public class07049 z() {
      return this.i != null && this.method_73183() instanceof class04782 class04782 ? this.i.N(class04782, class07049.class) : super.z();
   }

   private void u() {
      class07049 class07049 = this.z();
      if (class07049 instanceof class04770) {
         ((class04770)class07049).method_64124(this);
      }
   }

   private void y() {
      class07049 class07049 = this.z();
      if (class07049 instanceof class04770) {
         ((class04770)class07049).method_64130(this);
      }
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);

      for (int i = 0; i < 32; i++) {
         this.method_73183()
            .method_8406(
               class07107.NM,
               this.method_23317(),
               this.method_23318() + this.field_5974.U() * 2.0,
               this.method_23321(),
               this.field_5974.E(),
               0.0,
               this.field_5974.E()
            );
      }

      if (this.method_73183() instanceof class04782 class04782 && !this.method_31481()) {
         class07049 class07049x = this.z();
         if (class07049x != null && N(class07049x, class04782)) {
            class06889 class06889 = this.method_61411();
            if (class07049x instanceof class04770 class04770x) {
               if (class04770x.field_13987.method_48106()) {
                  if (this.field_5974.z() < 0.05F && class04782.method_74962()) {
                     class07560 class07560 = class07078.A.N(class04782, class06113.field_16461);
                     if (class07560 != null) {
                        class07560.method_5808(
                           class07049x.method_23317(),
                           class07049x.method_23318(),
                           class07049x.method_23321(),
                           class07049x.method_36454(),
                           class07049x.method_36455()
                        );
                        class04782.method_8649(class07560);
                     }
                  }

                  if (this.method_30230()) {
                     class07049x.method_30229();
                  }

                  class04770 class04770x = class04770x.method_61275(
                     new class01032(
                        class04782, class06889, class06889.L, 0.0F, 0.0F, class06681.N(class06681.field_40711, class06681.field_54094), class01032.N
                     )
                  );
                  if (class04770x != null) {
                     class04770x.method_38785();
                     class04770x.method_58396();
                     class04770x.method_64397(class04770x.method_51469(), this.method_48923().W(), 5.0F);
                  }

                  this.N(class04782, class06889);
               }
            } else {
               class07049 class07049x = class07049x.method_5731(
                  new class01032(class04782, class06889, class07049x.method_18798(), class07049x.method_36454(), class07049x.method_36455(), class01032.N)
               );
               if (class07049x != null) {
                  class07049x.method_38785();
               }

               this.N(class04782, class06889);
            }

            this.method_31472();
         } else {
            this.method_31472();
         }
      }
   }

   @Override
   protected void N(@Nullable class08372<class07049> var1) {
      this.y();
      super.N(var1);
      this.u();
   }

   @Override
   protected class06581 N() {
      return class06570.nz;
   }

   @Nullable
   private static class07049 N(class04782 var0, UUID var1) {
      class07049 class07049 = var0.method_73284(var1);
      return (class07049)(class07049 != null ? class07049 : var0.method_8503().Nm().y(var1));
   }

   private static boolean N(class07049 var0, class07299 var1) {
      if (var0.method_73183().method_27983() == var1.method_27983()) {
         return !(var0 instanceof class07438 class07438) ? var0.method_5805() : class07438.method_5805() && !class07438.method_6113();
      } else {
         return var0.method_5822(true);
      }
   }

   private void N(class07299 var1, class06889 var2) {
      var1.method_54762(null, var2.M, var2.B, var2.Z, class04909.lB, class04911.field_15248);
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      var1.L().method_64419(this.method_48923().y(this, this.z()), 0.0F);
   }
}

package minecraft;

public class class04786 extends class04787 {
   public static final int N = 5;
   public static final int y = 120500;
   private boolean i;
   private boolean R;
   private int M;
   private int B;

   public class04786(class04770 var1) {
      super(var1);
   }

   @Override
   public void N(class07209 var1, class07356 var2, class07211 var3, int var4, int var5) {
      if (this.R) {
         this.R();
      } else {
         super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public class07082 N(class04770 var1, class07299 var2, class06584 var3, class07050 var4) {
      if (this.R) {
         this.R();
         return class07082.i;
      } else {
         return super.N(var1, var2, var3, var4);
      }
   }

   @Override
   public class07082 N(class04770 var1, class07299 var2, class06584 var3, class07050 var4, class06183 var5) {
      if (this.R) {
         this.R();
         return class07082.i;
      } else {
         return super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void N() {
      super.N();
      this.B++;
      long ix = this.L.N();
      long j = ix / 24000L + 1L;
      if (!this.i && this.B > 20) {
         this.i = true;
         this.u.field_13987.method_14364(new class00503(class00503.M, 0.0F));
      }

      this.R = ix > 120500L;
      if (this.R) {
         this.M++;
      }

      if (ix % 24000L == 500L) {
         if (j <= 6L) {
            if (j == 6L) {
               this.u.field_13987.method_14364(new class00503(class00503.M, 104.0F));
            } else {
               this.u.method_64398(class00392.L("demo.day." + j));
            }
         }
      } else if (j == 1L) {
         if (ix == 100L) {
            this.u.field_13987.method_14364(new class00503(class00503.M, 101.0F));
         } else if (ix == 175L) {
            this.u.field_13987.method_14364(new class00503(class00503.M, 102.0F));
         } else if (ix == 250L) {
            this.u.field_13987.method_14364(new class00503(class00503.M, 103.0F));
         }
      } else if (j == 5L && ix % 24000L == 22000L) {
         this.u.method_64398(class00392.L("demo.day.warning"));
      }
   }

   private void R() {
      if (this.M > 100) {
         this.u.method_64398(class00392.L("demo.reminder"));
         this.M = 0;
      }
   }
}

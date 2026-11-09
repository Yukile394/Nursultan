package minecraft;

public class class07871 extends class07629 {
   private static final class02131<Integer> B = class03289.N(class07871.class, class02154.y);
   int N;
   int y;
   private static final class01317 Z = (var0, var1) -> var0 instanceof class08036 && ((class08036)var0).method_68878()
      ? false
      : !var0.method_5864().N(class01217.Y);
   static final class01328 L = class01328.y().i().u().N(Z);
   public static final int u = 0;
   public static final int i = 1;
   public static final int R = 2;
   private static final int W = 0;

   @Override
   public void method_5674(class02131<?> var1) {
      if (B.equals(var1)) {
         this.method_18382();
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(B, 0);
   }

   @Override
   public void method_5773() {
      if (!this.method_73183().method_8608() && this.method_5805() && this.method_6034()) {
         if (this.N > 0) {
            if (this.v() == 0) {
               this.method_56078(class04909.lQ);
               this.N(1);
            } else if (this.N > 40 && this.v() == 1) {
               this.method_56078(class04909.lQ);
               this.N(2);
            }

            this.N++;
         } else if (this.v() != 0) {
            if (this.y > 60 && this.v() == 2) {
               this.method_56078(class04909.lY);
               this.N(1);
            } else if (this.y > 100 && this.v() == 1) {
               this.method_56078(class04909.lY);
               this.N(0);
            }

            this.y++;
         }
      }

      super.method_5773();
   }

   @Override
   public void method_5694(class08036 var1) {
      int ix = this.v();
      if (var1 instanceof class04770 class04770 && ix > 0 && var1.method_64397(class04770.method_51469(), this.method_48923().y((class07438)this), 1 + ix)) {
         if (!this.method_5701()) {
            class04770.field_13987.method_14364(new class00503(class00503.U, 0.0F));
         }

         var1.method_37222(new class07055(class07047.j, 60 * ix, 0), this);
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("PuffState", this.v());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(Math.min(var1.N("PuffState", 0), 2));
   }

   public class07871(class07078<? extends class07871> var1, class07299 var2) {
      super(var1, var2);
      this.method_18382();
   }

   @Override
   protected class04891 m() {
      return class04909.lg;
   }

   public int v() {
      return this.field_6011.N(B);
   }

   private static float y(int var0) {
      switch (var0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   public void N(int var1) {
      this.field_6011.N(B, var1);
   }

   private void N(class04782 var1, class07079 var2) {
      int ix = this.v();
      if (var2.method_64397(var1, this.method_48923().y((class07438)this), 1 + ix)) {
         var2.method_37222(new class07055(class07047.j, 60 * ix, 0), this);
         this.method_5783(class04909.lJ, 1.0F, 1.0F);
      }
   }

   @Override
   public class06584 Y() {
      return new class06584(class06570.jb);
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(1, new class07902(this));
   }

   @Override
   public class04891 method_6002() {
      return class04909.lO;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return super.method_55694(var1).N(y(this.v()));
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_73183() instanceof class04782 class04782 && this.method_5805() && this.v() > 0) {
         for (class07079 class07079 : this.method_73183().N(class07079.class, this.method_5829().M(0.3), var2 -> L.N(class04782, this, var2))) {
            if (class07079.method_5805()) {
               this.N(class04782, class07079);
            }
         }
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.lI;
   }
}

package minecraft;

import Nursultan.class10714;
import org.jspecify.annotations.Nullable;

public class class06179 extends class00683 {
   private static final int C = 47999;
   private int S = 47999;

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("DespawnDelay", this.S);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.S = var1.N("DespawnDelay", 47999);
   }

   public class06179(class07078<? extends class06179> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected void y(class08036 var1) {
      if (!(this.yW() instanceof class06163)) {
         super.y(var1);
      }
   }

   @Override
   public void E(int var1) {
      this.S = var1;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var3 == class06113.field_16467) {
         this.u(0);
      }

      if (var4 == null) {
         var4 = new class10714(false);
      }

      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   public boolean ND() {
      return true;
   }

   private boolean yP() {
      return this.g_() && !this.ym();
   }

   private void yM() {
      if (this.yB()) {
         this.S = this.ym() ? ((class06163)this.yW()).B() - 1 : this.S - 1;
         if (this.S <= 0) {
            this.yE();
            this.method_31472();
         }
      }
   }

   private boolean yB() {
      return !this.I() && !this.yP() && !this.method_5817();
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(1, new class07993(this, 2.0));
      this.H.N(1, new class06140(this));
      this.H.N(2, new class07952<>(this, class08004.class, true, (var0, var1) -> var0.method_5864() != class07078.LN));
      this.H.N(2, new class07952<>(this, class00675.class, true));
   }

   @Nullable
   @Override
   protected class00683 yy() {
      return class07078.yJ.N(this.method_73183(), class06113.field_16466);
   }

   private boolean ym() {
      return this.yW() instanceof class06163;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (!this.method_73183().method_8608()) {
         this.yM();
      }
   }
}

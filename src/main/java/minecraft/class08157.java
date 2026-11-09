package minecraft;

import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class class08157 extends class08156 {
   private static final int p = 300;

   @Override
   public int method_5748() {
      return 300;
   }

   @Override
   public void method_5670() {
      int i = this.method_5669();
      super.method_5670();
      if (!this.Nt() && this.method_73183() instanceof class04782 class04782) {
         this.N(class04782, i);
      }
   }

   @Override
   protected class04891 method_5737() {
      return this.method_6109() ? class04909.yW : class04909.vu;
   }

   public class08157(class07078<? extends class08157> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      if (this.method_6109()) {
         return this.method_5869() ? class04909.yi : class04909.yR;
      } else {
         return this.method_5869() ? class04909.jA : class04909.jf;
      }
   }

   @Override
   protected class04891 l() {
      return this.method_5869() ? class04909.jx : class04909.jD;
   }

   @Override
   public boolean g() {
      return !this.Q();
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("nautilusBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("nautilusActivityUpdate");
      class08185.N(this);
      class04643.L();
      super.N(var1);
   }

   @Nullable
   public class08157 y(class04782 var1, class07077 var2) {
      class08157 class08157 = class07078.NH.N(var1, class06113.field_16466);
      if (class08157 != null && this.NQ()) {
         class08157.a_(this.NI());
         class08157.N(true, true);
      }

      return class08157;
   }

   protected void N(class04782 var1, int var2) {
      if (this.method_5805() && !this.method_5799()) {
         this.method_5855(var2 - 1);
         if (this.method_5669() <= -20) {
            this.method_5855(0);
            this.method_64397(var1, this.method_48923().v(), 2.0F);
         }
      } else {
         this.method_5855(300);
      }
   }

   @Override
   protected void O() {
      class04891 class04891 = this.method_6109() ? class04909.yZ : class04909.vN;
      this.method_56078(class04891);
   }

   @Override
   protected class04891 G() {
      return this.method_5869() ? class04909.jC : class04909.jS;
   }

   @Override
   public class05781<class08157> method_28306() {
      return class08185.N();
   }

   @Override
   public class04891 method_6002() {
      if (this.method_6109()) {
         return this.method_5869() ? class04909.yM : class04909.yB;
      } else {
         return this.method_5869() ? class04909.jh : class04909.jr;
      }
   }

   @Override
   public class01289<class08157> method_18868() {
      return (class01289<class08157>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      if (this.method_6109()) {
         return this.method_5869() ? class04909.yz : class04909.yU;
      } else {
         return this.method_5869() ? class04909.vy : class04909.vL;
      }
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class08185.N(this.method_28306().N(var1));
   }
}

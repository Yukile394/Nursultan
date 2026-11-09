package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class08187 extends class08156 {
   private static final class02131<class03556<class07589>> p = class03289.N(class08187.class, class02154.O);

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NF);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(p, class08577.N(this.method_56673(), class07597.N));
   }

   @Override
   protected class04891 method_5737() {
      return class04909.oM;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class08577.N(var1, this.o());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NF ? method_66651(var1, new class02204<>(this.o())) : super.method_58694(var1);
   }

   @Override
   public boolean method_6109() {
      return false;
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08577.N(var1, class04227.Nx).ifPresent(this::N);
   }

   public class08187(class07078<? extends class08187> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 I() {
      return class08156.B().N(class05298.l, 1.1F);
   }

   @Override
   protected class07085 J() {
      return class07085.field_48824;
   }

   @Override
   protected class04891 s() {
      return this.method_5869() ? class04909.JS : class04909.Jx;
   }

   @Override
   protected class04891 l() {
      return this.method_5869() ? class04909.Jr : class04909.oN;
   }

   public class03556<class07589> o() {
      return this.field_6011.N(p);
   }

   @Override
   public boolean g() {
      return !this.Q() && !this.Y();
   }

   public void N(class03556<class07589> var1) {
      this.field_6011.N(p, (class03556<class07589>)var1);
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class08577.N(class08579.N(var1, this.method_24515()), class04227.Nx).ifPresent(this::N);
      return super.N(var1, var2, var3, var4);
   }

   @Nullable
   public class08187 y(class04782 var1, class07077 var2) {
      return null;
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("zombieNautilusBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("zombieNautilusActivityUpdate");
      class08167.N(this);
      class04643.L();
      super.N(var1);
   }

   @Override
   protected void O() {
      this.method_56078(class04909.ou);
   }

   @Override
   protected class04891 G() {
      return this.method_5869() ? class04909.JD : class04909.Jh;
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NF) {
         Optional<class03556<class07589>> optional = method_66651(class02484.NF, var2).N(this.method_56673());
         if (optional.isPresent()) {
            this.N(optional.get());
            return true;
         } else {
            return false;
         }
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public class05781<class08187> method_28306() {
      return class08167.N();
   }

   @Override
   public class04891 method_6002() {
      return this.method_5869() ? class04909.oy : class04909.oL;
   }

   @Override
   public class01289<class08187> method_18868() {
      return (class01289<class08187>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.method_5869() ? class04909.oi : class04909.oR;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class08167.N(this.method_28306().N(var1));
   }
}

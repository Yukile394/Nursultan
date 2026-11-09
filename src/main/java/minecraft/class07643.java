package minecraft;

import Nursultan.class10777;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class class07643 extends class07629 {
   @Nullable
   private class07643 N;
   private int y = 1;

   public void w() {
      if (this.n()) {
         this.f().N(this.N, 1.0);
      }
   }

   private void Q() {
      this.y++;
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.l() && this.method_73183().field_9229.y(200) == 1 && this.method_73183().N(this.getClass(), this.method_5829().L(8.0, 8.0, 8.0)).size() <= 1) {
         this.y = 1;
      }
   }

   public class07643(class07078<? extends class07643> var1, class07299 var2) {
      super(var1, var2);
   }

   public boolean n() {
      return this.N != null && this.N.method_5805();
   }

   public boolean l() {
      return this.y > 1;
   }

   public boolean d() {
      return this.method_5858(this.N) <= 121.0;
   }

   public void t() {
      this.N.O();
      this.N = null;
   }

   public int v() {
      return super.n_();
   }

   public class07643 N(class07643 var1) {
      this.N = var1;
      var1.Q();
      return var1;
   }

   public void N(Stream<? extends class07643> var1) {
      var1.limit(this.v() - this.y).filter(var1x -> var1x != this).forEach(var1x -> var1x.N(this));
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      super.N(var1, var2, var3, (class07446)var4);
      if (var4 == null) {
         var4 = new class10777(this);
      } else {
         this.N(((class10777)var4).N);
      }

      return (class07446)var4;
   }

   @Override
   public boolean W() {
      return !this.n();
   }

   private void O() {
      this.y--;
   }

   @Override
   public boolean G() {
      return this.l() && this.y < this.v();
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(5, new class07429(this));
   }

   @Override
   public int n_() {
      return this.v();
   }
}

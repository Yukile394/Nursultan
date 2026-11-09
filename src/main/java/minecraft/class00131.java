package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class00131 extends class01777 {
   private final class06202 y;
   private final List<class06478> L;

   public class00131(class00104 var1, class06202 var2, int var3, int var4) {
      super(0, 0, var3, var4, class05220.N);
      this.N = var1;
      this.L = new ArrayList<>();
      this.y = var2;
      var1.N.method_48206(this.L::add);
   }

   @Override
   public class03255 N_49(class03249 var1) {
      return new class03255(this.method_46426(), this.method_46427(), this.field_22758, this.method_44395());
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.L;
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      super.method_25395(var1);
      if (var1 != null && this.y.Nc().y()) {
         class03255 class03255x = this.method_48202();
         class03255 class03255x = var1.method_48202();
         int i = class03255x.y() - class03255x.y();
         int j = class03255x.L() - class03255x.L();
         if (i < 0) {
            this.method_44382(this.method_44387() + i - 14.0);
         } else if (j > 0) {
            this.method_44382(this.method_44387() + j + 14.0);
         }
      }
   }

   @Override
   public void method_46419(int var1) {
      super.method_46419(var1);
      this.N.N.method_46419(var1 - (int)this.method_44387());
   }

   @Override
   public void method_46421(int var1) {
      super.method_46421(var1);
      this.N.N.method_46421(var1 + 10);
   }

   @Override
   public Collection<? extends class03434> e_() {
      return this.L;
   }

   @Override
   public void method_44382(double var1) {
      super.method_44382(var1);
      this.N.N.method_46419(this.method_48202().y() - (int)this.method_44387());
   }

   @Override
   protected void method_47399(class03428 var1) {
   }

   @Override
   protected void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.L(this.method_46426(), this.method_46427(), this.method_46426() + this.field_22758, this.method_46427() + this.field_22759);
      Iterator<class06478> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         iterator.next().method_25394(var1, var2, var3, var4);
      }

      var1.R();
      this.method_44396(var1, var2, var3);
   }

   @Override
   protected int method_44395() {
      return this.N.N.method_25364();
   }

   @Override
   protected double method_44393() {
      return 10.0;
   }
}

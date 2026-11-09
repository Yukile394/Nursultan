package minecraft;

import java.util.Iterator;
import java.util.List;

class class07180 extends class07168 {
   private static final int L = 20;
   private boolean u;
   private int i;

   @Override
   public void L() {
   }

   class07180(class07155 var1) {
      super(var1);
      this.N = var1;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.L = new class06889(class07438.method_23317(), class07438.method_23323(0.5), class07438.method_23321());
         if (this.N.method_5829().M(0.2F).L(class07438.method_5829())) {
            this.N.method_6121(N_18(this.N.method_73183()), class07438);
            this.N.i = class07142.field_7318;
            if (!this.N.method_5701()) {
               this.N.method_73183().N(1039, this.N.method_24515(), 0);
            }
         } else if (this.N.field_5976 || this.N.fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0) {
            this.N.i = class07142.field_7318;
         }
      }
   }

   @Override
   public void u() {
      this.N.y(null);
      this.N.i = class07142.field_7318;
   }

   @Override
   public boolean y() {
      class07438 class07438 = this.N.T();
      if (class07438 == null) {
         return false;
      } else if (!class07438.method_5805()) {
         return false;
      } else if (class07438 instanceof class08036 var2 && (class07438.method_7325() || var2.method_68878())) {
         return false;
      } else if (!this.N()) {
         return false;
      } else {
         if (this.N.field_6012 > this.i) {
            this.i = this.N.field_6012 + 20;
            List<class07617> list = this.N.method_73183().N(class07617.class, this.N.method_5829().M(16.0), class07042.N);
            Iterator<class07617> iterator = list.iterator();

            while (iterator.hasNext()) {
               iterator.next().n();
            }

            this.u = !list.isEmpty();
         }

         return !this.u;
      }
   }

   @Override
   public boolean N() {
      return this.N.T() != null && this.N.i == class07142.field_7317;
   }
}

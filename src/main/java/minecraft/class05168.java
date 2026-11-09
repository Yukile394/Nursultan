package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class class05168 extends class05154 {
   private final List<class05163> y = Lists.newLinkedList();

   public class05168(int var1, class06069 var2, int var3, int var4, class06187 var5) {
      super(class04878.L, var1, var5, new class05163(var3, 50, var4, var3 + 7 + var2.y(6), 54 + var2.y(6), var4 + 7 + var2.y(6)));
      this.N = var5;
   }

   public class05168(class07001 var1) {
      super(class04878.L, var1);
      this.y.addAll(var1.<List<? extends class05163>>N_15("Entrances", class05163.N.listOf()).orElse(List.of()));
   }

   @Override
   public void N(int var1, int var2, int var3) {
      super.N(var1, var2, var3);
      Iterator<class05163> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, var2, var3);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Entrances", class05163.N.listOf(), this.y);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (!this.N(var1, var5)) {
         this.N(var1, var5, this.k.B(), this.k.Z() + 1, this.k.z(), this.k.U(), Math.min(this.k.Z() + 3, this.k.E()), this.k.W(), w, w, false);

         for (class05163 class05163 : this.y) {
            this.N(var1, var5, class05163.B(), class05163.E() - 2, class05163.z(), class05163.U(), class05163.E(), class05163.W(), w, w, false);
         }

         this.N(var1, var5, this.k.B(), this.k.Z() + 4, this.k.z(), this.k.U(), this.k.E(), this.k.W(), w, false);
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      int i = this.u();
      int k = this.k.i() - 3 - 1;
      if (k <= 0) {
         k = 1;
      }

      int j = 0;

      while (j < this.k.u()) {
         j += var3.y(this.k.u());
         if (j + 3 > this.k.u()) {
            break;
         }

         class05154 class05154xxx = class05184.N(var1, var2, var3, this.k.B() + j, this.k.Z() + var3.y(k) + 1, this.k.z() - 1, class07211.field_11043, i);
         if (class05154xxx != null) {
            class05163 class05163xxx = class05154xxx.L();
            this.y.add(new class05163(class05163xxx.B(), class05163xxx.Z(), this.k.z(), class05163xxx.U(), class05163xxx.E(), this.k.z() + 1));
         }

         j += 4;
      }

      j = 0;

      while (j < this.k.u()) {
         j += var3.y(this.k.u());
         if (j + 3 > this.k.u()) {
            break;
         }

         class05154 class05154xx = class05184.N(var1, var2, var3, this.k.B() + j, this.k.Z() + var3.y(k) + 1, this.k.W() + 1, class07211.field_11035, i);
         if (class05154xx != null) {
            class05163 class05163xx = class05154xx.L();
            this.y.add(new class05163(class05163xx.B(), class05163xx.Z(), this.k.W() - 1, class05163xx.U(), class05163xx.E(), this.k.W()));
         }

         j += 4;
      }

      j = 0;

      while (j < this.k.R()) {
         j += var3.y(this.k.R());
         if (j + 3 > this.k.R()) {
            break;
         }

         class05154 class05154x = class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var3.y(k) + 1, this.k.z() + j, class07211.field_11039, i);
         if (class05154x != null) {
            class05163 class05163x = class05154x.L();
            this.y.add(new class05163(this.k.B(), class05163x.Z(), class05163x.z(), this.k.B() + 1, class05163x.E(), class05163x.W()));
         }

         j += 4;
      }

      j = 0;

      while (j < this.k.R()) {
         j += var3.y(this.k.R());
         if (j + 3 > this.k.R()) {
            break;
         }

         class05154 class05154 = class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var3.y(k) + 1, this.k.z() + j, class07211.field_11034, i);
         if (class05154 != null) {
            class05163 class05163 = class05154.L();
            this.y.add(new class05163(this.k.U() - 1, class05163.Z(), class05163.z(), this.k.U(), class05163.E(), class05163.W()));
         }

         j += 4;
      }
   }
}

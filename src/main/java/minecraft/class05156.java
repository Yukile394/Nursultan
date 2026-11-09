package minecraft;

import org.jspecify.annotations.Nullable;

public class class05156 extends class05154 {
   private final class07211 y;
   private final boolean L;

   public class05156(int var1, class05163 var2, @Nullable class07211 var3, class06187 var4) {
      super(class04878.y, var1, var4, var2);
      this.y = var3;
      this.L = var2.i() > 3;
   }

   public class05156(class07001 var1) {
      super(class04878.y, var1);
      this.L = var1.y("tf", false);
      this.y = var1.<class07211>N_15("D", class07211.field_57038).orElse(class07211.field_11035);
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      int i = this.u();
      switch (this.y) {
         case field_11043:
         default:
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z(), this.k.z() - 1, class07211.field_11043, i);
            class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z(), this.k.z() + 1, class07211.field_11039, i);
            class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z(), this.k.z() + 1, class07211.field_11034, i);
            break;
         case field_11035:
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z(), this.k.W() + 1, class07211.field_11035, i);
            class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z(), this.k.z() + 1, class07211.field_11039, i);
            class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z(), this.k.z() + 1, class07211.field_11034, i);
            break;
         case field_11039:
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z(), this.k.z() - 1, class07211.field_11043, i);
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z(), this.k.W() + 1, class07211.field_11035, i);
            class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z(), this.k.z() + 1, class07211.field_11039, i);
            break;
         case field_11034:
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z(), this.k.z() - 1, class07211.field_11043, i);
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z(), this.k.W() + 1, class07211.field_11035, i);
            class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z(), this.k.z() + 1, class07211.field_11034, i);
      }

      if (this.L) {
         if (var3.Z()) {
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z() + 3 + 1, this.k.z() - 1, class07211.field_11043, i);
         }

         if (var3.Z()) {
            class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + 3 + 1, this.k.z() + 1, class07211.field_11039, i);
         }

         if (var3.Z()) {
            class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + 3 + 1, this.k.z() + 1, class07211.field_11034, i);
         }

         if (var3.Z()) {
            class05184.N(var1, var2, var3, this.k.B() + 1, this.k.Z() + 3 + 1, this.k.W() + 1, class07211.field_11035, i);
         }
      }
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (!this.N(var1, var5)) {
         class00500 class00500 = this.N.L();
         if (this.L) {
            this.N(var1, var5, this.k.B() + 1, this.k.Z(), this.k.z(), this.k.U() - 1, this.k.Z() + 3 - 1, this.k.W(), w, w, false);
            this.N(var1, var5, this.k.B(), this.k.Z(), this.k.z() + 1, this.k.U(), this.k.Z() + 3 - 1, this.k.W() - 1, w, w, false);
            this.N(var1, var5, this.k.B() + 1, this.k.E() - 2, this.k.z(), this.k.U() - 1, this.k.E(), this.k.W(), w, w, false);
            this.N(var1, var5, this.k.B(), this.k.E() - 2, this.k.z() + 1, this.k.U(), this.k.E(), this.k.W() - 1, w, w, false);
            this.N(var1, var5, this.k.B() + 1, this.k.Z() + 3, this.k.z() + 1, this.k.U() - 1, this.k.Z() + 3, this.k.W() - 1, w, w, false);
         } else {
            this.N(var1, var5, this.k.B() + 1, this.k.Z(), this.k.z(), this.k.U() - 1, this.k.E(), this.k.W(), w, w, false);
            this.N(var1, var5, this.k.B(), this.k.Z(), this.k.z() + 1, this.k.U(), this.k.E(), this.k.W() - 1, w, w, false);
         }

         this.N(var1, var5, this.k.B() + 1, this.k.Z(), this.k.z() + 1, this.k.E());
         this.N(var1, var5, this.k.B() + 1, this.k.Z(), this.k.W() - 1, this.k.E());
         this.N(var1, var5, this.k.U() - 1, this.k.Z(), this.k.z() + 1, this.k.E());
         this.N(var1, var5, this.k.U() - 1, this.k.Z(), this.k.W() - 1, this.k.E());
         int i = this.k.Z() - 1;

         for (int j = this.k.B(); j <= this.k.U(); j++) {
            for (int k = this.k.z(); k <= this.k.W(); k++) {
               this.N(var1, var5, class00500, j, i, k);
            }
         }
      }
   }

   private void N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6) {
      if (!this.N(var1, var3, var6 + 1, var5, var2).P()) {
         this.N(var1, var2, var3, var4, var5, var3, var6, var5, this.N.L(), w, false);
      }
   }

   @Nullable
   public static class05163 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5) {
      byte b0;
      if (var1.y(4) == 0) {
         b0 = 6;
      } else {
         b0 = 2;
      }
      class05163 class05163 = switch (var5) {
         default -> new class05163(-1, 0, -4, 3, b0, 0);
         case field_11035 -> new class05163(-1, 0, 0, 3, b0, 4);
         case field_11039 -> new class05163(-4, 0, -1, 0, b0, 3);
         case field_11034 -> new class05163(0, 0, -1, 4, b0, 3);
      };
      class05163.N(var2, var3, var4);
      return var0.N(class05163) != null ? null : class05163;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("tf", this.L);
      var2.N("D", class07211.field_57038, this.y);
   }
}

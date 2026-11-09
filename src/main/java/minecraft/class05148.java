package minecraft;

import org.jspecify.annotations.Nullable;

public class class05148 extends class05154 {
   public class05148(int var1, class05163 var2, class07211 var3, class06187 var4) {
      super(class04878.u, var1, var4, var2);
      this.N(var3);
   }

   public class05148(class07001 var1) {
      super(class04878.u, var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      int i = this.u();
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
            default:
               class05184.N(var1, var2, var3, this.k.B(), this.k.Z(), this.k.z() - 1, class07211.field_11043, i);
               break;
            case field_11035:
               class05184.N(var1, var2, var3, this.k.B(), this.k.Z(), this.k.W() + 1, class07211.field_11035, i);
               break;
            case field_11039:
               class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z(), this.k.z(), class07211.field_11039, i);
               break;
            case field_11034:
               class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z(), this.k.z(), class07211.field_11034, i);
         }
      }
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (!this.N(var1, var5)) {
         this.N(var1, var5, 0, 5, 0, 2, 7, 1, w, w, false);
         this.N(var1, var5, 0, 0, 7, 2, 2, 8, w, w, false);

         for (int i = 0; i < 5; i++) {
            this.N(var1, var5, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, w, w, false);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static class05163 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5) {
      class05163 class05163 = switch (var5) {
         default -> new class05163(0, -5, -8, 2, 2, 0);
         case field_11035 -> new class05163(0, -5, 0, 2, 2, 8);
         case field_11039 -> new class05163(-8, -5, 0, 0, 2, 2);
         case field_11034 -> new class05163(0, -5, 0, 8, 2, 2);
      };
      class05163.N(var2, var3, var4);
      return var0.N(class05163) != null ? null : class05163;
   }
}

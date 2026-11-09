package minecraft;

import org.jspecify.annotations.Nullable;

abstract class class04931 extends class04890 {
   protected class04900 i = class04900.field_15288;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   protected class04890 L(class04898 var1, class03860 var2, class06069 var3, int var4, int var5) {
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
               return class04933.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11034, this.u());
            case field_11035:
               return class04933.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11034, this.u());
            case field_11039:
               return class04933.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.W() + 1, class07211.field_11035, this.u());
            case field_11034:
               return class04933.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.W() + 1, class07211.field_11035, this.u());
         }
      }

      return null;
   }

   protected class04931(class04878 var1, int var2, class05163 var3) {
      super(var1, var2, var3);
   }

   public class04931(class04878 var1, class07001 var2) {
      super(var1, var2);
      this.i = var2.<class04900>N_15("EntryDoor", class04900.field_56683).orElseThrow();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   protected class04890 y(class04898 var1, class03860 var2, class06069 var3, int var4, int var5) {
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
               return class04933.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11039, this.u());
            case field_11035:
               return class04933.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11039, this.u());
            case field_11039:
               return class04933.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.z() - 1, class07211.field_11043, this.u());
            case field_11034:
               return class04933.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.z() - 1, class07211.field_11043, this.u());
         }
      }

      return null;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   protected class04890 N(class04898 var1, class03860 var2, class06069 var3, int var4, int var5) {
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
               return class04933.N(var1, var2, var3, this.k.B() + var4, this.k.Z() + var5, this.k.z() - 1, class07211, this.u());
            case field_11035:
               return class04933.N(var1, var2, var3, this.k.B() + var4, this.k.Z() + var5, this.k.W() + 1, class07211, this.u());
            case field_11039:
               return class04933.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var5, this.k.z() + var4, class07211, this.u());
            case field_11034:
               return class04933.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var5, this.k.z() + var4, class07211, this.u());
         }
      }

      return null;
   }

   protected static boolean N(class05163 var0) {
      return var0.Z() > 10;
   }

   protected class04900 N(class06069 var1) {
      switch (var1.y(5)) {
         case 0:
         case 1:
         default:
            return class04900.field_15288;
         case 2:
            return class04900.field_15290;
         case 3:
            return class04900.field_15289;
         case 4:
            return class04900.field_15291;
      }
   }

   protected void N(class05974 var1, class06069 var2, class05163 var3, class04900 var4, int var5, int var6, int var7) {
      switch (var4) {
         case field_15288:
            this.N(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, w, w, false);
            break;
         case field_15290:
            this.L(var1, class00869.Rm.W(), var5, var6, var7, var3);
            this.L(var1, class00869.Rm.W(), var5, var6 + 1, var7, var3);
            this.L(var1, class00869.Rm.W(), var5, var6 + 2, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 1, var6 + 2, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 2, var6 + 2, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 2, var6 + 1, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 2, var6, var7, var3);
            this.L(var1, class00869.uE.W(), var5 + 1, var6, var7, var3);
            this.L(var1, class00869.uE.W().y(class07196.L, class08059.field_12609), var5 + 1, var6 + 1, var7, var3);
            break;
         case field_15289:
            this.L(var1, class00869.mr.W(), var5 + 1, var6, var7, var3);
            this.L(var1, class00869.mr.W(), var5 + 1, var6 + 1, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.i, true), var5, var6, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.i, true), var5, var6 + 1, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.L, true).y(class07100.i, true), var5, var6 + 2, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.L, true).y(class07100.i, true), var5 + 1, var6 + 2, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.L, true).y(class07100.i, true), var5 + 2, var6 + 2, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.L, true), var5 + 2, var6 + 1, var7, var3);
            this.L(var1, class00869.RQ.W().y(class07100.L, true), var5 + 2, var6, var7, var3);
            break;
         case field_15291:
            this.L(var1, class00869.Rm.W(), var5, var6, var7, var3);
            this.L(var1, class00869.Rm.W(), var5, var6 + 1, var7, var3);
            this.L(var1, class00869.Rm.W(), var5, var6 + 2, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 1, var6 + 2, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 2, var6 + 2, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 2, var6 + 1, var7, var3);
            this.L(var1, class00869.Rm.W(), var5 + 2, var6, var7, var3);
            this.L(var1, class00869.ur.W(), var5 + 1, var6, var7, var3);
            this.L(var1, class00869.ur.W().y(class07196.L, class08059.field_12609), var5 + 1, var6 + 1, var7, var3);
            this.L(var1, class00869.iP.W().y(class00889.R, class07211.field_11043), var5 + 2, var6 + 1, var7 + 1, var3);
            this.L(var1, class00869.iP.W().y(class00889.R, class07211.field_11035), var5 + 2, var6 + 1, var7 - 1, var3);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      var2.N("EntryDoor", class04900.field_56683, this.i);
   }
}

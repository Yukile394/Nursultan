package minecraft;

import Nursultan.class09108;
import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public class class04980 extends class05105 implements class04942 {
   @SerializedName("spawnProtection")
   public int N = 0;
   @SerializedName("forceGameMode")
   public boolean y = false;
   @SerializedName("difficulty")
   public int L = 2;
   @SerializedName("gameMode")
   public int u = 0;
   @SerializedName("slotName")
   private String z = "";
   @SerializedName("version")
   public String i = "";
   @SerializedName("compatibility")
   public class04949 R = class04949.field_46697;
   @SerializedName("worldTemplateId")
   public long M = -1L;
   @SerializedName("worldTemplateImage")
   @Nullable
   public String B = null;
   @class09108
   public boolean Z;

   public class04980 L() {
      return new class04980(this.N, this.L, this.u, this.y, this.z, this.i, this.R);
   }

   private class04980() {
      super();
   }

   public class04980(int var1, int var2, int var3, boolean var4, String var5, String var6, class04949 var7) {
      super();
      this.N = var1;
      this.L = var2;
      this.u = var3;
      this.y = var4;
      this.z = var5;
      this.i = var6;
      this.R = var7;
   }

   public static class04980 y() {
      class04980 class04980 = N();
      class04980.N(true);
      return class04980;
   }

   public String y(int var1) {
      return class08392.N("mco.configure.world.slot", var1);
   }

   private static void N(class04980 var0) {
      if (var0.z == null) {
         var0.z = "";
      }

      if (var0.i == null) {
         var0.i = "";
      }

      if (var0.R == null) {
         var0.R = class04949.field_46697;
      }
   }

   public void N(boolean var1) {
      this.Z = var1;
   }

   public String N(int var1) {
      if (class05018.B(this.z)) {
         return this.Z ? class08392.N("mco.configure.world.slot.empty") : this.y(var1);
      } else {
         return this.z;
      }
   }

   public static class04980 N() {
      return new class04980();
   }

   public static class04980 N(class07282 var0, class07086 var1, boolean var2, String var3, String var4) {
      class04980 class04980 = N();
      class04980.L = var1.N();
      class04980.u = var0.N();
      class04980.z = var4;
      class04980.i = var3;
      return class04980;
   }

   public static class04980 N(class07312 var0, String var1) {
      return N(var0.y(), var0.u(), var0.L(), var1, var0.N());
   }

   public static class04980 N(class04968 var0, String var1) {
      class04980 class04980 = var0.N(var1, class04980.class);
      if (class04980 == null) {
         return N();
      } else {
         N(class04980);
         return class04980;
      }
   }
}

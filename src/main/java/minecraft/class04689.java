package minecraft;

import com.google.common.base.Preconditions;

public class class04689 {
   private static final class04689[] NW = new class04689[64];
   public static final class04689 N = new class04689(0, 0);
   public static final class04689 y = new class04689(1, 8368696);
   public static final class04689 L = new class04689(2, 16247203);
   public static final class04689 u = new class04689(3, 13092807);
   public static final class04689 i = new class04689(4, 16711680);
   public static final class04689 R = new class04689(5, 10526975);
   public static final class04689 M = new class04689(6, 10987431);
   public static final class04689 B = new class04689(7, 31744);
   public static final class04689 Z = new class04689(8, 16777215);
   public static final class04689 z = new class04689(9, 10791096);
   public static final class04689 U = new class04689(10, 9923917);
   public static final class04689 E = new class04689(11, 7368816);
   public static final class04689 W = new class04689(12, 4210943);
   public static final class04689 m = new class04689(13, 9402184);
   public static final class04689 P = new class04689(14, 16776437);
   public static final class04689 s = new class04689(15, 14188339);
   public static final class04689 T = new class04689(16, 11685080);
   public static final class04689 b = new class04689(17, 6724056);
   public static final class04689 j = new class04689(18, 15066419);
   public static final class04689 v = new class04689(19, 8375321);
   public static final class04689 n = new class04689(20, 15892389);
   public static final class04689 t = new class04689(21, 5000268);
   public static final class04689 G = new class04689(22, 10066329);
   public static final class04689 l = new class04689(23, 5013401);
   public static final class04689 d = new class04689(24, 8339378);
   public static final class04689 w = new class04689(25, 3361970);
   public static final class04689 k = new class04689(26, 6704179);
   public static final class04689 Y = new class04689(27, 6717235);
   public static final class04689 Q = new class04689(28, 10040115);
   public static final class04689 O = new class04689(29, 1644825);
   public static final class04689 g = new class04689(30, 16445005);
   public static final class04689 I = new class04689(31, 6085589);
   public static final class04689 J = new class04689(32, 4882687);
   public static final class04689 o = new class04689(33, 55610);
   public static final class04689 q = new class04689(34, 8476209);
   public static final class04689 K = new class04689(35, 7340544);
   public static final class04689 V = new class04689(36, 13742497);
   public static final class04689 e = new class04689(37, 10441252);
   public static final class04689 H = new class04689(38, 9787244);
   public static final class04689 c = new class04689(39, 7367818);
   public static final class04689 X = new class04689(40, 12223780);
   public static final class04689 a = new class04689(41, 6780213);
   public static final class04689 p = new class04689(42, 10505550);
   public static final class04689 F = new class04689(43, 3746083);
   public static final class04689 A = new class04689(44, 8874850);
   public static final class04689 f = new class04689(45, 5725276);
   public static final class04689 C = new class04689(46, 8014168);
   public static final class04689 S = new class04689(47, 4996700);
   public static final class04689 x = new class04689(48, 4993571);
   public static final class04689 D = new class04689(49, 5001770);
   public static final class04689 h = new class04689(50, 9321518);
   public static final class04689 r = new class04689(51, 2430480);
   public static final class04689 NN = new class04689(52, 12398641);
   public static final class04689 Ny = new class04689(53, 9715553);
   public static final class04689 NL = new class04689(54, 6035741);
   public static final class04689 Nu = new class04689(55, 1474182);
   public static final class04689 Ni = new class04689(56, 3837580);
   public static final class04689 NR = new class04689(57, 5647422);
   public static final class04689 NM = new class04689(58, 1356933);
   public static final class04689 NB = new class04689(59, 6579300);
   public static final class04689 NZ = new class04689(60, 14200723);
   public static final class04689 Nz = new class04689(61, 8365974);
   public final int NU;
   public final int NE;

   private static class04689 L(int var0) {
      class04689 class04689 = NW[var0];
      return class04689 != null ? class04689 : N;
   }

   private class04689(int var1, int var2) {
      super();
      if (var1 >= 0 && var1 <= 63) {
         this.NE = var1;
         this.NU = var2;
         NW[var1] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public byte y(class04659 var1) {
      return (byte)(this.NE << 2 | var1.field_34763 & 3);
   }

   public static int y(int var0) {
      int ix = var0 & 0xFF;
      return L(ix >> 2).N(class04659.y(ix & 3));
   }

   public int N(class04659 var1) {
      return this == N ? 0 : class02566.u(class02566.M(this.NU), var1.field_34764);
   }

   public static class04689 N(int var0) {
      Preconditions.checkPositionIndex(var0, NW.length, "material id");
      return L(var0);
   }
}

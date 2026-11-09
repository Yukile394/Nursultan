package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class class02119 {
   protected class02682 L;
   protected class07079 u;
   protected final Int2ObjectMap<class01763> i = new Int2ObjectOpenHashMap();
   protected int R;
   protected int M;
   protected int B;
   protected boolean Z = true;
   protected boolean z;
   protected boolean U;
   protected boolean E;

   protected class01763 L(int var1, int var2, int var3) {
      return (class01763)this.i.computeIfAbsent(class01763.y(var1, var2, var3), var3x -> new class01763(var1, var2, var3));
   }

   public void L(boolean var1) {
      this.U = var1;
   }

   public boolean M() {
      return this.E;
   }

   public class02119() {
      super();
   }

   public boolean i() {
      return this.z;
   }

   public void u(boolean var1) {
      this.E = var1;
   }

   public boolean u() {
      return this.Z;
   }

   protected class01763 u(class07209 var1) {
      return this.L(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public class04425 y(class07079 var1, class07209 var2) {
      return this.N(new class02682(var1.method_73183(), var1), var2.method_10263(), var2.method_10264(), var2.method_10260());
   }

   public void y(boolean var1) {
      this.z = var1;
   }

   protected class04604 y(double var1, double var3, double var5) {
      return new class04604(this.L(class04995.N(var1), class04995.N(var3), class04995.N(var5)));
   }

   public abstract class01763 y();

   public abstract class04425 N(class02682 var1, int var2, int var3, int var4);

   public void N() {
      this.L = null;
      this.u = null;
   }

   public void N(class00783 var1, class07079 var2) {
      this.L = new class02682(var1, var2);
      this.u = var2;
      this.i.clear();
      this.R = class04995.y(var2.method_17681() + 1.0F);
      this.M = class04995.y(var2.method_17682() + 1.0F);
      this.B = class04995.y(var2.method_17681() + 1.0F);
   }

   public static boolean N(class00500 var0) {
      return var0.N(class01210.Nh) || var0.N(class00869.V) || var0.N(class00869.EI) || class05847.U(var0) || var0.N(class00869.MU);
   }

   public abstract class04425 N(class02682 var1, int var2, int var3, int var4, class07079 var5);

   public void N(boolean var1) {
      this.Z = var1;
   }

   public abstract int N(class01763[] var1, class01763 var2);

   public abstract class04604 N(double var1, double var3, double var5);

   public boolean R() {
      return this.U;
   }
}
